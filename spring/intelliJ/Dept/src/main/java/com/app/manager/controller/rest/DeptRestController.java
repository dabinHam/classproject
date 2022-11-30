package com.app.manager.controller.rest;


import com.app.manager.domain.DeptDTO;
import com.app.manager.service.*;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController     // 4.0 이상에서만 처리해줘야함. 4.0이하의 경우 @GetMapping 아래 @ResponseBody를 넣어줘야함
@RequestMapping("/api/v1/depts")
public class DeptRestController {

    // get => 전체리스트
    // get / {no} => 부서 하나의 정보
    // post => Json 형식의 데이터를 받아서 입력 처리
    // put /{no} => 하나의 부서정보를 수정, 모든 데이터를 수정
    // delete /{no} => 부서 정보 하나를 삭제

    @Autowired
    private DeptListService deptListService;    // <- 이걸 가져와야 DB 를 가져올 수 있음.

    @Autowired
    private DeptReadService deptReadService;

    @Autowired
    private DeptRegService deptRegService;

    @Autowired
    private DeptEditService deptEditService;

    @Autowired
    private DeptDeleteService deptDeleteService;

    @GetMapping
    public List<DeptDTO> getDeptList(){
        return deptListService.getList();
    }

    @GetMapping("/{no}")    // -> /api/v1/depts/10
    public DeptDTO getDept(@PathVariable("no") int deptno){
        log.info("deptno >>>>>>>>>>" + deptno);
        return deptReadService.getDept(deptno);
    }

    @PostMapping    // JSON(형식의문자열) 데이터를 받아서 처리  |  ResponseEntity<>, HttpEntity<> : (응답처리, 미리정의해서 응답해야할때 사용)
    public ResponseEntity<String> regDept(@RequestBody DeptDTO deptDTO){
        /*
        {
            "deptno" : 55,
            "dname" : "디자인",
            "loc" : "강남"
        }
        */

        log.info(deptDTO);

        deptRegService.insertDept(deptDTO);

        // Header 정의
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("some-header","some-value");

        // ResponseEntity<String> => 응답 데이터를 제네릭으로 정의,
        // 객체 -> 응답데이터, http header, http status code
//        return new ResponseEntity<>("insert OK", HttpStatus.OK);
        return new ResponseEntity<>("insert OK", httpHeaders, HttpStatus.OK);      // BAD_REQUEST : 400
    }

    @PutMapping("/{no}")
    public HttpEntity<String> editDept( //  ResponseEntity<>, HttpEntity<> : (응답처리, 미리정의해서 응답해야할때 사용)
            @PathVariable("no") int deptno,
            @RequestBody DeptDTO deptDTO
    ){
        log.info("deptno >>>>>" + deptno);
        log.info(deptDTO);

        // Header 정의
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("some-header","some-value");

        deptEditService.editDept(deptDTO);

        return new HttpEntity<String>("update");
    }

    @DeleteMapping("/{no}")
    public ResponseEntity<String> deleteDept(@PathVariable("no")int deptno){
        log.info("delete ... " + deptno);

        deptDeleteService.deleteDept(deptno);

//        return new ResponseEntity<String>("delete", HttpStatus.OK);
        return new ResponseEntity<String>(HttpStatus.OK);
    }
}

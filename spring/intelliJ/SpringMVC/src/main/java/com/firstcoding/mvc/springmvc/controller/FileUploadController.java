package com.firstcoding.mvc.springmvc.controller;

import com.firstcoding.mvc.springmvc.domain.Report;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@Log4j2
@Controller
@RequestMapping("/report")
public class FileUploadController {

    @GetMapping
    public String getReportForm(){
        return "/report/reportForm";
    }

    // 1. @RequestParam
    // 2. @MultipartHttpServletRequest
    // 3. 커맨드 객체

    @PostMapping("/submit1")
    public String result1(
            @RequestParam("snum") String snum,
            @RequestParam("sname") String sname,
            @RequestParam("report") MultipartFile report,        // MultipartFile : 파일에 대한 정보를 다 가지고 있음.
            HttpServletRequest request,
            Model model // String인 경우 Model 사용
    ) throws IOException {

        log.info("학번 : " + snum);
        log.info("이름 : " + sname);
        log.info("리포트파일 : " + report.getOriginalFilename());


        // web 경로 ( domain,port 제거한 경로) 외부에서 보여지려면 이렇게 처리해야한다.
        String uploadURI = "/uploadfile/report";        // http://localhost:8080/uploadfile/report
        // 시스템경로(폴더위치) 실제로 배포되어있는 경로
        String dirRealPath = request.getSession().getServletContext().getRealPath(uploadURI);
        log.info(dirRealPath);

        // 저장
//        report.transferTo(new File(dirRealPath,"파일이름"));
        report.transferTo(new File(dirRealPath, report.getOriginalFilename()));

        model.addAttribute("snum", snum);
        model.addAttribute("sname", sname);
        model.addAttribute("fileName", report);

        return "report/submit1";
    }

    /* === submit2 === */
    @PostMapping("/submit2")
    public String result2(
            MultipartHttpServletRequest request,
            Model model
    ) throws IOException {

        String snum = request.getParameter("snum");
        String sname = request.getParameter("sname");
        MultipartFile report = request.getFile("report");

        log.info("학번 : " + snum);
        log.info("이름 : " + sname);
        log.info("리포트파일 : " + report.getOriginalFilename());


        // web 경로 ( domain,port 제거한 경로) 외부에서 보여지려면 이렇게 처리해야한다.
        String uploadURI = "/uploadfile/report";        // http://localhost:8080/uploadfile/report
        // 시스템경로(폴더위치) 실제로 배포되어있는 경로
        String dirRealPath = request.getSession().getServletContext().getRealPath(uploadURI);
        log.info(dirRealPath);

        // 저장
//        report.transferTo(new File(dirRealPath,"파일이름"));
        report.transferTo(new File(dirRealPath, report.getOriginalFilename()));

        model.addAttribute("snum", snum);
        model.addAttribute("sname", sname);
        model.addAttribute("fileName", report);

        return "report/submit2";
    }

    /* === submit3 === */
    @PostMapping("/submit3")
    public String result3(
            Report report,
            HttpServletRequest request,
            Model model
    ) throws IOException {

        log.info("학번 : " + report.getSnum());
        log.info("이름 : " + report.getSname());
        log.info("리포트파일 : " + report.getReport().getOriginalFilename());    // getReport를 해야 getOriginalFilename을 받을수 있음.


        // web 경로 ( domain,port 제거한 경로) 외부에서 보여지려면 이렇게 처리해야한다.
        String uploadURI = "/uploadfile/report";        // http://localhost:8080/uploadfile/report
        // 시스템경로(폴더위치) 실제로 배포되어있는 경로
        String dirRealPath = request.getSession().getServletContext().getRealPath(uploadURI);
        log.info(dirRealPath);

        // 저장
        // report.getReport() : 멀티파트객체
        report.getReport().transferTo(new File(dirRealPath, report.getReport().getOriginalFilename()));

        model.addAttribute("snum", report.getSnum());
        model.addAttribute("sname", report.getSname());
        model.addAttribute("fileName", report.getReport().getOriginalFilename());

        return "report/submit3";
    }









}

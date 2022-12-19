package com.app.board.controller.board;


import com.app.board.domain.ReplyDTO;
import com.app.board.service.reply.*;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@Log4j2
@RequestMapping("/reply")
public class ReplyRestController {
    // get  /reply => list
    // post /reply => reply
    // put  /reply/{rno} => reply
    // delete /reply/{rno} => 0 / 1, ok, fail

    @Autowired
    private ReplyListService replyListService;
    @Autowired
    private ReplyInsertSerivce replyInsertSerivce;
    @Autowired
    private ReplyReadService replyReadService;
    @Autowired
    private ReplyEditService replyEditService;
    @Autowired
    private ReplyDeleteService replyDeleteService;





    /*=============================================================================================*/

    // get : /reply/{bno} => list
    @GetMapping(value = "/{bno}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ReplyDTO>> selectList(@PathVariable("bno") int bno){

        List<ReplyDTO> list = replyListService.selectAll(bno);

        return new ResponseEntity<>(list, HttpStatus.OK);
    }


    /*=============================================================================================*/

    // post : /reply => reply  |  클라이언트로부터 JSON데이터를 받아서 DB에 insert  처음 받을시 rno가 없어서
    @PostMapping
    public ResponseEntity<ReplyDTO> insertReply(@RequestBody ReplyDTO replyDTO){

        log.info("insert 전 "+replyDTO);
        /// Service -> Mapper
        replyInsertSerivce.insertReply(replyDTO);

        log.info("insert 후 "+replyDTO);     // rno 값이 갱신된 데이터

        replyDTO.setReplyDate(LocalDate.now().toString());

        return new ResponseEntity<>(replyReadService.selectByRno(replyDTO.getRno()), HttpStatus.OK);
    }

    /*=============================================================================================*/

    // put : /reply/{rno} => reply
    @PutMapping("/{rno}")
    public ResponseEntity<Integer> editReply(@RequestBody ReplyDTO replyDTO, @PathVariable("rno")int rno){
        replyDTO.setRno(rno);
        return new ResponseEntity<>(replyEditService.updateReply(replyDTO),HttpStatus.OK);
    }



    /*=============================================================================================*/

    // delete : /reply/{rno} => 0 / 1, ok, success,fail
    @DeleteMapping("/{rno}")
    public ResponseEntity<Integer> delete(@PathVariable("rno")int rno){     /*처리완료 : 0 , 처리실패 : 1*/
        return new ResponseEntity<>(replyDeleteService.deleteByRno(rno), HttpStatus.OK);

    }





}

package com.app.board.controller.board;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.*;

@Log4j2
@Controller
public class ImageViewController {

    @GetMapping(value = "/upload/photo/{fileName}", produces = MediaType.IMAGE_PNG_VALUE)
    @ResponseBody
    public ResponseEntity<byte[]> viewImage(@PathVariable("fileName")String fileName) throws IOException {

        log.info("ImageView Controller ...");

        // 응답하기 위한 변수 생성
        byte[] imageByteArray= null;
        HttpStatus status = HttpStatus.NOT_FOUND;

        // == 저장된 파일 경로 찾기 ,파일구분자(File.separator 사용)
        /*File savedFile = new File(new File("").getAbsolutePath(),"photo\\"+fileName);*/
        File savedFile = new File(new File("").getAbsolutePath(),"photo"+File.separator+fileName);


        // ==  응답 처리

        // 저장파일(savedFile) 있으면
        // InputStream을 통하여 imageByteArray 가져오고 imageByteArray의 응답처리 (status) OK=200
        if (savedFile.exists()){
            InputStream imageStream = new FileInputStream(savedFile);   // 파일 저장경로
            imageByteArray = imageStream.readAllBytes();
            status = HttpStatus.OK;
        }

        // 저장파일(savedFile) 없으면 별도의값 전달 없이 NOTFOUND 응답하도록 처리
        return new ResponseEntity<byte[]>(imageByteArray, status);


    }


}

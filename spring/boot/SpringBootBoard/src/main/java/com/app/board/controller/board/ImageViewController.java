package com.app.board.controller.board;


import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;
import java.io.*;

@Controller
@Log4j2
public class ImageViewController {

    @GetMapping(value = "/upload/photo/{fileName}", produces = MediaType.IMAGE_PNG_VALUE)
    @ResponseBody
    public ResponseEntity<byte[]> viewImage(@PathVariable("fileName") String fileName) throws IOException {
        // 이미지에 대한 바이너리코드 -> 파일이없으면 404, 있으면 200을 주고자 함
        log.info(" ImageView Controller");

        byte[] imageByteArray = null;
        HttpStatus status = HttpStatus.NOT_FOUND;

        // 저장된 파일 경로 찾기
        File savedFile = new File(new File("").getAbsolutePath(),"photo\\"+fileName);

        if (savedFile.exists()){
            //응답 처리
            InputStream imageStream = new FileInputStream(savedFile);
            imageByteArray = imageStream.readAllBytes();
            status = HttpStatus.OK;
        }
        return new ResponseEntity<byte[]>(imageByteArray, status);
    }
}

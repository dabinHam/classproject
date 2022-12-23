package com.app.board.util;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component      // saveUtil 이라는 이름으로 vean이 등록됨
@Log4j2

public class SaveUtil {

    public Map<String,Object> saveFile(MultipartFile file){

        // 새 메소드는 => MultipartFile 을 받아서 저장 , 저장파일을 반환

        File saveDir = null;
        String newFileName = null;

        if (file != null && !file.isEmpty()) {
            // 새로운 파일 저장
            String absolutePath = new File("").getAbsolutePath(); // 기본경로
            log.info(absolutePath);

            // == 만들고자하는 디렉토리 | 기본경로에 "photo"를 포함하고있는 디렉토리
            String path = "photo";
            saveDir = new File(absolutePath, path); // saveDir:저장하는 경로
            // == 폴더가 존재하지 않으면 생성
            if (!saveDir.exists()) {  // 디렉토리가 존재하면 : true , 없으면 : false
                saveDir.mkdirs();
                log.info(">>>>>>>>>>>>>>>>>>photo dir 생성");
            }

            String uuid = UUID.randomUUID().toString(); // 난수발생
            newFileName = uuid + file.getOriginalFilename();  // 새로운 파일의 이름 생성

            // == 생성 후 파일 저장
            File newFile = new File(saveDir, newFileName); // 새로운 저장파일의 경로

            try {
                file.transferTo(newFile); // 파일 저장
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("newFileName",newFileName);
        resultMap.put("saveDir",saveDir);

        return resultMap;
    }

}


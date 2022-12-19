package com.app.board.service.board;


import com.app.board.domain.BoardDTO;
import com.app.board.domain.BoardEditRequest;
import com.app.board.mapper.BoardMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.UUID;

@Service
@Log4j2
public class BoardEditService {

    @Autowired
    private BoardMapper boardMapper;

    public int edit(BoardEditRequest boardEditRequest){

        MultipartFile file = boardEditRequest.getFormFile();

        File saveDir = null;
        String newFileName = null;

        if (file != null && !file.isEmpty()){

            // 새로운 파일을 저장
            String absolutePath = new File("").getAbsolutePath(); // 기본경로
            log.info(absolutePath);

            String path = "photo";
            saveDir = new File(absolutePath,path);
            if (!saveDir.exists()){  // 디렉토리가 존재하면 : true , 없으면 : false
                saveDir.mkdirs();
                log.info(">>>>>>>>>>>>>>>>>>photo dir 생성");
            }

            String uuid = UUID.randomUUID().toString(); // 난수발생
            newFileName = uuid+file.getOriginalFilename();  // 새로운 파일의 이름 생성

            // == 생성 후 파일 저장
            File newFile = new File(saveDir, newFileName); // 새로운 저장파일의 경로

            try {
                file.transferTo(newFile); // 파일 저장
                log.info("newFileName>>>>>>>>>>>>" + newFileName);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }


        BoardDTO boardDTO = boardEditRequest.toBoardDTO();
        if(newFileName!=null){
            boardDTO.setPhoto(newFileName);
        }

        log.info(boardDTO);
        int result=0;

        try {
            // db update
            result = boardMapper.update(boardDTO);   // SQLException 발생하는 곳

            // 1.새로운 파일이 저장되고 2.이전파일이 존재한다면 3.이전파일 삭제!
            String oldFileName = boardEditRequest.getOldFile();
            if (newFileName !=null && oldFileName != null && !oldFileName.isEmpty()){
                File delOldFile = new File(saveDir, oldFileName);// <-   지우고자하는 경로
                if (delOldFile.exists()){

                    delOldFile.delete();
                }
            }
        } catch (SQLException e){

            if (newFileName!=null){
                File delFile = new File (saveDir,newFileName);
                if (delFile.exists()){
                    delFile.delete();// 파일이 존재하면 삭제처리
                }
            }
        }


        return result;
    }
}

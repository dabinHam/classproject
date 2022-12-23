package com.app.board.service;


import com.app.board.domain.BoardDTO;
import com.app.board.domain.BoardWriteRequest;
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
public class BoardWriteService {

    @Autowired
    private BoardMapper boardMapper;

    // 파일이 저장되는지 먼저 확인
    public int write(BoardWriteRequest boardWriteRequest){

        MultipartFile file = boardWriteRequest.getFormFile();

        File saveDir = null;
        String newFileName = null;

        /* 파일 존재 여부확인 */
        if (file != null && !file.isEmpty() && file.getSize()>0){

            String absolutePath = new File("").getAbsolutePath(); // 기본경로
            log.info(absolutePath);

            // == 만들고자하는 디렉토리 | 기본경로에 "photo"를 포함하고있는 디렉토리
            String path = "photo";
            saveDir = new File(absolutePath,path); // saveDir:저장하는 경로


            // == 폴더가 존재하지 않으면 생성
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
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        BoardDTO boardDTO = boardWriteRequest.toBoardDTO();
        if (newFileName != null){
            boardDTO.setPhoto(newFileName);
        }

        int result = 0;

        try{
            // DB insert
            result = boardMapper.insert(boardDTO);
        }catch (SQLException e){
            if (newFileName!=null){
                File delFile = new File(saveDir,newFileName);
                if (delFile.exists()){
                    delFile.delete();// 파일이 존재하면 삭제처리
                }
            }
        }
        return result;
    }

}

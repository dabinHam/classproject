package com.app.board.service;


import com.app.board.domain.BoardDTO;
import com.app.board.mapper.BoardMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
@Log4j2
public class BoardDeleteService {

    @Autowired
    private BoardMapper boardMapper;

    public int delete(int bno){

        // 삭제 하려는 게시물의 데이터
        BoardDTO boardDTO = boardMapper.selectByBno(bno);

        // 삭제 결과
        int result = boardMapper.deleteByBno(bno);

        // 해당 게시물이 DB에서 삭제되고 , 해당게시물의 사진이름을 가지고 있다면  -> 파일삭제
        if(result>0 && boardDTO.getPhoto()!=null){

            File delFile = new File(new File("").getAbsolutePath(),"photo"+File.pathSeparator+boardDTO.getPhoto());
            log.info(delFile.getAbsolutePath());
            if (delFile.exists()){
                delFile.delete();
            }
        }

        return result;
    }


}

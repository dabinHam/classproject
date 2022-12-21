package com.app.board.domain;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
public class BoardListPage {

    /*  == 받아서 처리 == */
    private int countPerPage;   // 페이지당 출력 할 게시물의 개수
    private int pageNum;        // 현재페이지 번호
    private List<BoardDTO> list; // 표현해야하는 게시물의 리스트
    private int totalCount;     // 전체 게시물의 개수 ('페이지당 출력 할 게시물의 개수'를 구하기 위하여)

    /* == 연산을 통하여 처리 == */
    private int startNum; // 페이지의 시작 번호
    private int endNum; // 페이지의 끝 번호
    private boolean prev; // 이전 버튼 출력 여부
    private boolean next; // 다음 버튼 출력 여부


    public BoardListPage(int countPerPage, int pageNum, List<BoardDTO> list, int totalCount) {
        this.countPerPage = countPerPage;
        this.pageNum = pageNum;
        this.list = list;
        this.totalCount = totalCount;
        calPageInfo();

    }

    /* 연산처리 */
    private void calPageInfo() {

        // 끝번호
        this.endNum = (int)(Math.ceil((this.pageNum * 1.0) / 10))*10;

        // 시작번호
        this.startNum=this.endNum-9;

        // 전체페이지 끝 번호
        int realEndNum = (int)(Math.ceil((this.totalCount* 1.0) / this.countPerPage));
        this.endNum = realEndNum < this.endNum ? realEndNum:this.endNum;

        // 이전 구간으로 이동 가능한지 체크
        this.prev = this.startNum > 1;
        // 다음 구간으로 이동 가능한지 체크
        this.next = this.endNum < realEndNum;

    }
}

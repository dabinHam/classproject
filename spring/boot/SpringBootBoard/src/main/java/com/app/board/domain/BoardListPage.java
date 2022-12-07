package com.app.board.domain;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
public class BoardListPage {

    /*== 받아서 처리 ==*/
    private int countPerPage; // 페이지당 출력 할 게시물의 개수


    private int pageNum; // 현재페이지 번호


    private List<BoardDTO> list; // 표현해야하는 게시물의 리스트


    private int totalCount; // 전체 게시물의 개수 ('페이지당 출력 할 게시물의 개수'를 구하기 위하여)

    /*== 연산을 통하여 처리 ==*/

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

    private void calPageInfo() {

        // 끝번호
        // Math.ceil : 올림
        // Math.lound : 반올림
        this.endNum = (int)(Math.ceil((this.pageNum * 1.0) / 10))*10;
        // 1 -> 1.0 / 10 => 0.1 => ceil : 가장 가까운 높은 정수값을 반환 1 * 10
        // 11 -> 11.0 / 10 => 1.1 => ceil : 가장 가까운 높은 정수값을 반환 2 * 10

        // 시작번호
        this.startNum=this.endNum-9;

        // 실제 마지막 값, 전체 페이지의 끝번호
        int realEndNum = (int)(Math.ceil((this.totalCount* 1.0) / this.countPerPage));

        // 구간의 마지막 번호보다 실제 페이지 끝번호가 작으면 endNum(끝번호)은 실제 끝 번호가 되어야 한다.
        this.endNum = realEndNum < this.endNum ? realEndNum:this.endNum;

        // 이전 구간으로 이동 가능한지 체크
        this.prev = this.startNum > 1;
        // 다음 구간으로 이동 가능한지 체크
        this.next = this.endNum < realEndNum;

    }
}

package com.app.board.domain;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class ReplyDTO {

    private int rno;
    private int bno;
    private String reply;
    private String replyer;
    private String replyDate;
    private String updateDate;


}

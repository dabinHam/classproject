package com.app.board.domain;


import com.app.board.entity.BoardMember;
import com.app.board.entity.Reply;
import lombok.*;

import java.time.LocalDate;

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
//    private String replyer;    // String => int 회원의 idx
    private Integer replyer;
    private String replyDate;
    private String updateDate;

    public Reply toReplyEntity(){
        return Reply.builder()
                .rno(rno)
                .bno(bno)
                .reply(reply)
                .replyer(BoardMember.builder().idx(replyer).build())
                /*.replydate(LocalDate.parse(replydate) )*/
                .build();
    }


}

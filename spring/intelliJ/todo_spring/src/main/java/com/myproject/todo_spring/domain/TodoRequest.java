package com.myproject.todo_spring.domain;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class TodoRequest {

    private int tdNum;
    private String tdList;
    private String tdCheck;
    private boolean tdDate;


}

package com.todo.todospring.domain;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class TodoDTO {
// DTO : 출력에 필요한 정보
    private long tno;
    private String todo;
    private LocalDate duedate;
    private boolean finished;

}
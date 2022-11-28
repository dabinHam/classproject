package com.todo.todospring.domain;

import lombok.*;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
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

    @NotEmpty
    private String todo;

    @Future
    private LocalDate duedate;

    private boolean finished;

}
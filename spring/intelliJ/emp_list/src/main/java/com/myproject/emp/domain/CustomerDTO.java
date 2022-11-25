package com.myproject.emp.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class CustomerDTO {

    private int custid;
    private String name;
    private String address;
    private String phone;
}

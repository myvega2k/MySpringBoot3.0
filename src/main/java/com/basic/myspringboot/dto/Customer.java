package com.basic.myspringboot.dto;

import lombok.*;

@NoArgsConstructor //기본생성자
@AllArgsConstructor //오버로딩된 생성자
@Getter  //getter
@Setter  //setter
@ToString //toString
@Builder
public class Customer {
    private String name;
    private int age;
}
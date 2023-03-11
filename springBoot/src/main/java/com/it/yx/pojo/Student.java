package com.it.yx.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private int id;
    private String stu_name;
    private int stu_age;
    private String stu_addr;
}

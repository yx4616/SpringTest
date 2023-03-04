package com.it;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@ToString
@Data
@Component("mySchool")
public class School {
    @Value("清华大学")
    private String name;
    @Value("天心")
    private String add;

}

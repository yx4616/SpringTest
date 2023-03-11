package com.it.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class User {
    private String username;
    private String password;
    private List<Order> order;
    private List<String> address;
}

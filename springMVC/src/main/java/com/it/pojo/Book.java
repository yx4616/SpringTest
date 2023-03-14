package com.it.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private int id;
    private String bookName;
    private String bookAuthor;
    private String bookPrice;
    private String imgAdr;

}

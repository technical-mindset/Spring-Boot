package com.example.demo.Model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
    //topic is runtime entity
public class Topic {
    private long id;
    private String name;
    private String course;
}

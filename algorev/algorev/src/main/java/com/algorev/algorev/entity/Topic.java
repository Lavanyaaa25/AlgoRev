package com.algorev.algorev.entity;

import lombok.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Topic {

    private String name;

    private List<Problem> problems;

}


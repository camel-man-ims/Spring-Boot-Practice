package com.example.spring_study0726.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SearchParam {
    private String account;
    private String password;
    private int page;
}

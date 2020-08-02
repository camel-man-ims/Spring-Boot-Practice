package com.example.spring_study0726.controller;

import com.example.spring_study0726.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path="/getMethod")
    public String getRequest(){

        return "Hi getMethod";
    }

    @GetMapping("/getMapping")
    public String getParameter(@RequestParam String id, @RequestParam String password){
        System.out.println("id : " + id );
        System.out.println("password : " + password);

        return id+password;
    }

    //localhost:8080/api/multi?account=ac&password=1234&page=1
    @GetMapping("multi")
    public SearchParam getMultiParameter(SearchParam searchParam){
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getPassword());
        System.out.println(searchParam.getPage());

        return searchParam;
    }
}

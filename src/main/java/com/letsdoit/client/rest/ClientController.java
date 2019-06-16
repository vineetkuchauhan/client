package com.letsdoit.client.rest;

import com.letsdoit.client.services.MakeHttpsCall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client/v1/test")
public class ClientController {

    @Autowired
    private MakeHttpsCall makeHttpsCall;
    @GetMapping
    @ResponseBody
    public String sayHello(){
        return makeHttpsCall.makeHttpsCall();
    }
}

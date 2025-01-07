package com.api.finapp.transaction.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/transaction")
@RestController
public class TransactionTestController {

    @PostMapping("/test")
    public String test() {
        return "transaction testing.....";
    }
}

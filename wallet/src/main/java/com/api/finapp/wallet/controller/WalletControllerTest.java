package com.api.finapp.wallet.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/wallet")
@RestController
public class WalletControllerTest {

    @PostMapping("test")
    public String test() {
        return "Wallet Testing........";
    }
}

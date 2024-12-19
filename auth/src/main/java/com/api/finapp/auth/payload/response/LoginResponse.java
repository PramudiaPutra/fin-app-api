package com.api.finapp.auth.payload.response;

import lombok.Data;

import java.util.Date;

@Data
public class LoginResponse {
    private String token;
    private Date tokenExp;
    private String email;
}

package com.api.finapp.auth.payload.response;

import lombok.Data;

@Data
public class RegisterResponse {
    private String email;
    private String username;
    private String firstName;
    private String lastName;
    private Integer status;
}

package com.api.finapp.auth.payload.request;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class RegisterRequest {
    private String email;
    private String password;
    private String username;
    private String firstName;
    private String lastName;
}

package com.api.finapp.auth.controller;

import com.api.finapp.auth.entity.User;
import com.api.finapp.auth.payload.request.LoginRequest;
import com.api.finapp.auth.payload.request.RegisterRequest;
import com.api.finapp.auth.payload.response.LoginResponse;
import com.api.finapp.auth.payload.response.RegisterResponse;
import com.api.finapp.auth.service.AuthenticationService;
import com.api.finapp.auth.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RequestMapping("/auth")
@RestController
public class AuthenticationController {

    @Autowired
    private JwtService jwtService;

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/signup")
    public ResponseEntity<RegisterResponse> signup(@RequestBody RegisterRequest request) {
        User user = authenticationService.signUp(request);

        RegisterResponse response = new RegisterResponse();
        response.setEmail(user.getEmail());
        response.setUsername(user.getUsername());
        response.setFirstName(user.getFirstName());
        response.setLastName(user.getLastName());
        response.setStatus(user.getStatus());

        return ResponseEntity.ok(response);
    }

    @PostMapping("login")
    public ResponseEntity<LoginResponse> signIn(@RequestBody LoginRequest request) {
        User user = authenticationService.login(request);
        String jwtToken = jwtService.generateToken(user);
        Date jwtExpiration = jwtService.getExpiration(jwtToken);

        LoginResponse response = new LoginResponse();
        response.setToken(jwtToken);
        response.setTokenExp(jwtExpiration);
        response.setEmail(user.getEmail());

        return ResponseEntity.ok(response);
    }
}

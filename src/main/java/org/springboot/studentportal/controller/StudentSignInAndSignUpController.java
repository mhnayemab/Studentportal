package org.springboot.studentportal.controller;

import lombok.AllArgsConstructor;
import org.springboot.studentportal.dto.request.SignUpRequest;
import org.springboot.studentportal.service.SignUpService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@AllArgsConstructor
@RestController
@RequestMapping("/student")
public class StudentSignInAndSignUpController {

    private final SignUpService signUpService;

    @PostMapping("/signup")
    public void signUp(Long id, @RequestBody @Valid SignUpRequest signUpRequest) {

        signUpService.createUser(id, signUpRequest);

    }


    @GetMapping("signin/api2")
    public String signIn() {

        return "thydtrh";

    }
}

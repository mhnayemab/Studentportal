package org.springboot.studentportal.service;

import lombok.AllArgsConstructor;
import org.springboot.studentportal.dto.request.SignUpRequest;
import org.springboot.studentportal.model.SignUpModel;
import org.springboot.studentportal.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SignUpService {
    private final StudentRepository studentRepository;
    public String createUser(Long id, SignUpRequest signUpRequest){
        SignUpModel signUpModel=new SignUpModel();
        signUpModel.setStudentId(signUpRequest.getStudentId());
        signUpModel.setStudentName(signUpRequest.getStudentName());
        signUpModel.setStudentName(signUpRequest.getStudentName());
        signUpModel.setStudentDept(signUpRequest.getStudentDept());
        signUpModel.setStudentPassword(signUpRequest.getStudentPassword());
        studentRepository.saveAndFlush(signUpModel);
        return "User Created";

    }
}

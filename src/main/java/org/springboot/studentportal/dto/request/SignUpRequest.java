package org.springboot.studentportal.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class SignUpRequest {

    private String studentName;

    private String studentDept;

    private String studentId;

    private String studentPassword;

}

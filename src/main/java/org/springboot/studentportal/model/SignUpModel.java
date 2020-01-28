package org.springboot.studentportal.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Student")
@Entity

public class SignUpModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Long id;


    private String studentName;


    private String studentDept;


    private String studentId;

    @Column(name="PassCode")
    @Size(min = 6,max = 12)
    private String studentPassword;

}

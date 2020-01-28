package org.springboot.studentportal.repository;

import org.springboot.studentportal.model.SignUpModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<SignUpModel,Long> {

}

package com.practice.pratice.repository;

import com.practice.pratice.pojo.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant,Long> {
    Applicant findByApplicantFirstName(String applicantFirstName);
}

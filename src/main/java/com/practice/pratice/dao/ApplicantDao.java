package com.practice.pratice.dao;

import com.practice.pratice.pojo.Applicant;
import org.springframework.stereotype.Service;

@Service
public interface ApplicantDao {
    Applicant getApplicantDetails(String applicantName);
    Applicant saveApplicant(Applicant applicant);
}

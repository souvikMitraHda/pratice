package com.practice.pratice.dao;

import com.practice.pratice.pojo.Applicant;
import com.practice.pratice.repository.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApplicantDaoImpl implements ApplicantDao{

    @Autowired
    ApplicantRepository applicantRepository;

    @Override
    public Applicant getApplicantDetails(String applicantFirstName) {
        return applicantRepository.findByApplicantFirstName(applicantFirstName);
    }

    @Override
    public Applicant saveApplicant(Applicant applicant) {
        Applicant savedApplicant = applicantRepository.saveAndFlush(applicant);
        return savedApplicant;
    }
}

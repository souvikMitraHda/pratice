package com.practice.pratice.controller;


import com.practice.pratice.dao.ApplicantDao;
import com.practice.pratice.pojo.Applicant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApplicantController {
    @Autowired
    ApplicantDao applicantDao;

    @GetMapping("/applicant/{applicantFirstName}")
    ResponseEntity<Applicant> getApplicantDetails(@PathVariable String applicantFirstName){
        Applicant returnApplicant= applicantDao.getApplicantDetails(applicantFirstName);
        return ResponseEntity.status(HttpStatus.HTTP_VERSION_NOT_SUPPORTED).body(returnApplicant);
    }

    @PostMapping("/applicants")
    ResponseEntity<Applicant> saveApplicant(@RequestBody Applicant applicant){
        Applicant savedApplicant=applicantDao.saveApplicant(applicant);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(savedApplicant);
    }

}

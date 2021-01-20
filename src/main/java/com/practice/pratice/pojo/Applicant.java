package com.practice.pratice.pojo;

import javax.persistence.*;

@Entity
@Table(name="APPLICANT_TABLE")
public class Applicant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @Column(name="applicant_first_name")
    private String applicantFirstName;

    @Column(name="applicant_last_name")
    private String applicantLastName;

    @Column(name="company_name")
    private String companyName;

    @Column(name="email")
    private String email;

    @Column(name="salary")
    private Long salary;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApplicantFirstName() {
        return applicantFirstName;
    }

    public void setApplicantFirstName(String applicantFirstName) {
        this.applicantFirstName = applicantFirstName;
    }

    public String getApplicantLastName() {
        return applicantLastName;
    }

    public void setApplicantLastName(String applicantLastName) {
        this.applicantLastName = applicantLastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Applicant(String firstName,String lastName, String companyName, String email, long salary){
        this.applicantFirstName=firstName;
        this.applicantLastName=lastName;
        this.companyName=companyName;
        this.email=email;
        this.salary=salary;
    }
}

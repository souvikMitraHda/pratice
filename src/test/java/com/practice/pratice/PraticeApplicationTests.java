package com.practice.pratice;

import com.practice.pratice.controller.ApplicantController;
import com.practice.pratice.dao.ApplicantDao;
import com.practice.pratice.pojo.Applicant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
class PraticeApplicationTests {

	@Autowired
	ApplicantController applicantController;

	@Autowired
	ApplicantDao applicantDao;

	@Test
	void contextLoads() throws Exception{
		assertThat(applicantController).isNotNull();
	}

	@Test
	public void testIfApplicantIsSaved(){
		Applicant testApplicant=new Applicant("testF","testL",
				"testComp","test@test.com",300L);
		//ApplicantDao applicantDaoMock=mock(ApplicantDao.class);
		//when(applicantDaoMock.saveApplicant())
		Applicant savedApplicant = applicantDao.saveApplicant(testApplicant);
		assert (savedApplicant.getId().equals(1l));
	}
}

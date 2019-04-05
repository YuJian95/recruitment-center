package com.rc.action;

import com.rc.iservice.IRcCompanyService;
import com.rc.iservice.IRcJobService;
import com.rc.iservice.IRcPersonService;
import com.rc.model.RcCompany;
import com.rc.model.RcJob;
import com.rc.model.RcPerson;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RcHomeAction {
    private static final int SHOW_NUM = 5;

    @Autowired
    private IRcCompanyService companyService;
    @Autowired
    private IRcPersonService personService;
    @Autowired
    private IRcJobService jobService;

    private List<RcJob> jobs;
    private List<RcPerson> persons;
    private List<RcCompany> companies;

    public String home() throws Exception {
        jobs = jobService.findJobs(SHOW_NUM);
        persons = personService.findPersons(SHOW_NUM);
        companies = companyService.findCompanies(SHOW_NUM);
        return "first";
    }

    public List<RcJob> getJobs() {
        return jobs;
    }

    public void setJobs(List<RcJob> jobs) {
        this.jobs = jobs;
    }

    public List<RcPerson> getPersons() {
        return persons;
    }

    public void setPersons(List<RcPerson> persons) {
        this.persons = persons;
    }

    public List<RcCompany> getCompanies() {
        return companies;
    }

    public void setCompanies(List<RcCompany> companies) {
        this.companies = companies;
    }
}

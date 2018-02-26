package com.tel.ran;

public class EmployeePerson extends Person {

    private String companyName;
    private String [] previousCompanies;

    public EmployeePerson(Integer id, String firstName, String lastName, int age) {
        super(id, firstName, lastName, age);
    }

    public EmployeePerson(Integer id,
                          String firstName,
                          String lastName,
                          int age,
                          String companyName,
                          String[] previousCompanies) {
        super(id, firstName, lastName, age);
        this.companyName = companyName;
        this.previousCompanies = previousCompanies;
    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String[] getPreviousCompanies() {
        return previousCompanies;
    }

    public void setPreviousCompanies(String[] previousCompanies) {
        this.previousCompanies = previousCompanies;
    }


    public String getFirstEmployeeName() {
        return "Employee: " + super.getFirstName();
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }
}

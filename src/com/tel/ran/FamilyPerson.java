package com.tel.ran;

public class FamilyPerson extends Person {

    private FamilyPerson spouse;

    public FamilyPerson(Integer id, String firstName, String lastName, int age, FamilyPerson spouse) {
        super(id, firstName, lastName, age);
        this.spouse = spouse;
    }

    public FamilyPerson getSpouse() {
        return spouse;
    }

    public void setSpouse(FamilyPerson spouse) {
        this.spouse = spouse;
    }
}

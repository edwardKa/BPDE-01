package com.tel.ran;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Person daniil = new Person(1, "Daniil", "Ivadnov", 30);
        daniil.setJavaProjectVersion("0.1");



        String fullName = daniil.getFirstName() + " " + daniil.getLastName();

        System.out.println(fullName);

        Person ivan = new Person(2, "Ivan", "Dale", 31);

        FamilyPerson natalie = new FamilyPerson(3, "Natalie", "Dale", 29, null);

        FamilyPerson pavel = new FamilyPerson(4, "Pavel", "Pavlov", 35, natalie);

        natalie.setSpouse(pavel);

        System.out.println("Ivan project version: " + ivan.getJavaProjectVersion());


        EmployeePerson employee_ivan = new EmployeePerson(2, "Ivan", "Dale", 31);
        employee_ivan.setId(100);

        employee_ivan.setCompanyName("Google");
        String [] ivansPreviousCompanies = new String[3];
        ivansPreviousCompanies[0] = "Facebook";
        ivansPreviousCompanies[1] = "Oracle";
        ivansPreviousCompanies[2] = "Microsoft";



        employee_ivan.setPreviousCompanies(ivansPreviousCompanies);
        System.out.println(">>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>");
        System.out.println(employee_ivan.getFirstName());
        System.out.println(">>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>");


        System.out.println("Employee ivan ID: " + employee_ivan.getId());

        for (int i = 0; i < ivansPreviousCompanies.length; i++) {
            System.out.println("Ivan's prevoius company #" + i + ": " + employee_ivan.getPreviousCompanies()[i]);
        }

        System.out.println("------- Our method ---------");
        System.out.println(Arrays.toString(employee_ivan.getPreviousCompanies()));


    }
}
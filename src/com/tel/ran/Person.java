package com.tel.ran;

public class Person {

    private final String city = "Berlin";

    private static String JAVA_PROJECT_VERSION;

    private Integer id;
    private String firstName;
    private String lastName;
    private int age;

    public Person(Integer id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getJavaProjectVersion() {
        return JAVA_PROJECT_VERSION;
    }

    public void setJavaProjectVersion(String javaProjectVersion) {
        JAVA_PROJECT_VERSION = javaProjectVersion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

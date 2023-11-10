package com.first.maven;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
    public Person() {
    }

    @Id
    int aadhar;

    public Person_details getPerson_details() {
        return person_details;
    }

    public Person(int aadhar, String name, String age, String gender, Person_details person_details) {
        this.aadhar = aadhar;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.person_details = person_details;
    }

    public void setPerson_details(Person_details person_details) {
        this.person_details = person_details;
    }

    String name, age, gender;
    private Person_details person_details;

    public int getAadhar() {
        return aadhar;
    }

    public void setAadhar(int aadhar) {
        this.aadhar = aadhar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

package com.first.maven;

import javax.persistence.Embeddable;

@Embeddable
public class Person_details {
    int car, bikes;

    public Person_details() {

    }

    public int getCar() {
        return car;
    }

    public Person_details(int car, int bikes) {
        this.car = car;
        this.bikes = bikes;
    }

    public void setCar(int car) {
        this.car = car;
    }

    public int getBikes() {
        return bikes;
    }

    public void setBikes(int bikes) {
        this.bikes = bikes;
    }

}

package com.company;

import java.io.File;

public class Animal {
    static final public Double DEAFULT_ANIMAL_WEIGHT = 1.0;
    final public String species;
    public String name;
    File pic;
    private Double weight;

    Animal(String species) {
        this.species = species;

        switch (this.species) {
            case "canis familiaris":
                this.weight = 10.0;
            case "feline":
                this.weight = 2.0;
                deafult:
                this.weight = DEAFULT_ANIMAL_WEIGHT;

        }
    }


    void feed() {
        this.weight += 1;
        System.out.println("thx for food :D");
    }


}

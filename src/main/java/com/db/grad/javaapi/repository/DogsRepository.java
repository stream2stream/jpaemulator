package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.Dog;

import java.util.List;

public interface DogsRepository {
    long addDog(Dog theDog );
    Dog  getDogById( int id );
    List<Dog> getDogByName(Dog theDog );
    Dog updateDogDetails( Dog theDog );
    boolean removeDog( Dog theDog );
}

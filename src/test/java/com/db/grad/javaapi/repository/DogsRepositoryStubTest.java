package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.Dog;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DogsRepositoryStubTest {

    @Test
    void addDog() {
        // arrange
        long expectedIndex = 1;
        DogsRepositoryStub cut = new DogsRepositoryStub();
        Dog theDog = new Dog();
        theDog.setName("Bruno");

        // act
        long actualIndex = cut.addDog( theDog );

        // assert
        assertEquals(expectedIndex, actualIndex );
    }

    @Test
    void getDogById() {
        // arrange
        Dog expectedDog = new Dog();
        expectedDog.setId(1); expectedDog.setName("Bruno");
        DogsRepositoryStub cut = new DogsRepositoryStub();
        Dog theDog = new Dog();
        theDog.setName("Bruno");
        cut.addDog( theDog );
        theDog = new Dog();
        theDog.setName("Penny");
        cut.addDog( theDog );

        // act
        Dog actualDog = cut.getDogById( 1 );

        // assert
        assertEquals( expectedDog.getName(), actualDog.getName());
        assertEquals( expectedDog.getId(), actualDog.getId());
    }

    @Test
    void getDogByName() {
        // arrange
        Dog expectedDog = new Dog();
        expectedDog.setId(2); expectedDog.setName("Penny");
        DogsRepositoryStub cut = new DogsRepositoryStub();
        Dog theDog = new Dog();
        theDog.setName("Bruno");
        cut.addDog( theDog );
        theDog = new Dog();
        theDog.setName("Penny");
        cut.addDog( theDog );

        // act
        List<Dog> actualDog = cut.getDogByName( expectedDog );

        // assert
        assertEquals(1, actualDog.size());
        Dog retrievedDog = actualDog.get(0);
        assertEquals( expectedDog.getName(), retrievedDog.getName());
        assertEquals( expectedDog.getId(), retrievedDog.getId());
    }

    @Test
    void updateDogDetails() {
        // arrange
        Dog dogToUpdate = new Dog();
        dogToUpdate.setId(1); dogToUpdate.setName("Frank");
        DogsRepositoryStub cut = new DogsRepositoryStub();
        Dog theDog = new Dog();
        theDog.setName("Bruno");
        cut.addDog( theDog );
        theDog = new Dog();
        theDog.setName("Penny");
        cut.addDog( theDog );

        // act
        cut.updateDogDetails(dogToUpdate);
        Dog actualDog = cut.getDogById( 1 );

        // assert
        assertEquals( dogToUpdate.getName(), actualDog.getName());
        assertEquals( dogToUpdate.getId(), actualDog.getId());
    }

    @Test
    void removeDog() {
        // arrange
        Dog dogToRemove = new Dog();
        dogToRemove.setId(1); dogToRemove.setName("Frank");
        DogsRepositoryStub cut = new DogsRepositoryStub();
        Dog theDog = new Dog();
        theDog.setName("Bruno");
        cut.addDog( theDog );
        theDog = new Dog();
        theDog.setName("Penny");
        cut.addDog( theDog );

        // act
        cut.removeDog(dogToRemove);
        Dog actualDog = cut.getDogById( 1 );

        // assert
        assertNull( actualDog );
    }
}
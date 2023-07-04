package com.db.grad.javaapi.service;


import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.repository.DogsRepository;
import com.db.grad.javaapi.repository.DogsRepositoryStub;
import com.db.grad.javaapi.service.DogHandler;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DogHandlerTest
{
    private DogsRepository itsDogRepo = new DogsRepositoryStub();

    @BeforeEach
    public  void    makeSureRepoIsEmpty()
    {
        itsDogRepo.deleteAll();
    }

    @Test
    public  void    add_dogs_by_return_num_dogs_added()
    {
        // arrange
        DogHandler cut = new DogHandler(itsDogRepo);
        Dog theDog = new Dog();
        theDog.setName("Bruno");
        cut.addDog( theDog );
        theDog = new Dog();
        theDog.setName("Frank");
        cut.addDog( theDog );
        theDog = new Dog();
        theDog.setName("Penny");
        cut.addDog( theDog );

        int expectedResult = 3;

        // act
        long actualResult = cut.getNoOfDogs();

        // assert
        assertEquals( expectedResult, actualResult );
    }
}

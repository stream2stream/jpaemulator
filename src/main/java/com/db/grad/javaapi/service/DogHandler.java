package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.repository.DogsRepository;
import com.db.grad.javaapi.repository.DogsRepositoryStub;

import java.util.ArrayList;

public class DogHandler
{
    private DogsRepository itsDogRepo = new DogsRepositoryStub();

    public DogHandler( DogsRepository dogRepo)
    {
        itsDogRepo = dogRepo;
    }

    public void addDog(Dog dog)
    {
        itsDogRepo.save(dog);
    }

    public long getNoOfDogs()
    {
        return itsDogRepo.count();
    }
}

package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.Dog;

import java.util.ArrayList;
import java.util.List;

public class DogsRepositoryStub implements DogsRepository {
    private ArrayList<Dog> itsDogs = new ArrayList<>();

    @Override
    public long addDog(Dog theDog) {
        long result = 0;
        itsDogs.add(theDog);
        result = itsDogs.size();
        theDog.setId(result);
        return result;
    }

    @Override
    public Dog getDogById(int id) {
        Dog result = null;

        for( Dog theDog: itsDogs)
            if(theDog.getId() == id ) {
                result = theDog;
                break;
            }

        return result;
    }

    @Override
    public List<Dog> getDogByName(Dog aDog) {
        ArrayList<Dog> result = new ArrayList<>();

        for( Dog theDog: itsDogs)
            if( theDog.getName().equalsIgnoreCase(aDog.getName()) ) {
                result.add(theDog);
                break;
            }

        return result;
    }

    @Override
    public Dog updateDogDetails(Dog aDog) {
        Dog result = null;

        for( Dog theDog: itsDogs)
            if( theDog.getId() == aDog.getId()) {
                result = theDog;
                result.setName( aDog.getName() );
                break;
            }

        return result;
    }

    @Override
    public boolean removeDog(Dog aDog) {
        boolean result = false;
        long initialSize = itsDogs.size();

        itsDogs.removeIf(dog -> dog.getId() == aDog.getId());
        result = initialSize != itsDogs.size();

        return result;
    }
}

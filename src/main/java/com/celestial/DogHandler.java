package com.celestial;

import java.util.ArrayList;

public class DogHandler
{
    private ArrayList<String> itsDogs = new ArrayList<>();
    public void addDog(String dog)
    {
        itsDogs.add(dog);
    }

    public int getNoOfDogs()
    {
        return itsDogs.size();
    }
}

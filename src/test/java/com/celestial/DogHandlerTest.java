package com.celestial;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class DogHandlerTest {
    @Test
    public  void    add_dogs_by_return_num_dogs_added()
    {
        // arrange
        DogHandler cut = new DogHandler();
        cut.addDog( "bruno" );
        cut.addDog( "frank" );
        cut.addDog( "penny" );

        int expectedResult = 3;

        // act
        int actualResult = cut.getNoOfDogs();

        // assert
        assertEquals( expectedResult, actualResult );
    }

}

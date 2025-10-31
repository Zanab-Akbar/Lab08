package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {

    @Test
    public void testHasCity(){
        CustomList list= new CustomList();
        City calgary= new City("Calgary", "AB");
        list.addCity(calgary);

        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Edmonton", "AB");

        list.addCity(calgary);
        list.addCity(edmonton);

        assertTrue(list.hasCity(calgary)); // confirm it’s there first

        list.deleteCity(calgary); // now delete it
        assertFalse(list.hasCity(calgary)); // should no longer exist
        assertTrue(list.hasCity(edmonton)); // others stay untouched
    }



}

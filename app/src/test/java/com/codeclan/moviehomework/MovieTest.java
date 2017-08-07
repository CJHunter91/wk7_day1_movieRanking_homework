package com.codeclan.moviehomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 07/08/2017.
 */

public class MovieTest {
    Movie movie;

    @Before
    public void before(){
        movie = new Movie("The Hobbit", "Adventure", 2);
    }

    @Test
    public void testCanGetTitle(){
        assertEquals("The Hobbit", movie.getTitle());
    }

    @Test
    public  void testCanSetTitle(){
        movie.setTitle("The Lord of the Rings");
        assertEquals("The Lord of the Rings", movie.getTitle());
    }

}

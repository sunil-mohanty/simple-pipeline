package com.ski.app;

import com.ski.model.Variable;

/**
 * App!
 *
 */
public class App 
{
    public static void main( String[] args ){
        System.out.println( "App!" );
        Multiplier multiplier = new Multiplier();
        System.out.println("multiplying 3 x 7 = " +  multiplier.multiply(new Variable(3), new Variable(7)));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.wcram.java_part_2;

/**
 *
 * @author WCram
 */
public class Java_Part_2 {

    public static void main(String[] args) {
        
        Animal ednalynnAnimal = new Animal(
                "German Shepard", 
                "Black and White",
                4, 
                true );
        
        // Name color legs tail
        Animal animal = new Dog("PitBull", "Orange", 3, false);
        
        Dog covertToADog = (Dog)animal;
        
        Object animalIsAnObject = animal;
        
        Dog objectToDog = (Dog)animalIsAnObject;
        
        // Explict and Implict Casting
        
        // Object - Generic
        // Animal
        // Dog
        // German Shepard - Specific
        
        Object d = new Animal("Mochi", "Tux", 4, true);

        
        
        
        
//        ednalynnAnimal.Run();
//        System.out.println("Hello World!");
        
        /*
        Regarding your question about inheritance - children classes can use methods of their parent classes; parents and their methods can be set internal if only their children need to access them
        
        // Sharing fields and methods and properties
        // Access modifiers
        
        //            Animal - Run
        //    Dog - Run                Cat - Run
        // Lab - Pitbull  Grey Hair -   Tabby ( What types are tabby )
        
        */
    }
}

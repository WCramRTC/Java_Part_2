/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wcram.java_part_2;

/**
 *
 * @author WCram
 */

// In C#
// Current Class : Parent Class

public class Dog extends Animal {
    
    enum EarType {
        Floppy,
        Pointy
    }
    
    // The super class is the parent class
    // C# equilivant base
    
    // C# public Dog(...) : base(....) {}
    // Java public Dog(..) { Super(...) }
    
    boolean _isLoyal;
    EarType _earType;

    public Dog(boolean _isLoyal, EarType _earType, String _name, String _color, int _legs, boolean _hasTail) {
        super(_name, _color, _legs, _hasTail);
        this._isLoyal = _isLoyal;
        this._earType = _earType;
    }
    
    
    
    public Dog(String _name, String _color, int _legs, boolean _hasTail) {
        super(_name, _color, _legs, _hasTail);
    }
    
    public void Bark() {
        System.out.println(getCall());
    }
    
}

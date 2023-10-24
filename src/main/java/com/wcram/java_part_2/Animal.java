/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wcram.java_part_2;

/**
 *
 * @author WCram
 */
public class Animal {
    
    // Fields
    String _name;
    String _color;
    int _legs;
    boolean _hasTail;
    String _call;

    public String getCall() {
        return _call;
    }

    public void setCall(String _call) {
        this._call = _call;
    }

    public Animal(String _name, String _color, int _legs, boolean _hasTail, String _call) {
        this._name = _name;
        this._color = _color;
        this._legs = _legs;
        this._hasTail = _hasTail;
        this._call = _call;
    }
    
    
    
    // Constructors
    public Animal(String _name, String _color, int _legs, boolean _hasTail) {
        this._name = _name;
        this._color = _color;
        this._legs = _legs;
        this._hasTail = _hasTail;
    }

    // Properties
        public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public String getColor() {
        return _color;
    }

    public void setColor(String _color) {
        this._color = _color;
    }

    public int getLegs() {
        return _legs;
    }

    public void setLegs(int _legs) {
        this._legs = _legs;
    }

    public boolean isHasTail() {
        return _hasTail;
    }

    public void setHasTail(boolean _hasTail) {
        this._hasTail = _hasTail;
    }

    // Methods
    public void Run() {
        System.out.println(this._name + " is running on " + this._legs );
    }

} // class

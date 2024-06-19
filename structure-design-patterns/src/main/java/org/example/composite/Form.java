package org.example.composite;

public class Form implements Component{
    @Override
    public void render() {
        System.out.println("Rendering form");
    }

    @Override
    public void move() {
        System.out.println("Moving form");

    }
}

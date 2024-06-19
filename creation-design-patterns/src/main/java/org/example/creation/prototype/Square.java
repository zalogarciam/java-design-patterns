package org.example.creation.prototype;

public class Square implements Component {
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    @Override
    public void render() {
        System.out.println("Rendering a square");
    }

    @Override
    public Component clone() {
        Square newSquare = new Square();
        newSquare.setHeight(height);
        return newSquare;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylists;

/**
 *
 * @author celeb
 */
public class Rectangle {
    private double length;
    private double width;
    private String colour;
    private boolean isFilled;

    public Rectangle(double length, double width, String colour, boolean isFilled) {
        this.length = length;
        this.width = width;
        this.colour = colour;
        this.isFilled = isFilled;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String getColour() {
        return colour;
    }

    public boolean isIsFilled() {
        return isFilled;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
    
    
}

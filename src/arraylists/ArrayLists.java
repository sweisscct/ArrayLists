/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylists;

import java.util.ArrayList;

/**
 *
 * @author Sam
 * 
 * Arrays:
 *  fixed size
 *      Need to specify in advance
 *  store multiple values
 *  Can store primitive (ie int) as well as objects (ie String, Car)
 * 
 * ArrayList
 *  
 */
public class ArrayLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4};
        
        // Can't have an ArrayList of ints
//        ArrayList<int> intArrayList;

        // To get around this, we use wrapper class
        ArrayList<Integer> intArrayList = new ArrayList<>();
        
//        int num = Integer.parseInt("5") + 8;

        // Adds the number to the end of the list
        System.out.println(intArrayList.size());
        intArrayList.add(6);
        System.out.println(intArrayList.size());
        intArrayList.add(7);
        System.out.println(intArrayList.size());
        intArrayList.add(8);
        System.out.println(intArrayList.size());
        
        // {6, 7, 8}
        
        // .add(index, element)
        intArrayList.add(0, 5);
        System.out.println(intArrayList.size());
        
        // {5, 6, 7, 8}
        
        // Remove the 7
        intArrayList.remove(2);
        System.out.println(intArrayList.size());
        
        // {5, 6, 8}
        
        System.out.println(intArrayList.contains(5));
        System.out.println(intArrayList.contains(7));
        
        // Should print 5
        System.out.println(intArrayList.get(0));
        
        // Exercise - write a for loop to print all the elements of the arraylist
        for (int i = 0; i < intArrayList.size(); i++) {
            System.out.println(intArrayList.get(i));
        }
        
        System.out.println(intArrayList.contains(5));
        
        intArrayList.set(0, 123);
        System.out.println(intArrayList.contains(5));
        System.out.println(intArrayList.get(0));
        
        // {123, 6, 8}
        
        Rectangle rect1 = new Rectangle(5, 2, "Yellow", true);
        Rectangle rect2 = new Rectangle(5, 1, "Red", true);
        Rectangle rect3 = new Rectangle(5, 3, "Green", true);
        
        ArrayList<Rectangle> rectList = new ArrayList<>();
        rectList.add(rect1);
        rectList.add(rect2);
        rectList.add(rect3);
        rectList.add(rect1);
        
        Rectangle rect4 = new Rectangle(5, 4, "Blue", true);
        
        System.out.println(rectList.contains(rect1));
        System.out.println(rectList.contains(rect4));
        System.out.println(  rectList  .get(0)   .getColour()  ); // arraylist  retrive element at index 0   getter for that object
        
        // Enchanced for loop
        // Will loop through each element of an array or ArrayList
        // Note: interates through the objects themselves, not their index
        for (Rectangle rectangle : rectList) {
            System.out.println(rectangle.getColour());
        }
        
        rectList.get(0).setColour("Orange");
        
        for (Rectangle rectangle : rectList) {
            System.out.println(rectangle.getColour());
        }     
        
        System.out.println(rect1.getColour());
        
        rectList.get(3).setColour("Purple");
        
        for (Rectangle rectangle : rectList) {
            System.out.println(rectangle.getColour());
        }  
        
        rectList.remove(rect1);
        
        for (Rectangle rectangle : rectList) {
            System.out.println(rectangle.getColour());
        }  
    }
    
}

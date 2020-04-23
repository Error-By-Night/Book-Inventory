/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookinventory;

import java.io.Serializable;

/**
 *
 * @author 2008684
 */
public class Book implements Serializable{
    //Add instance variables
    private String firstName;
    private String lastName;
    private String title;
    private String group;
    private String description;
    private String bookID;
    
    //constructor
    public Book(String firstName, String lastName, String title, String group, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.group = group;
        this.description = description;
        generateBookID();
    }
    
    //gets
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getBookID() {
        return bookID;
    }
    
    public String getGroup() {
        String groupText = "";
        
        //use the switch - case structure
        switch(group){
            case "000":
                groupText = "Computer Science, Information & General Works";
                break;
            case "100":
                groupText = "Philosophy & Psychology";
                break;
            case "200":
                groupText = "Religion";
                break;
            case "300":
                groupText = "Social Sciences";
                break;
            case "400":
                groupText = "Language";
                break;
            case "500":
                groupText = "Science";
                break;
            case "600":
                groupText = "Technology";
                break;
            case "700":
                groupText = "Art & Recreation";
                break;    
            case "800":
                groupText = "Literature";
                break;    
            case "900":
                groupText = "History & Geography";
                break;
        }
        
        return groupText;
    }
    
    private void generateBookID() {
        bookID = group + lastName + firstName.substring(0,1);
    }
    
}

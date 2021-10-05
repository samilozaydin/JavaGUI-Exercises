/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

/**
 *
 * @author Bilal
 */
public class Person {
    
    public static int personId;
    public int id;
    public String mail;
    public String name;
    public String phone;
    public String password;
    public boolean isSmoker;
    public char gender;
    
    public Person(){
        this.id= Person.personId;
        Person.personId++;
        
    }
          

}

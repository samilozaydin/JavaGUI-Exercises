
package Lab1;


public class Person {
    
    private static int idKeeper =0;
    private String name;
    private String surname;
    private int id;
    
    public Person(String name,String surname){
        this.name=name;
        this.surname=surname;
        this.id= idKeeper;
        this.idKeeper++;
    }
    
}

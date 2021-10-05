/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab10;

public class User {

    private String nameSurname;
    private String telephone;
    private String email;
    private String password;
    private String repassword;
    private String address;
    private String gender;

    public User( String nameSurname, String telephone,  String email, String password, String repassword, String address, String gender){
        this.nameSurname=nameSurname;
        this.telephone=telephone;
        this.email=email;
        this.password=password;
        this.repassword=repassword;
        this.address=address;
        this.gender=gender;
    }
}

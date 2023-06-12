package com.mimaraslan._05_hiyerasi_kurma.cokdosyada;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Results {

    private String gender;
    private String email ;
    private String phone ;
    private String cell ;
    private String nat ;

    private  Name name;
    private  Location location;
    private  Login login;
    private  Dob dob;
    private  Registered registered;
    private  Id id;
    private  Picture picture;

}

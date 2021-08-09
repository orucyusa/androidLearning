package com.yusaoruc.denemestaj;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Kullanici implements Serializable {
    ArrayList<String> arrayList = new ArrayList<>();
    String name;
    String password;
    String email;
    public Kullanici(String name,String password,String email){
        this.name=name;
        this.password=password;
        this.email=email;
    }


}


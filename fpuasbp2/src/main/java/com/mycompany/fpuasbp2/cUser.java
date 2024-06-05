/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fpuasbp2;

/**
 *
 * @author Jihan
 */
public class cUser {
 // Object User (dapat berupa non-member dan member)
    // Non Member : nama - "Non-Member", id : "N000", pass : "normal", akumulasi  : 0
    // Member : nama - "Member", id : "M001", pass : "0001", akumulasi : 0
    String nama;
    String id;
    String pass;
    int nomer;

    public cUser(String n, String d, String p, int nm){
        nama = n;
        id = d;
        pass = p;
        nomer = nm;
    }

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    public String getPass() {
        return pass;
    }

    public int getNomer() {
        return nomer;
    }

    
}

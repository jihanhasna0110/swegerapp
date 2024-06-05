/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fpuasbp2;

/**
 *
 * @author Jihan
 */
public class cUserPembeli extends cUser {
  int akumulasi;
    public cUserPembeli(String n, String d, String p, int nm, int ak) {
        super(n,d,p,nm);
        nama = n;
        id = d;
        pass = p;
        nomer = nm;
        akumulasi = ak;


    }

    public int getAkumulasi() {
        return akumulasi;
    }

    public void setAkumulasi(int akumulasi) {
        this.akumulasi = this.akumulasi +akumulasi;
    }
    public void setPass (String pass){
        this.pass = pass;
    }    
}

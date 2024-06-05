/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fpuasbp2;

/**
 *
 * @author Jihan
 */
public class cTransaksi {
 public cTransaksi next;
    int NomorTransaksi;
    cUserPembeli pembeli;
    cProduk produk;
    int jumlahprd;
    int status;
    int total;

    cTransaksi (int nt, cUserPembeli pem, cProduk pr, int jum, int s, int t){
        NomorTransaksi = nt; pembeli = pem; produk = pr; jumlahprd = jum; status = s; total = t;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getNomorTransaksi() {
        return NomorTransaksi;
    }

    public cUserPembeli getPembeli() {
        return pembeli;
    }

    public cProduk getProduk() {
        return produk;
    }

    public int getJumlahprd() {
        return jumlahprd;
    }

    public int getStatus() {
        return status;
    }

    public int getTotal() {
        return total;
    }    
}

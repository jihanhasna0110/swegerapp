/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.fpuasbp2;

import java.util.Scanner;

/**
 *
 * @author Jihan
 */
public class AppSueger {

    public static Scanner sc = new Scanner(System.in);
    public static int pilih3, jumlah;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Daftar data Produk
        cProduk prd1 = new cProduk("Jus Alpukat", 10000, "M001", 0, 0);
        cProduk prd2 = new cProduk("Jus Mangga", 10000, "M002", 0, 0);
        cProduk prd3 = new cProduk("Jus Jambu", 10000, "M003", 0, 0);
        cProduk prd4 = new cProduk("Jus Apel", 10000, "M004", 0, 0);
        cProduk prd5 = new cProduk("Jus Wortel", 10000, "M005", 0, 0);
        cProduk prd6 = new cProduk("Jus Naga", 10000, "M006", 0, 0);
        cProduk prd7 = new cProduk("Jus Tomat", 10000, "M007", 0, 0);
        cProduk prd8 = new cProduk("Beng-Beng", 7000, "M008", 0, 0);
        cProduk prd9 = new cProduk("Chocolatos", 7000, "M009", 0, 0);
        cProduk prd10 = new cProduk("Nutrisari", 7000, "M0010", 0, 0);
        cProduk prd11 = new cProduk("Milo", 7000, "M0011", 0, 0);

        // Daftar data User
        cUser admin = new cUser("admin", "admin", "123", 000);
        cUser pemilik = new cUser("owner", "owner", "123", 001);
        // Daftar data Pembeli
        cUserPembeli nonmbr = new cUserPembeli("nonmem", "nonmbr", "123", 100, 0);
        cUserPembeli mbr1 = new cUserPembeli("jihan", "jihan123", "123", 101, 0);
        cUserPembeli mbr2 = new cUserPembeli("ana", "ana123", "123", 102, 0);
        cUserPembeli mbr3 = new cUserPembeli("betari", "betari123", "123", 103, 0);
        cUserPembeli mbr4 = new cUserPembeli("praja", "praja123", "123", 103, 0);
        int member;
        String nama = null, username, password;
        double diskon = 0.05;
        int totalPenjualan = 0;
        int totalPembelian = 0;
        int totalDiskon = 0;

        //Terdapat dua linkedlist menghimpun transaksi satu pembeli (beli) ketika melakukan transaksi yang belum diproses
        // dan seluruh transaksi (jual)
        cDaftarTransaksi transaksi_penjualan = new cDaftarTransaksi();
        int pilih, pilih2 = 0, pesanan = 0, notransaksi = 0;

        // Aplikasi AppCafe
        // 1. Pembeli -->
        // 2. Anggota -->
        // 3. Admin -->
        // 4. Pemilik -->
        do {
            System.out.println("=================================================");
            System.out.println("SELAMAT DATANG DI TOKO SUEGER!!!");
            System.out.println("-------------------------------------------------");
            System.out.println("1. Pembeli\n2. Anggota\n3. Admin\n4. Pemilik\n5. Selesai");
            System.out.println("------------------------------------------------");
            System.out.print("Pilih Nomor :");
            pilih = sc.nextInt();
            System.out.println("=================================================");
            switch (pilih) {
                case 1:
                    // Pembeli Non-Member
                    notransaksi++;
                    int jumtrans = 0;
                    // Linked List memasukkan data dari pembeli
                    cDaftarTransaksi transaksi_pembelian = new cDaftarTransaksi();
                    System.out.print("Masukkan Nama = ");
                    nama = sc.next();
                    do {
                        System.out.println("-------------------------------------------------");
                        System.out.println("Halo, " + nama + " Selamat Datang di Menu Pembelian");
                        System.out.println("-------------------------------------------------");
                        System.out.println("1. Tambah\n2. Hapus\n3. Lihat\n4. Kembali");
                        System.out.println("-------------------------------------------------");
                        System.out.print("Pilih Nomor :");
                        pilih2 = sc.nextInt();
                        System.out.println("=================================================");
                        switch (pilih2) {
                            case 1:
                                cTransaksi temp = null;
                                mPembeli_TambahBarang();
                                if (pilih3 == 1) {
                                    temp = new cTransaksi(notransaksi, nonmbr, prd1, jumlah, 0, prd1.getHarga() * jumlah);
                                } else if (pilih3 == 2) {
                                    temp = new cTransaksi(notransaksi, nonmbr, prd2, jumlah, 0, prd2.getHarga() * jumlah);
                                } else if (pilih3 == 3) {
                                    temp = new cTransaksi(notransaksi, nonmbr, prd3, jumlah, 0, prd3.getHarga() * jumlah);
                                } else if (pilih3 == 4) {
                                    temp = new cTransaksi(notransaksi, nonmbr, prd4, jumlah, 0, prd4.getHarga() * jumlah);
                                } else if (pilih3 == 5) {
                                    temp = new cTransaksi(notransaksi, nonmbr, prd5, jumlah, 0, prd5.getHarga() * jumlah);
                                }else if (pilih3 == 6) {
                                    temp = new cTransaksi(notransaksi, nonmbr, prd6, jumlah, 0, prd6.getHarga() * jumlah);
                                }else if (pilih3 == 7) {
                                    temp = new cTransaksi(notransaksi, nonmbr, prd7, jumlah, 0, prd7.getHarga() * jumlah);
                                }else if (pilih3 == 8) {
                                    temp = new cTransaksi(notransaksi, nonmbr, prd8, jumlah, 0, prd8.getHarga() * jumlah);
                                }else if (pilih3 == 9) {
                                    temp = new cTransaksi(notransaksi, nonmbr, prd9, jumlah, 0, prd9.getHarga() * jumlah);
                                }else if (pilih3 == 10) {
                                    temp = new cTransaksi(notransaksi, nonmbr, prd10, jumlah, 0, prd10.getHarga() * jumlah);
                                }else if (pilih3 == 11) {
                                    temp = new cTransaksi(notransaksi, nonmbr, prd11, jumlah, 0, prd11.getHarga() * jumlah);
                                } 
                                transaksi_pembelian.tambahTransaksi(temp);
                                jumtrans++;
                                totalPembelian = totalPembelian + temp.getTotal();
                                System.out.println("=================================================");
                                break;
                            case 2:
                                // Hapus Transaksi
                                //Agar tidak terjadi error ketika belum ada transasksi
                                if (jumtrans > 0) {
                                    transaksi_pembelian.lihatTransaksi();
                                    System.out.print("Hapus Nomor = ");
                                    int hapus = sc.nextInt();
                                    transaksi_pembelian.hapusTransaksi(hapus);
                                } else {
                                    System.out.println("Tidak ada transaksi");
                                }
                                break;
                            case 3:
                                transaksi_pembelian.lihatTransaksi();
                                break;
                            case 4:
                                //Transaksi selesai, sambungkan transaksi pembeli ke antrian transaksi overall
                                transaksi_penjualan.sambungTransaksi(transaksi_pembelian.getFront(), transaksi_pembelian.getRear());
                                break;

                        }
                    } while (pilih2 != 4);
                    break;
                case 2:
                    // Pembeli Member
                    transaksi_pembelian = new cDaftarTransaksi();
                    cUserPembeli tempMember = null;
                    boolean login = false,
                     cek = false;

                    if (login == false) {
                        boolean found = false;
                        do {
                            System.out.println("=================================================");
                            System.out.print("|   Login  | ");
                            username = sc.next();
                            System.out.print("| Password | ");
                            password = sc.next();
                            System.out.println("=================================================");
                            if (username.equals(mbr1.getId()) && password.equals(mbr1.getPass())) {
                                member = 1;
                                nama = mbr1.getNama();
                                found = true;
                                login = true;
                                cek = true;
                                tempMember = mbr1;
                            } else if (username.equals(mbr2.getId()) && password.equals(mbr2.getPass())) {
                                member = 2;
                                nama = mbr2.getNama();
                                found = true;
                                login = true;
                                cek = true;
                                tempMember = mbr2;
                            } else if (username.equals(mbr3.getId()) && password.equals(mbr3.getPass())) {
                                member = 3;
                                nama = mbr3.getNama();
                                found = true;
                                login = true;
                                cek = true;
                                tempMember = mbr3;
                            } else if (username.equals(mbr4.getId()) && password.equals(mbr4.getPass())) {
                                member = 4;
                                nama = mbr4.getNama();
                                found = true;
                                login = true;
                                cek = true;
                                tempMember = mbr4;
                            } else {
                                System.out.println("Username/Password Salah");
                                System.out.println("-------------------------------------------------");
                                System.out.println("Mencoba Login Kembali?");
                                System.out.println("1: Ya / 2: Tidak");
                                System.out.print("Pilih = ");
                                pilih3 = sc.nextInt();
                                System.out.println("-------------------------------------------------");
                                if (pilih3 == 1) {
                                    login = false;
                                    found = false;
                                } else if (pilih3 == 2) {
                                    found = true;
                                    login = false;
                                    break;
                                }
                            }
                        } while (found != true);
                    }

                    if (login == true) {
                        int tempDiskon = 0;
                        jumtrans = 0;
                        notransaksi++;
                        do {
                            System.out.println("Halo, " + nama + ". Selamat Datang di Menu Pembelian");
                            System.out.println("------------------------------------------------");
                            System.out.println("Member akan mendapat diskon 5%");
                            System.out.println("------------------------------------------------");
                            System.out.println("1. Tambah\n2. Hapus\n3. Lihat\n4. Ubah Password\n5. Kembali");
                            System.out.println("-------------------------------------------------");
                            System.out.print("Pilih Nomor :");
                            pilih2 = sc.nextInt();
                            System.out.println("=================================================");
                            switch (pilih2) {
                                case 1:
                                    cTransaksi temp = null;
                                    mPembeli_TambahBarang();
                                    if (pilih3 == 1) {
                                        tempDiskon = (int) (prd1.getHarga() * jumlah * diskon);
                                        temp = new cTransaksi(notransaksi, tempMember, prd1, jumlah, 0, (int) ((prd1.getHarga() * jumlah) - (tempDiskon)));
                                    } else if (pilih3 == 2) {
                                        tempDiskon = (int) (prd2.getHarga() * jumlah * diskon);
                                        temp = new cTransaksi(notransaksi, tempMember, prd2, jumlah, 0, (int) (prd2.getHarga() * jumlah - (tempDiskon)));
                                    } else if (pilih3 == 3) {
                                        tempDiskon = (int) (prd3.getHarga() * jumlah * diskon);
                                        temp = new cTransaksi(notransaksi, tempMember, prd3, jumlah, 0, (int) (prd3.getHarga() * jumlah - (tempDiskon)));
                                    } else if (pilih3 == 4) {
                                        tempDiskon = (int) (prd4.getHarga() * jumlah * diskon);
                                        temp = new cTransaksi(notransaksi, tempMember, prd4, jumlah, 0, (int) (prd4.getHarga() * jumlah - (tempDiskon)));
                                    } else if (pilih3 == 5) {
                                        tempDiskon = (int) (prd5.getHarga() * jumlah * diskon);
                                        temp = new cTransaksi(notransaksi, tempMember, prd5, jumlah, 0, (int) (prd5.getHarga() * jumlah - (tempDiskon)));
                                    } else if (pilih3 == 6) {
                                        tempDiskon = (int) (prd6.getHarga() * jumlah * diskon);
                                        temp = new cTransaksi(notransaksi, tempMember, prd6, jumlah, 0, (int) (prd6.getHarga() * jumlah - (tempDiskon)));
                                    } else if (pilih3 == 7) {
                                        tempDiskon = (int) (prd7.getHarga() * jumlah * diskon);
                                        temp = new cTransaksi(notransaksi, tempMember, prd7, jumlah, 0, (int) (prd7.getHarga() * jumlah - (tempDiskon)));
                                    } else if (pilih3 == 8) {
                                        tempDiskon = (int) (prd8.getHarga() * jumlah * diskon);
                                        temp = new cTransaksi(notransaksi, tempMember, prd8, jumlah, 0, (int) (prd8.getHarga() * jumlah - (tempDiskon)));
                                    } else if (pilih3 == 9) {
                                        tempDiskon = (int) (prd9.getHarga() * jumlah * diskon);
                                        temp = new cTransaksi(notransaksi, tempMember, prd9, jumlah, 0, (int) (prd9.getHarga() * jumlah - (tempDiskon)));
                                    } else if (pilih3 == 10) {
                                        tempDiskon = (int) (prd10.getHarga() * jumlah * diskon);
                                        temp = new cTransaksi(notransaksi, tempMember, prd10, jumlah, 0, (int) (prd10.getHarga() * jumlah - (tempDiskon)));
                                    } else if (pilih3 == 11) {
                                        tempDiskon = (int) (prd11.getHarga() * jumlah * diskon);
                                        temp = new cTransaksi(notransaksi, tempMember, prd11, jumlah, 0, (int) (prd11.getHarga() * jumlah - (tempDiskon)));
                                    }
                                    transaksi_pembelian.tambahTransaksi(temp);
                                    jumtrans++;
                                    totalPembelian = totalPembelian + temp.getTotal();
                                    totalDiskon = totalDiskon + tempDiskon;
                                    System.out.println("=================================================");
                                    break;
                                case 2:
                                    // Hapus Transaksi
                                    //Agar tidak terjadi error ketika belum ada transasksi
                                    if (jumtrans > 0) {
                                        transaksi_pembelian.lihatTransaksi();
                                        System.out.println("Hapus Nomor = ");
                                        int hapus = sc.nextInt();
                                        transaksi_pembelian.hapusTransaksi(hapus);
                                    } else {
                                        System.out.println("Tidak ada transaksi");
                                    }
                                    break;
                                case 3:
                                    transaksi_pembelian.lihatTransaksi();
                                    break;
                                case 4:
                                    System.out.println("=================================================");
                                    System.out.print("| Password Baru | ");
                                    password = sc.next();
                                    System.out.println("=================================================");
                                    tempMember.setPass(password);
                                    break;
                                case 5:
                                    //Transaksi selesai, sambungkan transaksi pembeli ke antrian transaksi overall
                                    transaksi_penjualan.sambungTransaksi(transaksi_pembelian.getFront(), transaksi_pembelian.getRear());
                                    break;

                            }
                        } while (pilih2 != 5);
                    }
                    break;
                case 3:
                    //Admin
                    boolean found = false;
                    do {
                        System.out.println("=================================================");
                        System.out.print("|   Login  | ");
                        username = sc.next();
                        System.out.print("| Password | ");
                        password = sc.next();
                        System.out.println("=================================================");
                        if (username.equals(admin.getId()) && password.equals(admin.getPass())) {
                            found = true;
                        } else {
                            System.out.println("ID/PASSWORD SALAH !!!");
                            System.out.println("--------------------------------------------------");
                            System.out.println("Mencoba Login Kembali?");
                            System.out.println("1: Ya / 2: Tidak");
                            System.out.print("Pilih = ");
                            pilih3 = sc.nextInt();
                            if (pilih3 == 1) {
                                found = false;
                            } else {
                                found = true;
                            }
                        }
                    } while (found != true);
                    if (username.equals(admin.getId()) && password.equals(admin.getPass())) {
                        do {
                            System.out.println("Halo, Selamat datang Admin");
                            System.out.println("-------------------------------------------------");
                            System.out.println("1. Lihat Transaksi\n2. Proses Transaksi\n3. Selesai");
                            System.out.println("-------------------------------------------------");
                            System.out.print("Pilih Nomor :");
                            pilih2 = sc.nextInt();
                            // Untuk Memproses transaksi Pembelian
                            switch (pilih2) {
                                case 1:
                                    transaksi_penjualan.lihatTransaksi();
                                    break;
                                case 2:
                                    cTransaksi temp = transaksi_penjualan.getFront();
                                    System.out.println("\t\t\t-Proses Transaksi-");
                                    System.out.println("-------------------------------------------------");
                                    System.out.println("No Kode  Pembeli        Item \t\t\tHarga\t\t Jumlah\t   Status\t   Total");
                                    System.out.println("-------------------------------------------------");
                                    int i = 1;
                                    do {
                                        if (temp.getStatus() == 0) {
                                            System.out.print(i + ".");
                                            System.out.print(" 00" + temp.getNomorTransaksi());
                                            System.out.print("   " + temp.getPembeli().getNama() + " \t\t");
                                            System.out.print(temp.getProduk().getNama() + "\t\t");
                                            System.out.print("Rp" + temp.getProduk().getHarga() + "\t\t\t");
                                            System.out.print(temp.getJumlahprd() + "\t\t ");
                                            System.out.print(temp.getStatus() + "\t\t ");
                                            System.out.println("  Rp" + temp.getTotal() + "");
                                            System.out.println("-------------------------------------------------");
                                            System.out.println("Transaksi (" + i + ") Pilih:");
                                            System.out.println("1. Diproses");
                                            System.out.println("2. Selesai");
                                            System.out.print("Pilih : ");
                                            int pilih3 = sc.nextInt();
                                            if (pilih3 == 1) {
                                                transaksi_penjualan.prosesTransaksi(temp);
                                                totalPenjualan = totalPenjualan + temp.getTotal();
                                                totalPembelian = totalPembelian - temp.getTotal();
                                                pesanan++;
                                            } else {
                                                break;
                                            }
                                        }
                                        temp = temp.next;
                                    } while (temp != null);
                                    if (temp == null) {
                                        System.out.println("Tidak ada transaksi");
                                        System.out.println("-------------------------------------------------");
                                    }
                            }
                        } while (pilih2 != 3);
                    }
                    break;
                case 4:
                    //Pemilik
                    found = false;
                    do {
                        System.out.println("=================================================");
                        System.out.print("|   Login  | ");
                        username = sc.next();
                        System.out.print("| Password | ");
                        password = sc.next();
                        System.out.println("=================================================");
                        if (username.equals(pemilik.getId()) && password.equals(pemilik.getPass())) {
                            found = true;
                        } else {
                            System.out.println("ID/PASSWORD SALAH !!!");
                            System.out.println("--------------------------------------------------");
                            System.out.println("Mencoba Login Kembali?");
                            System.out.println("1: Ya / 2: Tidak");
                            System.out.print("Pilih = ");
                            pilih3 = sc.nextInt();
                            if (pilih3 == 1) {
                            } else {
                                found = true;
                            }
                        }
                    } while (found != true);
                    if (username.equals(pemilik.getId()) && password.equals(pemilik.getPass())) {
                        do {
                            System.out.println("Halo, Owner Selamat Datang");
                            System.out.println("--------------------------------------------------");
                            System.out.println("1. History Transaksi\n2. Merubah Menu\n3. Laporan Penjualan Produk"
                                    + "\n4. Laporan Pembelian Member\n5. Laporan Grafik Bulanan\n6. Kembali");
                            System.out.println("-------------------------------------------------");
                            System.out.print("Pilih Nomor :");
                            pilih2 = sc.nextInt();
                            System.out.println("=================================================");
                            switch (pilih2) {
                                case 1:
                                    // History Transaksi Sesudah & Sebelum Diproses
                                    System.out.println("History Transaksi Pembelian Belum Diproses");
                                    System.out.println("-------------------------------------------------");
                                    System.out.println("Total Pembelian = Rp" + totalPembelian);
                                    transaksi_penjualan.historyPembelian();
                                    System.out.println("-------------------------------------------------");
                                    System.out.println("History Transaksi Penjualan");
                                    System.out.println("-------------------------------------------------");
                                    System.out.println("Total Penjualan = Rp" + totalPenjualan);
                                    transaksi_penjualan.historyPenjualan();
                                    System.out.println("=================================================");
                                    break;
                                case 2:
                                    // Perubahan Harga Menu
                                    cek = false;
                                    cProduk temp = null;
                                    System.out.println("NB : Perubahan harga akan mereset data penjualan produk");
                                    System.out.println("--------------------------------------------------");
                                    System.out.println("\t \tMenu Sueger");
                                    System.out.println("--------------------------------------------------");
                                    System.out.println("1. Jus Alpukat");
                                    System.out.println("2. Jus Mangga");
                                    System.out.println("3. Jus Jambu");
                                    System.out.println("4. Jus Apel");
                                    System.out.println("5. Jus Wortel");
                                    System.out.println("6. Jus Naga");
                                    System.out.println("7. Jus Tomat");
                                    System.out.println("8. Beng-Beng");
                                    System.out.println("9. Chocolatos");
                                    System.out.println("10. Nutrisari");
                                    System.out.println("11. Milo");
                                    System.out.println("12. Kembali");
                                    System.out.println("--------------------------------------------------");
                                    System.out.print("Pilih = ");
                                    pilih3 = sc.nextInt();
                                    System.out.println("--------------------------------------------------");
                                    if (pilih3 == 1) {
                                        temp = prd1;
                                        cek = true;
                                    } else if (pilih3 == 2) {
                                        temp = prd2;
                                        cek = true;
                                    } else if (pilih3 == 3) {
                                        temp = prd3;
                                        cek = true;
                                    } else if (pilih3 == 4) {
                                        temp = prd4;
                                        cek = true;
                                    } else if (pilih3 == 5) {
                                        temp = prd5;
                                        cek = true;
                                    } else if (pilih3 == 6) {
                                        temp = prd6;
                                        cek = true;
                                    }else if (pilih3 == 7) {
                                        temp = prd7;
                                        cek = true;
                                    }else if (pilih3 == 8) {
                                        temp = prd8;
                                        cek = true;
                                    }else if (pilih3 == 9) {
                                        temp = prd9;
                                        cek = true;
                                    }else if (pilih3 == 10) {
                                        temp = prd10;
                                        cek = true;
                                    }else if (pilih3 == 11) {
                                        temp = prd11;
                                        cek = true;
                                    }else {
                                        cek = false;
                                    }
                                    if (cek = true) {
                                        System.out.println("Produk      = " + temp.getNama());
                                        System.out.println("Harga Lama  = " + temp.getHarga());
                                        System.out.print("Harga Baru  = ");
                                        int tempharga = sc.nextInt();
                                        temp.setHarga(tempharga);
                                        //Akumulasi harga akan direset
                                        temp.setAkumulasi(0);
                                        temp.setJumakumulasi(0);
                                        System.out.println("--------------------------------------------------");
                                        System.out.println("Perubahan Berhasil...");
                                        System.out.println("--------------------------------------------------");
                                    }
                                    break;
                                case 3:
                                    // Laporan Pemasukan Harian
                                    System.out.println("--------------------------------------------------");
                                    System.out.println("\t \tLaporan Pemasukan Harian");
                                    System.out.println("--------------------------------------------------");
                                    System.out.println("Total Penjualan = Rp" + totalPenjualan);
                                    System.out.println("--------------------------------------------------");
                                    System.out.println("No  Item \t\t\tHarga\t\t Jumlah\t   Status\t   Total");
                                    System.out.println("1." + prd1.getNama() + "  = Rp" + prd1.getakumulasi() + "  - " + prd1.getJumakumulasi());
                                    System.out.println("2." + prd2.getNama() + "  = Rp" + prd2.getakumulasi() + "  - " + prd2.getJumakumulasi());
                                    System.out.println("3." + prd3.getNama() + "  = Rp" + prd3.getakumulasi() + "  - " + prd3.getJumakumulasi());
                                    System.out.println("4." + prd4.getNama() + "  = Rp" + prd4.getakumulasi() + "  - " + prd4.getJumakumulasi());
                                    System.out.println("5." + prd5.getNama() + "  = Rp" + prd5.getakumulasi() + "  - " + prd5.getJumakumulasi());
                                    System.out.println("6." + prd6.getNama() + "  = Rp" + prd6.getakumulasi() + "  - " + prd6.getJumakumulasi());
                                    System.out.println("7." + prd7.getNama() + "  = Rp" + prd7.getakumulasi() + "  - " + prd7.getJumakumulasi());
                                    System.out.println("8." + prd8.getNama() + "  = Rp" + prd8.getakumulasi() + "  - " + prd8.getJumakumulasi());
                                    System.out.println("9." + prd9.getNama() + "  = Rp" + prd9.getakumulasi() + "  - " + prd9.getJumakumulasi());
                                    System.out.println("10." + prd10.getNama() + "  = Rp" + prd10.getakumulasi() + "  - " + prd10.getJumakumulasi());
                                    System.out.println("11." + prd11.getNama() + "  = Rp" + prd11.getakumulasi() + "  - " + prd11.getJumakumulasi());
                                    System.out.println("=================================================");
                                    break;
                                case 4:
                                    // Laporan Pembelian Member
                                    System.out.println("--------------------------------------------------");
                                    System.out.println("\t \tLaporan Pembelian Member");
                                    System.out.println("--------------------------------------------------");
                                    System.out.println("Total Pembelian Member = Rp" + (mbr1.getAkumulasi() + mbr2.getAkumulasi() + mbr3.getAkumulasi()));
                                    System.out.println("--------------------------------------------------");
                                    System.out.println(mbr1.getNama() + " = Rp" + mbr1.getAkumulasi());
                                    System.out.println(mbr2.getNama() + " = Rp" + mbr2.getAkumulasi());
                                    System.out.println(mbr3.getNama() + " = Rp" + mbr3.getAkumulasi());
                                    System.out.println(mbr4.getNama() + " = Rp" + mbr4.getAkumulasi());
                                    System.out.println("=================================================");
                                    break;
                                case 5:
                                    // Laporan Grafik Bulanan
                                    System.out.println("--------------------------------------------------");
                                    System.out.println("\t \tLaporan Grafik Bulanan");
                                    System.out.println("--------------------------------------------------");
                                    System.out.println("Total Penjualan = Rp" + totalPenjualan);
                                    System.out.println("--------------------------------------------------");
                                    System.out.print(prd1.getNama() + "\t: ");
                                    for (int i = 0; i < prd1.getakumulasi() / 10000; i++) {
                                        if ((prd1.getakumulasi() / 10000) - i < 1) {
                                            break;
                                        }
                                        System.out.print("X");
                                    }
                                    System.out.println(" - " + Math.floor(prd1.getakumulasi()));
                                    System.out.print(prd2.getNama() + "\t: ");
                                    for (int i = 0; i < prd2.getakumulasi() / 10000; i++) {
                                        if ((prd2.getakumulasi() / 10000) - i < 1) {
                                            break;
                                        }
                                        System.out.print("X");
                                    }
                                    System.out.println(" - " + Math.floor(prd2.getakumulasi()));
                                    System.out.print(prd3.getNama() + "\t: ");
                                    for (int i = 0; i < prd3.getakumulasi() / 10000; i++) {
                                        if ((prd3.getakumulasi() / 10000) - i < 1) {
                                            break;
                                        }
                                        System.out.print("X");
                                    }
                                    System.out.println(" - " + Math.floor(prd3.getakumulasi()));
                                    System.out.print(prd4.getNama() + "\t: ");
                                    for (int i = 0; i < prd4.getakumulasi() / 10000; i++) {
                                        if ((prd4.getakumulasi() / 10000) - i < 1) {
                                            break;
                                        }
                                        System.out.print("X");
                                    }
                                    System.out.println(" - " + Math.floor(prd4.getakumulasi()));
                                    System.out.print(prd5.getNama() + "\t: ");
                                    for (int i = 0; i < prd5.getakumulasi() / 10000; i++) {
                                        if ((prd5.getakumulasi() / 10000) - i < 1) {
                                            break;
                                        }
                                        System.out.print("X");
                                    }
                                    System.out.println(" - " + Math.floor(prd5.getakumulasi()));
                                    System.out.print(prd6.getNama() + "\t: ");
                                    for (int i = 0; i < prd6.getakumulasi() / 10000; i++) {
                                        if ((prd6.getakumulasi() / 10000) - i < 1) {
                                            break;
                                        }
                                        System.out.print("X");
                                    }
                                    System.out.println(" - " + Math.floor(prd6.getakumulasi()));
                                    System.out.print(prd7.getNama() + "\t: ");
                                    for (int i = 0; i < prd7.getakumulasi() / 10000; i++) {
                                        if ((prd7.getakumulasi() / 10000) - i < 1) {
                                            break;
                                        }
                                        System.out.print("X");
                                    }
                                    System.out.println(" - " + Math.floor(prd7.getakumulasi()));
                                    System.out.print(prd8.getNama() + "\t: ");
                                    for (int i = 0; i < prd8.getakumulasi() / 10000; i++) {
                                        if ((prd8.getakumulasi() / 10000) - i < 1) {
                                            break;
                                        }
                                        System.out.print("X");
                                    }
                                    System.out.println(" - " + Math.floor(prd8.getakumulasi()));
                                    System.out.print(prd9.getNama() + "\t: ");
                                    for (int i = 0; i < prd9.getakumulasi() / 10000; i++) {
                                        if ((prd9.getakumulasi() / 10000) - i < 1) {
                                            break;
                                        }
                                        System.out.print("X");
                                    }
                                    System.out.println(" - " + Math.floor(prd9.getakumulasi()));
                                    System.out.print(prd10.getNama() + "\t: ");
                                    for (int i = 0; i < prd10.getakumulasi() / 10000; i++) {
                                        if ((prd10.getakumulasi() / 10000) - i < 1) {
                                            break;
                                        }
                                        System.out.print("X");
                                    }
                                    System.out.println(" - " + Math.floor(prd10.getakumulasi()));
                                    System.out.print(prd11.getNama() + "\t: ");
                                    for (int i = 0; i < prd11.getakumulasi() / 10000; i++) {
                                        if ((prd11.getakumulasi() / 10000) - i < 1) {
                                            break;
                                        }
                                        System.out.print("X");
                                    }
                                    System.out.println(" - " + Math.floor(prd5.getakumulasi()));
                                    System.out.println("=================================================");
                                    break;
                            }
                        } while (pilih2 != 6);
                    }
                    break;
            }
        } while (pilih != 5);
    }

    public static void mPembeli_TambahBarang() {
        System.out.println("\t \tMenu Sueger");
        System.out.println("--------------------------------------------------");
        System.out.println("1. Jus Alpukat");
        System.out.println("2. Jus Mangga");
        System.out.println("3. Jus Jambu");
        System.out.println("4. Jus Apel");
        System.out.println("5. Jus Wortel");
        System.out.println("6. Jus Naga");
        System.out.println("7. Jus Tomat");
        System.out.println("8. Beng-Beng");
        System.out.println("9. Chocolatos");
        System.out.println("10. Nutrisari");
        System.out.println("11. Milo");
        System.out.println("--------------------------------------------------");
        System.out.print("Pilih = ");
        pilih3 = sc.nextInt();
        System.out.print("Jumlah = ");
        jumlah = sc.nextInt();
        System.out.println("=================================================");
    }
}

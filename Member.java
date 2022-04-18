/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_ukl1;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Member implements Penginput {
     private ArrayList<String> namaMember = new ArrayList<String> ();
    private ArrayList<String> alamat = new ArrayList<String> ();
    private ArrayList<String> telepon = new ArrayList<String> ();
    private ArrayList<Integer> saldo = new ArrayList<Integer> ();
    
    //KONTRUKTOR = ADALAH METHOD  YANG NAMANYA SAMA DENGAN CLAS DAN DIA  AKAN DIJALANKAN SAAT DIEKSEKUSI
    public Member (){
        this.namaMember.add("Abby");
        this.alamat.add("Malang");
        this.telepon.add("08973264451");
        this.saldo.add(200000);
        
        this.namaMember.add("Avif");
        this.alamat.add("Nganjuk");
        this.telepon.add("082230422105");
        this.saldo.add(350000);
        
        this.namaMember.add("Fahri");
        this.alamat.add ("Malang");
        this.telepon.add("082141137980");
        this.saldo.add(150000);
        
        this.namaMember.add("Andini");
        this.alamat.add ("Malang");
        this.telepon.add("081232167707");
        this.saldo.add(150000);
        
       
    }
    public void setaldo ( int saldo){
        this.saldo.add(saldo);
    }
    
    public int getSaldo(int idMember){
        return this.saldo.get(idMember);        
    }
    
    public void editSaldo (int idMember, int saldo){
        this.saldo.set(idMember,saldo);
    } 
    
   public int getJmlMember (){
       return this.saldo.size();
   }
    @Override
    public void setNama(String namamember) {
        this.namaMember.add(namamember);
    }

    @Override
    public void setAlamat(String alamat) {
       this.namaMember.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.namaMember.add(telepon);
    }

    @Override
    public String getNama(int idMember) {
        return this.namaMember.get(idMember);
     
    }

    @Override
    public String getTelepon(int idMember) {
        return this.telepon.get(idMember);
    }

    @Override
    public String getAlamat(int idMember) {
       return this.alamat.get (idMember);
    }
}

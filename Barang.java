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
public class Barang {
    private ArrayList<String> namaBarang = new ArrayList<String>();    
    private ArrayList<Integer> stok = new ArrayList<Integer>();    
    private ArrayList<Integer> harga = new ArrayList<Integer>(); 
     
    public Barang() { 
        this.namaBarang.add("Mie Sedap Kremes");       
        this.stok.add(89);    
        this.harga.add(4000); 
 
        this.namaBarang.add("Mie Indomie");        
        this.stok.add(36);   
        this.harga.add(5000); 
  
        this.namaBarang.add("Mie Sarimi");       
        this.stok.add(54);     
         this.harga.add(7000);
        
    }      public int getJmlBarang(){     
        return this.namaBarang.size(); 
    } 
    public void setNamaBarang(String namaBarang ){ 
        this.namaBarang.add(namaBarang); 
    } 
    public String getNamaBarang(int idBarang){ 
        return this.namaBarang.get(idBarang); 
    }        
    public void setStok(int stok ){       
        this.stok.add(stok); 
    } 
    public int getStok(int idBarang){    
        return this.stok.get(idBarang); 
    }     
    public void editStok(int idBarang, int stok){       
        this.stok.set(idBarang, stok);; 
        
    }  public void setHarga(int harga ){      
        this.harga.add(harga); 
    } 
    public int getHarga(int idBarang){       
        return this.harga.get(idBarang); 
    }
}

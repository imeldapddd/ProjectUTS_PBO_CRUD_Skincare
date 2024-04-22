/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

/**
 *
 * @author imeld
 */
public class ProdukDiskon extends Skincare implements Diskonable{
    private double diskon;
    
    public ProdukDiskon(int id, String nama, double harga, int stok, double diskon){
        super(id, nama, harga, stok);
        this.diskon = diskon;
    }
    
    @Override
    public double hitungDiskon(){
        return getHarga() * (diskon/ 100);
    }
    
    @Override
    public String toString(){
        return super.toString()+ ", Diskon:" + diskon + "%";
    }
    
}

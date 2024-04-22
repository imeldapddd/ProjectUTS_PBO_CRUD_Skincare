/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

/**
 *
 * @author imeld
 */
public class PremiumSkincare extends Skincare{
    private String jenis;
    
    public PremiumSkincare(int id, String nama, double harga, int stok, String jenis){
        super(id, nama, harga, stok);
        this.jenis = jenis;
    }
    
    public String getJenis() {
        return jenis;
    }
    
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    @Override
    public String toString(){
        return super.toString()+ ", jenis: " + jenis;
    }
    
}

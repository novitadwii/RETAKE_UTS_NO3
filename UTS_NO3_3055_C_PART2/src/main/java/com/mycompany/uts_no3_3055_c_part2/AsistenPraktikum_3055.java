/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_3055_c_part2;

/**
 *
 * @author User
 * Novita Dwi Sabekti
 * 21103055
 * SI05C
 */

public class AsistenPraktikum_3055 extends Mahasiswa_3055 {
    String mkAsistensi_3055;
    int jmlPertemuan_3055, inputUser;
    
    public double totalPendapatan_3055(){
        return(jmlPertemuan_3055 * 50000);
    }
    
    
    public void tampilDataAsistenPraktikum_3055() {
        super.tampilDataMhs_3055();
        System.out.println("Mata Kuliah                 : " + mkAsistensi_3055);
        System.out.println("Jumlah Pertemuan            : " + jmlPertemuan_3055);
        System.out.println("Total Pendapatan            : " + totalPendapatan_3055());
        
        
    }
}

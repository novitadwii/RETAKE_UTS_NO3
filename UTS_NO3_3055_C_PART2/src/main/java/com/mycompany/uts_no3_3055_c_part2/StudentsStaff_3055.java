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

public class StudentsStaff_3055 extends Mahasiswa_3055 {
    int jamKerja_3055;
    String unitKerja_3055;
    
    public double totalPendapatan_3055(){
        return (jamKerja_3055 * 30000);
    }
    public void tampilDataStudentStaff_3055(){
        super.tampilDataMhs_3055();
        System.out.println("Unit Kerja                     : " + unitKerja_3055);
        System.out.println("Jam Kerja                      : " + jamKerja_3055);
        System.out.println("Total Pendapatan Student Staff : " + totalPendapatan_3055());
    }
}

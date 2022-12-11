/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no3_3055_c_part2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author User
 * Novita Dwi Sabekti
 * 21103055
 * SI05C
 */

public class UTS_NO3_3055_C_PART2 {

    public static void main(String[] args) {
        
        //Membuat object menggunakan array
        AsistenPraktikum_3055[] asprak_3055 = new AsistenPraktikum_3055[2];
        StudentsStaff_3055[] ss_3055 = new StudentsStaff_3055[2];
        
        asprak_3055[0] = new AsistenPraktikum_3055();
        asprak_3055[1] = new AsistenPraktikum_3055();
 
        ss_3055[0] = new StudentsStaff_3055();
        ss_3055[1] = new StudentsStaff_3055();
        

        //program input menggunakan buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        try {
            //mengisi data ke array pada data Asisten Praktikum
            for(int i = 0; i < 2; i++){
                System.out.println("===INPUT DATA ASISTEN PRAKTIKUM===");
                System.out.print("NIM              : ");
                asprak_3055[i].nim_3055 = br.readLine();
                System.out.print("Nama             : ");
                asprak_3055[i].nama_3055 = br.readLine();
                System.out.print("Jurusan          : ");
                asprak_3055[i].jurusan_3055 = br.readLine();
                System.out.print("IPK              : ");
                asprak_3055[i].ipk_3055 = Double.valueOf(br.readLine());
                System.out.print("Mata Kuliah      : ");
                asprak_3055[i].mkAsistensi_3055 = br.readLine();
                System.out.print("Jumlah Pertemuan : ");
                asprak_3055[i].jmlPertemuan_3055 = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            //Menampilkan semua isi array pada data Asisten Praktikum
            System.out.println("DATA ASISTEN PRAKTIKUM");
            for(AsistenPraktikum_3055 as : asprak_3055){
                as.tampilDataAsistenPraktikum_3055();
                System.out.println("");
            }

            //mengisi data ke array pada data Students Staff
            for(int i = 0; i < 2; i++){
                System.out.println("===INPUT DATA STUDENTS STAFF===");
                System.out.print("NIM         : ");
                ss_3055[i].nim_3055 = br.readLine();
                System.out.print("Nama        : ");
                ss_3055[i].nama_3055 = br.readLine();
                System.out.print("Jurusan     : ");
                ss_3055[i].jurusan_3055 = br.readLine();
                System.out.print("IPK         : ");
                ss_3055[i].ipk_3055 = Double.valueOf(br.readLine());
                System.out.print("Unit Kerja : ");
                ss_3055[i].unitKerja_3055 = br.readLine();
                System.out.print("Jam Kerja   : ");
                ss_3055[i].jamKerja_3055 = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            //Menampilkan semua isi array pada data Students Staff
            System.out.println("DATA STUDENT STAFF");
            for(StudentsStaff_3055 ss : ss_3055){
                ss.tampilDataStudentStaff_3055();
                System.out.println("");
            }
        } 
        catch (Exception ex){ // menangkap kesalahan
            System.out.println(ex);
        }
    }
}

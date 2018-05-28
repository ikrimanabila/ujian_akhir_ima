/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujian_akhir_ima;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
class rapor{
    int nomor_siswa,kelas;
    double nilai_mtk,nilai_bahasaindonesia,nilai_bahasainggris,nilai_ipa,nilai_ips,nilai_agama,nilai_olahraga;
    Scanner input = new Scanner(System.in);
    
    public rapor(){
        nomor_siswa=0;
        kelas=0;
        nilai_mtk=0.0;
        nilai_bahasaindonesia=0.0;
        nilai_bahasainggris=0.0;
        nilai_ipa=0.0;
        nilai_ips=0.0;
        nilai_agama=0.0;
        nilai_olahraga=0.0;
        
    }
    
    public void input(){
        System.out.print("inputkan nomer siswa : ");
        if(!input.hasNextInt()){
            System.out.println("that's not a number!");
        }
        else{
            nomor_siswa= input.nextInt();
        }
        
        System.out.print("inputkan kelas : ");
        if(!input.hasNextInt()){
            System.out.println("that's not a number!");
        }
        else{
            kelas= input.nextInt();
        }
        
        System.out.print("inputkan nilai matematika : ");
        if(!input.hasNextDouble()){
            System.out.println("that's not a number!");
        }
        else{
            nilai_mtk= input.nextDouble();
        }
        
        System.out.print("inputkan nilai bahasa indonesia : ");
        if(!input.hasNextDouble()){
            System.out.println("that's not a number!");
        }
        else{
            nilai_bahasaindonesia= input.nextDouble();
        }
        
        System.out.print("inputkan nilai bahasa inggris : ");
        if(!input.hasNextDouble()){
            System.out.println("that's not a number!");
        }
        else{
            nilai_bahasainggris= input.nextDouble();
        }
        
        System.out.print("inputkan nilai ipa : ");
        if(!input.hasNextDouble()){
            System.out.println("that's not a number!");
        }
        else{
            nilai_ipa= input.nextDouble();
        }
        
        System.out.print("inputkan nilai ips : ");
        if(!input.hasNextDouble()){
            System.out.println("that's not a number!");
        }
        else{
            nilai_ips= input.nextDouble();
        }
        
        System.out.print("inputkan nilai agama :  ");
        if(!input.hasNextDouble()){
            System.out.println("that's not a number!");
        }
        else{
            nilai_agama= input.nextDouble();
        }
        
        System.out.print("inputkan nilai olahraga :  ");
        if(!input.hasNextDouble()){
            System.out.println("that's not a number!");
        }
        else{
            nilai_olahraga= input.nextDouble();
        }
    }
    
     public double jumlah(){
        double jumlah_nilai;
        jumlah_nilai = nilai_mtk+nilai_bahasaindonesia+nilai_bahasainggris+nilai_ipa+nilai_ips+nilai_agama+nilai_olahraga;
        return jumlah_nilai;
    }
    
    public double rata_rata(){
        double rata_nilai;
        rata_nilai = jumlah()/7;
        return rata_nilai;
    }
     
    public void hasil_pengumuman (){
        if (rata_rata()>7){
            System.out.print ("naik kelas");
        }
        else if (rata_rata()<=7){
            System.out.print ("tidak naik kelas");
            
        }
        else {
            System.out.print("tidak tersedia");
        }
    }
    
    public void output(){
        
        System.out.println("=======================================");
        System.out.println("nomor siswa         : "+nomor_siswa);
        System.out.println("kelas               : "+kelas);
        System.out.println("jumlah nilai        : "+jumlah());
        System.out.println("rata-rata           : "+rata_rata());
        System.out.print("hasil pengumuman    : ");
        hasil_pengumuman();
        
    }
}
public class Ujian_akhir_ima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        rapor ns=new rapor();
        ns.input();
        ns.output();
    }
    
}

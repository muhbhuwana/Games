/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author MuhammadBhuwana
 */
public class Peta {
    private String benua;
    private String negara;
    private String ibukota;
 
    public void EROPA(){
        benua="Eropa";
        negara="Jerman";
        ibukota="berlin";
        System.out.println("\n Benua "+ benua);
        System.out.println("\n Negara "+ negara);
        System.out.println("\n Jerman beribukota "+ ibukota);
    } 
            public void AUSTRALIA(){
        benua="Australia";
        negara="Australia Barat";
        ibukota="Perth";
        System.out.println("\n Benua "+ benua);
        System.out.println("\n Negara "+ negara);
        System.out.println("\n Australia Barat beribukota "+ ibukota);
    }
     public void AFRIKA(){
        benua="Afrika";
        negara="Mesir";
        ibukota="Kairo";
        System.out.println("\n Benua "+ benua);
        System.out.println("\n Negara "+ negara);
        System.out.println("\n Mesir beribukota "+ ibukota);   
    }
    public void ASIA(){
        benua="Asia";
        negara="Indonesia";
        ibukota="Jakarta";
        System.out.println("\n Benua "+ benua);
        System.out.println("\n Negara "+ negara);
        System.out.println("\n Indonesia beribukota "+ ibukota);
    }
public void kunci(char password){
    if(password=='Z'){
        System.out.println("Password yang Anda Masukkan Benar");
        ASIA();
        AFRIKA();
        AUSTRALIA();
        EROPA();
    }
    else{
        System.out.println("\n Password yang Anda Masukkan Salah");
        System.out.println("Tidak Terdaftar Benua Satupun");
    }
}
}

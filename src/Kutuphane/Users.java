/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kutuphane;

/**
 *
 * @author baris
 */
public class Users {
    private String Ad;
    private String Soyad;
    private String username;
   private String password;
    
   public Users(String Ad,String Soyad,String username,String password){
       this.Ad=Ad;
       this.Soyad=Soyad;
       this.username=username;
       this.password=password;
   }
   public String getad()
   {
       return Ad;
   }
     public String getsoyad()
   {
       return Soyad;
   }
      public String getusername()
   {
       return username;
   }
         public String getpassword()
   {
       return password;
   }
   
    
}

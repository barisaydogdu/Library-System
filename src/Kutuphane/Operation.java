/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kutuphane;
import java.sql.ResultSet;
import java.sql.SQLException;
import Kutuphane.Books;

/**
 *
 * @author baris
 */
public class Operation {
     private DBConnect dbc;
    private ResultSet rs; 
    
     private void closeDB()
{   try{
        if (rs != null){rs.close();}
       // if (stmt != null){stmt.close();}
        //if (dbc != null){dbc.close();}
    }catch(Exception e){}

}
      public void safedata(Books stu) throws ClassNotFoundException {
    System.out.println("Kaydediliyor...");       
        try{
         dbc = new DBConnect();
         dbc.connectToDB();   
      Boolean dataSaved = dbc.insertDataToDB("INSERT INTO kitaplar(kitapadi,sayfasayisi,yazaradi,stoksayisi,barkod,yayinevi,kitaptürü,ciltno)"
             + " VALUES('"+stu.getkitapadi()+"','"+stu.getsayfasayisi()+"','"+stu.getyazaradi()+"','"+stu.getstoksayisi()+"','"+stu.getbarkod()+"','"+stu.getyayinevi()+"','"+stu.getkitaptürü()+"','"+stu.getciltno()+"')");
                              
         System.out.println("save or not "+ dataSaved);
         dbc.disconnectFromDB();            
     }
       catch (SQLException ex) {
            System.out.println(ex.getMessage());        
        }finally {closeDB();}

    } 

   public void saveusers(Users usr) throws ClassNotFoundException {
       System.out.println("Kaydediliyor... ");       
        try{
         dbc = new DBConnect();
         dbc.connectToDB();
        Boolean dataSaved = dbc.insertDataToDB("INSERT INTO login(ad,soyad,username,password)"
                                           + " VALUES('"+usr.getad()+"','"+usr.getsoyad()+"','"+usr.getusername()+"','"+usr.getpassword()+"')");
                              
      //   System.out.println("save or not "+ dataSaved);
         dbc.disconnectFromDB();            
     }
       catch (SQLException ex) {
            System.out.println(ex.getMessage());
            
        }finally {closeDB();}
    }
    }

     


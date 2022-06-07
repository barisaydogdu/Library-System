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
    public class Books {
    private String kitapadi ;
   private int sayfasayisi;  
    private String yazaradi;
    private String stoksayisi;
   private String barkod;
   private String yayinevi;
    private String kitaptürü;
    private String ciltno;

    
//    private String kitapadi;

    /**
     * @return the firstName
     */
     java.util.Date date=new java.util.Date();  
   // public Books(String kitapadi, String sayfasayisi, int yazaradi,String stoksayisi,String barkod,String yayinevi,String kitaptürü,String ciltno) {
     public Books(String kitapadi,int sayfasayisi,String yazaradi,String stoksayisi,String barkod,String yayinevi,String kitaptürü,String ciltno){ 
        this.kitapadi = kitapadi;
       this.sayfasayisi = sayfasayisi;
        this.yazaradi = yazaradi;
        this.stoksayisi=stoksayisi;
       this.barkod=barkod;
        this.yayinevi=yayinevi;
    this.kitaptürü=kitaptürü;
      this.ciltno=ciltno;
  
    }
  public String getkitapadi() {
        return kitapadi;
    }
   public  int getsayfasayisi() {
        return sayfasayisi;
   }
    public String getyazaradi() {
        return yazaradi;
    }
    public String getstoksayisi()
    {
        return stoksayisi;
    }
    public String getbarkod()
   {
        return barkod;
    }
     public String getyayinevi()
    {
        return yayinevi;
    }
       public String getkitaptürü()
    {
        return kitaptürü;
    }
      public String getciltno()
    {
        return ciltno;
    }
           
 
 //TextField3
    
}

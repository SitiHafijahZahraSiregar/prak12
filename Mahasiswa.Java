package prak12_ara;

import java.util.ArrayList;
public class mahasiswa {
    private String nama;
    private String npm;
    private ArrayList<Integer> nilai = new ArrayList<>();
    
    public mahasiswa(String nama,String npm,ArrayList<Integer> nilai){
        this.nama = nama;
        this.npm = npm;
        this.nilai = nilai;
    }
    public String getnama(){
        return nama;
    }
      public String getnama(String nama){
          this.nama = nama;
          return (null);
      
      }
      public String getnpm(){
          return npm;
      }
      public void setnpm(String npm){
          this.npm  = npm;
         
      }
      public ArrayList<Integer> getnilai(){
        return nilai;
          
      }
      public void setnilai (ArrayList <Integer> nilai){
          this.nilai = nilai;
    
      }
}

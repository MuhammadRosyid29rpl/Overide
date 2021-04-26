/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overide;

/**
 *
 * @author ASUS TUF A15
 */
public class Overide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Induk moklet = new Induk();
        Anak moklet2 = new Anak();
        Induk moklet3 = new Induk();
        
        
        moklet2.kelas();
        moklet.kelas();
        moklet.sekolah();
        
        moklet3.kelas();
    }
    
}

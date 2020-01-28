
package pbo;


public class pbo1 {
   
    public static void main(String[] args) {
        Pbo nes = new Pbo();
        nes.setAngka1(10);
        nes.setAngka2(5);
        
        int penjumlahan =nes.getAngka1()+ nes.getAngka2();
        int pengurangan =nes.getAngka1()- nes.getAngka2();
        int perkalian   =nes.getAngka1()* nes.getAngka2();
        int pembagian = nes.getAngka1() / nes.getAngka2();
        
        System.out.println("Angka 1 :" + nes.getAngka1());
        System.out.println("Angka 2 :" + nes.getAngka2());
        System.out.println("Hasil penjumlahan :" + penjumlahan );
        System.out.println("Hasil pengurangan :" + pengurangan);
        System.out.println("Hasil Perkalian :" + perkalian);
        System.out.println("Hasil pembagian :" + pembagian);
        
        
    }
    }


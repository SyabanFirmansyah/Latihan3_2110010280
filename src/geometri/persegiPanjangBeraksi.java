package geometri;

public class persegiPanjangBeraksi {
    public static void main(String[] args) {
        PersegiPanjang persegi1 = new PersegiPanjang(2,8);
        
        System.out.println("Hasil luas: "+persegi1.setluasPersegiPanjang());
        System.out.println("Hasil keliling : "+persegi1.kelilingPersegiPanjang());
    }
}

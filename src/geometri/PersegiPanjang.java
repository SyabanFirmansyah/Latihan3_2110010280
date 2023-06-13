package geometri;

public class PersegiPanjang {
    double panjang, lebar;
    
    public PersegiPanjang(double radius) {
        this.panjang = panjang;
        this.lebar   = lebar;
    }
    
    double luasPersegiPanjang(){
       return panjang*lebar;
   }
    
    double kelilingPersegiPanjang(){
        return 2*(panjang+lebar);
    }
}

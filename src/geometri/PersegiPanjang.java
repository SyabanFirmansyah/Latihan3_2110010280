package geometri;

public class PersegiPanjang {
    double panjang, lebar;
    
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar   = lebar;
    }
    
    double luasPersegiPanjang(){
       return panjang*lebar;
   }
    
    double kelilingPersegiPanjang(){
        return 2*(panjang+lebar);
    }

    String setluasPersegiPanjang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

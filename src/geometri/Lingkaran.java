package geometri;
public class Lingkaran {
    double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }    
    double luasLingkaran(){
       return 3.14*radius*2;
   }
    
    double kelilingLingkaran(){
        return 2*3.14*radius;
    }

    String setluasLingkaran() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String setkelilingLingkaran() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

package Properties.inheritance;

public class boxWeight extends box {
    
    double weight;
    public boxWeight(){
        this.weight = -1;
    }
     public boxWeight(double l,double b, double wd, double wg){
        super(l,b,wd); 
        this.weight = wg;
    }
}

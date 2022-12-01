package Properties.inheritance;

public class box {
    double length;
    double height;
    double width;
    box(){
        this.length = -1;
        this.height = -1;
        this.width = -1;
    }
    box(double side){
        this.length = side;
        this.height = side;
        this.width = side;
    }
    box(double l, double h,double w){
        this.length =l;
        this.height = h;
        this.width = w;
    }
    box(box old){
        this.length = old.height;
        this.height = old.height;
        this.width = old.width;
    }
    public void status(){
        System.out.println("Running . . . box . . . Method");
    }
}

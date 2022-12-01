public class mfgDetails {
    public  static class CompanyDetaisl{
    String Company;
    char vehCat;
    int vehLaunchYear;
    String bikeName;
    int mfgYear;
    int enginrCap;
    String chasisNo;
    String engineNo;

     CompanyDetaisl(){
        


    }

     CompanyDetaisl(String engNO, String chasisnO){
        this.engineNo= engNO;
        this.chasisNo = chasisnO;
    }
    
   
}
    public static  void main(String[] args){
        CompanyDetaisl bikeNew = new CompanyDetaisl("57484dgetg815g","87/84dr6s");
        CompanyDetaisl bike2 = new  CompanyDetaisl();
        bike2.Company = "TVS";

        System.out.println(bike2.Company);


    }
}



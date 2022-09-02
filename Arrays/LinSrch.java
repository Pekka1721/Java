public class LinSrch {
    //richest customer wealth
    public static void main(String[] args){
        int [][] accounts = {{1,5},{7,3},{3,5}};
        int ans =maxWealth(accounts);
        System.out.print(ans);
    }
    static int maxWealth(int[][] customers){
    int wealth=0;
        for(int person=0;person<customers.length;person++){
            int sum =0;
            for(int account =0;account<customers[person].length;account++){
                    sum=sum+customers[person][account];
            }
            if (sum>wealth){
                wealth=sum;
            }
        }
        return wealth;
    }
}

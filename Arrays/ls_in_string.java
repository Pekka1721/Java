public class ls_in_string {
    public static void main(String[] args) {
        String name ="MiniPekka";
        char letter = 'P';
        boolean ans = charsearch(name,letter);
        System.out.println(ans);
    }
    static boolean charsearch(String name, char letter){
        if(name.length()==0){
            return false;
        }
        for(int i = 0;i<name.length();i++){
            if(letter==name.charAt(i)){                 //Use name.toCharArray() to transform the string into letters of array [M,i,n,i,P,e,k,k,a]
                return true;
            }
        }
        return false;
    }
}

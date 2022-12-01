package Properties.inheritance;

public class Main {
    public static void main(String[] args) {
        box boxOne = new box(5,5,9);
        box boxTwo = new box(boxOne);
        System.out.println(boxOne.height+" "+boxOne.weight+" "+boxOne.length);
        System.out.println(boxTwo.height);
    }
}

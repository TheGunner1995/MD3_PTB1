import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner PTB1 = new Scanner(System.in);
        System.out.println("nhập số a: ");
        Double a = PTB1.nextDouble();
        System.out.println("nhập số b: ");
        Double b = PTB1.nextDouble();
        if (a==0){
            if (b==0){
                System.out.println("pt vô số nghiệm");
            }else {
                System.out.println("pt vô nghiệm");
            }
        }else {
            System.out.println("phương trình có nghiệm x = "+ -b/a);
        }

    }
}
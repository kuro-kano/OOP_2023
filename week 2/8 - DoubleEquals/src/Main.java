import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble(), n2 = sc.nextDouble();
        
        if (Math.abs(n1 - n2) < 0.001) {
            System.out.println("==");
        } else {
            System.out.println("!=");
        }
    }
}

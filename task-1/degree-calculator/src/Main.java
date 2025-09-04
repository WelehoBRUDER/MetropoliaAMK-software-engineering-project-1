import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DegreeCalculator calculator = new DegreeCalculator();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter degree name: ");
            String name = sc.nextLine();
            try {
                int toComplete = calculator.yearsToCompleteDegree(name);
                if (toComplete == 0) {
                    System.out.println("Invalid degree name.");
                    continue;
                }
                String degreeName = calculator.degreeName(name);
                System.out.println("It takes ~" + toComplete + " years to complete your " + degreeName + ".");
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

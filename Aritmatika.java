import java.util.Scanner;

public class Aritmatika {
    public static void main(String[] args) {
        //System.out.println("Hello docker. :)");
	Scanner sc = new Scanner(System.in);
	Scanner su = new Scanner(System.in);
	System.out.println("Input nilai: ");
	double val = sc.nextDouble();
	System.out.println("Input paramter please(*/+-): ");
    char op = sc.next().charAt(0);
    System.out.println("Input nilai: ");
	double val1 = su.nextDouble();
	operator(op,val,val1);
    }

    static void operator(char operator, double val, double val2) {
        switch (operator) {
            case '*':
                double result = (val * val2);
                System.out.printf("Hasil dari %f %s %f adalah %f\n", val, operator, val2, result);
                break;
            case '/':
                result = (val / val2);
                System.out.printf("Hasil dari %f %s %f adalah %f\n", val, operator, val2, result);
                break;
            case '+':
                result = (val + val2);
                System.out.printf("Hasil dari %f %s %f adalah %f\n", val, operator, val2, result);
                break;
            case '-':
                result = (val - val2);
                System.out.printf("Hasil dari %f %s %f adalah %f\n", val, operator, val2, result);
                break;
            default:
                System.out.println("Check operator");
        }
    }
}

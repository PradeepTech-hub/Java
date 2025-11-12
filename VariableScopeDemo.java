package example;
import java.util.Scanner;

class Calculator {
    // Instance variables
    int a, b;
    // Static variable
    static int result;

    // Parameterized constructor using 'this'
    Calculator(int a, int b) {
        this.a = a;  // 'this' refers to instance variable
        this.b = b;
    }

    void calculateSum() {
        int sum = this.a + this.b;  // local variable
        if (sum > 0) {
            int temp = sum;  // block variable
            System.out.println("Block variable (temp): " + temp);
        }
        result = sum; // static variable updated
        System.out.println("Sum = " + sum);
    }

    void add() {
        int res = this.a + this.b; // local variable
        result = res;
        System.out.println("Addition = " + res);
    }

    void sub() {
        int res = this.a - this.b;
        result = res;
        System.out.println("Subtraction = " + res);
    }

    void mul() {
        int res = this.a * this.b;
        result = res;
        System.out.println("Multiplication = " + res);
    }

    void div() {
        if (this.b != 0) {
            double res = (double) this.a / this.b;
            System.out.println("Division = " + res);
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}

public class VariableScopeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt(); // local variable

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        Calculator c = new Calculator(a, b);

        System.out.println("1.Addition  2.Subtraction  3.Multiplication  4.Division  5.CalculateSum");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1: 
            	c.add(); 
            break;
            
            case 2: 
            	c.sub(); 
            break;
            
            case 3:
            	c.mul(); 
            break;
            case 4:
            	c.div(); 
            break;
            case 5: 
            	c.calculateSum(); 
            break;
            default: System.out.println("Invalid choice");
        }

        System.out.println("Static variable (result): " + Calculator.result);
        sc.close();
    }
}

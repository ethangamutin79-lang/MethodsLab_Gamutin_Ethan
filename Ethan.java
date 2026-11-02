/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ethan;

import java.util.Scanner;

public class Ethan {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            greetUser();
            
            // ARITHMETIC OPERATIONS
            System.out.println("===== ARITHMETIC OPERATIONS =====");
            
            System.out.print("Enter two numbers: ");
            int first = input.nextInt();
            int second = input.nextInt();
            
            System.out.println("Addition: " + add(first, second));
            System.out.println("Subtraction: " + subtract(first, second));
            System.out.println("Multiplication: " + multiply(first, second));
            
            if (second != 0) {
                System.out.println("Division: " + divide(first, second));
            } else {
                System.out.println("Cannot divide by zero.");
            }
            
            // FACTORIAL
            System.out.println("\n===== FACTORIAL =====");
            
            System.out.print("Enter a number: ");
            int value = input.nextInt();
            
            int fact = factorial(value);
            
            if (fact == -1) {
                System.out.println("Invalid input. Enter a number from 0 to 12.");
            } else {
                System.out.println("Factorial: " + fact);
            }
            
            // ARRAY OPERATIONS
            System.out.println("\n===== ARRAY OPERATIONS =====");
            
            System.out.print("Enter array size: ");
            int length = input.nextInt();
            
            if (length > 0) {
                
                int[] numbers = new int[length];
                
                System.out.println("Enter " + length + " numbers:");
                
                for (int i = 0; i < length; i++) {
                    numbers[i] = input.nextInt();
                }
                
                System.out.println("Sum of array: " + sumArray(numbers));
                System.out.println("Maximum element: " + maxInArray(numbers));
                
            } else {
                System.out.println("Invalid array size.");
            }
            
            // PRIME NUMBER
            System.out.println("\n===== PRIME NUMBER =====");
            
            System.out.print("Enter a number: ");
            int primeValue = input.nextInt();
            
            if (isPrime(primeValue)) {
                System.out.println(primeValue + " is a prime number.");
            } else {
                System.out.println(primeValue + " is not a prime number.");
            }
            
            // GCD AND LCM
            System.out.println("\n===== GCD AND LCM =====");
            
            System.out.print("Enter two positive integers: ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            
            if (num1 > 0 && num2 > 0) {
                System.out.println("GCD: " + gcd(num1, num2));
                System.out.println("LCM: " + lcm(num1, num2));
            } else {
                System.out.println("Please enter positive integers.");
            }
            
            // RECURSIVE FACTORIAL
            System.out.println("\n===== RECURSIVE FACTORIAL =====");
            
            System.out.print("Enter a number: ");
            int recursiveValue = input.nextInt();
            
            int recursiveAnswer = recursiveFactorial(recursiveValue);
            
            if (recursiveAnswer == -1) {
                System.out.println("Invalid input. Enter a number from 0 to 12.");
            } else {
                System.out.println("Factorial: " + recursiveAnswer);
            }
            
            // RECURSIVE FIBONACCI
            System.out.println("\n===== RECURSIVE FIBONACCI =====");
            
            System.out.print("Enter a number (0-45): ");
            int position = input.nextInt();
            
            if (position >= 0 && position <= 45) {
                System.out.println("Fibonacci: " + fib(position));
            } else {
                System.out.println("Invalid input. Enter a number from 0 to 45.");
            }
            
            // PALINDROME
            System.out.println("\n===== PALINDROME =====");
            
            System.out.print("Enter a word: ");
            String text = input.next();
            
            if (isPalindrome(text)) {
                System.out.println(text + " is a palindrome.");
            } else {
                System.out.println(text + " is not a palindrome.");
            }
        }
    }

    // GREETING
    static void greetUser() {
        System.out.println("========================================");
        System.out.println("          WELCOME TO MATHVERSE!");
        System.out.println("========================================");
        System.out.println("     Where numbers meet logic and fun!");
        System.out.println("   Ready to challenge something amazing!");
        System.out.println("========================================\n");
    }

    // ARITHMETIC METHODS
    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }

    // FACTORIAL USING LOOP
    static int factorial(int n) {

        if (n < 0 || n > 12) {
            return -1;
        }

        int answer = 1;

        for (int i = 1; i <= n; i++) {
            answer *= i;
        }

        return answer;
    }

    // SUM OF ARRAY ELEMENTS
    static int sumArray(int[] values) {

        int total = 0;

        for (int number : values) {
            total += number;
        }

        return total;
    }

    // FIND THE LARGEST ARRAY ELEMENT
    static int maxInArray(int[] values) {

        int largest = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] > largest) {
                largest = values[i];
            }
        }

        return largest;
    }

    // PRIME NUMBER CHECKER
    static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // GREATEST COMMON DIVISOR
    static int gcd(int a, int b) {

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }

    // LEAST COMMON MULTIPLE
    static int lcm(int a, int b) {

        if (a == 0 || b == 0) {
            return 0;
        }

        return (a / gcd(a, b)) * b;
    }

    // FACTORIAL USING RECURSION
    static int recursiveFactorial(int n) {

        if (n < 0 || n > 12) {
            return -1;
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * recursiveFactorial(n - 1);
    }

    // FIBONACCI USING RECURSION
    static int fib(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    // PALINDROME CHECKER
    static boolean isPalindrome(String word) {

        word = word.toLowerCase();

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {

            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
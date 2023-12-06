package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void test(String x){
        System.out.println(x);
    }
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
      //  System.out.printf("Hello and welcome!");
        test("hello");

        int x = 5/3;
        char z = 'z';
        x=246%2;
        if(x > 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        double y = 3.1+z;

        System.out.println(y);

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Ctrl+D to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Cmd+F8.
//            System.out.println("i = " + i);
//        }
    }
}
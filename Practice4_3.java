// Income Tax

import java.util.Scanner;

public class Practice4_3 {
    static String ruppessformatter(double value){
        int int_value = (int) value;
        String string_value = Integer.toString(int_value);
        String new_value = new String();
        int a = 0;
        for(int i = string_value.length()-1; i>=0; i--){
            new_value = string_value.charAt(i) + new_value;
            if(a%2 == 0 && a >0){
                new_value = "," + new_value;
            }
            a++;
        }
        return new_value;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Income Tax Calculator");
        System.out.print("Income(in LPA): ");
        double income = sc.nextDouble();
        double tax;
        if(income > 10){
            income = income *100000;
            tax = (income * 30)/100;
        }else if(income <= 10 && income >= 5){
            income = income *100000;
            tax = (income *20)/100;
        }else if(income < 5 && income >= 2.5){
            income = income * 100000;
            tax = (income*5)/100;
        }else{
            tax = 0;
        }
        System.out.println("Statement:-");
        System.out.println("Gross Income: "+ruppessformatter(income));
        System.out.println("Tax: "+ruppessformatter(tax));
        System.out.println("Net Income: "+ruppessformatter(income-tax));
    }
}

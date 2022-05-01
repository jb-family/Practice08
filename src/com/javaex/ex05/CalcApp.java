package com.javaex.ex05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	Add a = new Add();
    	Div d = new Div();
    	Mul m = new Mul();
    	Sub s = new Sub();
    	
    	int num1;
    	String numLine = null;
    	int num2;
   
    	
    	while(true) {
            System.out.print(">>");
            numLine = sc.next();
            if ( numLine.equals("/q")) {
                System.out.println("종료되었습니다.");
                break;
             } else {
                System.out.print(">>");
                 num1 = Integer.parseInt(numLine);
                 numLine = sc.next();
                  num2 = sc.nextInt();   
                  
                  if(numLine.equals("+")) {
                   a.setValue(num1, num2);
                   System.out.println(a.calculate());
                }else if(numLine.equals("-")) {
                    s.setValue(num1, num2);
                    System.out.println(s.calculate());   
                 }else if (numLine.equals("*")) {
                    m.setValue(num1, num2);
                     System.out.println(m.calculate());
                 }else if (numLine.equals("/")) {
                    d.setValue(num1, num2);
                    System.out.println(d.calculate());   
                 }else {
                    System.out.println("알수없는 연산입니다.");
                 }
             }
      
      }
    	
    
    	
    	
    	
    	sc.close();
    }
}

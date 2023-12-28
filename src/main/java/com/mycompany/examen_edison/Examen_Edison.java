package com.mycompany.examen_edison;
import java.util.Scanner;
/**
 *
 * @author EDISON
 */
public class Examen_Edison {

    public static void main(String[] args) {
     Scanner ingresar = new Scanner(System.in);
      int n1,n2,n3;
      System.out.println("INGRESE EL PRIMER VALOR");
      n1=ingresar.nextInt();
      System.out.println("INGRESE EL SEGUNDO VALOR");
      n2=ingresar.nextInt();
      System.out.println("INGRESE OPERACION");
      char op =ingresar.next().charAt(0);
      if (op=='+')
      {
      n3=n1+n2;   
      System.out.println("LA SUMA ES:");
      System.out.println(n3);
      }
      else if (op=='-')        
      {
      n3=n1-n2;
      System.out.println("LA RESTA ES:");
      System.out.println(n3);
      }
      else if (op=='*') 
      {
      n3=n1*n2;
      System.out.println("LA MULTIPLICACION ES:");
      System.out.println(n3);
      }
      else if (op=='/') 
      {
      n3=n1/n2;
      System.out.println("LA DIVICION ES:");
      System.out.println(n3);
    }
}
}

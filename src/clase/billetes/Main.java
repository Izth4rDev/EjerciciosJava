package clase.billetes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa el monto");
        int monto = sc.nextInt();
        billetes01(monto);
        billetesEnhanced(monto);
    }

    public static void billetes01(int monto){

        //billete de 100
        int billete100 = monto/100;
        int resto100 = monto%100;
        System.out.println("billetes de 100 USD "+billete100);
        System.out.println(resto100);
        //billete de 50
        int billete50 = resto100/50;
        int resto50 = resto100%50;
        System.out.println("billetes de 50 USD "+billete50);
        System.out.println(resto50);
        //billete de 20
        int billete20 = resto50/20;
        int resto20 = resto50%20;
        System.out.println("billetes de 20 USD "+billete20);
        System.out.println(resto20);
        //billete de 10
        int billete10 = resto20/10;
        int resto10 = resto20%10;
        System.out.println("billetes de 10 USD "+billete10);
        System.out.println(resto10);
        //billete de 5
        int billete5 = resto10/5;
        int resto5 = resto10%5;
        System.out.println("billetes de 5 USD "+billete5);
        System.out.println(resto5);
        //billetes de 1
        int billete1 = resto5/1;
        int resto1 = resto5%1;
        System.out.println("billetes de 1 USD " + billete1);
        System.out.println(resto1);
    }

    public static void billetesEnhanced(int monto){
        ArrayList<Integer> billetes = new ArrayList<Integer>();
        int resto, resultado;
        billetes.add(100);
        billetes.add(50);
        billetes.add(20);
        billetes.add(10);
        billetes.add(5);
        billetes.add(1);

        resto = monto;

        for(int billetin : billetes){
            resultado = resto/billetin;
            resto = resto%billetin;
            System.out.println("Billetes de de:"+billetin+" "+resultado);
            System.out.println("Resto: "+resto);
        }
    }
}

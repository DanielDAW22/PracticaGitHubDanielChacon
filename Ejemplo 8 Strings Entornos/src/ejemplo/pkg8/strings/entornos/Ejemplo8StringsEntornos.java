/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.pkg8.strings.entornos;
import java.util.*;
/**
 *
 * @author admin
 */
public class Ejemplo8StringsEntornos {

  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    public static void main(String[] args) {
        // TODO code application logic here
        double temperaturas[] = new double[7];
        String diasSemana[]={"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
        double suma = 0;
        int dia;
        char seguir;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        do{
        System.out.println("Anota temperatura de la semana");

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println(diasSemana[i] + ":");
            temperaturas[i] = sc.nextDouble();
            suma = suma + temperaturas[i];
        }

        System.out.println("La temperatura media ha sido:" + suma / 7);

        do {
            System.out.println("Anota día del que quieras saber la temperatura:");
            dia = sc.nextInt();
        }while (dia<1 || dia>7);
        
        System.out.println("La temperatura fue "+ temperaturas[dia-1] );
        
            System.out.println("Quieres seguir");
            seguir = sc.next().charAt(0);
        }while(seguir=='s' || seguir=='S');
    }

}

package eldarchallengeDM;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.xml.crypto.Data;

import eldarchallengeDM.modules.Ejercicio5Array;
import eldarchallengeDM.modules.Marca;
import eldarchallengeDM.modules.Tarjeta;
import eldarchallengeDM.utils.DataFormater;

/**
 * Danilo Mutti Challenge - Ejecicio 1 - Clase ejecutable!
 *
 */
public class App{
    public static void main( String[] args ){
        Boolean seguir = true;
        DataFormater fData = new DataFormater();
        Marca marca1 = new Marca("VISA", "AÑO / MES");
        Marca marca2 = new Marca("NARA", "DIA DEL MES * 0.5");
        Marca marca3 = new Marca("AMEX", "MES * 0.1");


        Tarjeta tarjeta1 = new Tarjeta(
                                marca1,
                                "10203040506070", 
                                "Danilo Mutti", 
                                LocalDate.of(2035, 6, 15)
                             );

        Tarjeta tarjeta2 = new Tarjeta(
                                marca2,
                                "01020304050607", 
                                "Lucio Mertinez", 
                                LocalDate.of(2023, 12, 7)
                             );
        Tarjeta tarjeta3 = new Tarjeta(
                                marca3,
                                "01020304050607", 
                                "Graciela Bruno", 
                                LocalDate.of(2024, 5, 21)
                             );
        List<Tarjeta> tarjetas = new ArrayList<>();
        tarjetas.add(tarjeta1);
        tarjetas.add(tarjeta2);
        tarjetas.add(tarjeta3);

        //System.out.println("Fecha de vencimento: " + fData.fechaFormat(i.next().getFechaVencimiento()));

        Scanner scanner = new Scanner(System.in);

        // Punto 1 - Información de una tarjeta
        System.out.println("Información de tarjeta:");
        System.out.println("Marca: " + tarjeta1.getMarca().getMarca());
        System.out.println("Numero de tarjeta: " + tarjeta1.getNumeroTarjeta());
        System.out.println("Nombre y Apellido: " + tarjeta1.getCardholder());
        System.out.println("Fecha de vencimento: " + fData.fechaFormat(tarjeta1.getFechaVencimiento()));

        // punto 2 - Operación válida
        System.out.println("Operación válida: " + tarjeta1.operacionValida(800));

        // punto 3 - Válida para operar
        System.out.println("Tarjeta válida para operar: " + tarjeta1.tarjetaValida());

        // punto 4 - Tarjeta es distinta a otra
        System.out.println("Tarjeta distinta: " + tarjeta1.esDistinta(tarjeta2));

        // punto 5 - Tasa de una operación
        System.out.println("Tasa de la operación: " + tarjeta1.calcTasa(tarjeta1.getMarca(), 500));


        System.out.print("Desea ver información de la proxima tarjeta? (S/N)");
        String resp = scanner.nextLine();
        resp = resp.toUpperCase();

        if(resp.equals("S")){
            // Punto 1 - Información de una tarjeta
            System.out.println("Información de tarjeta:");
            System.out.println("Marca: " + tarjeta2.getMarca().getMarca());
            System.out.println("Numero de tarjeta: " + tarjeta2.getNumeroTarjeta());
            System.out.println("Nombre y Apellido: " + tarjeta2.getCardholder());
            System.out.println("Fecha de vencimento: " + fData.fechaFormat(tarjeta2.getFechaVencimiento()));

            // punto 2 - Operación válida
            System.out.println("Operación válida: " + tarjeta2.operacionValida(800));

            // punto 3 - Válida para operar
            System.out.println("Tarjeta válida para operar: " + tarjeta2.tarjetaValida());

            // punto 4 - Tarjeta es distinta a otra
            System.out.println("Tarjeta distinta: " + tarjeta2.esDistinta(tarjeta3));

            // punto 5 - Tasa de una operación
            System.out.println("Tasa de la operación: " + tarjeta2.calcTasa(tarjeta2.getMarca(), 1500));

        }
        scanner.close();

        //Ejecicio 5 - Array
        System.out.println("====================Ejecicio 5 - Array================= ");
        Ejercicio5Array array = new Ejercicio5Array();
        array.validaImprimeArray();
        
    }
}

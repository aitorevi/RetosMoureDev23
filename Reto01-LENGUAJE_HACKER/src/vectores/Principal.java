package vectores;

import java.util.Hashtable;
import java.util.Scanner;

public class Principal {
    public static void main(String[]  args) {
        String[] alfabeto2 = {"4","I3","[",")","3","|=","&","#","1",",_|",">|","1","/\\/\\","^/","0","|*","(_,)","I2","5","7","(_)","\\/","\\/\\/","><","j","2"};

        Hashtable<String,String> alfabeto = new Hashtable<String,String>();
        alfabeto.put("A","4");
        alfabeto.put("B","I3");
        alfabeto.put("C","[");
        alfabeto.put("D",")");
        alfabeto.put("E","3");
        alfabeto.put("F","|=");
        alfabeto.put("G","&");
        alfabeto.put("H","#");
        alfabeto.put("I","1");
        alfabeto.put("J","_|");
        alfabeto.put("K",">|");
        alfabeto.put("L","1");
        alfabeto.put("M","/\\/\\");
        alfabeto.put("N","^/");
        alfabeto.put("O","0");
        alfabeto.put("P","|*");
        alfabeto.put("Q","(_,)");
        alfabeto.put("R","I2");
        alfabeto.put("S","5");
        alfabeto.put("T","7");
        alfabeto.put("U","(_)");
        alfabeto.put("V","\\/");
        alfabeto.put("W","\\/\\/");
        alfabeto.put("X","><");
        alfabeto.put("Y","J");
        alfabeto.put("Z","2");

        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce una palabra en mayusculas");
        String palabra = reader.next();
        System.out.println(alfabeto.get(letra));

        /*
        toUpperCase()


        Map alfabetoHacker = new HashMap();
        for (int cont = 0; cont < 100; cont++)
            alfabetoHacker.put(new String("Pepe"), new String("123456789"));
        System.out.println("El teléfono de pepe es " + alfabetoHacker.get("Pepe"));
        */
    }
}

package vectores;

import java.util.HashMap;
import java.util.Map;

public class Principal {
    public static void main(String[]  args) {
        String[] alfabeto = {"4","I3","[",")","3","|=","&","#","1",",_|",">|","1","/\\/\\","^/","0","|*","(_,)","I2","5","7","(_)","\\/","\\/\\/","><","j","2"};
        System.out.println(alfabeto[12]);
        Map alfabetoHacker = new HashMap();
        for (int cont = 0; cont < 100; cont++)
            alfabetoHacker.put(new String("Pepe"), new String("123456789"));
        System.out.println("El teléfono de pepe es " + alfabetoHacker.get("Pepe"));
    }
}

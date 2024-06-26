package testers;

import fichero.ManejadorFicheros;
import java.util.*;
import objetos.*;

public class FicherosTester extends MenusTester{
    
    public static void main(String[] args){

        FicherosTester tester = new FicherosTester();
        List<Menu> menus = tester.crearMenus();
        // guardar lista de menús a fichero
        ManejadorFicheros.guardarFichero("comida.txt", menus);
        // leer lista de menús de fichero, e imprimirlos por pantalla 
        ManejadorFicheros.leerFichero("comida.txt");
        
        for(Menu menu: ManejadorFicheros.getMenus())
            System.out.println("* " + menu);
    }
}

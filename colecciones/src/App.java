/*import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
*/
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

//        Set<String> superheroes = new HashSet<>(); //No almacena segun un orden
//        Set<String> superheroes = new TreeSet<>(); //Si almacena un orden natural A...Z  -...0...+
        Set<String> superheroes = new LinkedHashSet<>(); //Almacena por orden de insersion

/*      Son ordenadas
        List <String> superheroes4 = new ArrayList<>(); 
        List <String> superheroes5 = new LinkedList<>();
        List <String> superheroes5 = new Vector<>();
*/

/*      Son de llave-valor
        Map <String,double> inventario = new HashMap<>();
        Map <String,double> inventario = new TreeMap<>();
        Map <String,double> inventario = new LinkedMap<>();

        se usa el for(String llave : superheroes.keySet()){  inventario.get(llave) }        para recorrer el Map por cada llave y que nos devuelva el valor.
*/
        superheroes.add("Spiderman");
        superheroes.add("Batman");
        superheroes.add("CatWoman");
        superheroes.add("Hulk");
        superheroes.add("Wonder Woman");
        superheroes.add("Superman");

        superheroes.add("Iron Man");

        if (superheroes.contains("Hulk")){
            System.out.println("Hulk si logro entrar");
        }

        superheroes.remove("Batman");

        if (!superheroes.contains("Batman")){
            System.out.println("Batman se fue");
        }

        //No lo va agregar otra vez, Set no admite repetidos
        superheroes.add("Hulk");

        if(superheroes.isEmpty()){
            System.out.println("La fiesta se acabo");
        }else{
            System.out.println("La fiesta aun no acaba, aun hay " + superheroes.size() + " superheroes");
        }

        for(String superheroe : superheroes){
            System.out.println(superheroe);
        }

    }
}

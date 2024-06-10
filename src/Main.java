import java.util.*;

public class Main {
   public static void main(String[] args) {
      // Ejercicio 1
      ArrayList<String> marcas = new ArrayList<>();
      marcas.add("Tab");
      marcas.add("Pumper Nick");
      marcas.add("Bagley");
      marcas.add("Banco Galicia");
      marcas.add("Starmedia");
      marcas.add("Bellsouth");
      marcas.add("Tupperware");
      marcas.add("Billiken");
      marcas.add("Santillana");
      marcas.add("kapelusz");

      System.out.println("***************************");
      System.out.println(marcas);
      System.out.println("***************************");

      marcas.add("Blockbaster");
      marcas.add("Carrefour");
      marcas.add("Jetix");

      System.out.println("***************************");
      System.out.println(marcas);
      System.out.println("***************************");


      marcas.indexOf("Blockbaster");
      marcas.set(10, "Blockbuster");

      System.out.println("***************************");
      System.out.println(marcas);
      System.out.println("***************************");
      System.out.println(marcas.remove("Carrefour"));
      ;
      System.out.println("***************************");
      System.out.println(marcas);
      System.out.println("***************************");

      ArrayList<String> posiblesMarcas = new ArrayList<>();
      posiblesMarcas.add("Chiclets");
      posiblesMarcas.add("Bazooka");
      posiblesMarcas.add("Free");

      marcas.addAll(posiblesMarcas);

      System.out.println("***************************");
      System.out.println(posiblesMarcas);
      System.out.println("***************************");
      System.out.println(marcas);
      System.out.println("***************************");
      System.out.println(marcas.size());
      System.out.println("***************************");

      // Ejercicio 2
      Set<String> invitados = new TreeSet<>();
      invitados.add("Daniel");
      invitados.add("Paola");
      invitados.add("Facundo");
      invitados.add("Pedro");
      invitados.add("Jacinta");
      invitados.add("Florencia");
      invitados.add("Juan Pablo");

      System.out.println("***************************");
      System.out.println(invitados);

      Set<String> posiblesInvitados = new TreeSet<>();
      posiblesInvitados.add("Jorge");
      posiblesInvitados.add("Francisco");
      posiblesInvitados.add("Marcos");

      invitados.addAll(posiblesInvitados);
      System.out.println("***************************");
      System.out.println(invitados);

      invitados.remove("Jorge");

      System.out.println("***************************");
      System.out.println(invitados);

      // Ejercicio 3
      Map<String, Integer> golosinas = new TreeMap<>();
      golosinas.put("Chocman", 100);
      golosinas.put("Trululú", 100);
      golosinas.put("Centella", 100);
      golosinas.put("Kilate", 50);
      golosinas.put("Miti-Miti", 30);
      golosinas.put("Traga", 150);
      golosinas.put("Tabletón", 5);

      System.out.println("***************************");
      System.out.println(golosinas);

      golosinas.forEach((clave, valor) -> {
         if (valor < 100) {
            System.out.println("Clave: " + clave + " Valor: " + valor);
         }
      });

      // Ejercicio 4
      Queue<String> juegos = new LinkedList<>();
      juegos.add("Tombo");
      juegos.add("Congelado");
      juegos.add("Quemaditas");
      juegos.add("Cachipún");
      juegos.add("Pillarse");

      System.out.println("***************************************");
      System.out.println(juegos);
      System.out.println("***************************************");
      System.out.println("El número de elementos de juegos es: " + juegos.size());
   }
}


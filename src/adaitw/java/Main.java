package adaitw.java;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Presupuesto presupuesto = new Presupuesto();

        Scanner sc = new Scanner(System.in);
        int op = 0;
        String usuario = "";
        do{
            System.out.println("\n Menú: \n");
            System.out.println("1) Crear nuevo presupuesto");
            System.out.println("3) Agregar elementos al presupuesto");
            System.out.println("0) Salir");
            System.out.print("Ingrese la opción deseada: ");
            op = sc.nextInt();
            switch (op){
                case 1:
                    crearPresupuesto(presupuesto);
                    break;
                case 2:
                    agregarElementos(presupuesto);
                    break;

            }
        }while(op!=0);
    }

    private static void agregarElementos(Presupuesto presupuesto) {
        Scanner sc = new Scanner(System.in);
        Producto unProducto = new Producto("Banana","bananas",10.0);
        System.out.print("Ingrese la cantidad deseada: ");
        int cantidad = sc.nextInt();
        unProducto.setCantidad(cantidad);
        presupuesto.agregarItem(unProducto);
        presupuesto.agregarItem(new Servicio("a", "aaa", 123.00, 3, "aaabbb"));
    }

    private static void crearPresupuesto(Presupuesto presupuesto) {


        List<Item> items = presupuesto.getItems();
        int indice = 0;
        Item unItem = items.get(indice);


        if(unItem instanceof Producto){
            //CASTING
            Producto coso = (Producto) unItem;
            //hacer cosas de productos
            // coso.calcularTotal()
            presupuesto.reemplazarItem(indice, coso);
        }else{
            Servicio coso = (Servicio) unItem;
            // hacer cosas de servicios...
            presupuesto.reemplazarItem(indice, coso);
        }


        if(unItem.getClass().getSimpleName().equals("Producto")){
            // tengo un producto
        }else{
            // tengo un servicio
        }

    }
}

/*Crear un sistema que tenga una interfaz que permita al usuario indicar desde un menú lo siguiente:

1) Si quiere agregar elementos al presupuesto.
2) Si quiere modificar un elemento.
3) Si quiere eliminar un elemento.

Los elementos/ítems pueden ser productos o servicios.
Cada producto tiene una cantidad, un precio unitario, un nombre y una descripción.
Cada servicio tiene un costo por hora y una cantidad de horas. Además del nombre del servicio, el nombre de la persona que lo ejecuta y una descripción.

Una vez que el presupuesto está listo (el usuario decide finalizar), mostrar el presupuesto total y el detalle de todos los ítems agregados.

 */
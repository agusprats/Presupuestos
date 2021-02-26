package adaitw.java;

import java.util.ArrayList;
import java.util.List;

public class Presupuesto {

    List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }

    public double calcularTotal(){
        double total = 0;
        for(Item i: items){
            total += i.calcularTotal();
        }
        return total;
    }

    public void agregarItem(Item item){
        items.add(item);
    }
    public void eliminarItem(Item item){
        items.remove(item);
    }
    public void reemplazarItem(int indice, Item item){
        items.set(indice, item);
    }


}

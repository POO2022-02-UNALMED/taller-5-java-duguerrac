package gestion;
import zooAnimales.Animal;
import java.util.ArrayList;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales = new ArrayList<Animal>();

    public Zona() {
    }

    public Zona(String nombre, Zoologico zoo) {
        this.nombre=nombre;
        this.zoo=zoo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public Zoologico getZoo() {
        return this.zoo;
    }

    public void setZoologico(Zoologico nuevo) {
        this.zoo=nuevo;
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(ArrayList<Animal> a) {
        this.animales = a;
    }

    public int cantidadAnimales() {
        return animales.size();
    }

    public void agregarAnimales(Animal animal) {
        animal.setZona(this);
        this.animales.add(animal);}
}
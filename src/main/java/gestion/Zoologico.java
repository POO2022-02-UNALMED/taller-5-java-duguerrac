package gestion;
import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas = new ArrayList<Zona>();

    public Zoologico() {
    }

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String u) {
        this.ubicacion = u;
    }

    public ArrayList<Zona> getZona() {
        return zonas;
    }

    public void setZona(ArrayList<Zona> nuevo) {
        this.zonas=nuevo;
    }

    public void agregarZonas(Zona a){
        a.setZoologico(this);
        this.zonas.add(a);
    }

    public int cantidadTotalAnimales() {
        int x = 0;
        for(int i = 0; i < zonas.size(); i++) {
            x += zonas.get(i).cantidadAnimales();
        }
        return x;
    }
}
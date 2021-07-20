
package clases;

public class Huesped {
    String nombre;
    String numHab;

    public Huesped(String nombre, String numHab) {
        this.nombre = nombre;
        this.numHab = numHab;
    }

    public Huesped() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumHab() {
        return numHab;
    }

    public void setNumHab(String numHab) {
        this.numHab = numHab;
    }

    @Override
    public String toString() {
        return "Huesped{" + "nombre=" + nombre + ", numHab=" + numHab + '}';
    }
    
    
    
}

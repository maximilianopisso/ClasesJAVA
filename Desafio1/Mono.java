package Desafio1;

public class Mono extends Animal {
    private String nombre;
    private String raza;
  

    public Mono() {
    }

    public Mono(String categoria, String especie, String nombre, String raza) {
        super(categoria, especie);
        this.nombre = nombre;
        this.raza = raza;    
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

  

    @Override
    public String toString() {
        return "{" + " categoria='" + getCategoria() + "'" + " especie='" + getEspecie() + "'" + " nombre='" + getNombre()
                + "'" + ", raza='" + getRaza() + "'" + "}";
    }

    public String comunicarse() {
        return "Alaridos...";
    };

    public String transladarse() {
        return "En 4 patas";
    };

}

package Desafio1;

public class Vaca extends Animal {

    private String nombre;
    private String raza;

    public Vaca() {
        super();
    }

    public Vaca(String categoria, String especie, String nombre, String raza) {
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
        return "{" + " categoria='" + getCategoria() + "'" + " raza='" + getRaza() + "'" + " nombre='" + getNombre()
                + "'" + ", raza='" + getRaza() + "'" + "}";
    }

    public String comunicarse() {
        return "Mugiendo...";
    };

    public String transladarse() {
        return "Se translada en 4 patas";
    };
}

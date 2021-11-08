package Desafio1;

public class Gato extends Animal {

    private String nombre;
    private String raza;
    private String tipo_pelaje;
    private String color_pelaje;

    public Gato() {
        super();
    }

    public Gato(String categoria, String especie, String nombre, String raza, String tipo_pelaje, String color_pelaje) {
        super(categoria, especie);
        this.nombre = nombre;
        this.raza = raza;
        this.tipo_pelaje = tipo_pelaje;
        this.color_pelaje = color_pelaje;
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

    public String getTipo_pelaje() {
        return this.tipo_pelaje;
    }

    public void setTipo_pelaje(String tipo_pelaje) {
        this.tipo_pelaje = tipo_pelaje;
    }

    public String getColor_pelaje() {
        return this.color_pelaje;
    }

    public void setColor_pelaje(String color_pelaje) {
        this.color_pelaje = color_pelaje;
    }

    @Override
    public String toString() {
        return "{" + " categoria='" + getCategoria() + "'" + " especie='" + getEspecie() + "'" + " nombre='"
        + getNombre() + "'" + ", raza='" + getRaza() + "'" + ", tipo_pelaje='" + getTipo_pelaje() + "'"
        + ", color_pelaje='" + getColor_pelaje() + "'" + "}";
    }

    public String comunicarse() {
        return "Maullando...";
    };

    public String transladarse() {
        return "Se translada en 4 patas";
    };

}

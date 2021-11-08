package Desafio1;

public abstract class Animal {

    protected String categoria;
    protected String especie;
    
    public Animal() {
    }
 
    public Animal(String categoria, String especie) {
        this.categoria = categoria;
        this.especie = especie;
    }


    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "{" +
            " categoria='" + getCategoria() + "'" +
            ", especie='" + getEspecie() + "'" +
            "}";
    }


    public abstract String comunicarse();
    public abstract String transladarse();
    
}

public class Estudiante {

    private Integer id;
    private String nombreCompleto;
    private Float promedio;
    private boolean presentismo;


    public Estudiante() {
    }

    public Estudiante(Integer id, String nombreCompleto, Float promedio, boolean presentismo) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.promedio = promedio;
        this.presentismo = presentismo;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Float getPromedio() {
        return this.promedio;
    }

    public void setPromedio(Float promedio) {
        this.promedio = promedio;
    }

    public boolean isPresentismo() {
        return this.presentismo;
    }

    public boolean getPresentismo() {
        return this.presentismo;
    }

    public void setPresentismo(boolean presentismo) {
        this.presentismo = presentismo;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombreCompleto='" + getNombreCompleto() + "'" +
            ", promedio='" + getPromedio() + "'" +
            ", presentismo='" + isPresentismo() + "'" +
            "}";
    }
}
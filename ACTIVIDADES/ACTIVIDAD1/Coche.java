package actividad1;

public class Coche implements VehículoConEncendido {
    
    private String marca;
    private String nombre;

    public Coche() {
        this.marca = "";
        this.nombre = "";
    }

    public Coche(String marca, String nombre) {
        setMarca(marca);
        setNombre(nombre);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null && !marca.trim().isEmpty()) {
            this.marca = marca;
        } else {
            this.marca = "Desconocida";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            this.nombre = "Desconocido";
        }
    }

    @Override
    public void acelerar() {
        System.out.println(nombre + " está acelerando usando el motor.");
    }

    @Override
    public void frenar() {
        System.out.println(nombre + " está frenando.");
    }

    @Override
    public void encender() {
        System.out.println(nombre + " está encendido.");
    }

    @Override
    public void apagar() {
        System.out.println(nombre + " está apagado.");
    }
}

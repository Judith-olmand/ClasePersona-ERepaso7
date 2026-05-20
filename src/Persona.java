public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) throws Exception {
        this.nombre = nombre;
        setEdad(edad);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad < 0){
            throw new Exception("La edad debe ser mayor a 0.");
        }else {
            this.edad = edad;
        }
    }

    public void saludar(){
        System.out.println(nombre + " tiene " + edad + " años. Manda un saludo.");
    }
}
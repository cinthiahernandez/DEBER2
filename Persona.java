
package Pregunta4;

public class Persona {
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    
    public Persona(String nombre, String direccion){
        this.nombre= nombre;
        this.direccion= direccion;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this. nombre= nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion= direccion;
    }
    public String getTelefono(){
        return direccion;
    }
    public void setTelefono(String telefono){
        this.telefono= telefono;
    }
    public String getEmail(){
        return direccion;
    }
    public void setEmail(String email){
        this.email= email;
    }
}

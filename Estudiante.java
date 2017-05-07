
package Pregunta4;


public class Estudiante extends Persona {
    
    public enum Status{
     Primero,
     Segundo,
     Tercero,
     Cuarto,
    }
    private Status status;
    
    public Estudiante(String nombre, String direccion, Status status){
        super(nombre,direccion);
        this.status= status;
    }
    
    public Status getStatus(){
    return status;   
}
    public void setStatus(Status status){
        this.status=status;
    }
}

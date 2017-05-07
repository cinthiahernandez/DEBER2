
package Taller1.pregunta2;

import java.util.Date;

public class Cuenta {
    //a)
    private int id;
    //b)
    private double saldo;
    //c)
    private double interesAnual;
    //d)
    private Date fechaInicial;
    //e)
    public Cuenta(){
       
    }
    public Cuenta(int id, double saldo){
        this.id=id;
        this.saldo=saldo;
    }
    
    public double getInteresAnual(){
        return(interesAnual);
    }
    public void setInteresAnual(double interesAnual){
        this.interesAnual=interesAnual;
    }
    public Date getFechaInicial(){
        return fechaInicial;
    }
    
    public void setFechaInicial(Date fechaInicial){
        this.fechaInicial=fechaInicial;
    }
    public void deposito (double deposito){
        this.saldo=this.saldo+deposito;
        
    }
    public void retiro (double retiro){
       // this.saldo=this.saldo-retiro;
       //if(saldo<retiro)
       if (retiro>saldo){
           System.out.println("Saldo insuficiente");
       }else
           this.saldo=this.saldo-retiro;
    }
    
}





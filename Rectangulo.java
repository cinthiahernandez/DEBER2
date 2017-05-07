
package Pregunta1;

public class Rectangulo {
    //a)
    private double altura=1;
    private double anchura=1;
    
    //b)
    public Rectangulo (){
    }
    //c)
    
public Rectangulo(double altura, double anchura){
    this.altura= altura;
    this.anchura = anchura;
}
//d)
 public double getArea(){
     double area = this.altura*this.anchura;
     return area;
     //return this.altura*this.anchura;
 } 
//e) 
 public double getPerimetro(){
     return (this.altura+this.anchura)*2;
 }
 
}


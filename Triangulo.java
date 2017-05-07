
package Taller1.pregunta3;

public class Triangulo {
//a)
private double lado1=1.0;
private double lado2=1.0;
private double lado3=1.0;

//b)
public Triangulo(){
    
}
//c)
public Triangulo (double lado1, double lado2, double lado3){
    this.lado1=lado1;
    this.lado2=lado2;
    this.lado3=lado3;
    
}
//d)
  public double getlado1(){
        return(lado1);
    }
    public void setlado1(double lado1){
        this.lado1=lado1;
    }
public double getlado2(){
        return(lado2);
    }
    public void setlado2(double lado2){
        this.lado2=lado2;
    }
public double getlado3(){
        return(lado3);
    }
    public void setlado3(double lado3){
        this.lado3=lado3;
    }
    //e)
    public double getArea(){
     double area = (this.lado1*lado2)/2;
     return area;
    }
    
public double setPerimetro(){
    return (this.lado1*3);
}

}

    
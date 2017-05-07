
import Pregunta2.Cuenta;

public class Main{

        public static void main (String[]args){
            Taller1.pregunta2.Cuenta cta1= new Taller1.pregunta2.Cuenta();
            cta1. setSaldo(1000);
            System.out.println("Saldo inicial:  "+cta1.getSaldo());
            System.out.println("Retiro: 500");
            cta1.retiro(500);
            System.out.println("Retiro: 50");
            cta1.retiro(50);
            System.out.println("Saldo: " + cta1.getSaldo());
            System.out.println("Deposito: 10");
            Taller1.pregunta2.Cuenta cta2=new Taller1.pregunta2.Cuenta(0, 100);
            cta2.retiro(1000);
            System.out.println("Saldo:  " + cta2.getSaldo());
           
        }
}



//Bianca Gabriela Craciun - Prueba técnica: Mini calculadora de notas.
import java.util.Scanner;

public class Pru_480 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int asignaturas, suspendidas, k; 
        double nota, suma, media; 
        String secuenciaDeNotas;
        boolean aprobado, notaValida;
        
        secuenciaDeNotas = "";
        suma = 0;
        suspendidas = 0;
        aprobado = false;

        do
        {
            System.out.print("¿Cúantas asignaturas tiene usted?" + " ");
            asignaturas = teclado.nextInt();
            
            if(asignaturas < 1 || asignaturas > 10)
            {
                System.out.println("ERROR. El número de asignaturas "
                        + "debe estar entre 1 y 10.");
            }   
        }while(!((asignaturas <= 10) && (asignaturas >= 1)));
        
        System.out.println("\nIntroduzca las notas de cada asignatura"
                + " una por una y con un decimal como mínimo.");
        
        for(k = 1; k <= asignaturas; k = k+1) 
        {
            do
            {
                System.out.print("Introduzca una nota:" + " ");
                nota = teclado.nextDouble();
                
                notaValida = (nota >= 0 && nota <= 10);
                
                if(!notaValida) 
                {
                    System.out.println("ERROR. La nota debe estar entre 0 y 10.");
                }
            }while(!notaValida);
            
            secuenciaDeNotas = (secuenciaDeNotas + nota) + "," + " ";
            suma = suma + nota;
            
            if(nota < 5)
            {
                suspendidas = suspendidas + 1;
            }  
        }
        
        media = (suma/asignaturas);
        
        if(media >= 5 && suspendidas <= 1)
        {
            aprobado = true;
        }
       
        System.out.println("\nEstas son sus notas:"+ " " + secuenciaDeNotas);
        System.out.printf("Nota media: %.1f", media);
        System.out.println("\nAsignaturas suspensas:" + " " + suspendidas);
        
        if(aprobado == true)
        {
            System.out.println("Resultado final: HA APROBADO");
        }
        else
        {
            System.out.println("Resultado final: HA SUSPENDIDO");
        }
    }
}


package lab2p1_carlosflores;
import java.util.Scanner;

public class LAB2P1_CARLOSFLORES 
{
    
    public static void main(String[] args) 
    {
        Scanner Leer = new Scanner(System.in);
        boolean running = true;
        
        
        while (running)
        {
            System.out.println("");
            System.out.println("1. Clasificando numeros");
            System.out.println("2. Aproximando PI");
            System.out.println("3. MCD");
            System.out.println("4. Salir ");
            int opcion = Leer.nextInt();
            
            switch (opcion)
            {
                case 1:
                    System.out.println("Ingrese un numero: ");
                    int numero = Leer.nextInt();
                    boolean es_primo = true;
                    int cont = 2;
                    
                    if (numero < 0)
                    {
                        numero *= -1;
                    }
                    
                    while (cont < numero)
                    {
                        if (numero % cont == 0)
                        {
                            es_primo = false;
                            break;
                        }
                        else
                        {
                            cont++;
                        }
                    }
                    
                    if (numero % 2 == 0)
                    {
                        System.out.println("El numero es par");
                        if (es_primo)
                        {
                            System.out.print(" y es primo");
                        }
                        
                    }
                    
                    else if (numero % 2 != 0)
                    {
                        System.out.println("El numero ingresado es impar");
                        if (es_primo)
                        {
                            System.out.print(" y es primo");
                        }
                    }
                    
                    break;
                
                case 2:
                    System.out.println("Ingrese un numero que sirva como limite: ");
                    int n = Leer.nextInt();
                    int c = 1;
                    double numerador = 0;
                    double denominador = 0;
                    double respuesta = 1;
                    
                    while (c <= n)
                    {
                        double i = Math.pow(c, 2);
                        numerador = 4 * i;
                        denominador = (numerador - 1);
                        respuesta *= (numerador / denominador); 
                        c++;
                        
                    }
                    
                    System.out.println(respuesta * 2);           
                    break;
                    
                case 3: 
                    System.out.println("Ingrese un numero: ");
                    int a = Leer.nextInt();
                    System.out.println("Ingrese otro numero");
                    int b = Leer.nextInt();
                    
                    while (a != b)
                    {
                        if ( a > b)
                        {
                            a = a - b;
                            
                        }
                        
                        else
                        {
                            b = b - a;
                        }
                    }
                    
                    System.out.println(b);
                    
                    
                    break;
                    
                case 4:
                    running = false;
                    
                default:
                    System.out.println("opcion incorrecta ");
                    break;
            }
        }
    }
    
}

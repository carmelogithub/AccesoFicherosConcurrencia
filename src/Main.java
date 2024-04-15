import java.io.*;

public class Main {
    public static void main(String [] args){
        int a=5;
        int b=3;
        int suma =a+b;
        int resta = a -b;
        int multiplicacion=a*b;
        double division=(double)a/b;

        String fichero="datos.txt";
        try {
            PrintWriter escribir=new PrintWriter(new BufferedWriter(new FileWriter(fichero)));
            escribir.println("Operaciones matemáticas");
            escribir.println(("la suma es "+suma));
            escribir.println(("la resta es "+resta));
            escribir.println(("la multiplicacion es "+multiplicacion));
            escribir.println(("la division es "+division));
            escribir.flush();
            BufferedReader lector=new BufferedReader(new FileReader(fichero));
            String linea;
            while((linea=lector.readLine())!=null){
                System.out.println(linea);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Aquí cerramos las conexiones");
        }
        System.out.println("fichero guardado");

    }

}

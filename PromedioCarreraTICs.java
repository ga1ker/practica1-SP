import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PromedioCarreraTICs {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Número de grupos: ");
        int numGrupos = Integer.parseInt(reader.readLine());
        
        double[] grupos = new double[numGrupos];
        
        for (int i = 0; i < numGrupos; i++) {
            System.out.println("----------------");
            System.out.print("Cantidad de alumnos en el grupo " + (i + 1) + ": ");
            int numAlumnos = Integer.parseInt(reader.readLine());
            System.out.println("--------------------------");
            
            double sumaPromedios = 0;
            
            for (int j = 0; j < numAlumnos; j++) {
                System.out.print("Promedio del alumno " + (j + 1) + " del grupo " + (i + 1) + ": ");
                double promedioAlumno = Double.parseDouble(reader.readLine());
                sumaPromedios += promedioAlumno;
            }
            
            double promedioGrupo = sumaPromedios / numAlumnos;
            grupos[i] = promedioGrupo;
        }
        
        double sumaPromediosGenerales = 0;
        
        for (int i = 0; i < numGrupos; i++) {
            System.out.println("--------------------");
            System.out.println("Promedio del grupo " + (i + 1) + ": " + grupos[i]);
            sumaPromediosGenerales += grupos[i];
        }
        
        double promedioGeneral = sumaPromediosGenerales / numGrupos;
        System.out.println("Promedio general de la carrera de TICS: " + promedioGeneral);
    }
}
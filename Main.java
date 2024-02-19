public class Main {
    public static void main(String[] args) {
        
    }
    public static void leerAlumno(Alumno a){
        a.nombre = Leer.leerTexto("Introduce el nombre del alumno: ");
        a.edad = Leer.leerEntero("Introduce la edad del alumno: ");
        a.num = Leer.leerEntero("Introduce el número del alumno: ");
        a.curso = Leer.leerEntero("Introduce el curso del alumno: ");
    }
    public static void imprimirAlumno(Alumno a){
        System.out.println("DATOS DEL ALUMNO:");
        System.out.println("-----------------");
        System.out.println("Nombre: "+a.nombre);
        System.out.println("Edad: "+a.edad);
        System.out.println("Número: "+a.num);
        System.out.println("Curso: "+a.curso);
    }
}
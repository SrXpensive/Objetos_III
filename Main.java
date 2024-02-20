public class Main {
    public static void main(String[] args) {
        Alumno a1 = new Alumno(1,23,1,"Paco");
        Alumno a2 = new Alumno(2,24,1,"Benito");
        Alumno a3 = new Alumno(3,24,1,"Adolfo");
        // Copiamos el alumno 2 al alumno 1
        copiaAlumno(a1,a2);
        System.out.println("¿Son los alumnos 1 y 2 iguales?: "+igualAlumno(a1,a2));
        System.out.println("¿Son los alumnos 2 y 3 iguales?: "+igualAlumno(a2,a3));

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
    public static void copiaAlumno(Alumno a, Alumno b){
        a.nombre = b.nombre;
        a.edad = b.edad;
        a.num = b.num;
        a.curso = b.curso;
    }
    public static boolean igualAlumno(Alumno a, Alumno b){
        return (a.nombre.equals(b.nombre)) && (a.edad == b.edad) && (a.num == b.num) && (a.curso == b.curso);
    }
}
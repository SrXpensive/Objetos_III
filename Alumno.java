public class Alumno {
    int num;
    int edad;
    int curso;
    String nombre;
    Alumno(){
        this.num = 0;
        this.edad = 12;
        this.curso = 1;
        this.nombre = "";
    }
    Alumno(int num, int edad, int curso, String nombre){
        this.num  = num;
        this.edad = edad;
        this.curso = curso;
        this.nombre = nombre;
    }
    Alumno(Alumno original){
        this.num = original.num;
        this.edad = original.edad;
        this.curso = original.curso;
        this.nombre = original.nombre;
    }
}

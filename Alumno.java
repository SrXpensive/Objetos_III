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
    public void copiaAlumno(Alumno a){
        this.nombre = a.nombre;
        this.edad = a.edad;
        this.num = a.num;
        this.curso = a.curso;
    }
    public boolean igualAlumno(Alumno a){
        return (a.nombre.equals(this.nombre)) && (a.edad == this.edad) && (a.num == this.num) && (a.curso == this.curso);
    }
}

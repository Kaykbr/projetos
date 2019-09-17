package qacademico;


public class Professor extends Pessoa{
    
    private String cursos;
    private Double salario;

    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cs) {
        this.cursos = cs;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double s) {
        this.salario = s;
    }
    
       public class Estudante extends Pessoa{
}


}

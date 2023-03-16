public class Aluno {
     String nome;
     String curso;
     Int notas;

    public Aluno(String nome, String curso, Int notas) {
        this.nome = nome;
        this.curso = curso;
        this.notas = notas;
    }

    public double calcularMedia() {
        double somaNotas = 0;
        for (double nota : notas.values()) {
            somaNotas += nota;
        }
        return somaNotas / notas.size();
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public Int getNotas() {
        return notas;
    }

    public void setNotas(notas) {
        this.notas = notas;
    }
}
    
    

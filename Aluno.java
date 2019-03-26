public class Aluno {
    private String name;
    private int matricula;
    private String apelido;
    private int nota;

    public Aluno() {
        this.name = "";
        this.matricula = 0;
        this.apelido = "";
    }
    public Aluno(String name, int matricula) {
        this.name = name;
        this.matricula = matricula;
    }
    public Aluno(String name, int matricula, int nota) {
        this.name = name;
        this.matricula = matricula;
        this.nota = nota;
    }
    public Aluno(String name, int matricula, String apelido) {
        this.name = name;
        this.matricula = matricula;
        this.apelido = apelido;
    }
    public Aluno(String name, int matricula, String apelido, int nota) {
        this.name = name;
        this.matricula = matricula;
        this.apelido = apelido;
        this.nota = nota;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMatricula() {
        return this.matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getApelido() {
        return this.apelido;
    }
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    public int getNota() {
        return this.nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }
    @Override
    public String toString() {
        return "Nome: " + this.getName() + System.lineSeparator()
                + "Matricula: " + this.getMatricula() + System.lineSeparator()
                + "Apelido: " + this.getApelido() + System.lineSeparator()
                + "Nota: " + this.getNota();
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Jon", 118210631, "JonJon", 5);
        System.out.println(aluno1.toString());
    }
}

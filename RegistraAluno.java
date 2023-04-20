public class RegistraAluno {
    private String nome;
    private String endereco;
    private int idade;
    private double notaMatematica;
    private double notaPortugues;
    private double notaGeografia;
    private static int contadorEstudante;
    //incrementando o contador
    {
        contadorEstudante++;
    }
    //get e set nome
    public String getNome() {
        return this.nome;
    }
    public void setNome(String temp) {
        this.nome = temp;
    }
    //get e set endereco
    public String getEndereco() {
        return this.endereco;
    }
    public void setEndereco(String temp) {
        this.endereco = temp;
    }
    //get e set idade
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int temp) {
        this.idade = temp;
    }
    //get e set notaMatematica
    public double getNotaMatematica() {
        return this.notaMatematica;
    }
    public void setNotaMatematica(double temp) {
        this.notaMatematica = temp;
    }
    //get e set notaPortugues
    public double getNotaPortugues() {
        return this.notaPortugues;
    }
    public void setNotaPortugues(double temp) {
        this.notaPortugues = temp;
    }
    //get e set notaGeografia
    public double getNotaGeografia() {
        return this.notaGeografia;
    }
    public void setNotaGeografia(double temp) {
        this.notaGeografia = temp;
    }
    //método para calcular a média do aluno
    public double media(){
        return (this.notaMatematica + this.notaPortugues + this.notaGeografia)/3;
    }
    //get para quantidade de alunos cadastrados
    public static int getQuantidadeAlunos() {
        return RegistraAluno.contadorEstudante;
    }
}

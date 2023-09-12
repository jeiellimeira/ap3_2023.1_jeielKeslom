public class Aluno {
    // 10104235940
    String nome = "semnome";
    int matricula = -1;
    double notaUnidade1 = -1.0;
    double notaUnidade2 = -1.0;
    double notaUnidade3 = -1.0;

    public double getMedia() {
        double media = -1;
        media = notaUnidade1 + notaUnidade2 + notaUnidade3;
        return media;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNotaUnidade1() {
        return notaUnidade1;
    }

    public void setNotaUnidade1(double notaUnidade1) {
        this.notaUnidade1 = notaUnidade1;
    }

    public double getNotaUnidade2() {
        return notaUnidade2;
    }

    public void setNotaUnidade2(double notaUnidade2) {
        this.notaUnidade2 = notaUnidade2;
    }

    public double getNotaUnidade3() {
        return notaUnidade3;
    }

    public void setNotaUnidade3(double notaUnidade3) {
        this.notaUnidade3 = notaUnidade3;
    }

    @Override
    public String toString() {
        return "Aluno" +
                "[nome=" + nome +
                ", matricula=" + matricula +
                ", notaUnidade1=" + notaUnidade1 +
                ", notaUnidade2=" + notaUnidade2 +
                ", notaUnidade3=" + notaUnidade3 +
                "]";
    }

}

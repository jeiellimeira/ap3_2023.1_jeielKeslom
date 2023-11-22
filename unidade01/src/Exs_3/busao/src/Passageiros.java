import java.time.LocalDate;

public class Passageiro {
public Passageiro(String nome, String documento, LocalDate dataNascimento) {
        this.nome = nome;
        this.documento = documento;
        this.dataNascimento = dataNascimento;
    }
private String nome;
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
private String documento;
private LocalDate dataNascimento;
    
}
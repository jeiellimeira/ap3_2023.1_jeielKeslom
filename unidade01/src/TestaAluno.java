public class TestaAluno {
    
    public static void main(String[] args) {
        Aluno umAluno = new Aluno(); // contrutor
        System.out.println(umAluno); // toString()
        umAluno.setNome("xico");
        umAluno.setMatricula(1000);
        umAluno.setNotaUnidade1(-1);
        umAluno.setNotaUnidade2(-1);
        umAluno.setNotaUnidade3(-1);
        
        System.out.println(umAluno.getMedia());
        System.out.println(umAluno);



    }
}

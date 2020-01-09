public class FuncionarioJava{

    public static class Funcionario {

        private String nome;
        private String sobrenome = "Silva";
        private String cargo = "Desenvolvedor";

        public Funcionario(String nome, String sobrenome, String cargo){
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.cargo = cargo;
        }

        public Funcionario() {
        }
        
        public Funcionario(String nome, String cargo){
            this.nome = nome;
            this.cargo = cargo;
        }
        
        public Funcionario(String nome){
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getSobrenome() {
            return sobrenome;
        }

        public void setSobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
        }

        public String getCargo() {
            return cargo;
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;
        }
 void imprimeDados() {
            System.out.println("Nome:" + getNome());
            System.out.println("Sobrenome:" + getSobrenome());
            System.out.println("Cargo:" + getCargo()+"\n");
        }
    }

    public static void main(String[] args) {
       
       // Funcionario f1 = new Funcionario("Alexander","Bodogo","Professor");
        
        Funcionario f1 = new Funcionario("Hugo", "Bastista", "Professor");
        f1.imprimeDados();
    }
}
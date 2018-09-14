package si400.demos;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Cliente(String nome, String cpf, String telefone, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public static void main(String[] args) {
        
        Cliente o1;
        
        o1 = new Cliente(null, null);
        
        System.out.println("Cliente: " + o1.getNome());
        System.out.println("CPF: " + o1.getCpf());
        System.out.println("Endereço: " + o1.getEndereco());
        System.out.println("Telefone: " + o1.getTelefone());
    }
}

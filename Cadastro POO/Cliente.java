public class Cliente {
    private String nome;
    private String sobrenome;
    private Telefone tele;
    private int rg;
    private String cpf;

    public Cliente(String nome, String sobrenome, int rg, String cpf, Telefone tele) {   
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.cpf = cpf;
        this.tele = tele;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String no){
        this.nome = no;
    }
    public String sobrenome(){
        return this.sobrenome;
    }
    public void setSobrenome(String sobre){
        this.sobrenome = sobre;
    }
    public int getRg(){
        return this.rg;
    }
    public void setRg(int r){
        this.rg = r;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String c){
        this.cpf = c;
    }
}


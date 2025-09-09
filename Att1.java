public class Att1 {
    private String nome;
    private String sobrenome;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public String nomeCompleto(){
        return nome + " " + sobrenome;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Nome Sobrenome {");
        sb.append("nome: '").append(getNome()).append('\'');
        sb.append(", sobrenome: '").append(getSobrenome()).append('\'');
        sb.append(", nome completo: '").append(nomeCompleto()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}


package daniel_arrays;

import java.util.List;

public class Pessoas {
  private int idade;
  private String nome;
  private String cargo;
  private List<Pessoas> listapessoas;

    public Pessoas() {
    }

    public Pessoas(int idade, String nome, String cargo) {
        this.idade = idade;
        this.nome = nome;
        this.cargo = cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


}

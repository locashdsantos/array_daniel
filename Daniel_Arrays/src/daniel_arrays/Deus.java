package daniel_arrays;
import java.util.List;


public class Deus {

    public void valida(String nome, List<Pessoas> pessoas) {

    for(Pessoas pessoasAux : pessoas){
        
    if(nome.equals(pessoasAux.getNome())){
        
        System.out.println("Nome econtrado, enviando para remoção!");
        remove(pessoasAux, pessoas);
    }    
        
    }
    
    }

    public void remove(Pessoas pessoa, List<Pessoas> pessoas) {
    
        pessoas.remove(pessoa);
        
        System.out.println("A Lista ficou dessa forma");
        
        for(Pessoas listaPessoas : pessoas){
        
            System.out.println(" Nome: " + listaPessoas.getNome()
            + " Idade: " + listaPessoas.getIdade() + 
                    " Cargo: " + listaPessoas.getCargo());
                       
        }     
        
    }
    
    
}

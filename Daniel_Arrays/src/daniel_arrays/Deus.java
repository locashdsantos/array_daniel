
package daniel_arrays;

import java.util.ArrayList;
import java.util.List;


public class Deus {

    public List<Pessoas> remove(String nome, List<Pessoas> pessoas){
        
        List<Pessoas> listaux = new ArrayList<>();
        
        for(Pessoas listaPessoas : pessoas){
            
            
                    
            if(nome.equals(listaPessoas.getNome())){
                
                pessoas.remove(listaPessoas);
                listaux = pessoas;
                
            }else{
            
                listaux = pessoas;
                
            }
            
        }
        return listaux;
        
    }
              
}

package daniel_arrays;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Daniel_Arrays{


    public static void main(String[] args) {        
            
        Scanner r = new Scanner(System.in);
        List<Pessoas> p = new ArrayList();
        
        Pessoas p0 = new Pessoas(18, "Mickinho", "Estagiário");
        p.add(p0);
        Pessoas p1 = new Pessoas(20, "Albine", "Estagiário");
        p.add(p1);
        Pessoas p2 = new Pessoas(30, "Criss", "Gerente");
        p.add(p2);   
               
        for(Pessoas listaPessoas : p){
        
            System.out.println(" Nome: " + listaPessoas.getNome()
            + " Idade: " + listaPessoas.getIdade() + 
                    " Cargo: " + listaPessoas.getCargo());
                       
        } 
        
        System.out.println("Você quer retirar uma pessoa da lista?");
        String resp = r.nextLine();    
        if("s".equals(resp)){
        
           System.out.println("Quem gostaria de remover?");
           String nomeRemover = r.nextLine();
           Deus d = new Deus();
           d.valida(nomeRemover, p);
           
        }else{
            
            System.out.println("A lista continua a mesma!"); 
            
        }
        
        
      /**  
        Deus d = new Deus();
        
        Deus.remove();
        
        for(Pessoas listaPessoas : listaNova){
        
            System.out.println(" Nome: " + listaPessoas.getNome()
            + " Idade: " + listaPessoas.getIdade() + 
                    " Cargo: " + listaPessoas.getCargo());
                       
        }
        
        
    }
    **/
    }
}

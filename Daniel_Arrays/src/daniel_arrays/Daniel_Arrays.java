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
        System.out.println("Gostaria de removeer alguém da lista?\n");        
        String nome = r.nextLine();
        
        Deus d = new Deus();
        
        List<Pessoas> listaNova =  d.remove(nome, p);
        
        for(Pessoas listaPessoas : listaNova){
        
            System.out.println(" Nome: " + listaPessoas.getNome()
            + " Idade: " + listaPessoas.getIdade() + 
                    " Cargo: " + listaPessoas.getCargo());
                       
        }
        
        
    }
    
}

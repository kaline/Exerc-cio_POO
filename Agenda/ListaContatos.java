import java.util. ArrayList;

public class ListaContatos{
    
    public static void main(String[] args){
        
        ArrayList<Contato> contatos = new ArrayList();
        
        
        Contato contato = new Contato("kaline", "mesquitabfkaline@gmail.com", "9999999");
        Contato contato2 = new Contato("pinguim", "pinguim@gmail.com", "9999999");
        
        contatos.add(contato);
        contatos.add(contato2);
        
        
        for(Contato c : contatos){
            
            System.out.println(c);
        }
        
        System.out.println("Tamanhnho da lista: " + contatos.size());
    }
    
    
}

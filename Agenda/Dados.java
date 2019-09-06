import java.util. ArrayList;

public class Dados{
    

        ArrayList<Contato> contatos = new ArrayList();
        
        public void CadastroContatos(Contato contato){
            
            contatos.add(contato)
            
        }
        
        public int QuantContatos(Contato contato){
            
            return contatos.size();
        }
    
    
}

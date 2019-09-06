public class Agenda{
    
    
     String nome;
     String telefone;
     String email;

    public static void main(String args[]){
        
     
    }
     
     
     public Agenda(){
         
     }
     public Agenda(String nome, String telefone, String email){
         
         this.nome = nome;
         this. email = email;
         this. telefone = telefone;
     }
     
     public String getNome(){
         return nome;
     }
     
     public void setNome(String nome){
         this.nome = nome;
     }
     
     public String getTelefone(){
         return telefone;
     }
     
     public void setTelefone(String telefone){
         this.telefone = telefone;
     }
     public String getEmail(){
         return email;
     }
     
     public void setEmail(String email){
         this.email = email;
     }
    
    
}

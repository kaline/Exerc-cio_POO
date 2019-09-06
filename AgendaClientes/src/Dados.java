import java.util.ArrayList;

public class Dados {


		ArrayList<Agenda> contatos = new ArrayList<Agenda>();
		
		public void CadastroContatos(Agenda contato) {
			
			contatos.add(contato);
			
		}
		
		public int quantContatos(Agenda contato) {
			return contatos.size();
			
			
		}
		
		
	

}


import java.util.ArrayList;

public class ListaContatos {

	public static void main(String[] args) {

		ArrayList<Agenda> contatos = new ArrayList<Agenda>();
		
		Agenda contato = new Agenda("kaline", "mesquitabfkaline@gmail.com", "85997995509");
		Agenda contato1 = new Agenda("kaline", "mesquitabfkaline@gmail.com", "85997995509");

		
		contatos.add(contato);
		contatos.add(contato1);

		
		for(Agenda c : contatos) {
			System.out.println(c);
		}
		
		System.out.println("Dados do contato:\nTamanho da lista "  + contatos.size());
		
		
	}

}

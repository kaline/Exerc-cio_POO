import java.util.Scanner;

public class Agenda{
    public static void main(String[] args){
        String[] nome = new String[20];
        String[] email = new String[20];
        String[] telefone = new String[20];

        String opcao = "";

        Scanner entrada = new Scanner(System.in);

        do{
            System.out.println("\nEscolha a opcao:\nInserir\nListar\nExluir\nSair");
            opcao = entrada.nextLine();

            switch(opcao){

                case "inserir":

                break;
            case "listar":
                break;
            case "excluir":

                break;
            case "sair":
                break;
            default:
                System.out.println("Opcao inválida\n");
                break;

                
            }

            
        }while(!opcao.equals("sair"));
    }
}

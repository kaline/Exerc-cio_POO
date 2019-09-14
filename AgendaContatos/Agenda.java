import java.util.Scanner;

import java.io.IOException;




public class Agenda{
    public static void main(String[] args) throws IOException, InterruptedException{

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();



        String[] nome = new String[20];
        String[] email = new String[20];
        String[] telefone = new String[20];

        for(int i = 0; i < 20; i++){
            nome[i] = "";
            telefone[i] = "";
            email[i] = "";

        }

        String opcao = "";
        String continuar = "";
        int posicao = 0;
        String nomeExcluir = "";
        String procura = "";

        Scanner entrada = new Scanner(System.in);

        do{
            System.out.println("\nEscolha a opcao\n($Digitando o nome do item com letras minúsculas):\n 1. Inserir \n 2.Listar \n 3.Consultar\n 4.Excluir\n 5.Sair \n");
            opcao = entrada.nextLine();

            switch(opcao){



                case "inserir":

                do{
                    System.out.println("\nInsira o Nome: ");
                    nome[posicao] = entrada.nextLine();
                    System.out.println("\nInsira o telefone: ");
                    telefone[posicao] = entrada.nextLine();
                    System.out.println("\nInsira o email: ");
                    email[posicao] = entrada.nextLine();    
                    System.out.println("Desejar continuar?\n");
                    continuar = entrada.nextLine();

                    posicao++;

                    
                }while(continuar.equals("sim"));
                break;

            case "listar":
            for(int i = 0; i < 20; i++){
                
                if(!nome[i].equals("")){

                    

                    System.out.println((i+1) + "° contato\n->A.Nome: "+ nome[i] +"\n->B.Telefone: "
                    + telefone[i] +"\n->C.Email: "+ email[i]);
           

                }
             }
                break;

            
            case "consultar":
                System.out.println("\nQuem deseja consultar?\n");
                procura = entrada.nextLine();
                for(int i = 0; i < 20;i++){

                    if(nome[i].equals(procura) || telefone[i].equals(procura) || email[i].equals(procura)){

                            System.out.println("\n->A.nome:"+nome[i]+"\n->B.telefone: "+telefone[i]+"\n->C.email: "+email[i]);
                    }


                }

                break;
           
            case "excluir":

            System.out.println("Quem deseja excluir?");
            nomeExcluir = entrada.nextLine();
                for(int i = 0; i < 20; i++){
                    if(nome[i].equals(nomeExcluir)){
                        nome[i] = "";
                        telefone[i] = "";
                        email[i] = "";



                    }
                }

                break;
            case "sair":
            System.out.println("Programa finalizado\n");
                return;
            default:
                System.out.println("Opcao inválida\n");
                break;

                
            }

            
        }while(!opcao.equals("sair"));
    }
}

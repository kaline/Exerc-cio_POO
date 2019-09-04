public class Dia {
    public static void main(String args[]) {
        
        final int DiasSemana = 7;
        final String[] vetorsemana={"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado"};
        
        if(args.length != 1){
            
            System.err.println("Sintaxe: Dia numero");
            
            System.exit(1);
            
        }
        
        int dia = Integer.parseInt(args[0]);
        
        if(dia < 1 || dia > DiasSemana){
            
            System.err.println("O dia deve estar entre os dia 1 e " + DiasSemana);
             System.exit(1);

        }
        
        System.err.println(vetorsemana[dia]);
        

    }
}

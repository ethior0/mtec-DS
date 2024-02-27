import java.util.Scanner;
 
public class Ex4 {
    
    public static void main(String[] args) {
        
    	Scanner ler = new Scanner(System.in);
        
        String resposta = "Sim";
        
        while(!resposta.equalsIgnoreCase("Não")) {
            System.out.println("Digite o ano atual:");
            int anoAtual = ler.nextInt();
            System.out.println("Digite o ano de nascimento:");
            int anoNasc = ler.nextInt();
            
            int idade = anoAtual - anoNasc;
            
            System.out.println(idade);
            System.out.println(idade >= 18 ? "Maior" : "Menor");
            
            System.out.println("Deseja continuar? (SIM / NÃO)");
            resposta = ler.next();
            if (resposta.equalsIgnoreCase("nao")) {
            	break;
            }
        }
        
        ler. close();
    }
}

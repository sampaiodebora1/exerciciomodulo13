package exercicios_modulo13;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;


public class atividade1 {
	public static void main(String[] args) {
		
        Queue<String> filaBanco = new LinkedList<>();
        
        int opcao = -1;
        
        while(opcao !=0) {
        
        	System.out.println("Escolha a opção:\n 1 - Adicionar Cliente\n 2 - Listar Clientes\n 3- Retirar Cliente\n 0 - Sair");
            
            Scanner leia = new Scanner(System.in);
    		opcao = leia.nextInt();
    		
    		if(opcao ==1 ){
    			System.out.println("Informe o nome do cliente: ");
    		    leia.nextLine(); // Consumir a nova linha pendente
    			String nome = leia.nextLine();
    			filaBanco.offer(nome);
    		}else	
    		if (opcao == 2) {
    			System.out.println("Lista de Clientes na Fila:");
    			System.out.println(filaBanco);
    		}	
    		else
    		if (opcao == 3) {
    			if (filaBanco.isEmpty())
    				System.out.println("Fila Vazia");
    			else {       	     
    				filaBanco.poll();
    				System.out.println("Cliente foi Chamado: " + filaBanco);
    			}	
    		}
    		
    		
        }
        
	}	
	

}

package application;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		int pedido;
		String confirme;
		
		//Lista de op��es
		pedido = Integer.parseInt(JOptionPane.showInputDialog("Qual lanche deseja?\n"
									+ "1- X-Bacon\n"
									+ "2- X-Salada\n"
									+ "3- X-Picanha\n"
									+ "4- X-Tudo"));
		
		
		
			//Em caso de errar o pedido dever� fazer a solicita��o novamente (executando o programa novamente)
			if(pedido == 1){
				confirme = JOptionPane.showInputDialog("X-Bacon\n"
														+ "Pre�o: R$ 20\n"
														+ "Confirma?(sim/nao)");
				if("sim".equals(confirme)){
					JOptionPane.showMessageDialog(null, "Compra concluida !");
				}else{
					JOptionPane.showMessageDialog(null, "Fa�a a solicita��o do pedido novamente");
				}
				
				
			}else if(pedido == 2){
					confirme = JOptionPane.showInputDialog("X-Salada\n"
															+ "Pre�o: R$ 15\n"
															+ "Confirma?(sim/nao)");
					if("sim".equals(confirme)){
						JOptionPane.showMessageDialog(null, "Compra concluida !");
					}else{
						JOptionPane.showMessageDialog(null, "Fa�a a solicita��o do pedido novamente");
					}
					
					
			 }else if(pedido == 3){
				 	confirme = JOptionPane.showInputDialog("X-Picanha\n"
				 											+ "Pre�o: R$ 22\n"
				 											+ "Confirma?(sim/nao)");
					if("sim".equals(confirme)){
						JOptionPane.showMessageDialog(null, "Compra concluida !");
					}else{
						JOptionPane.showMessageDialog(null, "Fa�a a solicita��o do pedido novamente");
					}
					
				 
			  }else if(pedido == 4){
				  	confirme = JOptionPane.showInputDialog("X-Tudo\n"
				  											+ "Pre�o: R$ 30\n"
				  											+ "Confirma?(sim/nao)");
					if("sim".equals(confirme)){
						JOptionPane.showMessageDialog(null, "Compra concluida !");
					}else{
						JOptionPane.showMessageDialog(null, "Fa�a a solicita��o do pedido novamente");
					}
					
					
			   }else{
				   JOptionPane.showMessageDialog(null, "Essa op��o nao existe!");
			    }

	}

}

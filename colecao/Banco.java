package colecao;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class Banco {
	public static void main(String[]args) {
		
		List contas = new ArrayList();
		List clientes = new ArrayList();
		
		NumberFormat z = NumberFormat.getCurrencyInstance();
		
		ContaCorrente conta1 = new ContaCorrente();
		ContaCorrente conta2 = new ContaCorrente();
		
		conta1.cliente.setNome(JOptionPane.showInputDialog("Entre com o nome: "));
		conta1.depositar(Double.parseDouble(JOptionPane.showInputDialog("Entre com o Saldo:")));

		conta2.cliente.setNome(JOptionPane.showInputDialog("Entre com o nome: "));
		conta2.depositar(Double.parseDouble(JOptionPane.showInputDialog("Entre com o Saldo:")));
				
		contas.add(conta1);
		contas.add(conta2);
		
		
		for(int i = 0 ; i<contas.size(); i++) {
			ContaCorrente aux  = (ContaCorrente) contas.get(i);
			JOptionPane.showMessageDialog(null,"Nome: " + aux.cliente.getNome() + "\nSaldo: " + z.format(aux.getSaldo()),"Conta",JOptionPane.INFORMATION_MESSAGE);
		}
		
		
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteriasoft;

import br.com.unicamp.ft.cafeteriasoft.entidade.Fornecedor;
import br.com.unicamp.ft.cafeteriasoft.entidade.Funcionario;
import br.com.unicamp.ft.cafeteriasoft.entidade.Venda;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author leand
 */
public class CafeteriaSoft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> produtos = new ArrayList<>();
        produtos.add("leite");
        produtos.add("cafe");
        Fornecedor fornecedor = new Fornecedor("Joao", "78.425.986/0036-15", "(13)9812722220", "leandromascaro@gmail.com", produtos);
        Funcionario funcionario = new Funcionario("42639141805", 1500.00,0,"Marcos","marcos@gmail.com");
        Funcionario funcionario2 = new Funcionario("4442221236", 2500.00,0,"Carlos","carlos@gmail.com");
        Venda venda = new Venda(01,funcionario,10.00,"19/10/2017");
        Venda venda2 = new Venda(02,funcionario2,12.00,"19/10/2017");
        final String FILENAME = "C:\\Users\\leand\\Desktop\\cafeteria\\teste.txt";
        BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			String content = "\r\n" + venda.getCodigo() +
                                "\r\n" + venda.getFuncionario().getNome() +
                                "\r\n" + venda.getDataVenda() + 
                                "\r\n" + venda.getValorTotal();

			fw = new FileWriter(FILENAME, true);
			bw = new BufferedWriter(fw);
			bw.write(content);

			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

    }
    
}

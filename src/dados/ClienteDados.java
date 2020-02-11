package dados;

import classes.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteDados {
    
    public static List<Cliente> lstClientes = new ArrayList<>();
    
    public static Cliente obterPessoaPeloNomeExato(String nome, List<Cliente> clientes){
        
        for (Cliente cliente : clientes) {
            if(cliente.getNome().equals(nome)){
                return cliente;
            }
        }        
        
        return null;
    }
    
    public static List<Cliente> obterPessoaPeloNomeParcial(String nome, List<Cliente> clientes, boolean caseSenstive){
        
        List<Cliente> clientesTemp = new ArrayList<>();
        
        for (Cliente cliente : clientes) {
            String nomeCliente = cliente.getNome();
            System.out.println(cliente.getNome());
            //if(clientes.getNome().indexOf(nome) >= 0){
            if(caseSenstive){
                if(nomeCliente.contains(nome)){
                    System.out.println(cliente.getNome());
                    clientesTemp.add(cliente);
                }
            }else{
                if(nomeCliente.toLowerCase().contains(nome.toLowerCase())){
                    clientesTemp.add(cliente);
                }
//                else{
//                    cliente.;
//                }
            }
        }        
        
        return clientesTemp;
    }
    
}

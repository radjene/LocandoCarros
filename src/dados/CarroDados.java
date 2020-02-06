package dados;

import classes.Carro;
import java.util.ArrayList;
import java.util.List;

public class CarroDados {

 
    public static List<Carro> lstCarros = new ArrayList<Carro>();
    
    public static Carro obterCarroPeloNomeExato(String placa, List<Carro> carros){
        
        for (Carro carro : carros) {
            if(carro.getPlaca().equals(placa)){
                return carro;
            }
        }        
        
        return null;
    }
    
    public static List<Carro> obterCarroPeloNomeParcial(String placa, List<Carro> carros, boolean caseSenstive){
        
        List<Carro> carrosTemp = new ArrayList<>();
        
        for (Carro carro : carros) {
            //if(carro.getPlaca().indexOf(placa) >= 0){
            if(caseSenstive){
                if(carro.getPlaca().contains(placa)){
                    carrosTemp.add(carro);
                }
            }else{
                if(carro.getPlaca().toLowerCase().contains(placa.toLowerCase())){
                    carrosTemp.add(carro);
                }
            }
        }        
        
        return carrosTemp;
    }
    
}

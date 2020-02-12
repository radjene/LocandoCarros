package dados;

import classes.Locacao;
import java.util.ArrayList;
import java.util.List;

public class LocacaoDados {
   
 
    public static List<Locacao> lstLocacoes = new ArrayList<>();
    
    public static Locacao obterLocacaoPeloNomeExato(String codigo, List<Locacao> locacoes){
        
        for (Locacao locacao : locacoes) {
            if(locacao.getCodigo().equals(codigo)){
                return locacao;
            }
        }        
        
        return null;
    }
    
    public static List<Locacao> obterLocacaoPeloNomeParcial(String codigo, List<Locacao> locacoes, boolean caseSenstive){
        
        List<Locacao> locacoesTemp = new ArrayList<>();
        
        for (Locacao locacao : locacoes) {
            //if(locacoes.getCodigo().indexOf(codigo) >= 0){
            if(caseSenstive){
                if(locacao.getCodigo().contains(codigo)){
                    locacoesTemp.add(locacao);
                }
            }else{
                if(locacao.getCodigo().toLowerCase().contains(codigo.toLowerCase())){
                    locacoesTemp.add(locacao);
                }
            }
        }        
        
        return locacoesTemp;
    }
    
}



package atividade10;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author julio mateus morais
 */
public class Atividade10 {

    public static void main(String[] args) {
        
        List<Pagamento> listaPagamentos = new ArrayList<>();
        
        listaPagamentos.add(new PagamentoCartao());
        listaPagamentos.add(new PagamentoPix());
        listaPagamentos.add(new PagamentoCartao());
        listaPagamentos.add(new PagamentoPix());
        
        for(Pagamento x : listaPagamentos){
            x.processarPagamento(200);
        }
    }
    
}

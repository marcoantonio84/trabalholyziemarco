
package unigran.br.projetoodonto.Classes;

import java.util.Arrays;
import java.util.Optional;


public enum TipoPagamento {
    CREDITO(1), DEBITO(2), PIX(3), DINHEIRO(4);
    
   public final Integer codigo;
   
   TipoPagamento(Integer codigo) {
        this.codigo = codigo;
    }

  public static Optional<TipoPagamento> buscarPorCodigo(Integer codigo) {
       return Arrays.stream(values())
                    .sequential()
                    .filter(t -> t.codigo.equals(codigo))
                    .findFirst();
    }
}

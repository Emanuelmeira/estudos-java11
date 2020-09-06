package estudos.lambda2.interfaces;

import estudos.lambda2.Carro;

/**
 * Uma interface funcionau � uma interface com um unico metodo
 *   (interface podem conter mais metodos apenas se forem default com implementa��o)
 */
@FunctionalInterface
public interface CarroPredicate {

    boolean test(Carro carro);

    //N�o � obrigatoria implementa��o de um metodo default em uma interface
    default void metodoComCorpo(){

    }


}

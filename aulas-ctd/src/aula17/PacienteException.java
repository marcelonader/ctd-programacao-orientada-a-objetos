package aula17;

import java.util.Date;

public class PacienteException extends Exception {

    public PacienteException () {
        super();
    }

    public PacienteException (String mensagem) {
        super(mensagem);
    }

    @Override
    public String toString() {
        return "A seguinte exceção ocorreu: "+getClass().getName()+
                "\nMensagem: " +getMessage();
    }

}

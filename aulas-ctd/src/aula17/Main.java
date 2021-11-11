package aula17;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        try {
            Paciente paciente=new Paciente("Juan","Perez","12345",new Date(2021,9,18));

            try {
                paciente.darAlta(new Date(2021, 8, 15));
            } catch (PacienteException e) {
                e.printStackTrace();
            }

        } catch (PacienteException e) {
            e.printStackTrace();
        }
    }

}

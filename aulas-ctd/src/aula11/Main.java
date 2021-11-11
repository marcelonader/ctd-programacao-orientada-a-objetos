package aula11;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Impressora impressora = new ImpressoraCannon("XX", "wifi",
                LocalDate.of(2015, 5, 25), 50, 50);

        ((ImpressoraCannon)impressora).precisaTinta();
    }
}

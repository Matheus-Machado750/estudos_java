public class Main {
    public static void main(String[] args) {

        DiasDaSemana dia1 = DiasDaSemana.TERCA;
        DiasDaSemana dia2 = DiasDaSemana.QUINTA;
        DiasDaSemana dia3 = DiasDaSemana.DOMINGO;

        new ValidadorDia (dia1);
        new ValidadorDia (dia2);
        new ValidadorDia (dia3);
    }
}
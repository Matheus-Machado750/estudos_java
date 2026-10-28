class ValidadorDia {

    ValidadorDia(DiasDaSemana dia) {
        if (dia == DiasDaSemana.SABADO || dia == DiasDaSemana.DOMINGO) {
            System.out.printf("%s não é um dia útil. Fim de semana!%n", dia);
        }
        else{
            System.out.printf("%s é um dia útil.%n", dia);
        }
    }
}

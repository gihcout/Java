package edu.primeirasemana;

public class TipoVariaveis {
        public static void main (String[] args) {
            byte idade = 25;
            short ano = 2024;
            int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
            long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
            final float pi = 3.14F; // float e long precisam terminam com as suas letras para que o Java entenda seu tipo. "final" é utilizado para travar a variavel, não permitindo que um novo valor seja atribuido, "variavel constante"
            double salario = 12940.78;
        }
}

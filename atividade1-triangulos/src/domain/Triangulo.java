package domain;

import exceptions.ParameterValueOutboundException;

import java.util.Arrays;
import java.util.List;

public class Triangulo {
    public String tipo(double v1, double v2, double v3) {
        if(v1 < 0 || v1 > 99 || v2 < 0 || v2 > 99 || v3 < 0 || v3 > 99) {
            throw new ParameterValueOutboundException("Entrada fora da faixa! Os valores devem estar entre 0 e 99.");
        }

        double A, B, C;
        List<Double> valores = Arrays.asList(v1, v2, v3);
        valores.sort((o1, o2) -> o2.compareTo(o1));

        A = valores.get(0);
        B = valores.get(1);
        C = valores.get(2);

        if(A >= B + C) {
            return "NAO FORMA TRIANGULO";
        } else if(A == B && B == C) {
            return "TRIANGULO EQUILATERO";
        } else if(A == B || B == C || A == C) {
            return "TRIANGULO ISOSCELES";
        } else if(A*A == B*B + C*C) {
            return "TRIANGULO RETANGULO";
        } else if(A*A > B*B + C*C) {
            return "TRIANGULO OBTUSANGULO";
        } else if(A*A < B*B + C*C) {
            return "TRIANGULO ACUTANGULO";
        }
        return null;
    }
}

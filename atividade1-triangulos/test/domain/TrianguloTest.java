package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TrianguloTest {
    @ParameterizedTest
    @MethodSource("testeNaoFormaTriangulo_argumentValues")
    void testeNaoFormaTriangulo(double v1, double v2, double v3) {
        String tipo = new Triangulo().tipo(v1, v2, v3);
        Assertions.assertEquals(tipo, "NAO FORMA TRIANGULO");
    }

    private static Stream<Arguments> testeNaoFormaTriangulo_argumentValues() {
        return Stream.of(
                Arguments.of(2,10,3),
                Arguments.of(10,2,3),
                Arguments.of(3,2,10)
        );
    }

    @ParameterizedTest
    @MethodSource("testeTrianguloEquilatero_argumentValues")
    void testeTrianguloEquilatero(double v1, double v2, double v3) {
        String tipo = new Triangulo().tipo(v1, v2, v3);
        Assertions.assertEquals(tipo, "TRIANGULO EQUILATERO");
    }

    private static Stream<Arguments> testeTrianguloEquilatero_argumentValues() {
        return Stream.of(
                Arguments.of(5.2, 5.2, 5.2),
                Arguments.of(13.8, 13.8, 13.8),
                Arguments.of(21.99, 21.99, 21.99)
        );
    }

    @ParameterizedTest
    @MethodSource("testeTrianguloIsosceles_argumentValues")
    void testeTrianguloIsosceles(double v1, double v2, double v3) {
        String tipo = new Triangulo().tipo(v1, v2, v3);
        Assertions.assertEquals(tipo, "TRIANGULO ISOSCELES");
    }

    private static Stream<Arguments> testeTrianguloIsosceles_argumentValues() {
        return Stream.of(
                Arguments.of(15.2, 15.2, 7.3),
                Arguments.of(13.8, 12.28, 13.8),
                Arguments.of(5.78, 21.99, 21.99)
        );
    }

    @ParameterizedTest
    @MethodSource("testeTrianguloRetangulo_argumentValues")
    void testeTrianguloRetangulo(double v1, double v2, double v3) {
        String tipo = new Triangulo().tipo(v1, v2, v3);
        Assertions.assertEquals(tipo, "TRIANGULO RETANGULO");
    }

    private static Stream<Arguments> testeTrianguloRetangulo_argumentValues() {
        return Stream.of(
                Arguments.of(10.0, 6.0, 8.0),
                Arguments.of(15.0, 9.0, 12.0),
                Arguments.of(40.0, 32.0, 24.0)
        );
    }

    @ParameterizedTest
    @MethodSource("testeTrianguloObtusangulo_argumentValues")
    void testeTrianguloObtusangulo(double v1, double v2, double v3) {
        String tipo = new Triangulo().tipo(v1, v2, v3);
        Assertions.assertEquals(tipo, "TRIANGULO OBTUSANGULO");
    }

    private static Stream<Arguments> testeTrianguloObtusangulo_argumentValues() {
        return Stream.of(
                Arguments.of(6.0, 4.0, 3.0),
                Arguments.of(10, 8, 7),
                Arguments.of(5, 3, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("testeTrianguloAcutangulo_argumentValues")
    void testeTrianguloAcutangulo(double v1, double v2, double v3) {
        String tipo = new Triangulo().tipo(v1, v2, v3);
        Assertions.assertEquals(tipo, "TRIANGULO ACUTANGULO");
    }

    private static Stream<Arguments> testeTrianguloAcutangulo_argumentValues() {
        return Stream.of(
                Arguments.of(),
                Arguments.of(),
                Arguments.of()
        );
    }

}
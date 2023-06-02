package org.miki.tests;

import org.junit.jupiter.api.*;

// @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
// @TestMethodOrder(MethodOrderer.MethodName.class)
// @TestMethodOrder(MethodOrderer.Random.class)
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class OrdemDosTestes {

//    @Order(4)
    @DisplayName("A")
    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true);
    }

    @DisplayName("B")
//    @Order(3)
    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true);
    }

    @DisplayName("C")
//    @Order(2)
    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true);
    }

//    @Order(1)
    @DisplayName("D")
    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true);
    }

}

package org.miki.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTeste {

    @Test
    void validarAlgoSomenteNoUsuarioGabriel() {
        Assumptions.assumeTrue("gabriel".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "gabriel")
    void validarAlgoSomenteNoUsuarioGabriel2() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void validarAlgoSomenteNoOSLinux() {
        Assertions.assertEquals(10, 5 + 5);
    }
}

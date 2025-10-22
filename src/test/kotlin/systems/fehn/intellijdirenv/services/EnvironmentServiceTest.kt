package systems.fehn.intellijdirenv.services

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertDoesNotThrow
import org.junit.jupiter.api.Test

class EnvironmentServiceTest {
    @Test
    fun `set and unset environment variable does not throw`() {
        val svc = EnvironmentService()
        val key = "INTELLIJ_DIRENV_TEST_VAR_${System.nanoTime()}"
        assertDoesNotThrow { svc.setVariable(key, "123") }
        assertDoesNotThrow { svc.unsetVariable(key) }
    }
}

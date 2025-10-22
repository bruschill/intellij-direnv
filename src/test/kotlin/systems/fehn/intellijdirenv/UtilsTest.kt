package systems.fehn.intellijdirenv

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class UtilsTest {
    @Test
    fun `switchNull invokes onNull for null receiver`() {
        var nullCalled = false
        val result = (null as String?).switchNull(onNull = { nullCalled = true })
        assertEquals(null, result)
        assertEquals(true, nullCalled)
    }

    @Test
    fun `switchNull invokes onNonNull for non-null receiver`() {
        var captured: String? = null
        val result = "value".switchNull(onNonNull = { captured = it })
        assertEquals("value", result)
        assertEquals("value", captured)
    }
}

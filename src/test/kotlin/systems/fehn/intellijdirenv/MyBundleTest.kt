package systems.fehn.intellijdirenv

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test

class MyBundleTest {
    @Test
    fun `message returns string from bundle`() {
        val msg = MyBundle.message("allow")
        assertEquals("Allow now", msg)
    }

    @Test
    fun `messagePointer returns lazy pointer`() {
        val pointer = MyBundle.messagePointer("openEnvrc")
        assertNotNull(pointer)
        // We don't evaluate the pointer here to avoid touching IntelliJ internals.
    }
}

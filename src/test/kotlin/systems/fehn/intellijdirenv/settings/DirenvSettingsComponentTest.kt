package systems.fehn.intellijdirenv.settings

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DirenvSettingsComponentTest {
    @Test
    fun `component getters and setters roundtrip`() {
        val comp = DirenvSettingsComponent()
        assertNotNull(comp.panel)
        assertNotNull(comp.preferredFocusedComponent)

        comp.setDirenvPath("/tmp/direnv")
        assertEquals("/tmp/direnv", comp.direnvPath)

        comp.setDirenvImportOnStartup(true)
        assertTrue(comp.direnvImportOnStartup)

        comp.setDirenvImportEveryExecution(true)
        assertTrue(comp.direnvImportEveryExecution)
    }
}

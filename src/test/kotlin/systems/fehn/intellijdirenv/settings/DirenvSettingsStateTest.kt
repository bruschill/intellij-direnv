package systems.fehn.intellijdirenv.settings

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DirenvSettingsStateTest {
    @Test
    fun `loadState copies all fields`() {
        val src = DirenvSettingsState().apply {
            direnvSettingsPath = "/usr/local/bin/direnv"
            direnvSettingsImportOnStartup = true
            direnvSettingsImportEveryExecution = true
        }
        val dst = DirenvSettingsState()
        dst.loadState(src)
        assertEquals(src.direnvSettingsPath, dst.direnvSettingsPath)
        assertEquals(src.direnvSettingsImportOnStartup, dst.direnvSettingsImportOnStartup)
        assertEquals(src.direnvSettingsImportEveryExecution, dst.direnvSettingsImportEveryExecution)
    }
}

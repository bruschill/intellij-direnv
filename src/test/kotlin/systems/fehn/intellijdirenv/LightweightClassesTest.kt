package systems.fehn.intellijdirenv

import com.intellij.openapi.components.Service
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import systems.fehn.intellijdirenv.services.DirenvProjectService

class LightweightClassesTest {
    @Test
    fun `DirenvImportAction can be instantiated and has template text`() {
        val action = DirenvImportAction()
        val text = action.templatePresentation.text
        assertNotNull(text)
        assertEquals(MyBundle.message("importDirenvAction"), text)
    }

    @Test
    fun `StartupActivity type contracts`() {
        val activity = MyStartupActivity()
        assertTrue(activity is com.intellij.openapi.project.DumbAware)
        assertTrue(activity is com.intellij.openapi.startup.ProjectActivity)
    }

    @Test
    fun `DirenvExecutionListener can be instantiated`() {
        val listener = DirenvExecutionListener()
        assertNotNull(listener)
    }

    @Test
    fun `DirenvProjectService is annotated as Service`() {
        val ann = DirenvProjectService::class.java.getAnnotation(Service::class.java)
        assertNotNull(ann)
    }
}

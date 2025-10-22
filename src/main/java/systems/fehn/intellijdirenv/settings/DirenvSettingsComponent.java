package systems.fehn.intellijdirenv.settings;

import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import com.intellij.ui.components.JBCheckBox;
import com.intellij.util.ui.FormBuilder;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class DirenvSettingsComponent {
    private final JPanel mainPanel;
    private final TextFieldWithBrowseButton direnvPath = new TextFieldWithBrowseButton();
    private final JBCheckBox direnvImportOnStartup = new JBCheckBox("Automatically import any .envrc in the project root when the project is opened.");
    private final JBCheckBox direnvImportEveryExecution = new JBCheckBox("Automatically import any .envrc in the project root before every run/debug");
    private final JBCheckBox direnvVerboseOutput = new JBCheckBox("Show detailed output of direnv operations in Event Log");


    public DirenvSettingsComponent() {
        direnvPath.addBrowseFolderListener( "Direnv Path", "Path to the direnv file", null,
                FileChooserDescriptorFactory.createSingleFileDescriptor());
        mainPanel = FormBuilder
                .createFormBuilder()
                .addLabeledComponent(new JLabel("DirenvPath: "), direnvPath, 1, false)
                .addComponent(direnvImportOnStartup, 1)
                .addComponent(direnvImportEveryExecution, 1)
                .addComponent(direnvVerboseOutput, 1)
                .addComponentFillVertically(new JPanel(), 0)
                .getPanel();
    }

    public JPanel getPanel() {
        return mainPanel;
    }

    public JComponent getPreferredFocusedComponent() {
        return direnvPath;
    }

    @NotNull
    public String getDirenvPath() {
        return direnvPath.getText();
    }

    public void setDirenvPath(@NotNull String path) {
        direnvPath.setText(path);
    }

    public boolean getDirenvImportOnStartup() {
        return direnvImportOnStartup.isSelected();
    }

    public void setDirenvImportOnStartup(boolean newStatus) {
        direnvImportOnStartup.setSelected(newStatus);
    }

    public boolean getDirenvImportEveryExecution() {
        return direnvImportEveryExecution.isSelected();
    }

    public void setDirenvImportEveryExecution(boolean newStatus) {
        direnvImportEveryExecution.setSelected(newStatus);
    }

    public boolean getDirenvVerboseOutput() {
        return direnvVerboseOutput.isSelected();
    }

    public void setDirenvVerboseOutput(boolean newStatus) {
        direnvVerboseOutput.setSelected(newStatus);
    }
}

package seedu.duke.command.cap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seedu.duke.command.CommandResult;
import seedu.duke.command.add.AddCommand;
import seedu.duke.command.add.AddModuleCommand;
import seedu.duke.command.grade.GradeCommand;
import seedu.duke.data.ModuleManager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static seedu.duke.util.Message.MESSAGE_CAP_DISPLAY;

public class CapCommandTest {
    static final String MODULE_CODE = "CS1231";
    static final double CAP = 4.37;

    @BeforeEach
    void setupModManager() {
        ModuleManager.clearModules();
        AddCommand addModule = new AddModuleCommand(MODULE_CODE);
        addModule.execute();
        GradeCommand gradeCommand = new GradeCommand(MODULE_CODE, 4, "A+");
        gradeCommand.execute();
    }

    @Test
    void capCommand_MessageCapDisplayWithCap_isShown() {
        CapCommand capCommand = new CapCommand(20, 4.24);
        CommandResult commandResult = capCommand.execute();
        assertEquals(String.format("%s%.2f\n", MESSAGE_CAP_DISPLAY, CAP), commandResult.feedbackToUser);
    }
}

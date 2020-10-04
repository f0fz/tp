package seedu.duke.command.edit;

import seedu.duke.command.Command;
import seedu.duke.command.CommandResult;
import seedu.duke.data.Module;
import seedu.duke.data.ModuleManager;
import seedu.duke.directory.Directory;
import seedu.duke.exception.ModuleNotProvidedException;

import java.util.regex.Pattern;

import static seedu.duke.common.Constant.MODULE_PREFIX;
import static seedu.duke.util.ExceptionMessage.MESSAGE_DUPLICATE_MODULE;
import static seedu.duke.util.ExceptionMessage.MESSAGE_INCORRECT_DIRECTORY_LEVEL;
import static seedu.duke.util.ExceptionMessage.MESSAGE_MODULE_NOT_FOUND;
import static seedu.duke.util.ExceptionMessage.MESSAGE_MODULE_NOT_PROVIDED;
import static seedu.duke.util.Message.MESSAGE_EDIT_MODULE_SUCCESS;

public class EditModuleCommand extends EditCommand {
    public static final String COMMAND_WORD = "edm";
    public static final String FORMAT = COMMAND_WORD + " <module code> -m <new module code>";
    public static final Pattern REGEX_FORMAT = Pattern.compile(
            "(?<identifier>(?:\\s+\\w\\S*)*)"
                    + "(?<moduleCode>(?:\\s+" + MODULE_PREFIX + "(?:\\s+\\w\\S*)+)?)"
                    + "(?<invalid>.*)"
    );
    private String oldModuleCode;
    private String newModuleCode;

    /**
     * Constructs the command to edit a module.
     *
     * @param oldModuleCode
     *  The module code of the module to be edited
     * @param newModuleCode
     *  The new module code for the module if any
     */
    public EditModuleCommand(String oldModuleCode, String newModuleCode) {
        this.oldModuleCode = oldModuleCode;
        this.newModuleCode = newModuleCode.toUpperCase();
    }

    /**
     * Edits the module.
     *
     * @param toEdit
     *  The module to edit
     * @throws ModuleManager.DuplicateModuleException
     *  If the new module code is duplicated
     * @throws ModuleNotProvidedException
     *  If the new module code is not a recognised NUS module
     */

    @Override
    protected void edit(Directory toEdit) throws ModuleManager.DuplicateModuleException, ModuleNotProvidedException {
        ModuleManager.edit((Module) toEdit, newModuleCode);
    }

    /**
     * Executes the <b>Edit Module Command</b> to edit a <b>Module</b> with the <code>module code</code>
     * from the <b>Module List</b>.
     *
     * @return The <b>Command Result</b> of the execution
     * @see Module
     * @see ModuleManager
     * @see CommandResult
     */
    @Override
    public CommandResult execute() {
        try {
            Module toEdit = ModuleManager.getModule(oldModuleCode);
            edit(toEdit);
            return new CommandResult(MESSAGE_EDIT_MODULE_SUCCESS);
        }  catch (ModuleNotProvidedException e) {
            return new CommandResult(MESSAGE_MODULE_NOT_PROVIDED);
        } catch (ModuleManager.ModuleNotFoundException e) {
            return new CommandResult(MESSAGE_MODULE_NOT_FOUND);
        } catch (ModuleManager.DuplicateModuleException e) {
            return new CommandResult(MESSAGE_DUPLICATE_MODULE);
        }
    }
}

package seedu.duke.util;

public class Message {
    public static final String MESSAGE_ADD_TASK_SUCCESS = "Your task has been added successfully.\n";
    public static final String MESSAGE_ADD_MODULE_SUCCESS = "Your module has been added successfully.\n";
    public static final String MESSAGE_ADD_LESSON_SUCCESS = "Your lesson has been added successfully.\n";

    public static final String MESSAGE_DELETE_TASK_SUCCESS = "Your task has been deleted successfully.\n";
    public static final String MESSAGE_DELETE_MODULE_SUCCESS = "Your module has been deleted successfully.\n";
    public static final String MESSAGE_DELETE_LESSON_SUCCESS = "Your lesson has been deleted successfully.\n";

    public static final String MESSAGE_EDIT_TASK_SUCCESS = "Your task has been edited successfully.\n";
    public static final String MESSAGE_EDIT_MODULE_SUCCESS = "Your module has been edited successfully.\n";

    public static final String MESSAGE_EMPTY_INPUT = "Please enter a command for me.\n";
    public static final String MESSAGE_INVALID_COMMAND_FORMAT =
            "Sorry, the command entered contains some unrecognised parameters starting from here:\n";
    public static final String MESSAGE_CHECK_COMMAND_FORMAT =
            "Please check to make sure to follow the command format:\n";
    public static final String MESSAGE_GOODBYE = "Goodbye, hope to see you soon!";
    public static final String MESSAGE_WELCOME = "Repository Assistant with a Versatile Interface (ra.VI)";
    public static final String MESSAGE_DONE_TASK_SUCCESS = "The task has been successfully marked as complete.\n";
    public static final String ICON_DONE = "\u221A";
    public static final String ICON_NOT_DONE = "\u0078";
    public static final String MESSAGE_LIST_PRINTED = "Here's your list:\n";
    public static final String MESSAGE_UNDO_SUCCESS = "Undo successful.";
    public static final String MESSAGE_UNDO_AT_BEGINNING = "There is nothing to undo.";
    public static final String MESSAGE_GRADE_MODULE_SUCCESS = "Module graded successfully.\n";
    public static final String MESSAGE_CAP_DISPLAY = "Your current CAP is \n";
    public static final String MESSAGE_COMPLETED_TASKLIST = "\n▻ Completed tasks:";
    public static final String MESSAGE_INCOMPLETE_UNDATED_TASKLIST = "\n▻ Incomplete undated tasks:";
    public static final String MESSAGE_INCOMPLETE_DATED_TASKLIST = "\n▻ Incomplete dated tasks:";
    public static final String MESSAGE_SUMMARY_PRINTED = "Your latest task summary \n";
    public static final String MESSAGE_GENERAL_HELP =
            "Hello! I'm ra.VI, your personal NUS assistant.\n"
            + "I'm here to help you manage your tasks, modules, and lessons.\n"
            + "This help message appears when you type 'help', or an unrecognised command.\n"
            + "To find out more about any of my commands, type 'help <command>'.\n"
            + "Here's a list of my commands to help you out:\n\n"
            + "  Action commands:\n"
            + "\t▻ add       → Add a task or module\n"
            + "\t▻ del       → Delete a task or module\n"
            + "\t▻ edit      → Edit a task or module\n"
            + "\t▻ done      → Mark a task as complete\n"
            + "\t▻ grade     → Grades and allocates MCs to a Module\n"
            + "\t▻ undo      → Undo the previous action (if you made changes)\n"
            + "\t▻ timetable → Manage your timetable\n"
            + "  Viewing commands:\n"
            + "\t▻ list      → Lists all tasks or modules\n"
            + "\t▻ summary   → See a neat summary of your tasks\n"
            + "\t▻ timetable → View your timetable, by day or by week\n"
            + "  Utility commands:\n"
            + "\t▻ help      → Get detailed help for each command\n"
            + "\t▻ bye       → Exit ra.VI (saves all changes!)";
    public static final String MESSAGE_TIMETABLE_INIT =
            "Please enter the current week num e.g. 1 - 14"
                    + " where 7 is recess week.\n" + "In here, NUS week 7 onwards is week 8 onwards.";
    public static final String MESSAGE_TIMETABLE_HEADER =
            " ┌───────────┬────┬────────────────────┐\n"
            + " │   Time    │ ID │       Lesson       │\n"
            + " ├───────────┼────┼────────────────────┤\n";
    public static final String MESSAGE_TIMETABLE_MIDDLE = "\n ├───────────┼────┼────────────────────┤\n";
    public static final String MESSAGE_TIMETABLE_FOOTER = "\n └───────────┴────┴────────────────────┘\n";
    public static final String MESSAGE_NO_LESSONS = "\nNo lessons on ";
}

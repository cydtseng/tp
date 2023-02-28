package seedu.address.logic.parser.patientparser;

import static seedu.address.commons.core.Messages.MESSAGE_UNKNOWN_COMMAND;

import seedu.address.logic.commands.Command;
import seedu.address.logic.commands.patientcommands.AddCommand;
import seedu.address.logic.commands.patientcommands.DeleteCommand;
import seedu.address.logic.commands.patientcommands.FindCommand;
import seedu.address.logic.commands.patientcommands.ListCommand;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * Parses user input
 */
public class PatientParser {

    public static final String OPERATION_TYPE = "p";

    /**
     * Parses user input into command for execution.
     * @param commandWord user command
     * @param arguments arguments specific to the command
     * @return the command based on the command word
     * @throws ParseException if the user input does not conform the expected format
     */
    public Command parse(String commandWord, String arguments) throws ParseException {
        switch (commandWord) {
        case AddCommand.COMMAND_WORD:
            return new AddCommandParser().parse(arguments);
        case DeleteCommand.COMMAND_WORD:
            return new DeleteCommandParser().parse(arguments);
        case FindCommand.COMMAND_WORD:
            return new FindCommandParser().parse(arguments);
        case ListCommand.COMMAND_WORD:
            return new ListCommand();
        default:
            throw new ParseException(MESSAGE_UNKNOWN_COMMAND);
        }
    }
}

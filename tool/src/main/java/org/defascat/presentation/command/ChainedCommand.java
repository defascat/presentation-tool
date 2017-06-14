package org.defascat.presentation.command;

/**
 *
 * @author apanasyuk
 */
public class ChainedCommand implements Command {
    private final Command[] commands;

    public ChainedCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}

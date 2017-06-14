package org.defascat.presentation.command;

/**
 *
 * @author apanasyuk
 */
public class ClearScreenCommand implements Command{
    @Override
    public void execute() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

package org.defascat.presentation.command;

/**
 *
 * @author apanasyuk
 */
public class PrintTextCommand implements Command {
    private String data;

    public PrintTextCommand(String data) {
        this.data = data;
    }
    
    @Override
    public void execute() {
        System.out.println(data);
    }
}

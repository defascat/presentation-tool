package org.defascat.presentation.command;

import java.io.Console;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apanasyuk
 */
public class WaitNavigateInput implements Command {
    @Override
    public void execute() {
        try {
            int ch = System.in.read();
        } catch (IOException ex) {
            Logger.getLogger(WaitNavigateInput.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

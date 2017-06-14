package org.defascat.presentation;

import static org.defascat.presentation.Constants.AUTHOR;
import static org.defascat.presentation.Constants.PRESENTATION_TITLE;
import static org.defascat.presentation.Constants.TWITTER;
import org.defascat.presentation.command.ChainedCommand;
import org.defascat.presentation.command.ClearScreenCommand;
import org.defascat.presentation.command.Command;
import org.defascat.presentation.command.ExecCommand;
import org.defascat.presentation.command.PrintTextCommand;
import org.defascat.presentation.command.ReadSourceFileCommand;
import org.defascat.presentation.command.WaitNavigateInput;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final String PROJECT = "../demo";
    public static void main( String[] args )
    {
        new ChainedCommand(new Command[] {
            new ClearScreenCommand(),
            new PrintTextCommand(PRESENTATION_TITLE),
            new PrintTextCommand(AUTHOR),
            new PrintTextCommand(TWITTER),
            new WaitNavigateInput()
        }).execute();
        
        new ChainedCommand(new Command[]{
            new ClearScreenCommand(),
            new ReadSourceFileCommand(PROJECT, "org.defascat.presentation.App"),
            new WaitNavigateInput(),
            new ExecCommand(PROJECT, "org.defascat.presentation.App"),
            new WaitNavigateInput()
        }).execute();
    }
    
}

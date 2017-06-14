package org.defascat.presentation.command;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.PumpStreamHandler;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author apanasyuk
 */
public class ExecCommand implements Command {
    private final String folder;
    private final String mainClass;
    public ExecCommand(String folder, String file) {
        this.folder = folder + "/target/classes";
        this.mainClass = file;
    }
    
    @Override
    public void execute() {
        try {
            String line = "java -cp " + folder + " " + mainClass;
            CommandLine cmdLine = CommandLine.parse(line);
            DefaultExecutor executor = new DefaultExecutor();
            try (OutputStream out = new ByteArrayOutputStream()) {
                executor.setStreamHandler(new PumpStreamHandler(out));
                executor.execute(cmdLine);
                System.out.println("----------- Execution ---------");
                System.out.println(out.toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(ExecCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

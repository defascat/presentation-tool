package org.defascat.presentation.command;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author apanasyuk
 */
public class ReadSourceFileCommand implements Command {
    private final String file;

    public ReadSourceFileCommand(String folder, String file) {
        this.file = folder + "/src/main/java/" + file.replaceAll("\\.", "/") + ".java";
    }
    
    @Override
    public void execute() {
        try {
            String content = FileUtils.readFileToString(new File(file), "UTF-8");
            System.out.println(content);
        } catch (IOException ex) {
            Logger.getLogger(ReadSourceFileCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

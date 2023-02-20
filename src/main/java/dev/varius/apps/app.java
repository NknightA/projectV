package dev.varius.apps;

import java.io.IOException;
import java.nio.channels.ScatteringByteChannel;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class app {
    public static void main () {
        String pj_path = "../../../../../../apps";
        String p_index = FileSystems.getDefault().getSeparator();
        try {
            Path app_path = Paths.get(pj_path + p_index + "Test.md");
            Files.createFile(app_path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

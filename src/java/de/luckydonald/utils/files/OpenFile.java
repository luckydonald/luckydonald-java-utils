package de.luckydonald.utils.files;

import de.luckydonald.utils.logger.ObjectWithLogger;

import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Opens a file for viewing or editing.
 * Created by luckydonald on 05.04.19.
 */
public class OpenFile extends ObjectWithLogger {
    private static boolean openFile(String fileName) {
        // https://stackoverflow.com/a/550336/3423324#how-to-open-a-file-with-the-default-associated-program
        // https://stackoverflow.com/a/526072/3423324#how-to-edit-a-file-with-system-preferred-editor
        File file = new File(fileName);
        if (!Desktop.isDesktopSupported()) {
            return false;
        }

        Desktop desktop = Desktop.getDesktop();
        if (!desktop.isSupported(Desktop.Action.OPEN)) {
            return false;
        }

        try {
            desktop.open(file);
        } catch (IOException e) {
            // Log an error
            return false;
        }

        return true;
    }
    public static boolean editFile(String fileName) {
        // https://stackoverflow.com/a/526072/3423324#how-to-edit-a-file-with-system-preferred-editor
        // https://stackoverflow.com/a/550336/3423324#how-to-open-a-file-with-the-default-associated-program
        File file = new File(fileName);
        if (!Desktop.isDesktopSupported()) {
            return false;
        }

        Desktop desktop = Desktop.getDesktop();
        if (!desktop.isSupported(Desktop.Action.EDIT)) {
            return false;
        }

        try {
            desktop.edit(file);
        } catch (IOException e) {
            // Log an error
            return false;
        }

        return true;
    }
}
package Duke;

import Duke.GUI.Ui;
import Duke.Tasks.TaskList;

/**
 * The Duke class is the main class that serves as the entry point to the Duke application.
 */
public class Duke {
    /**
     * The main method that starts the Duke application.
     */

    private TaskList tasks;

    public Duke() {
        tasks = new TaskList();
    }

    /**
     * Gets a response from Duke based on user input.
     *
     * @param str The user input.
     * @return A response generated by Duke.
     */
    public String getResponse(String str) {
        return Parser.input(str, tasks, new Ui());
    }

}

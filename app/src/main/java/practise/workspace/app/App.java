/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package practise.workspace.app;

import practise.workspace.list.LinkedList;

import static practise.workspace.utilities.StringUtils.join;
import static practise.workspace.utilities.StringUtils.split;
import static practise.workspace.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}

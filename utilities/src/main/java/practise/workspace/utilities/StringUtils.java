/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package practise.workspace.utilities;

import practise.workspace.list.LinkedList;

public class StringUtils {
    public static String join(LinkedList source) {
        return JoinUtils.join(source);
    }

    public static LinkedList split(String source) {
        return SplitUtils.split(source);
    }
}

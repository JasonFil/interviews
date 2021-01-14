package others.StringPairs;

import java.util.HashSet;

/**
 * <p>{@link TreeNode} is a container for the data required by our implicit tree's nodes.</p>
 *  @author <a href = "mailto:jason.filippou@gmail.com">Jason Filippou</a>
 * @see ListNode
 */
public class TreeNode {
    boolean isRoot; // Is this node the root of a sub-forest?
    HashSet<String> children;

    TreeNode() {
        this.isRoot = true;
        children = new HashSet<>();
    }
}

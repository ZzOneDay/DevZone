import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class CodeTreeNode implements Comparable<CodeTreeNode> {
    private Character character;
    private int weight;

    private CodeTreeNode left;
    private CodeTreeNode right;

    public CodeTreeNode(Character character, int weight) {
        this.character = character;
        this.weight = weight;
    }

    public CodeTreeNode(Character character, int weight, CodeTreeNode left, CodeTreeNode right) {
        this.character = character;
        this.weight = weight;
        this.left = left;
        this.right = right;
    }

    public static CodeTreeNode huffman (ArrayList<CodeTreeNode> codeTreeNodes) {
        while (codeTreeNodes.size() > 1) {
            Collections.sort(codeTreeNodes);

            CodeTreeNode left = codeTreeNodes.remove(codeTreeNodes.size() - 1);
            CodeTreeNode right = codeTreeNodes.remove(codeTreeNodes.size() -1);
            int wight = left.getWeight() + right.getWeight();

            CodeTreeNode parent = new CodeTreeNode(null,wight,left,right);
            codeTreeNodes.add(parent);
        }
        return codeTreeNodes.get(0);
    }

    public String getCodeOfCharacter (Character character,  String parentPath) {
        if (character == this.character) {
            return parentPath;
        } else {
            if (left != null) {
                String path = left.getCodeOfCharacter(character, parentPath + 0);
                if (path != null) {
                    return path;
                }
            }

            if (right != null) {
                String path = right.getCodeOfCharacter(character, parentPath + 1);
                if (path != null) {
                    return path;
                }
            }
        }
        return null;
    }

    public Character getCharacter() {
        return character;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(CodeTreeNode o) {
        return o.weight - weight;
    }

    @Override
    public String toString() {
        return "Character: " + character + " weight: " + weight;

    }
}

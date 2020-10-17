import java.util.ArrayList;
import java.util.Collections;

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

    public static CodeTreeNode huffman(ArrayList<CodeTreeNode> codeTreeNodes) {
        while (codeTreeNodes.size() > 1) {
            Collections.sort(codeTreeNodes);

            CodeTreeNode left = codeTreeNodes.remove(codeTreeNodes.size() - 1);
            CodeTreeNode right = codeTreeNodes.remove(codeTreeNodes.size() - 1);

            if (left.getWeight() == right.getWeight() && left.getCharacter() != null
                    && right.getCharacter() != null && left.getWeight() % 2 == 0) {
                if (left.getCharacter() < right.getCharacter()) {
                    CodeTreeNode temp = left;
                    left = right;
                    right = temp;
                }
            }

            if (left.getWeight() == right.getWeight() && left.getCharacter() != null
                    && right.getCharacter() != null && left.getWeight() % 2 != 0) {
                if (left.getCharacter() > right.getCharacter()) {
                    CodeTreeNode temp = left;
                    left = right;
                    right = temp;
                }
            }

            int wight = left.getWeight() + right.getWeight();

            CodeTreeNode parent = new CodeTreeNode(null, wight, left, right);
            codeTreeNodes.add(parent);
        }
        return codeTreeNodes.get(0);
    }

    public static String getDecodingString(CodeTreeNode treeNodes, String encoding) {
        StringBuilder stringBuilder = new StringBuilder();

        CodeTreeNode codeTreeNode = treeNodes;
        for (int i = 0; i < encoding.length(); i++) {
            if (encoding.charAt(i) == '0') {
                codeTreeNode = codeTreeNode.left;
            } else {
                codeTreeNode = codeTreeNode.right;
            }

            if (codeTreeNode.getCharacter() != null) {
                stringBuilder.append(codeTreeNode.getCharacter());
                codeTreeNode = treeNodes;
            }
        }
        return stringBuilder.toString();
    }

    public String getCodeOfCharacter(Character character, String parentPath) {
        if (character == this.character) {
            return parentPath;
        } else {
            if (left != null) {
                String path = left.getCodeOfCharacter(character, parentPath + '0');
                if (path != null) {
                    return path;
                }
            }

            if (right != null) {
                String path = right.getCodeOfCharacter(character, parentPath + '1');
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

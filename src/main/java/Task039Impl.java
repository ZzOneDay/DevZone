import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Task039Impl implements Task039 {
    @Override
    public Map<Character, String> getEncoding(Map<Character, Integer> charFrequencies) {
        ArrayList<CodeTreeNode> codeTreeNodes = new ArrayList<>();
        for (Character c : charFrequencies.keySet()) {
            codeTreeNodes.add(new CodeTreeNode(c,charFrequencies.get(c)));
        }
        CodeTreeNode treeNodes = CodeTreeNode.huffman(codeTreeNodes);

        TreeMap<Character, String> map = new TreeMap<>();
        for (Character c : charFrequencies.keySet()) {
            map.put(c,treeNodes.getCodeOfCharacter(c, ""));
        }

        return map;
    }

    @Override
    public String getEncodedString(Map<Character, Integer> charFrequencies, String string) {
        return null;
    }

    @Override
    public String getDecodedString(Map<Character, Integer> charFrequencies, String encodedString) {
        return null;
    }
}

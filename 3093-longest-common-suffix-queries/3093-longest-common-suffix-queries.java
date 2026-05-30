class Solution {

    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        int index = -1; 
        int length = Integer.MAX_VALUE;
    }

    TrieNode root = new TrieNode();

    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {

        for (int i = 0; i < wordsContainer.length; i++) {
            insert(wordsContainer[i], i);
        }

        int[] ans = new int[wordsQuery.length];

        for (int i = 0; i < wordsQuery.length; i++) {
            ans[i] = search(wordsQuery[i]);
        }

        return ans;
    }

    private void insert(String word, int idx) {

        TrieNode node = root;

        if (word.length() < node.length) {
            node.length = word.length();
            node.index = idx;
        }

        for (int i = word.length() - 1; i >= 0; i--) {

            int ch = word.charAt(i) - 'a';

            if (node.children[ch] == null) {
                node.children[ch] = new TrieNode();
            }

            node = node.children[ch];

            if (word.length() < node.length) {
                node.length = word.length();
                node.index = idx;
            }
        }
    }

    private int search(String query) {

        TrieNode node = root;

        for (int i = query.length() - 1; i >= 0; i--) {

            int ch = query.charAt(i) - 'a';

            if (node.children[ch] == null) {
                break;
            }

            node = node.children[ch];
        }

        return node.index;
    }
}
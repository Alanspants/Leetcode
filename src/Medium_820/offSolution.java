package Medium_820;

import java.lang.reflect.Array;
import java.util.*;

public class offSolution {
    public static void main(String[] args) {
        System.out.println(minimumLengthEncoding(new String[] {"time", "me", "bell"}));
    }
     public static int minimumLengthEncoding(String[] words){
        TrieNode initNode = new TrieNode();
         Map<TrieNode, Integer> nodes = new HashMap<>();
         for(int i = 0; i < words.length; i++){
             String temp = words[i];
             TrieNode curr = initNode;
             for(int j = temp.length() - 1; j >= 0; j--){
                 curr = curr.insert(curr, temp.charAt(j));
             }
             nodes.put(curr, i);
         }

         int ans = 0;
         for(TrieNode node : nodes.keySet()){
             if(node.nCount == 0){
                 ans += words[nodes.get(node)].length() + 1;
             }
         }
         return ans;
     }
}

class TrieNode {
    int nCount;
    TrieNode[] children;

    public TrieNode(){
        nCount = 0;
        children = new TrieNode[26];
    }

    public TrieNode insert(TrieNode node, char c){
        if(node.children[c - 'a'] == null){
            node.children[c - 'a'] = new TrieNode();
            nCount ++;
        }
        return node.children[c - 'a'];
    }
}

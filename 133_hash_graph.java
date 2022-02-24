/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    static HashMap<Node,Node> cloneMap = new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        Node newNode = new Node(node.val);
        cloneMap.put(node,newNode);
        dfs(node);
        return newNode;
    }
    
    final private Node dfs(Node node) {
        for (Node n:node.neighbors) {
            if (cloneMap.containsKey(n) == false) {
                // this means n is a new node
                Node nCopy = new Node(n.val);
                cloneMap.put(n,nCopy);
                cloneMap.get(node).neighbors.add(nCopy);
                dfs(n);
            }
            else {cloneMap.get(node).neighbors.add(cloneMap.get(n));}
        }
        return node;
    }
}

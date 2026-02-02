class Trie {
    Node root;
    class Node
    {
        Node[] ch;
        boolean flag;
        Node()
        {
            ch = new Node[26];
            flag = false;
        }
    }
    public Trie() {
        root = new Node();
    }
    
    public void insert(String word) {
        Node temp = root;
        // iterating each character and insert into node
        for(int i = 0; i < word.length(); i++)
        {
            int index = word.charAt(i) - 'a';
            if(temp.ch[index] == null)
            {
                // if character is alreay exsit then do not need to create the node if not present then created
                temp.ch[index] = new Node();
            }
            temp = temp.ch[index];
        }
        // after ending the character the end of the character flag
        temp.flag = true; 
    }
    
    public boolean search(String word) {
        Node temp = root;
        for(int i = 0; i < word.length(); i++)
        {

            int index = word.charAt(i) - 'a';
            if(temp.ch[index] == null)
            {
                // if the middle character is not present then return the false
                return false;
            }
            // shifting the node one by one
            temp = temp.ch[index];
        }
        // if all iteration done then the last flag will be checked
        return temp.flag;
    }
    
    public boolean startsWith(String prefix) {
        Node temp = root;
        for(int i = 0; i < prefix.length(); i++)
        {
            int index = prefix.charAt(i) - 'a';
            // the prefix character not end the middle value or character is not present then return the false value
            if(temp.ch[index] == null)
            {
                return false;
            }
            // shifting the last node
            temp = temp.ch[index];
        }
        // if all character is present in tree then return true
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
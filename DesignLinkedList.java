class MyLinkedList {
    Node head;
    class Node
    {
        Node next;
        int val;
        Node(int val)
        {
            this.val = val;
            next = null;
        }
        Node(int val,Node next)
        {
            this.val = val;
            this.next = next;
        }
    }
    int size;
    public MyLinkedList() {
        head = null;
        size = 0;
    }
    
    public int get(int index) 
    {
        if(index < 0 || index >= size)
        {
            return -1;
        }
        Node temp = head;
        for(int i = 0; i < index; i++)
        {
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
       Node temp = new Node(val);
       temp.next = head;
       head = temp;
       size++;
    }
    
    public void addAtTail(int val) {
       Node temp = new Node(val);
       if(head == null)
       {
            head = temp;
       }
       else
       {
            Node iterate = head;
            while(iterate.next != null)
            {
                iterate = iterate.next;
            }
            iterate.next = temp;
       }
       size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size)
        {
            return;
        }
        if(index == 0)
        {
            addAtHead(val);
            return;
        }
        Node temp = head;
        for(int i = 0; i < index - 1; i++)
        {
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size++;
    }
    
    public void deleteAtIndex(int index) {
       if(index < 0 || index >= size)
       {
            return;
       }
       if(index == 0)
       {
            head = head.next;
       }
       else
       {
            Node temp = head;
            for(int i = 0; i < index - 1; i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
       }
       size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

package doublylinkedlistapp;

import java.util.NoSuchElementException;

public class DoublyLinkedList<T> {
    private class Node<T>{
        private Node<T> previous;
        private Node<T> next;
        private T data;
        
        public Node(T data){
            this.data = data;
            this.next = null;
            this.previous = null;
        }
        
        public T getData(){
            return data;
        }
        public Node<T> getPrev(){
            return previous;
        }
        public Node<T> getNext(){
            return next;
        }
        public void setData(T data){
            this.data = data;
        }
        public void setNext(Node<T> next){
            this.next = next;
        }
        public void setPrev(Node<T> prev){
            this.previous = prev;
        }
        
    }
    
    
    private Node<T> head;
    private Node<T> tail;
    private int size;
    private Node<T> current;
    
    public DoublyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
    
    @Override
    //returns the list with each value seperated by commas and inside of [ ]
    public String toString(){
        if(head == null){
            return "List is Empty";
        }
        String nodeString = "[";
        current = head;
        while(current != null){
            nodeString += current.data;
            if(current.next != null){
                nodeString += ", ";
            }
          current = current.next;
        }
        nodeString += " ]";
        return nodeString;
    }
    //Works
    public void addFirst(T value){
        Node<T> temp = new Node(value);
        if(head != null){
            //set head previous to temp because it is now second in the list
            head.previous = temp;
            //set temp.next to head because head is now the second in the list
            temp.next = head;
            //change the head of the list to temp because it is now the first item
            head = temp;
        }else{
            head = temp;
            tail = temp;
        }
        size++;
    }
    //Works
    public void addLast(T value){
        Node<T> temp = new Node(value);
        if(head != null){
            //set previous to the old tail
            temp.previous = tail;
            //set old tail next to temp
            tail.next = temp;
            //set temp to be the new tail
            tail = temp;
        }else{
            head = temp;
            tail = temp;
        }
        size++;
    }
    
    
    public T getFirst(){
        if(head == null){
            throw new NoSuchElementException();
        }
        return head.data;
        
    }
    
    
    public T getLast(){
        if(head == null){
            throw new NoSuchElementException();
        }
        return tail.data;
    }
    
    
    public void removeFirst(){
        if(head == null){
            throw new NoSuchElementException();
        }
        current = head.next; //sets the current node to the next node
        head = current;
        head.previous = null; //deletes the old head node
        size--;
    }
    
    public void removeLast(){
        if(head == null){
            throw new NoSuchElementException();
        }
        current = tail.previous; //sets the current node to the node before the original tail
        tail = current; //the new current node is the new tail
        tail.next = null; //delets the old tail
        size--;
    }
    
    
    public int size(){
        return size;
    }
    
   
    public T get(int index){
        if(index >= size){ //if the index is larger than or equal to the size of the array this index does not exist
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        int count = 0;
        current = head;
        while(count != index){ //starts at the first node and everytime the count number is not equal to the index of the data, count is updated and the next node is checked
            current = current.next;
            count++;
        }
        return current.data;
    }
    
    public int indexOf(T value){
        current = head;
        int index = 0; //starts at the first index of the list
        while(current.data != value){ //while the data in the current node does not equal the value we are looking for check the next node
            current = current.next; 
            index++;
            if(current.next == null){ //if there is no next node
                return -1;
            }
        }
        return index;
    }
    
    //creates a new doubly list iterator object
    public ListIterator<T> listIterator(){
        return new DoublyListIterator();
    }
    
    private class DoublyListIterator implements ListIterator<T>{
        private Node<T> temp  = head;
        private Node<T> lastAccess = null;
        private int index = 0;

        //if index < size returns true, there is a next node, if false there is not
        public boolean hasNext()      { 
            return index < size; 
        }
        
        //if this returns true, there is a previous node
        public boolean hasPrevious()  { 
            return index > 0; 
        }
        
        public int previousIndex()    { 
            return index - 1; 
        }
        public int nextIndex()        { 
            return index + 1;     
        }

        //if hasnext returned false, throws an exception, otherwise this updates the index position and returns the next node
        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            lastAccess = temp;
            T value = temp.data;
            temp = temp.next; 
            index++;
            return temp.data;
        }
        
        //if hasprevious is false, throws exception. if true, sets temp = the previous node and returns the value stored in that location
        public T previous() {
            if (!hasPrevious()) throw new NoSuchElementException();
            temp = temp.previous;
            index--;
            lastAccess = temp;
            return temp.data;
        }
        
        //if the list is empty, an exception is thrown. 
         public void remove() { 
            if (lastAccess == null) throw new IllegalStateException();
            Node<T> temp1 = lastAccess.previous; //the node before the current node is temp1
            Node<T> temp2 = lastAccess.next; //the node after the current node is temp2
            temp1.next = temp2; //temp 1 now points forward to temp 2
            temp2.previous = temp1; //temp 2 now points in reverse to temp 1
            size--; //node is removed so the size of the list is reduced
            if (temp == lastAccess)
                temp = temp2;
            else
                index--;
            lastAccess = null;
        }
         //e is set as the last node that was accessed
        public void set(T e) {
            if (lastAccess == null) throw new IllegalStateException();
            lastAccess.data = e;
        }
        public void add(T e) {
            Node<T> temp1 = temp.previous;
            Node<T> temp2 = new Node(e);
            Node<T> temp3 = temp;
            temp1.next = temp2;
            temp2.next = temp3;
            temp3.previous = temp2;
            temp2.previous = temp1;
            size++; //size is updated 
            index++; 
            lastAccess = null;
        }
        }
        
    }
    
    
    
    
    
   

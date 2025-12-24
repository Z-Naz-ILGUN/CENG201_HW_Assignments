public class DischargeStack {
    private DischargeStackNode top;
// PUSH RECORD TO STACK (LIFO)
    public void push(DischargeRecord record){
        DischargeStackNode newNode = new DischargeStackNode(record);
        newNode.next = top; // LINK NEW NODE
        top = newNode; //UPDATE TOP
    }
    //POP RECORD FROM STACK
    public DischargeRecord pop(){
        if( top == null)
            return null;

        DischargeRecord temp = top.data;
        top = top.next; //REMOVE TOP NODE
        return temp;
    }
    // VIEW TOP RECORD WITHOUT REMOVING WITH USING PEEK METHOD
    public DischargeRecord peek(){
        if(top == null) return null;
        return top.data;
    }

// PRINT STACK CONTENT
    public void printStack(){
        DischargeStackNode current = top;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}

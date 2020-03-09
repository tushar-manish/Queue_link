public class Queue_Implement {
    Node front;
    Node rear;

    Queue_Implement(){
        front = null;
        rear = null;
    }

    public void enqueue(int data){
        Node ns = new Node(data);
        if(isempty()){
            front = ns;
            rear = ns;
        }
        else{
            rear.next = ns;
            rear = ns;
        }
    }

    public void dequeue(){
        if(isempty()){
            System.out.println("Queue is empty");
        }
        else{
            front = front.next;
        }
    }

    private boolean isempty() {
        return front == null;
    }

}

package javaapplication292;
public class Queue {
int size;
int[] queue;
int front,rear;
public Queue(int size){
    this.size=size;
    queue=new int[size];
    front=0;
    rear=-1;
}
public void enqueue(int item){
    if(isFull()){
        System.out.println("queue is full,cannot enqueue "+item);
        return;
    }
    queue[++rear]=item;
    System.out.println(item+" enqueued.");
}
public int dequeue(){
    if(isEmpty())
    { System.out.println("queue is empty,cannot dequeue");
    return -1;
    }
    int removed=queue[front++];
    System.out.println(removed+" dequeued");
    return removed;
}
public int peek(){
    if(isEmpty()){
        System.out.println("queue is empty and nothing to peek");
        return -1;
    }
    return queue[front];
}
public boolean isEmpty(){
    return front>rear;
}
public boolean isFull(){
    return rear==size-1;
}
public void display(){
    if(isEmpty()){
        System.out.println("queue is empty");
        return;
    }
    System.out.print("queue: ");
    for(int i=front;i<=rear;i++){
        System.out.print(queue[i]+" ");
    }
    System.out.println();
}
public static void main(String[] args){
    Queue qu=new Queue(5);
    qu.enqueue(10);
    qu.enqueue(20);
    qu.enqueue(30);
    qu.display();
    System.out.println("front element is: "+qu.peek());
    qu.dequeue();
    qu.display();
    qu.enqueue(40);
    qu.enqueue(50);
    qu.enqueue(60);
    qu.display();
}
}    

    

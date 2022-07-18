package Implement_Stack_using_Queues_225;

import java.util.*;

class MyStack {

  private Queue<Integer> queue;

  public MyStack() {
    queue = new LinkedList<>();
  }

  public void push(int x) {
    queue.add(x);
    for (int i=1; i<queue.size(); i++)
      queue.add(queue.remove());
  }

  public int pop(){
    return queue.remove();
  }

  public int top() {
    return queue.peek();
  }

  public boolean empty() {
    return queue.isEmpty();
  }

  public static void main(String[] args)
  {
    MyStack obj = new MyStack();
    obj.push(5);
    obj.push(6);
    int param_2 = obj.pop();
    System.out.println(param_2);
    int param_3 = obj.top();
    System.out.println(param_3);
  }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

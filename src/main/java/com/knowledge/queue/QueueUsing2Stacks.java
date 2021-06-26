package com.knowledge.queue;

import java.util.Stack;

public class QueueUsing2Stacks {
    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();

    void enqueue(int x){
        in.push(x);
    }

    int dequeue(){
        if (out.isEmpty()){
            while (!in.empty()){
                out.push(in.pop());
            }
        }
        return out.pop();
    }

    public static void main(String[] args) {
        QueueUsing2Stacks queue = new QueueUsing2Stacks();
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println(queue.dequeue());
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}

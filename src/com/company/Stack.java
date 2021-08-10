package com.company;

public class Stack {
    private int maxSize; //mSize - максимальный размер
    private int[] stackArray;
    private int top;

    public Stack(int m) {
        this.maxSize = m;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("ERROR: Stack is full");
            loseBottomElement(element);
        } else {
            stackArray[++top] = element;
        }
    }

    public void loseBottomElement(int element) {
        int index = top;
        int[] array = new int[maxSize];
        for (int i = index; i >= 0; i--) {
            if (i == index) {
                array[i] = element;
            } else {
                array[i] = readTop();
                pop();
            }
        }
        pop();//удаляем нижний элемент
        for (int j = 0; j <= index; j++) {
            push(array[j]);
        }
        System.out.println("Стек теряет элемент снизу");
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("ERROR: Stack is empty");
        } else {
            top--;
        }
    }

    public int readTop() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
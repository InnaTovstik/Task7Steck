package com.company;
//2. Написать реализацию стека для целых чисел,
// который при переполнении теряет элементы снизу.

public class Main {

   private static final int STACK_SIZE = 5;

   public static void main(String[] args) {

        Stack mStack = new Stack(STACK_SIZE);
        mStack.push(10);
        mStack.push(20);
        mStack.push(30);
        mStack.push(40);
        mStack.push(50);
        mStack.push(60);
        while (!mStack.isEmpty()) {
           System.out.println(mStack.readTop());
           mStack.pop();
       }
   }
}
package org.example;

public class ClassTestThread extends Thread{
    private int nbr;
    public static void main(String[] args) {
        ClassTestThread t1=new ClassTestThread();
        new Thread(t1).start();
        new Thread(t1).start();
        //ClassTestThread t2=new ClassTestThread();
        //t1.setPriority(Thread.MIN_PRIORITY);
        //t2.setPriority(Thread.MAX_PRIORITY);
        //t1.start();
        //t2.start();



    }
    @Override
    public void run(){
        for(int i=0;i<100000;i++){
            synchronized (this){   nbr++;}


        }
        System.out.println(nbr);
    }

}

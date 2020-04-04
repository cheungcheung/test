package JavaTest;


import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Test  {


    public static void main(String[] args)  {

        Dog dog = new Dog("大狗",11,11);


        Thread t1 = new Thread(){
            public void run(){
                synchronized (dog){
                    System.out.println(dog.getName()+"正在喝水");
                    try {

                        Thread.sleep(2000);
                        System.out.println(dog.getName()+"想吃东西了");

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                synchronized (dog){
                    System.out.println(dog.getName()+"正在吃东西");

                    try {
                        Thread.sleep(2000);
                        System.out.println(dog.getName()+"又想喝水了");

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        t1.start();
        t2.start();

    }



}

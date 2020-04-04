package LianXi;

import sun.plugin2.message.GetAppletMessage;

import java.lang.reflect.Array;
import java.text.Format;
import java.util.ArrayList;
import java.util.Formattable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.concurrent.*;

public class AA {
    public static void main(String args[]) throws InterruptedException {


        BlockingQueue<Runnable> queue = new ArrayBlockingQueue(200);
        // 实例化线程池
        Executor executor = new ThreadPoolExecutor(1, 1, 5000, TimeUnit.MILLISECONDS,
                queue);




        // 创建100条线程,每条线程执行 线程睡眠10秒钟
        for (int i = 0; i <= 100; i++) {
            Myrunnable t = new Myrunnable(String.valueOf(i));
            executor.execute(t);


        }

        Thread.sleep(999999);

    }


    public static class Myrunnable implements Runnable {

        private String name;

        public Myrunnable(String name){
            this.name = name;
        }

        public String getName(){
            return this.name;
        }

        public void setName(String name){
            this.name = name;
        }

        /*public void name(){
            System.out.println(this.name);
        }*/


        @Override
        public void run() {

            try {

                System.out.println("my name:" + this.name);

                Thread.sleep(5000);


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
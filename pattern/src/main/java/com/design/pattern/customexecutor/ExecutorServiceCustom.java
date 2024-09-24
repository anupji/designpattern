package com.design.pattern.customexecutor;

class MyTask implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("print :-> " + Thread.currentThread().getName());
    }
}

// https://medium.com/@itsmynameangad/java-build-your-own-custom-executorservice-threadpool-213e46159326
// https://youtu.be/3Uo7MfXY4to
public class ExecutorServiceCustom {
    public static void main(String[] args) {
        MyExecutorService service = MyExecutors.myNewFixedThreadPool(3);
        for (int i = 0; i < 20; i++) {
            service.execute(new MyTask());
        }
        Runnable runnableTask = null;
    }
}
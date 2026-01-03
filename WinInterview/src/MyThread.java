public class MyThread {

    public static void main(String[] args) {
        Thread t= new Thread();
        System.out.println(t.getState());

        t.start();
        System.out.println(t.getState());
        System.out.println(t.currentThread());
        System.out.println(t.currentThread().getPriority());

       try
           {
           t.join();
           }
           catch(Exception e)
           {
               e.printStackTrace();
           }
        System.out.println(t.getState());


    }
}


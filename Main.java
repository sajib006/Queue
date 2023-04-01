public class Main {
    public static void main(String[] args) {
        Employee t1=new Employee("Arobi1","Rahman",1);
        Employee t2=new Employee("Arobi4","Rahman",4);
        Employee t3=new Employee("Arobi3","Rahman",3);

        ArrayQueue queue=new ArrayQueue(10);

        queue.add(t1);
        queue.add(t3);
        queue.add(t2);

        queue.remove();
        queue.remove();

        queue.remove();
        queue.remove();
       // queue.remove();

        queue.add(t1);

        queue.printQueue();
    }

}
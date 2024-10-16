public class MultiP1 {
    public static void main(String[] args) {

//      The initial thread is always main
//      It gets created when the process is created which also gets created when we execute the byte code (java MultiP1).
        System.out.println("The current thread is -> " + Thread.currentThread().getName());

//        O/p :-
//        The current thread is -> main
    }
}

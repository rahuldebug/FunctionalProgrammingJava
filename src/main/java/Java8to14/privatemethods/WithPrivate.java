package Java8to14.privatemethods;
/*Default methods have started utilising */
public interface WithPrivate {
    default void doCalculation(){
        System.out.println("calculating ......");
        callAfterCalculation();
    }

    private void callAfterCalculation() {
        System.out.println("after calculation");
    }

    public static int returnMethodCount(){
        return 2;
    }

}

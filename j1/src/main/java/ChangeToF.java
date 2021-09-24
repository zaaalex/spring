public class ChangeToF extends Change {

    void print_temperature(){

        System.out.println(" temperature in F: "+t);
    }

    void convert (double t1){
        this.t=t1;
        System.out.print(t1);
        t1+=273.1;
        print_temperature();
    }
}
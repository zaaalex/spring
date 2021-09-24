public class ChangeToK extends Change {

    void print_temperature(){
        System.out.println(" temperature in K: "+t);
    }

    void convert (double t1){
        this.t=t1;
        System.out.print(t);
        t= t* 1.8 + 32;
        print_temperature();
    }
}
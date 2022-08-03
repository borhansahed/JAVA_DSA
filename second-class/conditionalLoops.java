public class conditionalLoops {
    public static void main(String[] args) {


        int salary = 25000;

        if(salary > 10000){

            salary = salary + 2000;
        }
        else if ( salary < 10000){
            salary = salary + 1000;
        }
        else {
            salary += 200;
        }

        System.out.println(salary);
    }
}

public class ReduceSteps {

    public static int reduceStep(int n, int steps){
        if (n == 0 || n == 1){
            return steps;
        }
        steps = steps + 1;
        if (n % 2 == 0){
            reduceStep(n/2, steps);
        }
        if (n % 3 == 0){
            reduceStep(n/3, steps);
        }
        else {
            reduceStep(n-1, steps);
        }
        return steps;
    }

    public static void main(String[] args) {
        int n = 4;
        int steps = 0;
        System.out.println(reduceStep(n, steps));
    }
}

import java.util.function.UnaryOperator;

public class Main {
        public static void main(String[] args) {
            System.out.println(square().apply(16.0));
        }


        public static UnaryOperator<Double> square () {
            UnaryOperator<Double> s = x -> Math.sqrt(x) ;
            return s;

        }
    }

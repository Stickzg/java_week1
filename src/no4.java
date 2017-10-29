
public class no4 {
    public static void main(String[] args) {

        int max = Integer.parseInt(args[0]);
        int min = Integer.parseInt(args[0]);
        float sum = 0;


        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
            if (Integer.parseInt(args[i]) > max) {
                max = Integer.parseInt(args[i]);
            }
            if (Integer.parseInt(args[i]) < min) {
                min = Integer.parseInt(args[i]);
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Median: " + sum/args.length);
    }
}

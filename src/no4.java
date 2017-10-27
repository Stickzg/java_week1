public class no4 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            for (int j = i; j < args.length; j++) {
                if (Integer.parseInt(args[i]) > Integer.parseInt(args[j])) {
                    String temp = args[j];
                    args[j] = args[i];
                    args[i] = temp;
                }
            }
        }
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }

        int median = sum / args.length;
        System.out.println(args[args.length - 1]);
        System.out.println(args[0]);
        System.out.println(median);
    }
}
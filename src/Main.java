public class Main {
    public static void main(String[] args) {

        // task1,2,3

        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;

        double[] in = {1.57, 7.654, 9.986};

        int[] days = {1, 2, 3, 4, 5};
        for (int i = days[0]; i <= days[4]; i++){
            System.out.println(i);}
        System.out.println(weights[0] + "," + weights[1] + "," + weights[2]);
            System.out.println(in[0] + "," + in[1] + "," + in[2]);
        System.out.println(weights[2] + "," + weights[1] + "," + weights[0]);
        System.out.println(in[2] + "," + in[1] + "," + in[0]);
        for (int i = days[4]; i >= days[0]; i--) {
            System.out.println(i);
        }

        // task4


        int[] weights1 = new int[3];
        weights1[0] = 1;
        weights1[1] = 2;
        weights1[2] = 3;
        for (int f = weights[0] +1; f <= weights[2] + 1;  f++){
            System.out.println(f);
        }


        }







    }










package ApplicationReZerV.Temporaly;

public class OddOrNot {
    public static void main(String[] args) {
        for (int i = -25; i < 100; i++) {
//            System.out.println(i + " " + (i & 1) + " #### " + ( i % 2));
            if((i % 2) > 0)
                System.out.println(i + " " + (i & 1) + " #### " + ( i % 2));


        }
        System.out.println(-8 & 1);
    }
}

package j08_Loops.Loop01_FoorLopp.Tasks;

public class Task34 {

    public static void main(String[] args) {



//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6
        int i, j, k;
        for(i=5; i>=1; i--)
        {
            for(j=1; j>i; j++)
                System.out.print(" ");
            for(k=1; k<=i; k++)
                System.out.format("%2d", k);
            System.out.println();

    }
}}




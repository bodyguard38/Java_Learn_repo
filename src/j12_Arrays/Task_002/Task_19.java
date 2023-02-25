package j12_Arrays.Task_002;

public class Task_19 {
    public static void main(String[] args) {

        //Task-> Asagidaki multi dimensional array'lerin ic array'lerinde ayni index'e sahip
        // elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru)
        // arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }

        int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}};
        int [][]arr2 = {{7, 8, 9}, {10, 11},{12}};

        int maxRows = Math.max(arr1.length, arr2.length);
        for(int i = 0; i < maxRows; i++) {
            int sum = 0;
            if (i<arr1.length && i<arr2.length) {
                int maxCols = Math.max(arr1[i].length, arr2[i].length);
                for(int j = 0; j < maxCols; j++) {
                    if(j<arr1[i].length && j<arr2[i].length) {
                        sum += arr1[i][j] + arr2[i][j];
                    }else if(j<arr1[i].length){
                        sum+=arr1[i][j];
                    }else {
                        sum += arr2[i][j];
                    }
                }
            }else if(i<arr1.length){
                for (int j = 0; j <arr1[i].length ; j++) {
                    sum+= arr1[i][j];
                }
            } else {
                for (int j = 0; j <arr2[i].length ; j++) {
                    sum+= arr2[i][j];
                }
            }
            System.out.println("Sum of the elemen at index " + i + " is " + sum);

        }
    }
}

/**
 * Created by fish-Xiang on 2016/9/11.
 */
//选择排序
public class ArrayExercise {
    public static void main(String[] args) {
        int[] number = {1, 9, 2, 8, 3, 7, 4, 5, 7};
        int temp;
        int minIndex;
        for (int i = 0; i < number.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < number.length; j++) {
                if (number[minIndex] >= number[j]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                temp = number[minIndex];
                number[minIndex] = number[i];
                number[i] = temp;
            }
        }

        for (int x : number) {
            System.out.println(x);
        }
    }


}

package book;

import java.util.Arrays;
import java.util.Collections;

public class prob2_array_control {
  public static void main(String[] args){
    Integer[] integers = new Integer[6];
    integers[0] = 4;
    integers[1] = 2;
    integers[2] = 2;
    integers[3] = 1;
    integers[4] = 1;
    integers[5] = 3;
    Integer[] solution = solution(integers);
    for (Integer integer : solution) {
      System.out.println("integer = " + integer);
    }
  }

  private static Integer[] solution(Integer[] arr){
    Integer[] result = Arrays.stream(arr).distinct().toArray(Integer[]::new);
    Arrays.sort(result, Collections.reverseOrder());
    return result;
}

}

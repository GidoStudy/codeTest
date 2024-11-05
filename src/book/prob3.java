package book;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 정수 배열 numbers가 주어지면 서로 다른 인덱스에 있는 2개의 수를 뽑아 더해 만들 수 있는
 * 모든 수를 배열에 오름차순으로 담아 반환
  */

public class prob3 {
  public static void main(String[] args){
    Integer[] arr = {5,0,2,7};
    Integer[] solution = solution(arr);
    for (Integer i : solution) {
      System.out.println("i = " + i);
    }
  }

  private static Integer[] solution(Integer[] arr){
    HashSet<Integer> integers = new HashSet<>();
    for(int i = 0; i < arr.length; i++){
      for(int j = i + 1; j < arr.length; j++){
        integers.add(arr[i] + arr[j]);
      }
    }
    return integers.stream().sorted().toArray(Integer[]::new);
  }
}


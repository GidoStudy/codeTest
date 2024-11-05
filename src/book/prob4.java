package book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class prob4 {
  public static void main(String[] args){
    int[] ans = {1,3,2,4,2};
    int[] solution = solution(ans);
    for (int i : solution) {
      System.out.println("i = " + i);
    }
  }

  private static int[] solution(int[] ans){
    int[][] pattern = {
        {1,2,3,4,5},
        {2,1,2,3,2,4,2,5},
        {3,3,1,1,2,2,4,4,5,5}
    };

    int[] score = new int[3];
    for(int i=0;i<ans.length;i++){
      for(int j=0;j<pattern.length;j++){
        if(ans[i] == pattern[j][i % pattern[j].length]){
          score[j]++;
        }
      }
    }

    List<Integer> res = new ArrayList<>();
    int maxScore = Arrays.stream(score).max().getAsInt();
    for(int i=0;i<score.length;i++){
      if(score[i]==maxScore){
        res.add(i+1);
      }
    }
    return res.stream().mapToInt(i->i).toArray();
  }

}

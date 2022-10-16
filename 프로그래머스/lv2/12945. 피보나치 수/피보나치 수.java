class Solution {
      public int solution(int n) {
          int[] f = new int[(n + 1)];
          
          f[1] = f[2] = 1;
          
          for (int i = 3; i <= n; i++) {
            f[i] = (f[i - 1] + f[i - 2]) % 1234567;
          }     
          
          return f[n];
    }
}
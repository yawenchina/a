public class HelloWorld{

     public static void main(String []args){
    
		String m1 = "sweden";
        String m2 = "student";
        find(m1, m2);
        String m3 = "wede";
        find(m1,m3);
	}
    public static void find(String m1,String m2){
        int[][] dp = new int[m1.length()+1][m2.length()+1];
        int max = 0;
        for(int i = 1; i <=m1.length() ;i++){
            for(int j = 1; j <= m2.length() ;j++){
              if(m1.charAt(i-1) == m2.charAt(j-1)){
                dp[i][j] = dp[i-1][j-1] + 1;
                if(dp[i][j] > max){
                  max = dp[i][j];
                }
              }
            }
        }
        System.out.print(max);
 
 
    }
     
}

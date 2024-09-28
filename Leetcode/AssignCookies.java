public class AssignCookies {
   public static int AssignCookies(int [] g,int [] s){
      for(int i=0;i<g.length;i++){
        for(int j=0;j<s.length;j++){
            if(g[i]>=s[j]){
                i++;
                j++;
            }
        }
      }
      return i;
      
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    public static void main(String[] args) {
        int[] g = {1,2};
        int [] s = {1,2,3};
      System.out.println(AssignCookies(g, s));
    }
}

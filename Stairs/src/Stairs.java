public class Stairs {
    int prev = 1;
    int ways = 1;
    int a = 0;
    public int getWays(int nStairs){
        if(nStairs >= 45 || nStairs <= 1){
            return 0; 
        }
        else{
            for(int i = 1; i < nStairs; i++){
                a = ways;
                ways+=prev;
                prev = a;
            }
        }
        return ways;
    }
}

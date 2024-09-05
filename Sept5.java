class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m=rolls.length;
        int totalSum=mean*(n+m);
        int givenSum=0;
        int[] result = new int[n];

        for(int roll :  rolls){
            givenSum+=roll;
        }
        int missingSum=totalSum-givenSum;
        if(missingSum<n || missingSum>6*n){
            return new int[0];
        }
        int quo = missingSum / n;
        int rem = missingSum % n;
        for(int i=0;i<n;i++){
            result[i]=quo+(i<rem?1:0);
        }
        return result; 
    }
}
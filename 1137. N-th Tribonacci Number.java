class Solution {
    public int tribonacci(int n) {

        int firstnum = 0;
        int secondnum = 1;
        int thirdnum = 1;

        for(int i=1;i<=n;i++){
            int fourthnum = firstnum + secondnum + thirdnum;
            firstnum = secondnum;
            secondnum = thirdnum;
            thirdnum = fourthnum;
        }
        return firstnum;
    }
}

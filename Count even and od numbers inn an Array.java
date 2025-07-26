public class count_even_and_odd_number {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8,9,10};
        int even=0;
        int odd=0;
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("count of even : "+even);
        System.out.println("count of odd : "+odd);
    }
}

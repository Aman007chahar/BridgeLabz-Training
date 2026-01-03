public class Diamond {
    public static void main(String[] args) {

        //2nd max from array no for loop no sort

        int[] arr = new int[]{5,1,6,9,2,8,1,10};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];

                //secondMax = max;
            }
        }
        System.out.println(secondMax);

    }
}

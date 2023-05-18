public static void main(String[] args) {
        int[] arr = {4000,2,3,44,4};
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i] ;
            }
            System.out.println("the max value is: "+max);
        }
    }

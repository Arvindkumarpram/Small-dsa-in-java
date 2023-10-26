public class sorting {
  public static void main(String[] args) {
    int arr[]={8,2,4,1,4,5,6};

    //selection sort
    for(int i=0;i<arr.length-1;i++){
        int smallest=i; 
        for(int j=i+1;j<arr.length;j++){
            if(arr[smallest]>arr[j]){
                smallest=j;
            }
        }
        int temp=arr[smallest];
        arr[smallest]=arr[i];
        arr[i]=temp;
    }
    for(int i=0;i<arr.length;i++)
    System.out.print(arr[i]);
  }  
}


import java.util.HashMap;
import java.util.Map;
public class array11 {
    public static void arry(int[] arr,int target ){
    Map<Integer,Integer> map=new HashMap<Integer,Integer>();
for(int i=0;i<arr.length;i++){
if( map.containsKey(target-arr[i])){
    System.out.printf("fount pairs (%d,%d)",arr[map.get(target-arr[i])],arr[i]);
    return;
}
map.put(arr[i],i);
}   
System.out.println("pair not found");
}
    public static void main(String[] args) {
        int[] arr={8,7,2,5,3,1};
        int target=10;
        arry(arr, target);

    }
}

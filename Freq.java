import java.util.HashMap;

class Freq{
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 4, 3, 5, 5 };
        HashMap<Integer, Integer> map = new HashMap<>();
        // int temp = 0;
        // int keyval = 0;
        // for (int i : arr) {
        //     int count = map.getOrDefault(i,0)+1;
        //     map.put(i,count);
        //     if(count > temp){
        //         temp = count;
        //         keyval = i;
        //     }
        // }
        // System.out.println(keyval + " has the highest frequency " + temp);
        // System.out.println(map);
        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        System.out.println(map);
    }
}


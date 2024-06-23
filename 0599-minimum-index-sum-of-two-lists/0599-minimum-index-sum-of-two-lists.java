class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();

        int min = Integer.MAX_VALUE;

    for(int i = 0; i < list1.length; i++){
        for(int j = 0; j < list2.length; j++){
            if(list1[i].equals(list2[j])){
                int index = i + j;
                map.put(list1[i], index);

                if(index < min){
                    min = index;
                }
            }
        }
    }

    List<String> array = new ArrayList<>();

    for(HashMap.Entry<String, Integer> entry: map.entrySet()){
        if(entry.getValue() == min){
            array.add(entry.getKey());

        }
    }

    String[] result = new String[array.size()];
    result = array.toArray(result);

    return result;
        
    }  
}
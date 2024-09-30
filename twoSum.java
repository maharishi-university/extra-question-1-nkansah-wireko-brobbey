

public class TwoSum{

    public static void main(String[] args){

        int[] arr = new int{2,7,11,15};

        solution(arr, 9);


    }


    public static Set<Integer> solution(int[] arr, int target) {

        Set<Integer> indiclList = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (j != i && (arr[j] + arr[i]) == target) {
                    indiclList.add(i);
                    indiclList.add(j);
                }

            }

        }

        return indiclList;

    }
}
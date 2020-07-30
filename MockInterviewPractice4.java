import java.util.Arrays;

public class MockInterviewPractice4 {

    public static void main(String[] args) {

        int[] myList = new int[]{3, 4, 6, 10, 11, 15};
        int[] alicesList = new int[]{1, 5, 8, 12, 14, 19};

        System.out.println(Arrays.toString(mergeLists(myList, alicesList)));

    }

    private static int[] mergeLists(int[] first, int[] second) {
        int[] mergedArr = new int[first.length + second.length];
        int mergedArrPointer = 0;
        int firstArrPointer = 0;
        int secondArrPointer = 0;

        if(first.length == 0){
            return second;
        }
        if(second.length == 0){
            return first;
        }

        while(firstArrPointer < first.length && secondArrPointer < second.length){

            if(first[firstArrPointer] < second[secondArrPointer]){
                mergedArr[mergedArrPointer] = first[firstArrPointer];
                firstArrPointer++;
            }
            else{
                mergedArr[mergedArrPointer] = second[secondArrPointer];
                secondArrPointer++;
            }

            mergedArrPointer++;
        }

        if(firstArrPointer < first.length){
            for(int i = firstArrPointer; i < first.length; i++){
                mergedArr[mergedArrPointer] = first[firstArrPointer];
                mergedArrPointer++;
            }
        }

        if(secondArrPointer < second.length){
            for(int i = secondArrPointer; i < second.length; i++){
                mergedArr[mergedArrPointer] = second[secondArrPointer];
                mergedArrPointer++;
            }
        }


        return mergedArr;
    }

}

package Arrays;

public class _1518WaterBottles {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int result;
        int emptyBottles;
        //drink
        emptyBottles = numBottles;
        result = numBottles;

        // loop
        while (emptyBottles >= numExchange){
            numBottles = emptyBottles / numExchange;
            emptyBottles = emptyBottles % numExchange;

            // drink
            emptyBottles += numBottles;
            result += numBottles;
        }
        return result;
    }

    //O(logN)
    //0(1)
    public static void main(String[] args) {
        System.out.println(numWaterBottles(9, 3));
    }
}

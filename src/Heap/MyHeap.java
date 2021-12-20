package Heap;

public class MyHeap {
    private int MAX_SIZE = 100;
    private int[] arr = new int[MAX_SIZE + 1];
    private int size ;

    MyHeap(){
      size = 0;
    }
    // isEmpty
    public boolean isEmpty(){
        return size <= 0;
    }
    // peek
    public int peek(){
        if (isEmpty()){
            System.out.println("Heap is empty");
            return -1;
        }
        return arr[1];
    }
    //swap
    public void swap(int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    // add
    // phai bao dam tinh chat cay nhi phan day du hoạc gan day du,
    // dam bao tinh chat heapify
    // phai bat dau them tu phan tu cuoi cung tu trai qua
    public void Add(int v){
        size ++;
        arr[size] = v;
        // hepofy up //
        int curIndex = size;
        int parentIndex = curIndex / 2;

        while (parentIndex != 0 && arr[parentIndex] > arr[curIndex]){
            // doi cho
           swap(parentIndex, curIndex);
           curIndex = parentIndex;
           parentIndex = curIndex / 2;
        }
    }


    // poll, xoa root
    // phai bao dam tinh chat cay nhi phan day du hoạc gan day du,
    // dam bao tinh chat heapify
    // phai bat dau xoa tu phan tu cuoi cung tu trai qua
    private void heapfipy(int curIndex){

        while (( 2 * curIndex) <= size){
            int leftChildIndex = 2 * curIndex;
            int rightChildIndex = leftChildIndex +1;
            // mặc đinh gán con nhỏ nhất == leftChildIndex;
            int smallerChildIndex = leftChildIndex;
            // neu con bên phai cung nho hon size va nho hơn leftChildIndex
            // => gan smaller = rightChildIndex
            if (rightChildIndex < size && arr[rightChildIndex] < arr[leftChildIndex]){
                smallerChildIndex = rightChildIndex;
            }

            // tim xong so sanh doi cho
            if (arr[curIndex] > arr[smallerChildIndex]){
                // swap
                swap(curIndex, smallerChildIndex);
                curIndex = smallerChildIndex;
            }else {
                // oke
                break;
            }
        }
    }
    public int poll(){
        if (isEmpty()){
            System.out.println("Heap is empty");
            return -1;
        }
        int minRoot = arr[1];
        arr[1] = arr[size];
        size --;

        int curIndex = 1;
        // heapify - down
        //  int leftChildIndex = 2 * curIndex;
        heapfipy(curIndex);
     return minRoot;
    }

    // remove phan tu bat ki
    // phai bao dam tinh chat cay nhi phan day du hoạc gan day du,
    // dam bao tinh chat heapify
    // phai bat dau xoa tu phan tu cuoi cung TU TRAI QUA
    public void remove(int v){
        int curIndex = -1;
        for (int i = 0; i <= size ; i++) {
           if (arr[i] == v){
               curIndex = i;
               break;
           }
        }

        //
        if (curIndex == -1){
            System.out.println("Emlement not exist!");
        }
        // heapify down
        heapfipy(curIndex);
    }

    public static void main(String[] args) {
        MyHeap head = new MyHeap();
        head.Add(10);
        head.Add(5);
        head.Add(1);

        while (head.isEmpty() == false){
            System.out.println(head.poll());
        }
    }
}

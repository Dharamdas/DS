package general;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MedianOfIntegerStream {

    public Queue<Integer> minHeap;
    public Queue<Integer> maxHeap;
    public int numOfElements;

    MedianOfIntegerStream(){
        minHeap = new PriorityQueue<>();
        maxHeap=new PriorityQueue<>(10,new MaxHeapComparator());
        numOfElements=0;
    }

    public void addNumbersToStream(Integer num){

        maxHeap.add(num);
        if(numOfElements%2==0) {
            if (minHeap.isEmpty()) {
                numOfElements++;
                return;
            } else if (maxHeap.peek() > minHeap.peek()) {

                Integer maxHeapRoot = maxHeap.poll();
                Integer minHeapRoot = minHeap.poll();
                maxHeap.add(minHeapRoot);
                minHeap.add(maxHeapRoot);

            }
        }
        else
        {
            minHeap.add(maxHeap.poll());
        }
        numOfElements++;

    }

    public double getMedian(){
        if(numOfElements%2!=0)
            return new Double(maxHeap.peek());
        else
            return (maxHeap.peek()+minHeap.peek())/2.0;

    }
    public static void main(String[] args) {

        MedianOfIntegerStream streamMedian = new MedianOfIntegerStream();

        streamMedian.addNumbersToStream(1);
        System.out.println(streamMedian.getMedian()); // should be 1

        streamMedian.addNumbersToStream(5);
        streamMedian.addNumbersToStream(10);
      //  streamMedian.addNumbersToStream(12);
        streamMedian.addNumbersToStream(2);
        //1 2 5 10 12
        System.out.println(streamMedian.getMedian()); // should be 5


        streamMedian.addNumbersToStream(3);
        streamMedian.addNumbersToStream(8);
        streamMedian.addNumbersToStream(9);
        // 1 2, 3, 5, 8 9 10 12
        System.out.println(streamMedian.getMedian()); // should be 6.5
    }

    private class MaxHeapComparator implements Comparator<Integer>
    {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    }
}

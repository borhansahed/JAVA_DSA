package HashMap;

public class HashMap {
 private HashNode[] buckets;
 private int numOfBuckets;
 private int size;

    public HashMap() {
       this(10);
    }

    public HashMap(int capacity) {
       this.numOfBuckets = capacity;
       buckets = new HashNode[numOfBuckets];
       this.size = 0;
    }

    private class HashNode{
     private Integer key;
     private int val;
     private HashNode next;

     public HashNode(Integer key, int val) {
         this.key = key;
         this.val = val;
     }
 }

 public int size(){
        return size;
 }

 public boolean isEmpty(){
        return size == 0;
 }

 public void put(Integer key, int value){
     int bucketIndex = getBucketIndex(key);
     HashNode head = buckets[bucketIndex];

     while (head != null){
         if(head.key == key){
             head.val = value;
             return;
         }
         head = head.next;
     }
     size++;
     head = buckets[bucketIndex];
     HashNode node = new HashNode(key,value);
     node.next = head;
     buckets[bucketIndex] = node;

 }

    private int getBucketIndex(Integer key) {

        return key % numOfBuckets;
    }

    public int get(Integer key){
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];

        while (head != null){
            if(head.key == key){

                return 1;
            }
            head = head.next;
        }
        return -1;
 }

 public void remove(Integer key){

     int bucketIndex = getBucketIndex(key);
     HashNode head = buckets[bucketIndex];
     HashNode prev = null;

             while( head != null){
                 if(head.key == key){
                     break;
                 }
                 prev = head;
                 head = head.next;
             }
             size--;
             if(prev != null){
                 prev.next = head.next;
             }else{
                 buckets[bucketIndex] = head.next;
             }

 }



}

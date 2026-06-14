public class linearsearch {
    public static int linearsearch(int number[],int key){
        for (int i =0;i<number.length;i++){
            if(number[i]==key){
                return i;

            }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[]={3,4,6,9,8};
        int key =6;
        int index = linearsearch(number,key);
        if(index==-1){
            System.out.println("notfound");
        }
        else{
            System.out.println("key at index:"+index);
        }
    }
    
}



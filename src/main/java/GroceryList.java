public class GroceryList {
    //instance variables:
    private String[] arr;
    private int length;
    private int n_item;



    public GroceryList (int size){
        this.arr = new String[size];
        this.length = size;
    }

    public void add(String itm){
        for(int i = 0; i < this.length; i++){
            if (arr[i] == null){
                arr[i] = itm;
                n_item = i+1;
                return;
            }
        }
        System.out.println("List is full!");
    }

    public void remove(String itm){
        for(int i = 0; i < this.length; i ++){
            if(arr[i].equals(itm)){
                arr[i] = null;
                n_item --;

                if(i != n_item){
                    for(int j = i; j < n_item; j++){
                        arr[j] = arr[j+1];
                    }
                }
            }
        }
    }

    @Override
    public String toString(){
        String str = "";
        for(int i = 0; i < n_item; i ++){
            str += arr[i] + ", ";
        }
        return (str.substring(0, str.length() - 2));
    }
}
public class GroceryListClient {
    public static void main(String[] args){
        GroceryList l1 = new GroceryList(4);
        l1.add("milk");
        l1.add("eggs");
        l1.add("more milk");
        l1.add("double yolk eggs");
        l1.add("coconut milk");
        System.out.println(l1);
    }
}
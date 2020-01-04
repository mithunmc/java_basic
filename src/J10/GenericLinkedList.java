package J10;

public class GenericLinkedList<T> {
    T value;//Value of generic type
    GenericLinkedList next;//pointer to next

    GenericLinkedList(T value){
        this.value = value;
    }

    void add(T value){
        if(next == null)
            next = new GenericLinkedList(value);
        else
            next.add(value);
    }

    @Override
    public String toString(){
        if(next == null){
            return value+"";

        }
        else
            return value+", "+next+" ";
    }

    public static void main(String[] args) {
        GenericLinkedList<Integer> ilist = new GenericLinkedList<>(6);
        ilist.add(3);
        ilist.add(5);
        ilist.add(7);
        System.out.println("Here it is  "+ilist);
        GenericLinkedList<String> slist = new GenericLinkedList<>("Hello");
        slist.add("World");
        System.out.println("String list "+slist);
    }


}

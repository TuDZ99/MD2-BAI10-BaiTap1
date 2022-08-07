import static jdk.nashorn.internal.objects.Global.print;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        print(list.getElements());
        System.out.println(list.indexOf("no"));
        System.out.println(list.indexOf("yes"));
        list.remove(1);
        list.add(Integer.parseInt("1"),1);
        print(list.getElements());
        MyList<String> clone = list.clone();
        System.out.println(clone.contains("ao"));
        System.out.println(clone.contains("that"));
        System.out.println(clone.get(3));
        System.out.println(clone.size());
        clone.clear();
        System.out.println(clone.size());
        print(clone.getElements());
    }
    static void print(Object[] list){
        for (Object x : list){
            if (!(x == null)){
                System.out.println((String)x);
            }
        }
        System.out.println("\n");
    }
}

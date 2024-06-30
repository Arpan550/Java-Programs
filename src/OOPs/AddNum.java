package OOPs;

public class AddNum {
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        AddNum addNum=new AddNum();
        System.out.println(addNum.add(4,5));
        System.out.println(addNum.add(4,5,6));
        System.out.println(addNum.add(3.5,6.7));
    }
}

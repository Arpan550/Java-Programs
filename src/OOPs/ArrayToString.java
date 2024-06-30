package OOPs;

public class ArrayToString {
    public static void main(String[] args) {
        String[] words={"Hello,","Everyone !","Welcome","to","the","world","of","programming","."};

        StringBuilder str=new StringBuilder();

        for(String element:words){
            str.append(element).append(" ");
        }
        System.out.println(str);
    }
}

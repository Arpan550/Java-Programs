public class ToString2 {
    String ename;
    int id;

    ToString2(String en, int i) {
        ename = en;
        id = i;
    }

    public String toString() {
        return ("Name is: " + ename + ", Id: " + id);
    }

    public static void main(String args[]) {
        ToString2 ob = new ToString2("Arpan", 30);
        System.out.println(ob);
        System.out.println(ob.toString());
    }
}

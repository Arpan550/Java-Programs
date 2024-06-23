class Wish{
    String name;
    public void show(){
        if(name!=null){
            System.out.println("Hello, Good Morning, "+ name+"!");
        } else{
            System.out.println("Hello, Good Morning!");
        }
    }
    Wish(){

    }
    Wish(String name){
        this.name=name;
    }
}

public class Main {
    public static void main(String[] args) {
        Wish wish1=new Wish();
        Wish wish2=new Wish("Arpan");
        wish1.show();
        wish2.show();
    }
}
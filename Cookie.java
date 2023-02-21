import java.io.*;
public class Cookie {
    private String color;
    public Cookie(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setcolor(String color){
        this.color=color;
    }

    public static void main(String[] args ){
              Cookie c1=new Cookie("green");
             Cookie c2=new Cookie("blue");
             System.out.println(c1.getColor());
             System.out.println(c2.getColor());
             c1.setcolor("white");
             System.out.println(c1.getColor());
                
              
    }
}

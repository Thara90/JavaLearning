package chapter8_DataTypes;

public class TextProcessor {

    public static void main(String arg[]) {
        String text="avacado";
        String[] words=text.split("a");
        System.out.println("size "+text.length());

        //for (String a : words)
            //System.out.println(a);

        for(int i=text.length()-1;i>=0;i--){
            System.out.print(text.charAt(i));
        }
    }
}

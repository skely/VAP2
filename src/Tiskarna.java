public class Tiskarna implements Volatelny, Tisknutelny{
    public void zavolej(){
        System.out.println("Zavoláno");
    }
    public void tiskni(String text){
        System.out.println("Tisknu: " + text);
    }
}

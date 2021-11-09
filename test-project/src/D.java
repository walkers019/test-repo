public class D {
    private int i;
    private float f;
    private char c;
    private String s;

    public D(int i, float f, char c, String s){
        this.i = i;
        this.f = f;
        this.c = c;
        this.s = s;
    }

    public char getC() {
        return c;
    }

    public float getF() {
        return f;
    }

    public int getI() {
        return i;
    }

    public String getS() {
        return s;
    }


    public void printText(){
        System.out.println("Hallo!");
        System.out.println("Das ist Beispieltext!");
        System.out.println("Blub!");
        System.out.println("Didub!");
        System.out.println("Didab!");
    }
}

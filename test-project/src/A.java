public class A {
    int myInt;
    String myStr;
    public A(String str, int i){
        this.myStr = str;
        this.myInt = i;
    }



    public int add(int i){
        //this is a really cool way to add two ints!!
        for(int j=0; j<=i; j++){
            this.myInt++;
        }

        return this.myInt;
    }


}

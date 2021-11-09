public class B {
        int myInt;
        String myStr;
        public B(String str, int i){
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

        public void printText(){
            System.out.println("Hallo!");
            System.out.println("Das ist Beispieltext!");
            System.out.println("Blub!");
            System.out.println("Didub!");
            System.out.println("Didab!");
        }

}

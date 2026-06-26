public class Loops {
    public static void main(String[] args) {
        /* loops - when we need to execute a particular piece of code for numerous times
        rather than writting manually we use loops */

        // while loop
        //int a=1;
        // while (a<=10){
        //   System.out.println(a);
        // a++;
        //  }

        // do while - one condition always gets executed
        //     int a=0;
        //    do {
        //      System.out.println(a);
        //     a++;

    //  while (a<=5);

    // For loop - (initializtion,condition,increment/decrement);

    //for(int a = 0; a<=11;a++) {
      //  System.out.println(a);

        // NESTED LOOP - loop inside loop is called as nested loop.

        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                System.out.println(i+"*"+j+" = "+i*j);
            }
        }
   }
}


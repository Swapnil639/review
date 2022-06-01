public class RollDie {
    public static void main(String[] args) {
        int[] die=new int[20];
       for(int i=1;i<=6;i++){
           System.out.println(die[i]=(int)(Math.random()*6)+1);
       }
        int max=die[1];
        for(int i=1;i<=6;i++){

            if(die[i]>max)
            {
               max=die[i];
            }
        }
        System.out.println("Maximum number :"+max);
    }
}


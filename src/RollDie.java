public class RollDie {
    public static void main(String[] args) {
        int SIDES=6;
        int die1=(int)(Math.random()*SIDES)+1;
        int die2=(int)(Math.random()*SIDES)+1;
        int die3=(int)(Math.random()*SIDES)+1;
        int die4=(int)(Math.random()*SIDES)+1;
        int die5=(int)(Math.random()*SIDES)+1;
        int die6=(int)(Math.random()*SIDES)+1;
        System.out.println(die1);
        System.out.println(die2);
        System.out.println(die3);
        System.out.println(die4);
        System.out.println(die5);
        System.out.println(die6);
        if(die1>die2 && die1>die3 && die1>die4 && die1>die5 && die1>die6)
            System.out.println("die1 is maximum ");
        else if(die2>die1 && die2>die3 && die2>die4 && die2>die5 && die2>die6)
            System.out.println("die2 is maximum ");
        else if(die3>die1 && die3>die2 && die3>die4 && die3>die5 && die3>die6)
            System.out.println("die3 is maximum ");
        else if(die4>die1 && die4>die2 && die4>die3 && die4>die5 && die4>die6)
            System.out.println("die4 is maximum ");
        else if(die5>die1 && die5>die2 && die5>die3 && die5>die4 && die5>die6)
            System.out.println("die5 is maximum ");
        else if(die6>die1 && die6>die2 && die6>die4 && die6>die5 && die6>die3)
            System.out.println("die6 is maximum ");
        else System.out.println("not valid");



    }
}

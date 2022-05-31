public class Main {
    public static void main(String[] args) {
        Tree agac= new Tree(7);
        agac.control(agac,8);
        agac.control(agac,5);
        agac.control(agac,10);
        agac.control(agac,2);
        agac.control(agac,9);
        agac.control(agac,11);


        System.out.println(agac.right.right.right.value);




    }
}

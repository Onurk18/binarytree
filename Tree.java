public class Tree {
    Integer value;
    Tree right;
    Tree left;


    public Tree(Integer value) {
        this.value = value;
    }

    void add_left(Tree x, Integer a){
        x.left.value=a;
    }
    void add_right(Tree x, Integer a){
        x.right.value=a;
    }
    void control(Tree x, Integer z){
        if (x.value==0){
            x.value= z;
        }
        else if (x.value> z){
            if (x.left==null){
            x.left= new Tree(0);}
            control(x.left, z);
        }
        else if (x.value< z){
            if (x.right==null){
            x.right= new Tree(0);}
            control(x.right, z);
        }
    }
    void yazdir(Tree x){

    }
 /*
    int level(Tree x){
        int rLevel=0;
        int lLevel=0;
        while(true){
            if (x.right==null){
                break;
            }
            else{
                rLevel++;
                x=x.right;
            }
        }
    }

  */
}

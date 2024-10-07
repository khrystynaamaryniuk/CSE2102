public class PizzaStore{

    public static void main(String[] argv){
        PizzaFactory pf = new PizzaFactory();
        System.out.println("Making the first pizza!");
        PizzaInterface cheese = pf.makePizza("Cheese");
        if (cheese!=null){
        cheese.prepare();
        cheese.bake();
        cheese.cut();
        cheese.box();
        }
        else{
            System.out.println("Pizza creation failed");
        }
           System.out.println("Making the second pizza!");
        PizzaInterface greek = pf.makePizza("Greek");
        if (greek!=null){
        greek.prepare();
        greek.bake();
        greek.cut();
        greek.box();
        }
        else{
            System.out.println("Pizza creation failed");
        }
           System.out.println("Making the third pizza!");
        PizzaInterface paperoni = pf.makePizza("Paperoni");
        if (cheese!=null){
        paperoni.prepare();
        paperoni.bake();
        paperoni.cut();
        paperoni.box();
        }
        else{
            System.out.println("Pizza creation failed");
        }
           System.out.println("Making the fourth pizza!");
        PizzaInterface glutenfree = pf.makePizza("GlutenFree");
        if (glutenfree!=null){
        glutenfree.prepare();
        glutenfree.bake();
        glutenfree.cut();
        glutenfree.box();
        }
        else{
            System.out.println("Pizza creation failed");
        }
        
        
        
        

    }


}
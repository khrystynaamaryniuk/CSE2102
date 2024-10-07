public class PizzaFactory{

    public PizzaInterface makePizza(String type){
        if(null==type || type.isEmpty()){
            System.err.println("No such pizza!");
            return null;
        }
        
    
    switch(type){
        case "Cheese": 
        return new CheesePizza();
        case "Greek":
            return new GreekPizza();
        case "Paperoni":
            return new PaperoniPizza();
        case "GlutenFree":
            return new GlutenFreePizza();
        default:
            System.out.println("No such pizza!");
            return null;
        
            
    }

    }

}
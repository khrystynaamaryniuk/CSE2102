import java.lang.Math;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
public class PizzaTests {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
PizzaInterface cheese_pizza;
PizzaInterface paperoni_pizza;
PizzaInterface greek_pizza;
PizzaInterface gluten_free;
@Before
public void setUp() throws Exception {
     cheese_pizza = new CheesePizza();
     paperoni_pizza=new PaperoniPizza();
     greek_pizza=new GreekPizza();
    gluten_free=new GlutenFreePizza();
    System.setOut(new PrintStream(outContent));
    System.setErr(new PrintStream(errContent));
}
@After
public void restoreStreams() {
    System.setOut(originalOut);
    System.setErr(originalErr);

}
@Test
public void CheeezePizzaTest_Prep() {
    cheese_pizza.prepare();
    String newString = outContent.toString();
    assertEquals("Preparing a cheese pizza!\n", newString);
}

@Test
public void CheeezePizzaTest_Cut() {
    cheese_pizza.cut();
    assertEquals("Cutting a cheese pizza!\n", outContent.toString());
}
@Test
public void CheeezePizzaTest_box() {
    cheese_pizza.box();
    assertEquals("Boxing a cheese pizza!\n", outContent.toString());
}
@Test
public void GlutenFreePizzaTest_prep() {
    gluten_free.prepare();
    assertEquals("Preparing a gluten free pizza!\n", outContent.toString());

}
@Test
public void GlutenFreePizzaTest_bake() {
    gluten_free.bake();
    assertEquals("Baking a gluten free pizza!\n", outContent.toString());
}
@Test
public void GlutenFreePizzaTest_cut() {
    gluten_free.cut();
    assertEquals("Cutting a gluten free pizza!\n", outContent.toString());
}
@Test
public void GlutenFreePizzaTest_box() {
    gluten_free.box();
    assertEquals("Boxing a gluten free pizza!\n", outContent.toString());
}
@Test
public void GreekPizzaTest_prepare() {
    greek_pizza.prepare();
    assertEquals("Preparing a greek pizza!\n", outContent.toString());
}
@Test
public void GreekPizzaTest_bake() {
    greek_pizza.bake();
    assertEquals("Baking a greek pizza!\n", outContent.toString());
}
@Test
public void GreekPizzaTest_cut() {
    greek_pizza.cut();
    assertEquals("Cutting a greek pizza!\n", outContent.toString());
}
@Test
public void GreekPizzaTest_box() {
    greek_pizza.box();
    assertEquals("Boxing a greek pizza!\n", outContent.toString());
}
@Test
public void PaperoniPizzaTest_prepare() {
    paperoni_pizza.prepare();
    assertEquals("Preparing a paperoni pizza!\n", outContent.toString());
}
@Test
public void PaperoniPizzaTest_bake() {
    paperoni_pizza.bake();
    assertEquals("Baking a paperoni pizza!\n", outContent.toString());
}
@Test
public void PaperoniPizzaTest_cut() {
    paperoni_pizza.cut();
    assertEquals("Cutting a paperoni pizza!\n", outContent.toString());
}
@Test
public void PaperoniPizzaTest_box() {
    paperoni_pizza.box();
    assertEquals("Boxing a paperoni pizza!\n", outContent.toString());
}
@Test
public void CheeezePizzaTest_Bake() {
    cheese_pizza.bake();
    assertNotEquals("Baking a cheese pizzaX!\n", outContent.toString());
}

}



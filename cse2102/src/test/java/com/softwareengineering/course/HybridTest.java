
import java.lang.Math;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.java.com.softwareengineering.course.Hybrid;


public class HybridTest {

	Hybrid hybrid;

	@Before
	public void setUp() throws Exception {
		hybrid  = new Hybrid();
    }

	@Test
	public void calcGasMPGTest() {

		double miles =120.0;
		double gallons =6.0;
		double expected = miles/gallons;
		hybrid.setMilesfromGas(120.0);
		hybrid.setGallonsfromGas(6.0);
		double actual = hybrid.calcGasMPG();

		assertTrue(actual == expected);

	}
	@Test
	public void calcMPGeTest() {

		double miles =120.0;
		double kWh =6.0;
		double expected = miles/kWh*33.7;
		hybrid.setElectricMiles(120.0);
		hybrid.setTotalkWh(6.0);
		double actual = hybrid.calcMPGe();
		assertTrue(actual == expected);
	}
	@Test
	public void setMilesTest(){
		double miles = 120.0;
		hybrid.setMilesfromGas(120.0);
		assertTrue(miles==hybrid.getMiles());
	}

	@Test
	public void setGallonsfromGasTest(){
		double gallons = 6.0;
		hybrid.setGallonsfromGas(6.0);
		assertTrue(gallons==hybrid.getGallons());
	}
	@Test
	public void setElectricMilesTest(){
		double miles = 140.0;
		hybrid.setElectricMiles(140);
		assertTrue(miles==hybrid.getEmiles());
	}

	@Test
	public void setTotalkWhTest(){
		double kwh =33.7;
		hybrid.setTotalkWh(33.7);
		assertTrue(kwh==hybrid.getkWh());
	}
	@Test
	public void calcCostForTripElectricTest() {

		double cost = 0.24;
		double kWh =33.7;
		double expected = cost*kWh;
		hybrid.setcostPerKWh(0.24);
		hybrid.setTotalkWh(33.7);
		double actual = hybrid.calcCostForTripElectric();

		assertTrue(actual == expected);
	}
	@Test
	public void calcCostForTripGasolineTest() {
	
		double cost = 3.50;
		double gallons = 6.0;
		double expected = cost*gallons;
		hybrid.setcostPerGallon(3.50);
		hybrid.setGallonsfromGas(6);
		double actual = hybrid.calcCostForTripGasoline();

		assertTrue(actual == expected);
	}
	@Test
	public void ConstuctorTest(){
		Hybrid h = new Hybrid();
		assertTrue(1==1);
	}
	
}

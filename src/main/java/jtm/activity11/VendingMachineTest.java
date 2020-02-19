package jtm.activity11;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

public class VendingMachineTest {

    VendingMachine machine;

    @Before
    public void setUp() {
        machine = new VendingMachine();
    }

    @Test
    public void testInitialBalance(){
        Assert.assertEquals("Expected to be 0.00$", "0.00$", machine.balance());
    }

    @Test
    public void testBalance() {
        machine.depositCoins(2.00);
        Assert.assertEquals("Expected to be 2.00$", "2.00$", machine.balance());
    }

    @Test
    public void testAddProducts() {
        machine.addProducts("banana", 1.00);
        machine.depositCoins(1.50);
        Assert.assertEquals("banana", machine.chooseProduct("banana"));

    }

    @Test
    public void testAddTwoProducts() {
        machine.addProducts("banana", 1.00);
        machine.addProducts("bounty", 3.00);
        machine.depositCoins(1.50);
        Assert.assertEquals("banana", machine.chooseProduct("banana"));
    }

    @Test
    public void testAddProductsDepositEqualToPrice() {
        machine.addProducts("snickers", 1.50);
        machine.depositCoins(1.50); // Actual Balance not enough! Check choose method. -- Done!
        Assert.assertEquals("snickers", machine.chooseProduct("snickers"));
    }

    @Test
    public void testNonCaseSensitive() {
        machine.addProducts("APPLE", 1.00);
        machine.depositCoins(1.00);
        Assert.assertEquals("apple", machine.chooseProduct("apple").toLowerCase());

    }

    @Test
    public void testBalanceNotEnough() {
        machine.addProducts("pepsi", 1.45);
        machine.depositCoins(1.00);
        Assert.assertEquals("balance not enough", machine.chooseProduct("pepsi").toLowerCase());
    }

    @Test
    public void testBNonExistingProduct() {
        machine.addProducts("pepsi", 1.45);
        machine.depositCoins(5.00);
        Assert.assertNull(machine.chooseProduct("cucumber"));
    }



    @Test
    public void testEjectCoins() {
        Assert.assertEquals(0.00, machine.ejectCoinsBack(), 0.001);
    }

}

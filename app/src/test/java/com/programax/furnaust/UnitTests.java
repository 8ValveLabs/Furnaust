package com.programax.furnaust;

import com.programax.furnaust.Abstract.Ore;
import com.programax.furnaust.Concrete.CrudeOil;
import com.programax.furnaust.Concrete.HqmOre;
import com.programax.furnaust.Concrete.MetalOre;
import com.programax.furnaust.Concrete.SulfurOre;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class UnitTests {

    Ore crude = new CrudeOil();
    Ore hqm = new HqmOre();
    Ore metal = new MetalOre();
    Ore sulfur = new SulfurOre();

    /**
     * Beginning of calculation tests
     */

    @Test
    public void calcWood_CrudeOil_isAccurate() {
        assertEquals(
                20,
                (crude.calcWoodConsumed((short)3)),
                0.1
        );
    }

    @Test
    public void calcWood_Hqm_isAccurate() {
        assertEquals(
                20,
                (hqm.calcWoodConsumed((short)2)),
                0.1
        );
    }

    @Test
    public void calcWood_Metal_isAccurate() {
        assertEquals(
                10,
                (metal.calcWoodConsumed((short)2)),
                0.1
        );
    }

    @Test
    public void calcWood_sulfur_isAccurate() {
        assertEquals(
                5,
                (sulfur.calcWoodConsumed((short)2)),
                0.1
        );
    }

    @Test
    public void calcOre_Crude_isAccurate() {
        assertEquals(
                2,
                crude.calcOreConsumed((short)13),
                0.1
        );
    }

    @Test
    public void calcOre_Hqm_isAccurate() {
        assertEquals(
                2,
                hqm.calcOreConsumed((short)20),
                0.1
        );
    }

    @Test
    public void calcOre_Metal_isAccurate() {
        assertEquals(
                2,
                metal.calcOreConsumed((short)10),
                0.1
        );
    }

    @Test
    public void calcOre_Sulfur_isAccurate() {
        assertEquals(
                2,
                sulfur.calcOreConsumed((short)5),
                0.1
        );
    }


    /**
     * Beginning of zero value checks
     */

    @Test
    public void calcWood_CrudeOil_zeroCheck() {
        assertThrows(
                IllegalArgumentException.class, () -> {
                    crude.calcWoodConsumed((short) 0);
                }
        );
    }

    @Test
    public void calcWood_Hqm_zeroCheck() {
        assertThrows(
                IllegalArgumentException.class, () -> {
                    hqm.calcWoodConsumed((short) 0);
                }
        );
    }

    @Test
    public void calcWood_Metal_zeroCheck() {
        assertThrows(
                IllegalArgumentException.class, () -> {
                    metal.calcWoodConsumed((short) 0);
                }
        );
    }

    @Test
    public void calcWood_Sulfur_zeroCheck() {
        assertThrows(
                IllegalArgumentException.class, () -> {
                    sulfur.calcWoodConsumed((short) 0);
                }
        );
    }

    @Test
    public void calcOre_CrudeOil_zeroCheck() {
        assertThrows(
                IllegalArgumentException.class, () -> {
                    crude.calcOreConsumed((short) 0);
                }
        );
    }

    @Test
    public void calcOre_Hqm_zeroCheck() {
        assertThrows(
                IllegalArgumentException.class, () -> {
                    hqm.calcOreConsumed((short) 0);
                }
        );
    }

    @Test
    public void calcOre_Metal_zeroCheck() {
        assertThrows(
                IllegalArgumentException.class, () -> {
                    metal.calcOreConsumed((short) 0);
                }
        );
    }

    @Test
    public void calcOre_Sulfur_zeroCheck() {
        assertThrows(
                IllegalArgumentException.class, () -> {
                    sulfur.calcOreConsumed((short) 0);
                }
        );
    }

    /**
     *  Beginning of negative value checks
     */

    @Test
    public void calcWood_CrudeOil_negativeCheck() {
        assertThrows(
                IllegalArgumentException.class, () -> {
                    crude.calcWoodConsumed((short) -5);
                }
        );
    }

    @Test
    public void calcWood_Hqm_negativeCheck() {
        assertThrows(
                IllegalArgumentException.class, () -> {
                    hqm.calcWoodConsumed((short) -5);
                }
        );
    }

    @Test
    public void calcWood_Metal_negativeCheck() {
        assertThrows(
                IllegalArgumentException.class, () -> {
                    metal.calcWoodConsumed((short) -5);
                }
        );
    }

    @Test
    public void calcWood_Sulfur_negativeCheck() {
        assertThrows(
                IllegalArgumentException.class, () -> {
                    sulfur.calcWoodConsumed((short) -5);
                }
        );
    }

    @Test
    public void calcOre_CrudeOil_negativeCheck() {
        assertThrows(
                IllegalArgumentException.class, () -> {
                    crude.calcOreConsumed((short) -5);
                }
        );
    }

    @Test
    public void calcOre_Hqm_negativeCheck() {
        assertThrows(
                IllegalArgumentException.class, () -> {
                    hqm.calcOreConsumed((short) -5);
                }
        );
    }

    @Test
    public void calcOre_Metal_negativeCheck() {
        assertThrows(
                IllegalArgumentException.class, () -> {
                    metal.calcOreConsumed((short) -5);
                }
        );
    }

    @Test
    public void calcOre_sulfur_negativeCheck() {
        assertThrows(
                IllegalArgumentException.class, () -> {
                    sulfur.calcOreConsumed((short) -5);
                }
        );
    }
}
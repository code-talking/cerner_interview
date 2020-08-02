package org.pmareke.cerner.test;

import org.pmareke.cerner.utils.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by pmareke on 22/09/16.
 */
public class Exercise1Test {

    /**
     * First exercise:
     * <p>
     * Develop an Allergy class which can hold different severities (LOW, MEDIUM or HIGH) and be tied to a Patient to
     * retrieve the allergies associated with that person and their respective severities.
     */
    
    @Test()
    public void testExercise1() {
        Utils.data();
        Assert.assertTrue(Utils.brad.getFullAllergies().length() > 0);
        Assert.assertTrue(Utils.brad.getFullDiseases().length() > 0);
    }
}
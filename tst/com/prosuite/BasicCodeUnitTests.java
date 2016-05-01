package com.prosuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class BasicCodeUnitTests {

    private static final String NAME = "name";
    private static final String OCCUPATION = "occupation";
    private static final String USERNAME = "userName";

    private BasicCode basicCode;

    @Before
    public void setup() {
        basicCode = new BasicCode(USERNAME);
        basicCode.setName(NAME);
        basicCode.setOccupation(OCCUPATION);
    }

    @Test
    public void evaluateGetters() {

        Assert.assertEquals(NAME, basicCode.getName());
        Assert.assertEquals(OCCUPATION, basicCode.getOccupation());
        Assert.assertEquals(USERNAME, basicCode.getUserName());
    }

}

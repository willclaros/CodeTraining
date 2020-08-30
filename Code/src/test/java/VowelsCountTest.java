/*
 *
 *  @(#)<Name Class>.java
 *
 *  Copyright (c) 2020 Code Training.
 *  All rights reserved.
 *
 *  This software is the confidential and proprietary information.  You shall not  disclose such Confidential
 *  Information and shall use it only in accordance with the terms of the license agreement.
 *
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VowelsCountTest {

    private VowelsCount vowelsCount;

    @Before
    public void initialized() {
        vowelsCount = new VowelsCount();
    }

    @Test
    public void vowelsCountTest1() {
        int actualResult = vowelsCount.vowelsCount("abracadabra");
        int expectedResult = 5;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void vowelsCountTest2() {
        int actualResult = vowelsCount.vowelsCount("Hello World. My name is Pimpón.");
        int expectedResult = 8;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void vowelsCountTest3() {
        int actualResult = vowelsCount.vowelsCount("Why?");
        int expectedResult = 0;
        Assert.assertEquals(expectedResult, actualResult);
    }
}

package com.topcoder.dmt.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author <a href="mailto:hameer.dhandu70@gmail.com">Hameer Singh</a>
 */
class CommonUtilityTest {

    @Test
    void generateUUID() {
        //given

        //when
        String value = CommonUtility.generateUUID();
        //then
        assert !value.isEmpty();
    }
}
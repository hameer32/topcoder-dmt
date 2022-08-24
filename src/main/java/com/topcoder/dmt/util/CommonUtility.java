package com.topcoder.dmt.util;

import java.util.UUID;

/**
 * @author <a href="mailto:hameer.dhandu70@gmail.com">Hameer Singh</a>
 */
public class CommonUtility {
    public static String generateUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
}

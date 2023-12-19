package com.base26decoder;

import java.util.Objects;

public class Base26Decoder {
    private Base26Decoder() {
    }

    private static final String BASE_26_DICTIONARY = "PQLAMZWOSKXNBCDJEIURHFGVTY";

    public static String fromBase26(String text) {
        Integer result;
        if (text != null && !text.equals("")) {
            int len = text.length();
            if (len > 13) {
                result = null;
            } else {
                int index = 0;
                for (int i = 0; i < len; ++i) {
                    int chr = text.charAt(i);
                    int idx = BASE_26_DICTIONARY.indexOf(chr);
                    index *= BASE_26_DICTIONARY.length();
                    index += idx;
                    //System.out.println(chr + "," + idx + "," + index);
                }
                result = index;
            }
        } else {
            result = null;
        }
        return Objects.toString(result, null);
    }
}

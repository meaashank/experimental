package com.bytedance.adsdk.ZRu.NOt.uR;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public enum uR implements TFq {
    LEFT_PAREN("("),
    RIGHT_PAREN(")"),
    LEFT_BRACKET("["),
    RIGHT_BRACKET("]"),
    COMMA(",");

    private static final Map<String, uR> Ht;
    private final String Mm;

    static {
        HashMap map = new HashMap(128);
        Ht = map;
        for (uR uRVar : map.values()) {
            Ht.put(uRVar.ZRu(), uRVar);
        }
    }

    uR(String str) {
        this.Mm = str;
    }

    public static boolean ZRu(TFq tFq) {
        return tFq instanceof uR;
    }

    public String ZRu() {
        return this.Mm;
    }
}

package com.bytedance.adsdk.ZRu.NOt.uR;

import com.google.firebase.sessions.settings.RemoteSettings;
import com.prism.gaia.download.a;
import com.prism.gaia.server.accounts.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public enum mZ implements TFq {
    QUESTION("?", 0),
    COLON(b.f166434b0, 0),
    DOUBLE_AMP("&&", 1),
    DOUBLE_BAR("||", 1),
    EQ("==", 2),
    GT(">", 2),
    LT("<", 2),
    LT_EQ("<=", 2),
    GT_EQ(">=", 2),
    NOT_EQ("!=", 2),
    PLUS("+", 3),
    MINUS(a.f164606q, 3),
    MULTI("*", 4),
    DIVISION(RemoteSettings.FORWARD_SLASH_STRING, 4),
    MOD("%", 4);

    private final int om;
    private final String qF;
    private static final Map<String, mZ> yBV = new HashMap(128);
    private static final Set<mZ> WMI = new HashSet();

    static {
        for (mZ mZVar : values()) {
            yBV.put(mZVar.ZRu(), mZVar);
            WMI.add(mZVar);
        }
    }

    mZ(String str, int i10) {
        this.qF = str;
        this.om = i10;
    }

    public static mZ ZRu(String str) {
        return yBV.get(str);
    }

    public int NOt() {
        return this.om;
    }

    public static boolean ZRu(TFq tFq) {
        return tFq instanceof mZ;
    }

    public String ZRu() {
        return this.qF;
    }
}

package com.bytedance.adsdk.NOt;

import com.bytedance.component.sdk.annotation.RestrictTo;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class OCA {
    private boolean NOt;
    private final Map<String, String> ZRu;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final String NOt(String str, String str2) {
        if (this.NOt && this.ZRu.containsKey(str2)) {
            return this.ZRu.get(str2);
        }
        String strZRu = ZRu(str, str2);
        if (this.NOt) {
            this.ZRu.put(str2, strZRu);
        }
        return strZRu;
    }

    public String ZRu(String str) {
        return str;
    }

    public String ZRu(String str, String str2) {
        return ZRu(str2);
    }
}

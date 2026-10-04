package com.bytedance.adsdk.NOt.mZ;

import androidx.compose.foundation.text.modifiers.l;
import com.bytedance.adsdk.NOt.mZ.NOt.yBV;
import com.bytedance.component.sdk.annotation.RestrictTo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class uR {
    private final String Ht;
    private final char NOt;
    private final String TFq;
    private final List<yBV> ZRu;
    private final double mZ;
    private final double uR;

    public uR(List<yBV> list, char c10, double d10, double d11, String str, String str2) {
        this.ZRu = list;
        this.NOt = c10;
        this.mZ = d10;
        this.uR = d11;
        this.TFq = str;
        this.Ht = str2;
    }

    public static int ZRu(char c10, String str, String str2) {
        return str2.hashCode() + l.a(str, c10 * 31, 31);
    }

    public double NOt() {
        return this.uR;
    }

    public int hashCode() {
        return ZRu(this.NOt, this.Ht, this.TFq);
    }

    public List<yBV> ZRu() {
        return this.ZRu;
    }
}

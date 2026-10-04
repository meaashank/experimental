package com.bytedance.sdk.component.adexpress.dynamic.uR;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class Vor {
    public float NOt;
    public float ZRu;

    public Vor(float f10, float f11) {
        this.ZRu = f10;
        this.NOt = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Vor vor = (Vor) obj;
            if (Float.compare(vor.ZRu, this.ZRu) == 0 && Float.compare(vor.NOt, this.NOt) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.ZRu), Float.valueOf(this.NOt)});
    }
}

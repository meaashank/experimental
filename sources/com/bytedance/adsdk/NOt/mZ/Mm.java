package com.bytedance.adsdk.NOt.mZ;

import C4.q;
import android.util.Pair;
import com.bytedance.component.sdk.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class Mm<T> {
    T NOt;
    T ZRu;

    private static boolean NOt(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public void ZRu(T t10, T t11) {
        this.ZRu = t10;
        this.NOt = t11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return NOt(pair.first, this.ZRu) && NOt(pair.second, this.NOt);
    }

    public int hashCode() {
        T t10 = this.ZRu;
        int iHashCode = t10 == null ? 0 : t10.hashCode();
        T t11 = this.NOt;
        return iHashCode ^ (t11 != null ? t11.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.ZRu + q.f17581a + this.NOt + "}";
    }
}

package com.bytedance.adsdk.NOt.uR;

import androidx.multidex.MultiDexExtractor;
import com.bytedance.component.sdk.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public enum mZ {
    JSON(".json"),
    ZIP(MultiDexExtractor.f114845k);

    public final String mZ;

    mZ(String str) {
        this.mZ = str;
    }

    public String ZRu() {
        return ".temp" + this.mZ;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.mZ;
    }
}

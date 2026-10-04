package com.bytedance.sdk.openadsdk.uR.ZRu;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class edo {
    public static edo ZRu = new edo();
    private ZRu NOt;
    private final Map<String, ZRu> mZ = new HashMap();
    private volatile boolean uR;

    public static class ZRu {
        private final int NOt;
        private final int ZRu;

        public ZRu(int i10, int i11) {
            this.ZRu = (i10 < 0 || i10 > 5) ? 3 : i10;
            this.NOt = i11 < 10 ? 30 : i11;
        }

        public int NOt() {
            return this.NOt;
        }

        public int ZRu() {
            return this.ZRu;
        }
    }

    private int NOt() {
        ZRu zRu = this.NOt;
        if (zRu != null) {
            return zRu.ZRu();
        }
        return 3;
    }

    private int mZ() {
        ZRu zRu = this.NOt;
        if (zRu != null) {
            return zRu.NOt();
        }
        return 30;
    }

    public void ZRu(ZRu zRu) {
        this.NOt = zRu;
    }

    public void ZRu(String str, ZRu zRu) {
        if (TextUtils.isEmpty(str) || zRu == null) {
            return;
        }
        this.mZ.put(str, zRu);
    }

    public int NOt(String str) {
        ZRu zRu = this.mZ.get(str);
        if (zRu == null) {
            return mZ();
        }
        return zRu.NOt();
    }

    public int ZRu(String str) {
        if (!ZRu()) {
            return 4;
        }
        ZRu zRu = this.mZ.get(str);
        if (zRu == null) {
            return NOt();
        }
        return zRu.ZRu();
    }

    public boolean ZRu() {
        return this.uR;
    }

    public void ZRu(boolean z10) {
        this.uR = z10;
    }
}

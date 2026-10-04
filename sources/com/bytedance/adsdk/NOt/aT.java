package com.bytedance.adsdk.NOt;

import android.graphics.Bitmap;
import com.bytedance.component.sdk.annotation.RestrictTo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class aT {
    private final String FA;
    private final String Ht;
    private final List<ZRu> Mm;
    private final int NOt;
    private final String TFq;
    private final int[][] Vor;
    private final int ZRu;
    private Bitmap aT;
    private final String mZ;
    private final String uR;

    public static class ZRu {
        public int Ht;
        public int NOt;
        public int TFq;
        public int ZRu;
        public String mZ;
        public String uR;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public aT(int i10, int i11, String str, String str2, String str3, String str4, List<ZRu> list, String str5, int[][] iArr) {
        this.ZRu = i10;
        this.NOt = i11;
        this.mZ = str;
        this.uR = str2;
        this.TFq = str3;
        this.Ht = str4;
        this.Mm = list;
        this.FA = str5;
        this.Vor = iArr;
    }

    public String FA() {
        return this.uR;
    }

    public int[][] Ht() {
        return this.Vor;
    }

    public String Mm() {
        return this.mZ;
    }

    public int NOt() {
        return this.NOt;
    }

    public String TFq() {
        return this.FA;
    }

    public String Vor() {
        return this.TFq;
    }

    public int ZRu() {
        return this.ZRu;
    }

    public Bitmap aT() {
        return this.aT;
    }

    public List<ZRu> mZ() {
        return this.Mm;
    }

    public String uR() {
        return this.Ht;
    }

    public void ZRu(Bitmap bitmap) {
        this.aT = bitmap;
    }
}

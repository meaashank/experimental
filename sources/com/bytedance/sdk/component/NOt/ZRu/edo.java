package com.bytedance.sdk.component.NOt.ZRu;

/* JADX INFO: loaded from: classes2.dex */
public class edo {
    public ZRu Ht;
    public byte[] TFq;
    public Vor mZ;
    public String uR;

    public enum ZRu {
        STRING_TYPE,
        BYTE_ARRAY_TYPE
    }

    public edo() {
    }

    public String ZRu() {
        return this.uR;
    }

    public edo(Vor vor, String str, ZRu zRu) {
        this.mZ = vor;
        this.uR = str;
        this.Ht = zRu;
    }

    public static edo ZRu(Vor vor, String str) {
        return new edo(vor, str, ZRu.STRING_TYPE);
    }

    public static edo ZRu(Vor vor, byte[] bArr) {
        return new edo(vor, bArr, ZRu.BYTE_ARRAY_TYPE);
    }

    public edo(Vor vor, byte[] bArr, ZRu zRu) {
        this.mZ = vor;
        this.TFq = bArr;
        this.Ht = zRu;
    }
}

package com.bytedance.sdk.component.Mm;

import com.bytedance.sdk.component.NOt.ZRu.aT;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class NOt {
    final long Ht;
    aT Mm;
    final String NOt;
    final long TFq;
    private final boolean Vor;
    final int ZRu;
    final Map<String, String> mZ;
    final String uR;
    private File FA = null;
    private byte[] aT = null;

    public NOt(boolean z10, int i10, String str, Map<String, String> map, String str2, long j10, long j11) {
        this.Vor = z10;
        this.ZRu = i10;
        this.NOt = str;
        this.mZ = map;
        this.uR = str2;
        this.TFq = j10;
        this.Ht = j11;
    }

    public boolean Ht() {
        return this.Vor;
    }

    public aT Mm() {
        return this.Mm;
    }

    public String NOt() {
        return this.NOt;
    }

    public File TFq() {
        return this.FA;
    }

    public int ZRu() {
        return this.ZRu;
    }

    public Map<String, String> mZ() {
        return this.mZ;
    }

    public String uR() {
        return this.uR;
    }

    public void ZRu(File file) {
        this.FA = file;
    }

    public void ZRu(byte[] bArr) {
        this.aT = bArr;
    }

    public void ZRu(aT aTVar) {
        this.Mm = aTVar;
    }
}

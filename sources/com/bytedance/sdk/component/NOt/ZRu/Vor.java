package com.bytedance.sdk.component.NOt.ZRu;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class Vor {
    private String NOt;
    private String ZRu;

    private Vor(String str) {
        this.ZRu = str;
    }

    public static Vor ZRu(String str) {
        return new Vor(str);
    }

    public String ZRu() {
        return this.ZRu;
    }

    public Charset ZRu(Charset charset) {
        try {
            String str = this.NOt;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}

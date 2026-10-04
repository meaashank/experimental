package com.inmobi.media;

import java.util.BitSet;

/* JADX INFO: loaded from: classes5.dex */
public abstract class X3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M1 f152584a;

    public X3(String b64feature) {
        kotlin.jvm.internal.G.p(b64feature, "b64feature");
        M1 m12 = new M1();
        this.f152584a = m12;
        m12.a(b64feature);
    }

    public final boolean a(boolean z10) {
        BitSet bitSet = this.f152584a.f152211a;
        return bitSet != null ? bitSet.get(0) : z10;
    }
}

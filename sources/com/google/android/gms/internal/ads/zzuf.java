package com.google.android.gms.internal.ads;

import java.util.function.Function;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzuf implements Function {
    static final /* synthetic */ zzuf zza = new zzuf();

    private /* synthetic */ zzuf() {
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        return new Integer(Integer.bitCount(((Integer) obj).intValue()));
    }
}

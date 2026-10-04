package com.google.android.gms.internal.ads;

import fd.InterfaceC4418a;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class zziiv implements Map.Entry, InterfaceC4418a {
    private final /* synthetic */ Map.Entry zza;

    public zziiv(@NotNull Map.Entry delegate) {
        kotlin.jvm.internal.G.p(delegate, "delegate");
        this.zza = delegate;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zza.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

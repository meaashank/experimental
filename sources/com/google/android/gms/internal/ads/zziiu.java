package com.google.android.gms.internal.ads;

import fd.InterfaceC4418a;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class zziiu extends zziir implements Set, InterfaceC4418a {

    @NotNull
    private final Set zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziiu(@NotNull Set delegate) {
        super(delegate);
        kotlin.jvm.internal.G.p(delegate, "delegate");
        this.zza = delegate;
    }

    @Override // com.google.android.gms.internal.ads.zziir, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return super.contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zziir, java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator iterator() {
        return new zziit(this.zza.iterator());
    }
}

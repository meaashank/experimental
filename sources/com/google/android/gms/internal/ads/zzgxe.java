package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgxe extends zzgxb implements Queue {
    @Override // java.util.Queue
    public final Object element() {
        return zza().element();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        return zza().offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return zza().peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return zza().poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return zza().remove();
    }

    public abstract Queue zza();

    @Override // com.google.android.gms.internal.ads.zzgxb
    public /* bridge */ /* synthetic */ Collection zzc() {
        throw null;
    }
}

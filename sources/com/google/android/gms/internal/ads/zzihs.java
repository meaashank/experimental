package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzihs implements Iterator {
    final /* synthetic */ zzihu zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzihs(zzihu zzihuVar, byte[] bArr) {
        Objects.requireNonNull(zzihuVar);
        this.zza = zzihuVar;
        this.zzb = -1;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzk().entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.zzb + 1;
        zzihu zzihuVar = this.zza;
        if (i10 >= zzihuVar.zzj()) {
            return !zzihuVar.zzk().isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i10 = this.zzb + 1;
        this.zzb = i10;
        zzihu zzihuVar = this.zza;
        return i10 < zzihuVar.zzj() ? (zzihr) zzihuVar.zzi()[i10] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzihu zzihuVar = this.zza;
        zzihuVar.zzh();
        int i10 = this.zzb;
        if (i10 >= zzihuVar.zzj()) {
            zza().remove();
        } else {
            this.zzb = i10 - 1;
            zzihuVar.zzg(i10);
        }
    }
}

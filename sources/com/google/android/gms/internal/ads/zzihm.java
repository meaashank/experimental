package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
final class zzihm implements Iterator {
    private final ArrayDeque zza;
    private zzief zzb;

    public /* synthetic */ zzihm(zziei zzieiVar, byte[] bArr) {
        if (!(zzieiVar instanceof zzihn)) {
            this.zza = null;
            this.zzb = (zzief) zzieiVar;
            return;
        }
        zzihn zzihnVar = (zzihn) zzieiVar;
        ArrayDeque arrayDeque = new ArrayDeque(zzihnVar.zzp());
        this.zza = arrayDeque;
        arrayDeque.push(zzihnVar);
        this.zzb = zzb(zzihnVar.zzo());
    }

    private final zzief zzb(zziei zzieiVar) {
        while (zzieiVar instanceof zzihn) {
            zzihn zzihnVar = (zzihn) zzieiVar;
            this.zza.push(zzihnVar);
            zzieiVar = zzihnVar.zzo();
        }
        return (zzief) zzieiVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzief next() {
        zzief zziefVarZzb;
        zzief zziefVar = this.zzb;
        if (zziefVar == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zziefVarZzb = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zziefVarZzb = zzb(((zzihn) arrayDeque.pop()).zzF());
        } while (zziefVarZzb.zzs());
        this.zzb = zziefVarZzb;
        return zziefVar;
    }
}

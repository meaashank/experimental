package com.google.android.gms.internal.consent_sdk;

import U6.j;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzdm implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzdo zzb;

    public zzdm(zzdo zzdoVar, CharSequence charSequence) {
        this.zza = charSequence;
        Objects.requireNonNull(zzdoVar);
        this.zzb = zzdoVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return zzdo.zzc(this.zzb, this.zza);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb2.append(zzdi.zza(it.next(), j.f68738d));
                while (it.hasNext()) {
                    sb2.append((CharSequence) j.f68738d);
                    sb2.append(zzdi.zza(it.next(), j.f68738d));
                }
            }
            sb2.append(']');
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}

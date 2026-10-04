package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.fragment.app.C2564b;

/* JADX INFO: loaded from: classes4.dex */
public final class zzahi {
    public final zzahl zza;
    public final zzahl zzb;

    public zzahi(zzahl zzahlVar, zzahl zzahlVar2) {
        this.zza = zzahlVar;
        this.zzb = zzahlVar2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahi.class == obj.getClass()) {
            zzahi zzahiVar = (zzahi) obj;
            if (this.zza.equals(zzahiVar.zza) && this.zzb.equals(zzahiVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        zzahl zzahlVar = this.zza;
        zzahl zzahlVar2 = this.zzb;
        String string = zzahlVar.toString();
        String strConcat = zzahlVar.equals(zzahlVar2) ? "" : U6.j.f68738d.concat(zzahlVar2.toString());
        return C2564b.a(new StringBuilder(com.bytedance.sdk.component.utils.a.a(strConcat, string.length() + 1, 1)), "[", string, strConcat, "]");
    }
}

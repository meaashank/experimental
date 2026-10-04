package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class zzico {
    @Deprecated
    public zzico() {
    }

    public final String toString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            zzidn zzidnVar = new zzidn(zzidi.zza(sb2));
            zzidnVar.zza(zzict.LENIENT);
            zzidj.zza.zza(zzidnVar, this);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public String zzd() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final zzicq zze() {
        if (this instanceof zzicq) {
            return (zzicq) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    public final zzicn zzf() {
        if (this instanceof zzicn) {
            return (zzicn) this;
        }
        throw new IllegalStateException("Not a JSON Array: ".concat(toString()));
    }

    public final zzics zzg() {
        if (this instanceof zzics) {
            return (zzics) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: ".concat(toString()));
    }
}

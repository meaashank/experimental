package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
final class zzhmq extends zzicu {
    public static final zzico zza(zzidl zzidlVar) throws IOException {
        String strZzh;
        int iZzm = zzidlVar.zzm();
        zzico zzicoVarZzc = zzc(zzidlVar, iZzm);
        if (zzicoVarZzc == null) {
            return zzb(zzidlVar, iZzm);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (zzidlVar.zzf()) {
                if (zzicoVarZzc instanceof zzicq) {
                    strZzh = zzidlVar.zzh();
                    if (!zzhms.zza(strZzh)) {
                        throw new IOException("illegal characters in string");
                    }
                } else {
                    strZzh = null;
                }
                int iZzm2 = zzidlVar.zzm();
                zzico zzicoVarZzc2 = zzc(zzidlVar, iZzm2);
                zzico zzicoVarZzb = zzicoVarZzc2 == null ? zzb(zzidlVar, iZzm2) : zzicoVarZzc2;
                if (zzicoVarZzc instanceof zzicn) {
                    ((zzicn) zzicoVarZzc).zza(zzicoVarZzb);
                } else {
                    zzicq zzicqVar = (zzicq) zzicoVarZzc;
                    if (zzicqVar.zzc(strZzh)) {
                        throw new IOException("duplicate key: ".concat(String.valueOf(strZzh)));
                    }
                    zzicqVar.zza(strZzh, zzicoVarZzb);
                }
                if (zzicoVarZzc2 != null) {
                    arrayDeque.addLast(zzicoVarZzc);
                    if (arrayDeque.size() > 100) {
                        throw new IOException("too many recursions");
                    }
                    zzicoVarZzc = zzicoVarZzb;
                } else {
                    continue;
                }
            } else {
                if (zzicoVarZzc instanceof zzicn) {
                    zzidlVar.zzc();
                } else {
                    zzidlVar.zze();
                }
                if (arrayDeque.isEmpty()) {
                    return zzicoVarZzc;
                }
                zzicoVarZzc = (zzico) arrayDeque.removeLast();
            }
        }
    }

    private static final zzico zzb(zzidl zzidlVar, int i10) throws IOException {
        int i11 = i10 - 1;
        if (i11 == 5) {
            String strZzi = zzidlVar.zzi();
            if (zzhms.zza(strZzi)) {
                return new zzics(strZzi);
            }
            throw new IOException("illegal characters in string");
        }
        if (i11 == 6) {
            return new zzics(new zzhmr(zzidlVar.zzi()));
        }
        if (i11 == 7) {
            return new zzics(Boolean.valueOf(zzidlVar.zzj()));
        }
        if (i11 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(zzidm.zza(i10)));
        }
        zzidlVar.zzk();
        return zzicp.zza;
    }

    @Nullable
    private static final zzico zzc(zzidl zzidlVar, int i10) throws IOException {
        int i11 = i10 - 1;
        if (i11 == 0) {
            zzidlVar.zzb();
            return new zzicn();
        }
        if (i11 != 2) {
            return null;
        }
        zzidlVar.zzd();
        return new zzicq();
    }
}

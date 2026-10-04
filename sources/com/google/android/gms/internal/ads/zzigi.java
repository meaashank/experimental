package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzigi {
    public static final List zza(Object obj, long j10) {
        zzify zzifyVar = (zzify) zziih.zzl(obj, j10);
        if (zzifyVar.zza()) {
            return zzifyVar;
        }
        int size = zzifyVar.size();
        zzify zzifyVarZzh = zzifyVar.zzh(size == 0 ? 10 : size + size);
        zziih.zzm(obj, j10, zzifyVarZzh);
        return zzifyVarZzh;
    }
}

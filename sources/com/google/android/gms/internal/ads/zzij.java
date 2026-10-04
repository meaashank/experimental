package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzij extends zzih {
    public final int zzc;

    public zzij(int i10, @Nullable String str, @Nullable IOException iOException, Map map, zzhw zzhwVar, byte[] bArr) {
        super(androidx.multidex.d.a(new StringBuilder(String.valueOf(i10).length() + 15), "Response code: ", i10), iOException, zzhwVar, 2004, 1);
        this.zzc = i10;
    }
}

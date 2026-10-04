package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzzs extends zzat {
    public final zzgxm zzc;

    public zzzs(String str, Uri uri, List list) {
        super(str, null, false, 1);
        this.zzc = zzgxm.zzq(list);
    }

    @Override // com.google.android.gms.internal.ads.zzat, java.lang.Throwable
    public final String getMessage() {
        zzgxm zzgxmVar = this.zzc;
        String message = super.getMessage();
        if (zzgxmVar.isEmpty()) {
            return message;
        }
        int length = message.length();
        String strValueOf = String.valueOf(zzgxmVar);
        return androidx.compose.animation.core.E0.a(new StringBuilder(length + 17 + strValueOf.length()), message, "\nsniff failures: ", strValueOf);
    }
}

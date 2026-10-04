package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzctn implements zzcsl {

    @Nullable
    private final CookieManager zza;

    public zzctn(Context context) {
        this.zza = com.google.android.gms.ads.internal.zzt.zzf().zza(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcsl
    public final void zza(Map map) {
        CookieManager cookieManager = this.zza;
        if (cookieManager == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            cookieManager.setCookie((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbE), str);
            return;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbE);
        String cookie = cookieManager.getCookie(str2);
        if (cookie != null) {
            List listZzg = zzguz.zza(zzgty.zzd(';')).zzg(cookie);
            for (int i10 = 0; i10 < listZzg.size(); i10++) {
                Iterator it = zzguz.zza(zzgty.zzd(SignatureVisitor.INSTANCEOF)).zzf((String) listZzg.get(i10)).iterator();
                it.getClass();
                if (!it.hasNext()) {
                    throw new IndexOutOfBoundsException(com.google.android.gms.ads.internal.util.d.a(new StringBuilder(String.valueOf(0).length() + 70), "position (0) must be less than the number of elements that remained (", 0, ")"));
                }
                cookieManager.setCookie(str2, String.valueOf((String) it.next()).concat(String.valueOf((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbp))));
            }
        }
    }
}

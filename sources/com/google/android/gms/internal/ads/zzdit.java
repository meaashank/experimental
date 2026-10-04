package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdit extends zzdjn implements zzboz {
    public zzdit(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzboz
    public final synchronized void zzb(final String str, final String str2) {
        zzs(new zzdjm() { // from class: com.google.android.gms.internal.ads.zzdis
            @Override // com.google.android.gms.internal.ads.zzdjm
            public final /* synthetic */ void zza(Object obj) {
                ((AppEventListener) obj).onAppEvent(str, str2);
            }
        });
    }
}

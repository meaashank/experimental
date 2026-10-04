package com.google.android.play.core.hsdp.service;

import U6.j;
import android.os.Bundle;
import android.support.v4.media.e;
import android.util.Log;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkService;
import e.g0;

/* JADX INFO: loaded from: classes4.dex */
final class zzay {
    private int zza = 1;
    private HsdpDeepLinkService.HsdpDeepLinkServiceListener zzb;
    private final String zzc;

    public zzay(String str, HsdpDeepLinkService.HsdpDeepLinkServiceListener hsdpDeepLinkServiceListener) {
        this.zzc = str;
        this.zzb = hsdpDeepLinkServiceListener;
    }

    public final String toString() {
        int i10 = this.zza;
        String strValueOf = String.valueOf(this.zzb);
        StringBuilder sb2 = new StringBuilder("HsdpOverlay{'");
        sb2.append(this.zzc);
        sb2.append("': ");
        sb2.append(i10);
        sb2.append(j.f68738d);
        return e.a(sb2, strValueOf, "}");
    }

    public final HsdpDeepLinkService.HsdpDeepLinkServiceListener zza() {
        return this.zzb;
    }

    public final void zzb(HsdpDeepLinkService.HsdpDeepLinkServiceListener hsdpDeepLinkServiceListener) {
        this.zzb = hsdpDeepLinkServiceListener;
    }

    public final boolean zzc() {
        return this.zza == 2;
    }

    @g0
    public final boolean zzd(int i10) {
        int i11 = this.zza;
        if (i11 == i10) {
            Log.w("HsdpOverlay", "targetPackage: " + this.zzc + " status was already set to " + i10);
            return false;
        }
        if (i11 == 4) {
            Log.w("HsdpOverlay", "targetPackage: " + this.zzc + " status was destroyed so cannot be updated");
            return false;
        }
        if (Log.isLoggable("HsdpOverlay", 4)) {
            StringBuilder sbA = androidx.constraintlayout.widget.e.a("targetPackage: ", this.zzc, " status: ", this.zza, "->");
            sbA.append(i10);
            Log.i("HsdpOverlay", sbA.toString());
        }
        if (i10 == 2) {
            Bundle bundle = new Bundle();
            bundle.putString("targetPackage", this.zzc);
            this.zzb.onShown(bundle);
        } else if (i10 == 3) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("targetPackage", this.zzc);
            this.zzb.onDismissed(bundle2);
        } else if (i10 != 4) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("targetPackage", this.zzc);
            bundle3.putBoolean("dldpRedirect", true);
            this.zzb.onDismissed(bundle3);
        } else if (this.zza == 2) {
            Bundle bundle4 = new Bundle();
            bundle4.putString("targetPackage", this.zzc);
            bundle4.putString("errorMessage", "HSDP overlay destroyed");
            this.zzb.onDismissed(bundle4);
        }
        this.zza = i10;
        return true;
    }
}

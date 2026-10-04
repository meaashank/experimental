package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgdk {
    private static zzgdk zzb;
    final zzgdl zza;

    private zzgdk(Context context) {
        this.zza = zzgdl.zza(context);
    }

    public static final zzgdk zza(Context context) {
        zzgdk zzgdkVar;
        synchronized (zzgdk.class) {
            try {
                if (zzb == null) {
                    zzb = new zzgdk(context);
                }
                zzgdkVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgdkVar;
    }

    public final void zzb(boolean z10) throws IOException {
        synchronized (zzgdk.class) {
            try {
                zzgdl zzgdlVar = this.zza;
                zzgdlVar.zzb("paidv2_publisher_option", Boolean.valueOf(z10));
                if (!z10) {
                    zzgdlVar.zzf("paidv2_creation_time");
                    zzgdlVar.zzf("paidv2_id");
                    zzgdlVar.zzf("vendor_scoped_gpid_v2_id");
                    zzgdlVar.zzf("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzc() {
        boolean zZze;
        synchronized (zzgdk.class) {
            zZze = this.zza.zze("paidv2_publisher_option", true);
        }
        return zZze;
    }

    public final void zzd(boolean z10) throws IOException {
        synchronized (zzgdk.class) {
            this.zza.zzb("paidv2_user_option", Boolean.valueOf(z10));
        }
    }

    public final boolean zze() {
        boolean zZze;
        synchronized (zzgdk.class) {
            zZze = this.zza.zze("paidv2_user_option", true);
        }
        return zZze;
    }
}

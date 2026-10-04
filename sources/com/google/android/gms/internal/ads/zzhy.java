package com.google.android.gms.internal.ads;

import U6.b;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhy implements zzhs {
    private final Context zza;
    private final List zzb = new ArrayList();
    private final zzhs zzc;

    @Nullable
    private zzhs zzd;

    @Nullable
    private zzhs zze;

    @Nullable
    private zzhs zzf;

    @Nullable
    private zzhs zzg;

    @Nullable
    private zzhs zzh;

    @Nullable
    private zzhs zzi;

    @Nullable
    private zzhs zzj;

    @Nullable
    private zzhs zzk;

    public zzhy(Context context, zzhs zzhsVar) {
        this.zza = context.getApplicationContext();
        this.zzc = zzhsVar;
    }

    private final zzhs zzf() {
        if (this.zze == null) {
            zzhj zzhjVar = new zzhj(this.zza);
            this.zze = zzhjVar;
            zzg(zzhjVar);
        }
        return this.zze;
    }

    private final void zzg(zzhs zzhsVar) {
        int i10 = 0;
        while (true) {
            List list = this.zzb;
            if (i10 >= list.size()) {
                return;
            }
            zzhsVar.zze((zziq) list.get(i10));
            i10++;
        }
    }

    private static final void zzh(@Nullable zzhs zzhsVar, zziq zziqVar) {
        if (zzhsVar != null) {
            zzhsVar.zze(zziqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        zzhs zzhsVar = this.zzk;
        zzhsVar.getClass();
        return zzhsVar.zza(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final long zzb(zzhw zzhwVar) throws IOException {
        zzhs zzhsVar;
        zzguk.zzi(this.zzk == null);
        Uri uri = zzhwVar.zza;
        String scheme = uri.getScheme();
        String str = zzfm.zza;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || Objects.equals(scheme2, b.h.f68653a)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.zzd == null) {
                    zzif zzifVar = new zzif();
                    this.zzd = zzifVar;
                    zzg(zzifVar);
                }
                this.zzk = this.zzd;
            } else {
                this.zzk = zzf();
            }
        } else if ("asset".equals(scheme)) {
            this.zzk = zzf();
        } else if ("content".equals(scheme)) {
            if (this.zzf == null) {
                zzhp zzhpVar = new zzhp(this.zza);
                this.zzf = zzhpVar;
                zzg(zzhpVar);
            }
            this.zzk = this.zzf;
        } else if ("rtmp".equals(scheme)) {
            if (this.zzg == null) {
                try {
                    zzhs zzhsVar2 = (zzhs) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                    this.zzg = zzhsVar2;
                    zzg(zzhsVar2);
                } catch (ClassNotFoundException unused) {
                    zzeh.zzc("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating RTMP extension", e10);
                }
                if (this.zzg == null) {
                    this.zzg = this.zzc;
                }
            }
            this.zzk = this.zzg;
        } else if ("udp".equals(scheme)) {
            if (this.zzh == null) {
                zzis zzisVar = new zzis(2000);
                this.zzh = zzisVar;
                zzg(zzisVar);
            }
            this.zzk = this.zzh;
        } else if ("data".equals(scheme)) {
            if (this.zzi == null) {
                zzhq zzhqVar = new zzhq();
                this.zzi = zzhqVar;
                zzg(zzhqVar);
            }
            this.zzk = this.zzi;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.zzj == null) {
                    zzio zzioVar = new zzio(this.zza);
                    this.zzj = zzioVar;
                    zzg(zzioVar);
                }
                zzhsVar = this.zzj;
            } else {
                zzhsVar = this.zzc;
            }
            this.zzk = zzhsVar;
        }
        return this.zzk.zzb(zzhwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    @Nullable
    public final Uri zzc() {
        zzhs zzhsVar = this.zzk;
        if (zzhsVar == null) {
            return null;
        }
        return zzhsVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zzd() throws IOException {
        zzhs zzhsVar = this.zzk;
        if (zzhsVar != null) {
            try {
                zzhsVar.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zze(zziq zziqVar) {
        zziqVar.getClass();
        this.zzc.zze(zziqVar);
        this.zzb.add(zziqVar);
        zzh(this.zzd, zziqVar);
        zzh(this.zze, zziqVar);
        zzh(this.zzf, zziqVar);
        zzh(this.zzg, zziqVar);
        zzh(this.zzh, zziqVar);
        zzh(this.zzi, zziqVar);
        zzh(this.zzj, zziqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final Map zzj() {
        zzhs zzhsVar = this.zzk;
        return zzhsVar == null ? Collections.EMPTY_MAP : zzhsVar.zzj();
    }
}

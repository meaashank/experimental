package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaja implements zzagh {
    private final zzagh zza;

    @Nullable
    private final zzagh zzb;
    private zzagk zzc;
    private zzagh zzd;

    @Nullable
    private Pair zze;

    public zzaja() {
        this(0);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean zza(zzagi zzagiVar) throws IOException {
        if (this.zzb.zza(zzagiVar)) {
            return true;
        }
        zzagiVar.zzl();
        return this.zza.zza(zzagiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public /* synthetic */ List zzb() {
        return C3365x.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzagk zzagkVar) {
        this.zzc = zzagkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzd(zzagi zzagiVar, zzahh zzahhVar) throws IOException {
        if (this.zzd == null) {
            zzagh zzaghVar = this.zzb;
            if (!zzaghVar.zza(zzagiVar)) {
                zzaghVar = this.zza;
            }
            this.zzd = zzaghVar;
            zzagiVar.zzl();
            Pair pair = this.zze;
            if (pair != null) {
                this.zzd.zze(((Long) pair.first).longValue(), ((Long) this.zze.second).longValue());
                this.zze = null;
            }
            zzagh zzaghVar2 = this.zzd;
            zzagk zzagkVar = this.zzc;
            zzagkVar.getClass();
            zzaghVar2.zzc(zzagkVar);
        }
        return this.zzd.zzd(zzagiVar, zzahhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j10, long j11) {
        zzagh zzaghVar = this.zzd;
        if (zzaghVar != null) {
            zzaghVar.zze(j10, j11);
        } else {
            this.zze = Pair.create(Long.valueOf(j10), Long.valueOf(j11));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public /* synthetic */ zzagh zzg() {
        return C3365x.b(this);
    }

    public zzaja(int i10) {
        this.zza = new zzahm(DefaultImageHeaderParser.f139848e, 2, "image/jpeg");
        this.zzb = new zzajb();
    }
}

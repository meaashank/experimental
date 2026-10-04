package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class zzaoc implements zzaht {
    private final zzaht zza;
    private final zzanx zzb;

    @Nullable
    private zzanz zzg;
    private zzv zzh;
    private boolean zzi;
    private int zzd = 0;
    private int zze = 0;
    private byte[] zzf = zzfm.zzb;
    private final zzeu zzc = new zzeu();

    public zzaoc(zzaht zzahtVar, zzanx zzanxVar) {
        this.zza = zzahtVar;
        this.zzb = zzanxVar;
    }

    private final void zzi(int i10) {
        int length = this.zzf.length;
        int i11 = this.zze;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.zzd;
        int iMax = Math.max(i12 + i12, i10 + i12);
        byte[] bArr = this.zzf;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.zzd, bArr2, 0, i12);
        this.zzd = 0;
        this.zze = i12;
        this.zzf = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final void zzA(zzv zzvVar) {
        String str = zzvVar.zzp;
        str.getClass();
        zzguk.zza(zzas.zzf(str) == 3);
        if (!zzvVar.equals(this.zzh)) {
            this.zzh = zzvVar;
            zzanx zzanxVar = this.zzb;
            this.zzg = zzanxVar.zza(zzvVar) ? zzanxVar.zzc(zzvVar) : null;
        }
        if (this.zzg == null) {
            this.zza.zzA(zzvVar);
            return;
        }
        zzaht zzahtVar = this.zza;
        zzt zztVarZza = zzvVar.zza();
        zztVarZza.zzo("application/x-media3-cues");
        zztVarZza.zzk(str);
        zztVarZza.zzt(Long.MAX_VALUE);
        zztVarZza.zzO(this.zzb.zzb(zzvVar));
        zzahtVar.zzA(zztVarZza.zzQ());
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public /* synthetic */ void zzP(long j10) {
        A.a(this, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public /* synthetic */ int zza(zzj zzjVar, int i10, boolean z10) {
        return A.b(this, zzjVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final int zzb(zzj zzjVar, int i10, boolean z10, int i11) throws IOException {
        if (this.zzg == null) {
            return this.zza.zzb(zzjVar, i10, z10, 0);
        }
        zzi(i10);
        int iZza = zzjVar.zza(this.zzf, this.zze, i10);
        if (iZza != -1) {
            this.zze += iZza;
            return iZza;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public /* synthetic */ void zzc(zzeu zzeuVar, int i10) {
        A.c(this, zzeuVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final void zzd(zzeu zzeuVar, int i10, int i11) {
        if (this.zzg == null) {
            this.zza.zzd(zzeuVar, i10, i11);
            return;
        }
        zzi(i10);
        zzeuVar.zzm(this.zzf, this.zze, i10);
        this.zze += i10;
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final void zze(final long j10, final int i10, int i11, int i12, @Nullable zzahs zzahsVar) {
        if (this.zzg == null) {
            this.zza.zze(j10, i10, i11, i12, zzahsVar);
            return;
        }
        zzguk.zzb(zzahsVar == null, "DRM on subtitles is not supported");
        int i13 = (this.zze - i12) - i11;
        try {
            this.zzg.zza(this.zzf, i13, i11, zzany.zza(), new zzdu() { // from class: com.google.android.gms.internal.ads.zzaob
                @Override // com.google.android.gms.internal.ads.zzdu
                public final /* synthetic */ void zza(Object obj) {
                    this.zza.zzh(j10, i10, (zzanr) obj);
                }
            });
        } catch (RuntimeException e10) {
            if (!this.zzi) {
                throw e10;
            }
            zzeh.zzd("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e10);
        }
        int i14 = i13 + i11;
        this.zzd = i14;
        if (i14 == this.zze) {
            this.zzd = 0;
            this.zze = 0;
        }
    }

    public final void zzf(boolean z10) {
        this.zzi = true;
    }

    public final /* synthetic */ void zzh(long j10, int i10, zzanr zzanrVar) {
        this.zzh.getClass();
        zzgxm zzgxmVar = zzanrVar.zza;
        long j11 = zzanrVar.zzc;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzgxmVar.size());
        Iterator<E> it = zzgxmVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzcy) it.next()).zzb());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(a7.c.f84756a, arrayList);
        bundle.putLong(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, j11);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        zzeu zzeuVar = this.zzc;
        int length = bArrMarshall.length;
        zzeuVar.zzb(bArrMarshall, length);
        zzaht zzahtVar = this.zza;
        zzahtVar.zzc(zzeuVar, length);
        long j12 = zzanrVar.zzb;
        if (j12 == -9223372036854775807L) {
            zzguk.zzi(this.zzh.zzu == Long.MAX_VALUE);
        } else {
            long j13 = this.zzh.zzu;
            j10 = j13 == Long.MAX_VALUE ? j10 + j12 : j12 + j13;
        }
        zzahtVar.zze(j10, i10 | 1, length, 0, null);
    }
}

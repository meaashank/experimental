package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import e.InterfaceC4326A;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzats implements Comparable {
    private final zzaud zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;

    @Nullable
    @InterfaceC4326A("mLock")
    private final zzatw zzf;
    private Integer zzg;
    private zzatv zzh;

    @InterfaceC4326A("mLock")
    private boolean zzi;

    @Nullable
    private zzatb zzj;

    @InterfaceC4326A("mLock")
    private zzatr zzk;
    private final zzatg zzl;

    public zzats(int i10, String str, @Nullable zzatw zzatwVar) {
        Uri uri;
        String host;
        this.zza = zzaud.zza ? new zzaud() : null;
        this.zze = new Object();
        int iHashCode = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i10;
        this.zzc = str;
        this.zzf = zzatwVar;
        this.zzl = new zzatg();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.zzd = iHashCode;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzats) obj).zzg.intValue();
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzl();
        Integer num = this.zzg;
        String str = this.zzc;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(num).length();
        String strConcat = "0x".concat(strValueOf);
        StringBuilder sb2 = new StringBuilder(strConcat.length() + length + 5 + 8 + length2);
        androidx.room.F.a(sb2, "[ ] ", str, C4.q.f17581a, strConcat);
        sb2.append(" NORMAL ");
        sb2.append(num);
        return sb2.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final void zzc(String str) {
        if (zzaud.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzd(String str) {
        zzatv zzatvVar = this.zzh;
        if (zzatvVar != null) {
            zzatvVar.zzc(this);
        }
        if (zzaud.zza) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzatq(this, str, id2));
                return;
            }
            zzaud zzaudVar = this.zza;
            zzaudVar.zza(str, id2);
            zzaudVar.zzb(toString());
        }
    }

    public final void zze(int i10) {
        zzatv zzatvVar = this.zzh;
        if (zzatvVar != null) {
            zzatvVar.zzd(this, i10);
        }
    }

    public final zzats zzf(zzatv zzatvVar) {
        this.zzh = zzatvVar;
        return this;
    }

    public final zzats zzg(int i10) {
        this.zzg = Integer.valueOf(i10);
        return this;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final String zzi() {
        int i10 = this.zzb;
        String str = this.zzc;
        if (i10 == 0) {
            return str;
        }
        String string = Integer.toString(1);
        return androidx.compose.animation.core.E0.a(new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str).length()), string, com.prism.gaia.download.a.f164606q, str);
    }

    public final zzats zzj(zzatb zzatbVar) {
        this.zzj = zzatbVar;
        return this;
    }

    @Nullable
    public final zzatb zzk() {
        return this.zzj;
    }

    public final boolean zzl() {
        synchronized (this.zze) {
        }
        return false;
    }

    public Map zzm() throws zzata {
        return Collections.EMPTY_MAP;
    }

    public byte[] zzn() throws zzata {
        return null;
    }

    public final int zzo() {
        return this.zzl.zza();
    }

    public final void zzp() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    public final boolean zzq() {
        boolean z10;
        synchronized (this.zze) {
            z10 = this.zzi;
        }
        return z10;
    }

    public abstract zzaty zzr(zzato zzatoVar);

    public abstract void zzs(Object obj);

    public final void zzt(zzaub zzaubVar) {
        zzatw zzatwVar;
        synchronized (this.zze) {
            zzatwVar = this.zzf;
        }
        zzatwVar.zza(zzaubVar);
    }

    public final void zzu(zzatr zzatrVar) {
        synchronized (this.zze) {
            this.zzk = zzatrVar;
        }
    }

    public final void zzv(zzaty zzatyVar) {
        zzatr zzatrVar;
        synchronized (this.zze) {
            zzatrVar = this.zzk;
        }
        if (zzatrVar != null) {
            zzatrVar.zza(this, zzatyVar);
        }
    }

    public final void zzw() {
        zzatr zzatrVar;
        synchronized (this.zze) {
            zzatrVar = this.zzk;
        }
        if (zzatrVar != null) {
            zzatrVar.zzb(this);
        }
    }

    public final /* synthetic */ zzaud zzx() {
        return this.zza;
    }

    public final zzatg zzy() {
        return this.zzl;
    }
}

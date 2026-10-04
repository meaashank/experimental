package com.google.android.gms.internal.ads;

import com.android.launcher3.IconCache;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhij {

    @Nullable
    private zzhil zza;

    @Nullable
    private String zzb;

    @Nullable
    private zzhik zzc;

    @Nullable
    private zzhga zzd;

    private zzhij() {
        throw null;
    }

    public final zzhij zza(zzhil zzhilVar) {
        this.zza = zzhilVar;
        return this;
    }

    public final zzhij zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final zzhij zzc(zzhik zzhikVar) {
        this.zzc = zzhikVar;
        return this;
    }

    public final zzhij zzd(zzhga zzhgaVar) {
        this.zzd = zzhgaVar;
        return this;
    }

    public final zzhim zze() throws GeneralSecurityException {
        if (this.zza == null) {
            this.zza = zzhil.zzb;
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        zzhik zzhikVar = this.zzc;
        if (zzhikVar == null) {
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        zzhga zzhgaVar = this.zzd;
        if (zzhgaVar == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (zzhgaVar.zza()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((zzhikVar.equals(zzhik.zza) && (zzhgaVar instanceof zzhhd)) || ((zzhikVar.equals(zzhik.zzc) && (zzhgaVar instanceof zzhhs)) || ((zzhikVar.equals(zzhik.zzb) && (zzhgaVar instanceof zzhjo)) || ((zzhikVar.equals(zzhik.zzd) && (zzhgaVar instanceof zzhgm)) || ((zzhikVar.equals(zzhik.zze) && (zzhgaVar instanceof zzhgu)) || (zzhikVar.equals(zzhik.zzf) && (zzhgaVar instanceof zzhhm))))))) {
            return new zzhim(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
        String string = this.zzc.toString();
        String strValueOf = String.valueOf(this.zzd);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + string.length() + 67 + 1);
        androidx.room.F.a(sb2, "Cannot use parsing strategy ", string, " when new keys are picked according to ", strValueOf);
        sb2.append(IconCache.EMPTY_CLASS_NAME);
        throw new GeneralSecurityException(sb2.toString());
    }

    public /* synthetic */ zzhij(byte[] bArr) {
    }
}

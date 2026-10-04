package com.google.android.gms.internal.ads;

import androidx.compose.foundation.layout.C1709v0;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhfd implements zzhfe {
    private final List zza;
    private final Map zzb;

    @Nullable
    private final zzhfd zzc;

    private zzhfd(List list, Map map, zzhfd zzhfdVar) {
        this.zza = list;
        this.zzb = map;
        this.zzc = zzhfdVar;
    }

    public static final zzhfd zza(zzhuc zzhucVar) throws GeneralSecurityException {
        if (zzhucVar == null || zzhucVar.zzc() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new zzhfd(zzj(zzhucVar), new HashMap());
    }

    public static final zzhfd zzg(zzhfj zzhfjVar) throws GeneralSecurityException {
        zzhey zzheyVar = new zzhey();
        zzhew zzhewVar = new zzhew(zzhfjVar, null);
        zzhewVar.zzb();
        zzhewVar.zza();
        zzheyVar.zza(zzhewVar);
        return zzheyVar.zzb();
    }

    public static /* synthetic */ zzhfd zzi(final zzhfd zzhfdVar) {
        final zzhnh zzhnhVar = (zzhnh) zzhfdVar.zzf(zzhnh.class);
        if (zzhnhVar == null) {
            return zzhfdVar;
        }
        zzhez zzhezVar = new zzhez() { // from class: com.google.android.gms.internal.ads.zzhfc
            @Override // com.google.android.gms.internal.ads.zzhez
            public final /* synthetic */ void zza(zzhfb zzhfbVar) {
                zzhnr.zza().zzb().zza(this.zza, zzhnhVar, "keyset_handle", "get_key");
            }
        };
        List<zzhfb> list = zzhfdVar.zza;
        ArrayList arrayList = new ArrayList(list.size());
        for (zzhfb zzhfbVar : list) {
            arrayList.add(new zzhfb(zzhfbVar.zzf(), zzhfbVar.zzj(), zzhfbVar.zzg(), zzhfbVar.zzh(), zzhfbVar.zzi(), zzhezVar, null));
        }
        return new zzhfd(arrayList, zzhfdVar.zzb, zzhfdVar);
    }

    private static List zzj(zzhuc zzhucVar) throws GeneralSecurityException {
        zzhes zzhneVar;
        boolean z10;
        ArrayList arrayList = new ArrayList(zzhucVar.zzc());
        for (zzhub zzhubVar : zzhucVar.zzb()) {
            int iZzc = zzhubVar.zzc();
            try {
                zzhos zzhosVarZzl = zzl(zzhubVar);
                zzhnw zzhnwVarZza = zzhnw.zza();
                zzhfr zzhfrVarZza = zzhfr.zza();
                zzhneVar = !zzhnwVarZza.zzf(zzhosVarZzl) ? new zzhne(zzhosVarZzl, zzhfrVarZza) : zzhnwVarZza.zzg(zzhosVarZzl, zzhfrVarZza);
                z10 = false;
            } catch (GeneralSecurityException e10) {
                if (zzhlv.zza.zza()) {
                    throw e10;
                }
                zzhneVar = new zzhne(zzl(zzhubVar), zzhfr.zza());
                z10 = true;
            }
            if (zzhlv.zza.zza() && !zzm(zzhubVar.zzi())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            boolean z11 = true;
            int iZzi = zzhubVar.zzi();
            if (iZzc != zzhucVar.zza()) {
                z11 = false;
            }
            arrayList.add(new zzhfb(zzhneVar, iZzi, iZzc, z11, z10, zzhfb.zza, null));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private final zzhfd zzk() {
        zzhfd zzhfdVar = this.zzc;
        return zzhfdVar == null ? this : zzhfdVar;
    }

    private static zzhos zzl(zzhub zzhubVar) throws GeneralSecurityException {
        return zzhos.zza(zzhubVar.zzb().zza(), zzhubVar.zzb().zzb(), zzhor.zzc(zzhubVar.zzb().zzi()), zzhor.zzd(zzhubVar.zzj()), zzhubVar.zzj() == 5 ? null : Integer.valueOf(zzhubVar.zzc()));
    }

    private static boolean zzm(int i10) {
        int i11 = i10 - 2;
        return i11 == 1 || i11 == 2 || i11 == 3;
    }

    public final String toString() {
        zzhuc zzhucVarZzb = zzb();
        int i10 = zzhfu.zza;
        zzhud zzhudVarZza = zzhug.zza();
        zzhudVarZza.zza(zzhucVarZzb.zza());
        for (zzhub zzhubVar : zzhucVarZzb.zzb()) {
            zzhue zzhueVarZza = zzhuf.zza();
            zzhueVarZza.zza(zzhubVar.zzb().zza());
            zzhueVarZza.zzc(zzhubVar.zzi());
            zzhueVarZza.zzd(zzhubVar.zzj());
            zzhueVarZza.zzb(zzhubVar.zzc());
            zzhudVarZza.zzb((zzhuf) zzhueVarZza.zzbu());
        }
        return ((zzhug) zzhudVarZza.zzbu()).toString();
    }

    public final zzhuc zzb() {
        try {
            zzhtz zzhtzVarZzh = zzhuc.zzh();
            for (zzhfb zzhfbVar : this.zza) {
                zzhes zzhesVarZza = zzhfbVar.zza();
                int iZzj = zzhfbVar.zzj();
                int iZzc = zzhfbVar.zzc();
                zzhos zzhosVar = (zzhos) zzhnw.zza().zzh(zzhesVarZza, zzhos.class, zzhfr.zza());
                Integer numZzb = zzhesVarZza.zzb();
                if (numZzb != null && numZzb.intValue() != iZzc) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                zzhua zzhuaVarZzd = zzhub.zzd();
                zzhts zzhtsVarZzc = zzhtt.zzc();
                zzhtsVarZzc.zza(zzhosVar.zzg());
                zzhtsVarZzc.zzb(zzhosVar.zzb());
                zzhtsVarZzc.zzc(zzhor.zzb(zzhosVar.zzc()));
                zzhuaVarZzd.zzb(zzhtsVarZzc);
                zzhuaVarZzd.zzd(iZzj);
                zzhuaVarZzd.zzc(iZzc);
                zzhuaVarZzd.zze(zzhor.zze(zzhosVar.zzd()));
                zzhtzVarZzh.zzb((zzhub) zzhuaVarZzd.zzbu());
                if (zzhfbVar.zzd()) {
                    zzhtzVarZzh.zza(zzhfbVar.zzc());
                }
            }
            return (zzhuc) zzhtzVarZzh.zzbu();
        } catch (GeneralSecurityException e10) {
            throw new zzhpc(e10);
        }
    }

    public final zzhfb zzc() {
        for (zzhfb zzhfbVar : this.zza) {
            if (zzhfbVar != null && zzhfbVar.zzd()) {
                if (zzhfbVar.zzb() == zzheu.zza) {
                    return zzhfbVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    @Override // com.google.android.gms.internal.ads.zzhfe
    public final int zzd() {
        return this.zza.size();
    }

    public final zzhfb zze(int i10) {
        if (i10 < 0 || i10 >= zzd()) {
            int iZzd = zzd();
            throw new IndexOutOfBoundsException(C1709v0.a(new StringBuilder(String.valueOf(i10).length() + 34 + String.valueOf(iZzd).length()), "Invalid index ", i10, " for keyset of size ", iZzd));
        }
        List list = this.zza;
        zzhfb zzhfbVar = (zzhfb) list.get(i10);
        if (!zzm(zzhfbVar.zzj())) {
            throw new IllegalStateException(com.google.android.gms.ads.internal.util.d.a(new StringBuilder(String.valueOf(i10).length() + 42), "Keyset-Entry at position ", i10, " has wrong status"));
        }
        if (zzhfbVar.zzi()) {
            throw new IllegalStateException(com.google.android.gms.ads.internal.util.d.a(new StringBuilder(String.valueOf(i10).length() + 48), "Keyset-Entry at position ", i10, " didn't parse correctly"));
        }
        return (zzhfb) list.get(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhfe
    @Nullable
    public final zzhel zzf(Class cls) {
        return (zzhel) this.zzb.get(cls);
    }

    public final Object zzh(zzhep zzhepVar, Class cls) throws GeneralSecurityException {
        zzhuc zzhucVarZzb = zzk().zzb();
        int i10 = zzhfu.zza;
        int iZza = zzhucVarZzb.zza();
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (zzhub zzhubVar : zzhucVarZzb.zzb()) {
            if (zzhubVar.zzi() == 3) {
                if (!zzhubVar.zza()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzhubVar.zzc())));
                }
                if (zzhubVar.zzj() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzhubVar.zzc())));
                }
                if (zzhubVar.zzi() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzhubVar.zzc())));
                }
                if (zzhubVar.zzc() == iZza) {
                    if (z10) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z10 = true;
                }
                z11 &= zzhubVar.zzb().zzi() == 5;
                i11++;
            }
        }
        if (i11 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z10 && !z11) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        for (int i12 = 0; i12 < zzd(); i12++) {
            List list = this.zza;
            if (((zzhfb) list.get(i12)).zzi() || !zzm(((zzhfb) list.get(i12)).zzj())) {
                String strZza = zzhucVarZzb.zzd(i12).zzb().zza();
                StringBuilder sb2 = new StringBuilder(String.valueOf(strZza).length() + String.valueOf(i12).length() + 44 + 32);
                sb2.append("Key parsing of key with index ");
                sb2.append(i12);
                sb2.append(" and type_url ");
                sb2.append(strZza);
                sb2.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(sb2.toString());
            }
        }
        return zzhepVar.zza(zzk(), cls);
    }

    public /* synthetic */ zzhfd(List list, Map map, byte[] bArr) {
        this(list, map);
    }

    private zzhfd(List list, Map map) throws GeneralSecurityException {
        this.zza = list;
        this.zzb = map;
        if (zzhlv.zza.zza()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean zZzd = false;
            while (it.hasNext()) {
                zzhfb zzhfbVar = (zzhfb) it.next();
                if (!hashSet.contains(Integer.valueOf(zzhfbVar.zzc()))) {
                    hashSet.add(Integer.valueOf(zzhfbVar.zzc()));
                    zZzd |= zzhfbVar.zzd();
                } else {
                    int iZzc = zzhfbVar.zzc();
                    throw new GeneralSecurityException(com.google.android.gms.ads.internal.util.d.a(new StringBuilder(String.valueOf(iZzc).length() + 121), "KeyID ", iZzc, " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                }
            }
            if (!zZzd) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.zzc = null;
    }
}

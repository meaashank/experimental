package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhey {
    private final List zza = new ArrayList();
    private final Map zzb = new HashMap();
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzhew) it.next()).zzd(false);
        }
    }

    public final zzhey zza(zzhew zzhewVar) {
        if (zzhewVar.zzh() != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzhewVar.zzc()) {
            zzc();
        }
        zzhewVar.zzi(this);
        this.zza.add(zzhewVar);
        return this;
    }

    public final zzhfd zzb() throws GeneralSecurityException {
        int i10;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.zzc = true;
        List<zzhew> list = this.zza;
        ArrayList arrayList = new ArrayList(list.size());
        int i11 = 0;
        while (i11 < list.size() - 1) {
            int i12 = i11 + 1;
            if (((zzhew) list.get(i11)).zzg() == zzhex.zza && ((zzhew) list.get(i12)).zzg() != zzhex.zza) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i11 = i12;
        }
        HashSet hashSet = new HashSet();
        byte[] bArr = null;
        Integer num = null;
        for (zzhew zzhewVar : list) {
            zzhewVar.zze();
            if (zzhewVar.zzg() == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            int i13 = 3;
            if (zzhewVar.zzg() == zzhex.zza) {
                int i14 = 0;
                while (true) {
                    if (i14 != 0 && !hashSet.contains(Integer.valueOf(i14))) {
                        break;
                    }
                    int i15 = zzhpd.zza;
                    i14 = 0;
                    while (i14 == 0) {
                        byte[] bArrZza = zzhov.zza(4);
                        i14 = (bArrZza[3] & 255) | ((bArrZza[0] & 255) << 24) | ((bArrZza[1] & 255) << 16) | ((bArrZza[2] & 255) << 8);
                    }
                }
                i10 = i14;
            } else {
                zzhewVar.zzg();
                i10 = 0;
            }
            Integer numValueOf = Integer.valueOf(i10);
            if (hashSet.contains(numValueOf)) {
                int i16 = i10;
                throw new GeneralSecurityException(com.google.android.gms.ads.internal.util.d.a(new StringBuilder(String.valueOf(i16).length() + 31), "Id ", i16, " is used twice in the keyset"));
            }
            hashSet.add(numValueOf);
            zzhes zzhesVarZzc = zzhnn.zza().zzc(zzhewVar.zzf(), true != zzhewVar.zzf().zza() ? null : numValueOf);
            zzheu zzheuVarZze = zzhewVar.zze();
            zzheu zzheuVar = zzheu.zza;
            if (!zzheuVar.equals(zzheuVarZze)) {
                if (zzheu.zzb.equals(zzheuVarZze)) {
                    i13 = 4;
                } else {
                    if (!zzheu.zzc.equals(zzheuVarZze)) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    i13 = 5;
                }
            }
            zzhfb zzhfbVar = new zzhfb(zzhesVarZzc, i13, i10, zzhewVar.zzc(), false, zzhfb.zza, null);
            if (zzhewVar.zzc()) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (zzhewVar.zze() != zzheuVar) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = numValueOf;
            }
            arrayList.add(zzhfbVar);
        }
        if (num != null) {
            return zzhfd.zzi(new zzhfd(arrayList, this.zzb, bArr));
        }
        throw new GeneralSecurityException("No primary was set");
    }
}

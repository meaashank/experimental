package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgmd {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final zzinq zzd;
    private final zzgrh zze;

    public zzgmd(Context context, SharedPreferences sharedPreferences, zzinq zzinqVar, zzgrh zzgrhVar) {
        this.zzc = sharedPreferences;
        File dir = context.getDir("pccache2", 0);
        zzfzt.zzd(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache2", 0);
        zzfzt.zzd(dir2, true);
        this.zza = dir2;
        this.zzd = zzinqVar;
        this.zze = zzgrhVar;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(((zzbei) this.zzd.zzb()).zza()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        int iZza = ((zzbei) this.zzd.zzb()).zza();
        return androidx.multidex.d.a(new StringBuilder(String.valueOf(iZza).length() + 6), "FBAMTD", iZza);
    }

    private final String zzf() {
        int iZza = ((zzbei) this.zzd.zzb()).zza();
        return androidx.multidex.d.a(new StringBuilder(String.valueOf(iZza).length() + 6), "LATMTD", iZza);
    }

    public final boolean zza(zzggt zzggtVar, byte[] bArr, byte[] bArr2) {
        boolean z10;
        String strZza = zzggtVar.zza().zza();
        if (!TextUtils.isEmpty(strZza) && bArr2.length != 0) {
            File file = this.zza;
            zzfzt.zze(file);
            file.mkdirs();
            File fileZzc = zzfzt.zzc(strZza, file);
            fileZzc.getClass();
            fileZzc.mkdirs();
            File fileZza = zzfzt.zza(strZza, "pcam.jar", file);
            fileZza.getClass();
            if (bArr == null || bArr.length <= 0 || zzfzt.zzb(fileZza, bArr)) {
                File fileZza2 = zzfzt.zza(strZza, "pcbc", file);
                fileZza2.getClass();
                if (zzfzt.zzb(fileZza2, bArr2)) {
                    String strZza2 = zzggtVar.zza().zza();
                    if (TextUtils.isEmpty(strZza2)) {
                        z10 = false;
                    } else {
                        File fileZza3 = zzfzt.zza(strZza2, "pcam.jar", file);
                        fileZza3.getClass();
                        File fileZza4 = zzfzt.zza(strZza2, "pcbc", file);
                        fileZza4.getClass();
                        File fileZza5 = zzfzt.zza(strZza2, "pcam.jar", zzd());
                        fileZza5.getClass();
                        File fileZza6 = zzfzt.zza(strZza2, "pcbc", zzd());
                        fileZza6.getClass();
                        if (fileZza3.exists() && !fileZza3.renameTo(fileZza5)) {
                            this.zze.zzb(15318);
                        } else if (fileZza4.exists() && fileZza4.renameTo(fileZza6)) {
                            zzggt zzggtVarZzc = zzc(1);
                            SharedPreferences.Editor editorEdit = this.zzc.edit();
                            if (zzggtVarZzc != null && !zzggtVar.zza().zza().equals(zzggtVarZzc.zza().zza())) {
                                editorEdit.putString(zze(), Hex.bytesToStringLowercase(zzggtVarZzc.zzaN()));
                            }
                            editorEdit.putString(zzf(), Hex.bytesToStringLowercase(zzggtVar.zzaN()));
                            if (editorEdit.commit()) {
                                z10 = true;
                            } else {
                                this.zze.zzb(15320);
                            }
                        } else {
                            this.zze.zzb(15319);
                        }
                        z10 = false;
                    }
                    HashSet hashSet = new HashSet();
                    zzggt zzggtVarZzc2 = zzc(1);
                    if (zzggtVarZzc2 != null) {
                        hashSet.add(zzggtVarZzc2.zza().zza());
                    }
                    zzggt zzggtVarZzc3 = zzc(2);
                    if (zzggtVarZzc3 != null) {
                        hashSet.add(zzggtVarZzc3.zza().zza());
                    }
                    File[] fileArrListFiles = zzd().listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            String name = file2.getName();
                            if (!hashSet.contains(name)) {
                                File fileZzc2 = zzfzt.zzc(name, zzd());
                                fileZzc2.getClass();
                                zzfzt.zze(fileZzc2);
                            }
                        }
                    }
                    return z10;
                }
            }
        }
        this.zze.zzb(15316);
        return false;
    }

    public final zzfzr zzb(int i10) {
        zzggt zzggtVarZzc = zzc(1);
        if (zzggtVarZzc == null) {
            this.zze.zzb(15315);
            return null;
        }
        String strZza = zzggtVarZzc.zza().zza();
        File fileZza = zzfzt.zza(strZza, "pcam.jar", zzd());
        fileZza.getClass();
        if (!fileZza.exists()) {
            fileZza = zzfzt.zza(strZza, "pcam", zzd());
            fileZza.getClass();
        }
        File fileZza2 = zzfzt.zza(strZza, "pcopt", zzd());
        fileZza2.getClass();
        File fileZza3 = zzfzt.zza(strZza, "pcbc", zzd());
        fileZza3.getClass();
        return new zzfzr(zzggtVarZzc.zza(), fileZza, fileZza3, fileZza2);
    }

    public final zzggt zzc(int i10) {
        zzggt zzggtVarZze;
        String strZza;
        File fileZza;
        String string = i10 == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            zziei zzieiVar = zziei.zza;
            zzggtVarZze = zzggt.zze(zziei.zzt(bArrStringToBytes, 0, bArrStringToBytes.length));
            strZza = zzggtVarZze.zza().zza();
            fileZza = zzfzt.zza(strZza, "pcam.jar", zzd());
        } catch (zzige unused) {
            this.zze.zzb(15317);
        }
        if (fileZza == null) {
            throw null;
        }
        if (!fileZza.exists() && (fileZza = zzfzt.zza(strZza, "pcam", zzd())) == null) {
            throw null;
        }
        File fileZza2 = zzfzt.zza(strZza, "pcbc", zzd());
        if (fileZza2 == null) {
            throw null;
        }
        if (fileZza.exists() && fileZza2.exists()) {
            return zzggtVarZze;
        }
        return null;
    }
}

package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.util.IOUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfzr {
    private final zzber zza;
    private final File zzb;
    private final File zzc;
    private final File zzd;
    private byte[] zze;

    public zzfzr(@NonNull zzber zzberVar, @NonNull File file, @NonNull File file2, @NonNull File file3) {
        this.zza = zzberVar;
        this.zzb = file;
        this.zzc = file3;
        this.zzd = file2;
    }

    public final zzber zza() {
        return this.zza;
    }

    public final File zzb() {
        return this.zzb;
    }

    public final File zzc() {
        return this.zzc;
    }

    public final byte[] zzd() throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArrZzA;
        ArrayList arrayList;
        int iMin;
        FileInputStream fileInputStream2 = null;
        if (this.zze == null) {
            try {
                fileInputStream = new FileInputStream(this.zzd);
                try {
                    zziei zzieiVar = zziei.zza;
                    arrayList = new ArrayList();
                    iMin = 256;
                } catch (IOException unused) {
                    IOUtils.closeQuietly(fileInputStream);
                    bArrZzA = null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    IOUtils.closeQuietly(fileInputStream2);
                    throw th;
                }
            } catch (IOException unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            while (true) {
                byte[] bArr = new byte[iMin];
                int i10 = 0;
                while (i10 < iMin) {
                    int i11 = fileInputStream.read(bArr, i10, iMin - i10);
                    if (i11 == -1) {
                        break;
                    }
                    i10 += i11;
                }
                zziei zzieiVarZzt = i10 == 0 ? null : zziei.zzt(bArr, 0, i10);
                if (zzieiVarZzt == null) {
                    break;
                }
                arrayList.add(zzieiVarZzt);
                iMin = Math.min(iMin + iMin, 8192);
                this.zze = bArrZzA;
            }
            bArrZzA = zziei.zzy(arrayList).zzA();
            IOUtils.closeQuietly(fileInputStream);
            this.zze = bArrZzA;
        }
        byte[] bArr2 = this.zze;
        if (bArr2 == null) {
            return null;
        }
        return Arrays.copyOf(bArr2, bArr2.length);
    }

    public final boolean zze(long j10) {
        return this.zza.zzc() - (System.currentTimeMillis() / 1000) < com.prism.gaia.server.content.e.f167098H;
    }
}

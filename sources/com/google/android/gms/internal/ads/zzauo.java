package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.compose.foundation.layout.C1713x0;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzauo implements zzatc {
    private final zzaun zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzauo(zzaun zzaunVar, int i10) {
        this.zzc = zzaunVar;
    }

    @e.f0
    public static byte[] zzg(zzaum zzaumVar, long j10) throws IOException {
        long jZza = zzaumVar.zza();
        if (j10 >= 0 && j10 <= jZza) {
            int i10 = (int) j10;
            if (i10 == j10) {
                byte[] bArr = new byte[i10];
                new DataInputStream(zzaumVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 33 + String.valueOf(jZza).length());
        C1713x0.a(sb2, "streamToBytes length=", j10, ", maxLength=");
        sb2.append(jZza);
        throw new IOException(sb2.toString());
    }

    public static void zzh(OutputStream outputStream, int i10) throws IOException {
        outputStream.write(i10 & 255);
        outputStream.write((i10 >> 8) & 255);
        outputStream.write((i10 >> 16) & 255);
        outputStream.write((i10 >> 24) & 255);
    }

    public static int zzi(InputStream inputStream) throws IOException {
        return (zzp(inputStream) << 24) | zzp(inputStream) | (zzp(inputStream) << 8) | (zzp(inputStream) << 16);
    }

    public static void zzj(OutputStream outputStream, long j10) throws IOException {
        outputStream.write((byte) j10);
        outputStream.write((byte) (j10 >>> 8));
        outputStream.write((byte) (j10 >>> 16));
        outputStream.write((byte) (j10 >>> 24));
        outputStream.write((byte) (j10 >>> 32));
        outputStream.write((byte) (j10 >>> 40));
        outputStream.write((byte) (j10 >>> 48));
        outputStream.write((byte) (j10 >>> 56));
    }

    public static long zzk(InputStream inputStream) throws IOException {
        return (((long) zzp(inputStream)) & 255) | ((((long) zzp(inputStream)) & 255) << 8) | ((((long) zzp(inputStream)) & 255) << 16) | ((((long) zzp(inputStream)) & 255) << 24) | ((((long) zzp(inputStream)) & 255) << 32) | ((((long) zzp(inputStream)) & 255) << 40) | ((((long) zzp(inputStream)) & 255) << 48) | ((((long) zzp(inputStream)) & 255) << 56);
    }

    public static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzj(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    public static String zzm(zzaum zzaumVar) throws IOException {
        return new String(zzg(zzaumVar, zzk(zzaumVar)), "UTF-8");
    }

    private final void zzn(String str, zzaul zzaulVar) {
        Map map = this.zza;
        if (map.containsKey(str)) {
            this.zzb = (zzaulVar.zza - ((zzaul) map.get(str)).zza) + this.zzb;
        } else {
            this.zzb += zzaulVar.zza;
        }
        map.put(str, zzaulVar);
    }

    private final void zzo(String str) {
        zzaul zzaulVar = (zzaul) this.zza.remove(str);
        if (zzaulVar != null) {
            this.zzb -= zzaulVar.zza;
        }
    }

    private static int zzp(InputStream inputStream) throws IOException {
        int i10 = inputStream.read();
        if (i10 != -1) {
            return i10;
        }
        throw new EOFException();
    }

    private static final String zzq(String str) {
        int length = str.length() >> 1;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzatc
    public final synchronized zzatb zza(String str) {
        zzaul zzaulVar = (zzaul) this.zza.get(str);
        if (zzaulVar == null) {
            return null;
        }
        File fileZzf = zzf(str);
        try {
            zzaum zzaumVar = new zzaum(new BufferedInputStream(new FileInputStream(fileZzf)), fileZzf.length());
            try {
                String str2 = zzaul.zza(zzaumVar).zzb;
                if (!TextUtils.equals(str, str2)) {
                    zzaue.zzb("%s: key=%s, found=%s", fileZzf.getAbsolutePath(), str, str2);
                    zzo(str);
                    return null;
                }
                byte[] bArrZzg = zzg(zzaumVar, zzaumVar.zza());
                zzatb zzatbVar = new zzatb();
                zzatbVar.zza = bArrZzg;
                zzatbVar.zzb = zzaulVar.zzc;
                zzatbVar.zzc = zzaulVar.zzd;
                zzatbVar.zzd = zzaulVar.zze;
                zzatbVar.zze = zzaulVar.zzf;
                zzatbVar.zzf = zzaulVar.zzg;
                List<zzatk> list = zzaulVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzatk zzatkVar : list) {
                    treeMap.put(zzatkVar.zza(), zzatkVar.zzb());
                }
                zzatbVar.zzg = treeMap;
                zzatbVar.zzh = Collections.unmodifiableList(list);
                return zzatbVar;
            } finally {
                zzaumVar.close();
            }
        } catch (IOException e10) {
            zzaue.zzb("%s: %s", fileZzf.getAbsolutePath(), e10.toString());
            zze(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatc
    public final synchronized void zzb(String str, zzatb zzatbVar) {
        int i10;
        int i11;
        long j10;
        char c10;
        float f10;
        try {
            long j11 = this.zzb;
            int length = zzatbVar.zza.length;
            long j12 = j11 + ((long) length);
            int i12 = this.zzd;
            float f11 = 0.9f;
            if (j12 <= i12 || length <= i12 * 0.9f) {
                File fileZzf = zzf(str);
                int i13 = 0;
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileZzf));
                    zzaul zzaulVar = new zzaul(str, zzatbVar);
                    try {
                        try {
                            zzh(bufferedOutputStream, 538247942);
                            zzl(bufferedOutputStream, zzaulVar.zzb);
                            String str2 = zzaulVar.zzc;
                            if (str2 == null) {
                                str2 = "";
                            }
                            zzl(bufferedOutputStream, str2);
                            zzj(bufferedOutputStream, zzaulVar.zzd);
                            zzj(bufferedOutputStream, zzaulVar.zze);
                            zzj(bufferedOutputStream, zzaulVar.zzf);
                            zzj(bufferedOutputStream, zzaulVar.zzg);
                            List<zzatk> list = zzaulVar.zzh;
                            if (list != null) {
                                zzh(bufferedOutputStream, list.size());
                                for (zzatk zzatkVar : list) {
                                    zzl(bufferedOutputStream, zzatkVar.zza());
                                    zzl(bufferedOutputStream, zzatkVar.zzb());
                                }
                            } else {
                                zzh(bufferedOutputStream, 0);
                            }
                            bufferedOutputStream.flush();
                            bufferedOutputStream.write(zzatbVar.zza);
                            bufferedOutputStream.close();
                            zzaulVar.zza = fileZzf.length();
                            zzn(str, zzaulVar);
                            long j13 = this.zzb;
                            int i14 = this.zzd;
                            if (j13 >= i14) {
                                boolean z10 = zzaue.zzb;
                                if (z10) {
                                    zzaue.zza("Pruning old cache entries.", new Object[0]);
                                }
                                long j14 = this.zzb;
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                Iterator it = this.zza.entrySet().iterator();
                                int i15 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i11 = i13;
                                        j10 = j14;
                                        c10 = 1;
                                        break;
                                    }
                                    zzaul zzaulVar2 = (zzaul) ((Map.Entry) it.next()).getValue();
                                    String str3 = zzaulVar2.zzb;
                                    if (zzf(str3).delete()) {
                                        i11 = i13;
                                        j10 = j14;
                                        f10 = f11;
                                        c10 = 1;
                                        this.zzb -= zzaulVar2.zza;
                                    } else {
                                        f10 = f11;
                                        i11 = i13;
                                        j10 = j14;
                                        c10 = 1;
                                        String strZzq = zzq(str3);
                                        Object[] objArr = new Object[2];
                                        objArr[i11] = str3;
                                        objArr[1] = strZzq;
                                        zzaue.zzb("Could not delete cache entry for key=%s, filename=%s", objArr);
                                    }
                                    it.remove();
                                    i15++;
                                    if (this.zzb < i14 * f10) {
                                        break;
                                    }
                                    j14 = j10;
                                    i13 = i11;
                                    f11 = f10;
                                }
                                if (z10) {
                                    Integer numValueOf = Integer.valueOf(i15);
                                    Long lValueOf = Long.valueOf(this.zzb - j10);
                                    Long lValueOf2 = Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime);
                                    Object[] objArr2 = new Object[3];
                                    objArr2[i11] = numValueOf;
                                    objArr2[c10] = lValueOf;
                                    objArr2[2] = lValueOf2;
                                    zzaue.zza("pruned %d files, %d bytes, %d ms", objArr2);
                                }
                            }
                        } catch (IOException e10) {
                            zzaue.zzb(C4.s.f17585b, e10.toString());
                            bufferedOutputStream.close();
                            zzaue.zzb("Failed to write header for %s", fileZzf.getAbsolutePath());
                            throw new IOException();
                        }
                    } catch (IOException unused) {
                        if (!fileZzf.delete()) {
                            Object[] objArr3 = new Object[1];
                            objArr3[i10] = fileZzf.getAbsolutePath();
                            zzaue.zzb("Could not clean up file %s", objArr3);
                        }
                        if (!this.zzc.zza().exists()) {
                            zzaue.zzb("Re-initializing cache after external clearing.", new Object[i10]);
                            this.zza.clear();
                            this.zzb = 0L;
                            zzc();
                        }
                    }
                } catch (IOException unused2) {
                    i10 = i13;
                }
            }
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatc
    public final synchronized void zzc() {
        File fileZza = this.zzc.zza();
        if (fileZza.exists()) {
            File[] fileArrListFiles = fileZza.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        long length = file.length();
                        zzaum zzaumVar = new zzaum(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            zzaul zzaulVarZza = zzaul.zza(zzaumVar);
                            zzaulVarZza.zza = length;
                            zzn(zzaulVarZza.zzb, zzaulVarZza);
                            zzaumVar.close();
                        } catch (Throwable th) {
                            zzaumVar.close();
                            throw th;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!fileZza.mkdirs()) {
            zzaue.zzc("Unable to create cache dir %s", fileZza.getAbsolutePath());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatc
    public final synchronized void zzd(String str, boolean z10) {
        zzatb zzatbVarZza = zza(str);
        if (zzatbVarZza != null) {
            zzatbVarZza.zzf = 0L;
            zzatbVarZza.zze = 0L;
            zzb(str, zzatbVarZza);
        }
    }

    public final synchronized void zze(String str) {
        boolean zDelete = zzf(str).delete();
        zzo(str);
        if (zDelete) {
            return;
        }
        zzaue.zzb("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public final File zzf(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public zzauo(File file, int i10) {
        this.zzc = new zzauk(this, file);
    }
}

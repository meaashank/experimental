package com.prism.gaia.download;

import android.drm.DrmConvertedStatus;
import android.drm.DrmManagerClient;
import android.util.Log;
import com.android.launcher3.IconCache;
import com.prism.gaia.download.j;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes6.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DrmManagerClient f164788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f164789b;

    public k(DrmManagerClient drmManagerClient, int i10) {
        this.f164788a = drmManagerClient;
        this.f164789b = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.drm.DrmManagerClient] */
    /* JADX WARN: Type inference failed for: r3v10, types: [android.drm.DrmManagerClient] */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.prism.gaia.download.k c(android.content.Context r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "Conversion of Mimetype: "
            r1 = 0
            r2 = -1
            if (r6 == 0) goto L4f
            if (r7 == 0) goto L4f
            java.lang.String r3 = ""
            boolean r3 = r7.equals(r3)
            if (r3 != 0) goto L4f
            android.drm.DrmManagerClient r3 = new android.drm.DrmManagerClient     // Catch: java.lang.IllegalStateException -> L3b java.lang.IllegalArgumentException -> L3d
            r3.<init>(r6)     // Catch: java.lang.IllegalStateException -> L3b java.lang.IllegalArgumentException -> L3d
            int r2 = r3.openConvertSession(r7)     // Catch: java.lang.IllegalStateException -> L1a java.lang.IllegalArgumentException -> L23
            goto L50
        L1a:
            r6 = move-exception
            java.lang.String r7 = com.prism.gaia.download.a.f164590a     // Catch: java.lang.IllegalStateException -> L3f java.lang.IllegalArgumentException -> L47
            java.lang.String r0 = "Could not access Open DrmFramework."
            android.util.Log.w(r7, r0, r6)     // Catch: java.lang.IllegalStateException -> L3f java.lang.IllegalArgumentException -> L47
            goto L50
        L23:
            r6 = move-exception
            java.lang.String r4 = com.prism.gaia.download.a.f164590a     // Catch: java.lang.IllegalStateException -> L3f java.lang.IllegalArgumentException -> L47
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.IllegalStateException -> L3f java.lang.IllegalArgumentException -> L47
            r5.<init>(r0)     // Catch: java.lang.IllegalStateException -> L3f java.lang.IllegalArgumentException -> L47
            r5.append(r7)     // Catch: java.lang.IllegalStateException -> L3f java.lang.IllegalArgumentException -> L47
            java.lang.String r7 = " is not supported."
            r5.append(r7)     // Catch: java.lang.IllegalStateException -> L3f java.lang.IllegalArgumentException -> L47
            java.lang.String r7 = r5.toString()     // Catch: java.lang.IllegalStateException -> L3f java.lang.IllegalArgumentException -> L47
            android.util.Log.w(r4, r7, r6)     // Catch: java.lang.IllegalStateException -> L3f java.lang.IllegalArgumentException -> L47
            goto L50
        L3b:
            r3 = r1
            goto L3f
        L3d:
            r3 = r1
            goto L47
        L3f:
            java.lang.String r6 = com.prism.gaia.download.a.f164590a
            java.lang.String r7 = "DrmManagerClient didn't initialize properly."
            android.util.Log.w(r6, r7)
            goto L50
        L47:
            java.lang.String r6 = com.prism.gaia.download.a.f164590a
            java.lang.String r7 = "DrmManagerClient instance could not be created, context is Illegal."
            android.util.Log.w(r6, r7)
            goto L50
        L4f:
            r3 = r1
        L50:
            if (r3 == 0) goto L5b
            if (r2 >= 0) goto L55
            goto L5b
        L55:
            com.prism.gaia.download.k r6 = new com.prism.gaia.download.k
            r6.<init>(r3, r2)
            return r6
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.gaia.download.k.c(android.content.Context, java.lang.String):com.prism.gaia.download.k");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v17, types: [int] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r8v9 */
    public int a(String str) throws Throwable {
        int i10;
        String str2;
        ?? r82;
        RandomAccessFile randomAccessFile;
        DrmManagerClient drmManagerClient = this.f164788a;
        int i11 = j.b.f164697D0;
        if (drmManagerClient == null || (i10 = this.f164789b) < 0) {
            return j.b.f164697D0;
        }
        try {
            DrmConvertedStatus drmConvertedStatusCloseConvertSession = drmManagerClient.closeConvertSession(i10);
            if (drmConvertedStatusCloseConvertSession == null || drmConvertedStatusCloseConvertSession.statusCode != 1 || drmConvertedStatusCloseConvertSession.convertedData == null) {
                return 406;
            }
            ?? r83 = 0;
            RandomAccessFile randomAccessFile2 = null;
            RandomAccessFile randomAccessFile3 = null;
            RandomAccessFile randomAccessFile4 = null;
            r83 = 0;
            r83 = 0;
            try {
                try {
                    try {
                        try {
                            randomAccessFile = new RandomAccessFile(str, "rw");
                        } catch (Throwable th) {
                            th = th;
                            i11 = 492;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (FileNotFoundException e10) {
                    e = e10;
                } catch (IOException e11) {
                    e = e11;
                } catch (IllegalArgumentException e12) {
                    e = e12;
                } catch (SecurityException e13) {
                    e = e13;
                }
                try {
                    r83 = drmConvertedStatusCloseConvertSession.offset;
                    randomAccessFile.seek((long) r83);
                    randomAccessFile.write(drmConvertedStatusCloseConvertSession.convertedData);
                    i11 = 200;
                    try {
                        randomAccessFile.close();
                    } catch (IOException e14) {
                        e = e14;
                        str2 = a.f164590a;
                        str = "Failed to close File:" + str + IconCache.EMPTY_CLASS_NAME;
                        r82 = r83;
                        Log.w(str2, str, e);
                        r83 = r82;
                        i11 = 492;
                    }
                } catch (FileNotFoundException e15) {
                    e = e15;
                    randomAccessFile2 = randomAccessFile;
                    Log.w(a.f164590a, "File: " + str + " could not be found.", e);
                    r83 = randomAccessFile2;
                    if (randomAccessFile2 != null) {
                        try {
                            randomAccessFile2.close();
                            r83 = randomAccessFile2;
                        } catch (IOException e16) {
                            e = e16;
                            str2 = a.f164590a;
                            str = "Failed to close File:" + str + IconCache.EMPTY_CLASS_NAME;
                            r82 = randomAccessFile2;
                            Log.w(str2, str, e);
                            r83 = r82;
                            i11 = 492;
                            return i11;
                        }
                    }
                    i11 = 492;
                    return i11;
                } catch (IOException e17) {
                    e = e17;
                    randomAccessFile3 = randomAccessFile;
                    Log.w(a.f164590a, "Could not access File: " + str + " .", e);
                    r83 = randomAccessFile3;
                    if (randomAccessFile3 != null) {
                        try {
                            randomAccessFile3.close();
                            r83 = randomAccessFile3;
                        } catch (IOException e18) {
                            e = e18;
                            str2 = a.f164590a;
                            str = "Failed to close File:" + str + IconCache.EMPTY_CLASS_NAME;
                            r82 = randomAccessFile3;
                            Log.w(str2, str, e);
                            r83 = r82;
                            i11 = 492;
                            return i11;
                        }
                    }
                    i11 = 492;
                    return i11;
                } catch (IllegalArgumentException e19) {
                    e = e19;
                    randomAccessFile4 = randomAccessFile;
                    Log.w(a.f164590a, "Could not open file in mode: rw", e);
                    r83 = randomAccessFile4;
                    if (randomAccessFile4 != null) {
                        try {
                            randomAccessFile4.close();
                            r83 = randomAccessFile4;
                        } catch (IOException e20) {
                            e = e20;
                            str2 = a.f164590a;
                            str = "Failed to close File:" + str + IconCache.EMPTY_CLASS_NAME;
                            r82 = randomAccessFile4;
                            Log.w(str2, str, e);
                            r83 = r82;
                            i11 = 492;
                            return i11;
                        }
                    }
                    i11 = 492;
                    return i11;
                } catch (SecurityException e21) {
                    e = e21;
                    r83 = randomAccessFile;
                    Log.w(a.f164590a, "Access to File: " + str + " was denied denied by SecurityManager.", e);
                    if (r83 != 0) {
                        try {
                            r83.close();
                        } catch (IOException e22) {
                            e = e22;
                            str2 = a.f164590a;
                            str = "Failed to close File:" + str + IconCache.EMPTY_CLASS_NAME;
                            r82 = r83;
                            Log.w(str2, str, e);
                            r83 = r82;
                            i11 = 492;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r83 = randomAccessFile;
                    if (r83 != 0) {
                        try {
                            r83.close();
                        } catch (IOException e23) {
                            Log.w(a.f164590a, "Failed to close File:" + str + IconCache.EMPTY_CLASS_NAME, e23);
                            i11 = 492;
                        }
                    }
                    throw th;
                }
                return i11;
            } catch (IllegalStateException e24) {
                e = e24;
                i11 = 492;
            }
        } catch (IllegalStateException e25) {
            e = e25;
        }
        Log.w(a.f164590a, "Could not close convertsession. Convertsession: " + this.f164789b, e);
        return i11;
    }

    public byte[] b(byte[] bArr, int i10) {
        DrmConvertedStatus drmConvertedStatusConvertData;
        if (bArr == null) {
            throw new IllegalArgumentException("Parameter inBuffer is null");
        }
        try {
            if (i10 != bArr.length) {
                byte[] bArr2 = new byte[i10];
                System.arraycopy(bArr, 0, bArr2, 0, i10);
                drmConvertedStatusConvertData = this.f164788a.convertData(this.f164789b, bArr2);
            } else {
                drmConvertedStatusConvertData = this.f164788a.convertData(this.f164789b, bArr);
            }
            if (drmConvertedStatusConvertData == null || drmConvertedStatusConvertData.statusCode != 1) {
                return null;
            }
            byte[] bArr3 = drmConvertedStatusConvertData.convertedData;
            if (bArr3 != null) {
                return bArr3;
            }
            return null;
        } catch (IllegalArgumentException e10) {
            Log.w(a.f164590a, "Buffer with data to convert is illegal. Convertsession: " + this.f164789b, e10);
            return null;
        } catch (IllegalStateException e11) {
            Log.w(a.f164590a, "Could not convert data. Convertsession: " + this.f164789b, e11);
            return null;
        }
    }
}

package com.bytedance.sdk.component.TFq.mZ.ZRu.ZRu;

import android.util.Log;
import com.bytedance.sdk.component.TFq.mZ.ZRu.ZRu.ZRu;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class NOt implements com.bytedance.sdk.component.TFq.mZ {
    private ZRu NOt;
    private long ZRu;

    public NOt(File file, long j10, ExecutorService executorService) {
        this.ZRu = j10;
        try {
            this.NOt = ZRu.ZRu(file, 20210302, 1, j10, executorService);
        } catch (IOException e10) {
            Log.w("LruCountDiskCache", e10.toString());
        }
    }

    @Override // com.bytedance.sdk.component.TFq.ZRu
    /* JADX INFO: renamed from: mZ, reason: merged with bridge method [inline-methods] */
    public boolean NOt(String str) {
        try {
            try {
                ZRu.mZ mZVarZRu = this.NOt.ZRu(str);
                boolean z10 = mZVarZRu != null;
                com.bytedance.sdk.component.TFq.mZ.mZ.NOt.ZRu(mZVarZRu);
                return z10;
            } catch (IOException e10) {
                Log.w("LruCountDiskCache", e10.getMessage());
                com.bytedance.sdk.component.TFq.mZ.mZ.NOt.ZRu(null);
                return false;
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.TFq.mZ.mZ.NOt.ZRu(null);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // com.bytedance.sdk.component.TFq.ZRu
    /* JADX INFO: renamed from: NOt, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] ZRu(String str) throws Throwable {
        Closeable closeable;
        ?? r72;
        ByteArrayOutputStream byteArrayOutputStream;
        ZRu zRu = this.NOt;
        ?? r12 = 0;
        if (zRu != null) {
            try {
                if (str != 0) {
                    try {
                        ZRu.mZ mZVarZRu = zRu.ZRu((String) str);
                        if (mZVarZRu == null) {
                            com.bytedance.sdk.component.TFq.mZ.mZ.NOt.ZRu(null);
                            com.bytedance.sdk.component.TFq.mZ.mZ.NOt.ZRu(null);
                            return null;
                        }
                        str = mZVarZRu.ZRu(0);
                        if (str != 0) {
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byte[] bArr = new byte[1024];
                                    while (true) {
                                        int i10 = str.read(bArr);
                                        if (i10 == -1) {
                                            break;
                                        }
                                        byteArrayOutputStream.write(bArr, 0, i10);
                                    }
                                } catch (IOException e10) {
                                    e = e10;
                                    r72 = str;
                                }
                            } catch (IOException e11) {
                                e = e11;
                                byteArrayOutputStream = null;
                                r72 = str;
                            } catch (Throwable th) {
                                th = th;
                                closeable = null;
                                r12 = str;
                                com.bytedance.sdk.component.TFq.mZ.mZ.NOt.ZRu(r12);
                                com.bytedance.sdk.component.TFq.mZ.mZ.NOt.ZRu(closeable);
                                throw th;
                            }
                        } else {
                            byteArrayOutputStream = null;
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        com.bytedance.sdk.component.TFq.mZ.mZ.NOt.ZRu(str);
                        com.bytedance.sdk.component.TFq.mZ.mZ.NOt.ZRu(byteArrayOutputStream);
                        return byteArray;
                    } catch (IOException e12) {
                        e = e12;
                        r72 = 0;
                        byteArrayOutputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        closeable = null;
                        com.bytedance.sdk.component.TFq.mZ.mZ.NOt.ZRu(r12);
                        com.bytedance.sdk.component.TFq.mZ.mZ.NOt.ZRu(closeable);
                        throw th;
                    }
                    Log.w("LruCountDiskCache", e.toString());
                    com.bytedance.sdk.component.TFq.mZ.mZ.NOt.ZRu(r72);
                    com.bytedance.sdk.component.TFq.mZ.mZ.NOt.ZRu(byteArrayOutputStream);
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.TFq.mZ
    public InputStream ZRu(String str) throws Throwable {
        ZRu zRu = this.NOt;
        if (zRu == null) {
            return null;
        }
        try {
            ZRu.mZ mZVarZRu = zRu.ZRu(str);
            if (mZVarZRu != null) {
                return mZVarZRu.ZRu(0);
            }
        } catch (IOException e10) {
            Log.w("LruCountDiskCache", e10.getMessage());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.TFq.ZRu
    public boolean ZRu(String str, byte[] bArr) throws Throwable {
        Closeable closeable;
        ZRu.C0411ZRu c0411ZRuNOt;
        ZRu zRu = this.NOt;
        if (zRu == null || bArr == null || str == null) {
            return false;
        }
        Closeable closeable2 = null;
        ZRu.C0411ZRu c0411ZRu = null;
        try {
            try {
                c0411ZRuNOt = zRu.NOt(str);
            } catch (IOException e10) {
                e = e10;
                closeable = null;
            }
            try {
                if (c0411ZRuNOt == null) {
                    Log.w("LruCountDiskCache", "save " + str + " failed for edit null");
                    com.bytedance.sdk.component.TFq.mZ.mZ.NOt.ZRu(null);
                    return false;
                }
                OutputStream outputStreamZRu = c0411ZRuNOt.ZRu(0);
                if (outputStreamZRu == ZRu.mZ) {
                    Log.w("LruCountDiskCache", "save " + str + " failed for null OutputStream");
                    com.bytedance.sdk.component.TFq.mZ.mZ.NOt.ZRu(outputStreamZRu);
                    return false;
                }
                outputStreamZRu.write(bArr);
                c0411ZRuNOt.ZRu();
                this.NOt.ZRu();
                com.bytedance.sdk.component.TFq.mZ.mZ.NOt.ZRu(outputStreamZRu);
                return true;
            } catch (IOException e11) {
                e = e11;
                closeable = null;
                c0411ZRu = c0411ZRuNOt;
                try {
                    Log.w("LruCountDiskCache", e.toString());
                    if (c0411ZRu != null) {
                        try {
                            c0411ZRu.NOt();
                        } catch (IOException unused) {
                        }
                    }
                    com.bytedance.sdk.component.TFq.mZ.mZ.NOt.ZRu(closeable);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    closeable2 = closeable;
                    com.bytedance.sdk.component.TFq.mZ.mZ.NOt.ZRu(closeable2);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            com.bytedance.sdk.component.TFq.mZ.mZ.NOt.ZRu(closeable2);
            throw th;
        }
    }
}

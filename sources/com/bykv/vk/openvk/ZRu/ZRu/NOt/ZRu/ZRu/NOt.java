package com.bykv.vk.openvk.ZRu.ZRu.NOt.ZRu.ZRu;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.f;
import com.bytedance.sdk.component.NOt.ZRu.ZH;
import com.bytedance.sdk.component.NOt.ZRu.oK;
import com.bytedance.sdk.component.NOt.ZRu.sAl;
import com.bytedance.sdk.component.NOt.ZRu.yBV;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.prism.gaia.download.a;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class NOt implements mZ {
    private long TFq;
    private RandomAccessFile Vor;
    private final com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ aT;
    private File mZ;
    private File uR;
    private volatile long ZRu = -2147483648L;
    private final Object NOt = new Object();
    private volatile long Ht = -1;
    private volatile boolean Mm = false;
    private volatile boolean FA = false;

    public NOt(Context context, com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ mZVar) {
        this.TFq = 0L;
        this.Vor = null;
        this.aT = mZVar;
        try {
            this.mZ = com.bykv.vk.openvk.ZRu.ZRu.NOt.TFq.NOt.NOt(mZVar.NOt(), mZVar.edo());
            this.uR = com.bykv.vk.openvk.ZRu.ZRu.NOt.TFq.NOt.mZ(mZVar.NOt(), mZVar.edo());
            if (uR()) {
                this.Vor = new RandomAccessFile(this.uR, CampaignEx.JSON_KEY_AD_R);
            } else {
                this.Vor = new RandomAccessFile(this.mZ, "rw");
            }
            if (uR()) {
                return;
            }
            this.TFq = this.mZ.length();
            ZRu();
        } catch (Throwable unused) {
            mZVar.sAl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ht() throws IOException {
        synchronized (this.NOt) {
            if (uR()) {
                this.aT.sAl();
                this.aT.edo();
                return;
            }
            try {
            } finally {
            }
            if (!this.mZ.renameTo(this.uR)) {
                throw new IOException("Error renaming file " + this.mZ + " to " + this.uR + " for completion!");
            }
            RandomAccessFile randomAccessFile = this.Vor;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.Vor = new RandomAccessFile(this.uR, "rw");
            this.aT.edo();
            this.aT.sAl();
        }
    }

    private long TFq() {
        return uR() ? this.uR.length() : this.mZ.length();
    }

    private boolean uR() {
        return this.uR.exists();
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.ZRu.ZRu.mZ
    public void NOt() {
        try {
            if (!this.Mm) {
                this.Vor.close();
            }
            File file = this.mZ;
            if (file != null) {
                file.setLastModified(System.currentTimeMillis());
            }
            File file2 = this.uR;
            if (file2 != null) {
                file2.setLastModified(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
        this.Mm = true;
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.ZRu.ZRu.mZ
    public long mZ() throws IOException {
        if (uR()) {
            this.ZRu = this.uR.length();
        } else {
            synchronized (this.NOt) {
                int i10 = 0;
                while (this.ZRu == -2147483648L) {
                    try {
                        i10 += 15;
                        try {
                            this.NOt.wait(5L);
                            if (i10 > 20000) {
                                return -1L;
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("total length InterruptException");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return this.ZRu;
    }

    public void ZRu() {
        ZH.ZRu zRu;
        if (com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.uR() != null) {
            zRu = com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.uR().NOt();
        } else {
            zRu = new ZH.ZRu("v_cache");
        }
        long jYBV = this.aT.yBV();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zRu.ZRu(jYBV, timeUnit).NOt(this.aT.WMI(), timeUnit).mZ(this.aT.qF(), timeUnit);
        ZH zhZRu = zRu.ZRu();
        this.aT.edo();
        zhZRu.ZRu(new sAl.ZRu().ZRu("RANGE", f.a(new StringBuilder("bytes="), this.TFq, a.f164606q)).NOt(this.aT.sAl()).ZRu().ZRu("videoLoadWhenPlaying").ZRu(9).NOt()).ZRu(new com.bytedance.sdk.component.NOt.ZRu.mZ() { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.ZRu.ZRu.NOt.1
            @Override // com.bytedance.sdk.component.NOt.ZRu.mZ
            public void ZRu(com.bytedance.sdk.component.NOt.ZRu.NOt nOt, IOException iOException) {
                NOt.this.FA = false;
                NOt.this.ZRu = -1L;
            }

            @Override // com.bytedance.sdk.component.NOt.ZRu.mZ
            public void ZRu(com.bytedance.sdk.component.NOt.ZRu.NOt nOt, oK oKVar) throws IOException {
                yBV ybvHt;
                InputStream inputStream;
                if (oKVar != null) {
                    InputStream inputStreamMZ = null;
                    try {
                        try {
                            NOt.this.FA = oKVar.uR();
                            if (!NOt.this.FA) {
                                NOt.this.FA = false;
                                NOt nOt2 = NOt.this;
                                nOt2.ZRu = nOt2.Ht;
                                ybvHt = null;
                            } else {
                                ybvHt = oKVar.Ht();
                                try {
                                    if (NOt.this.FA && ybvHt != null) {
                                        NOt.this.ZRu = ybvHt.ZRu() + NOt.this.TFq;
                                        inputStreamMZ = ybvHt.mZ();
                                    }
                                    inputStream = inputStreamMZ;
                                    if (inputStream == null) {
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        if (ybvHt != null) {
                                            ybvHt.close();
                                        }
                                        oKVar.close();
                                        if (!NOt.this.FA || NOt.this.mZ.length() != NOt.this.ZRu) {
                                            return;
                                        }
                                        NOt.this.Ht();
                                    }
                                    try {
                                        byte[] bArr = new byte[8192];
                                        long j10 = NOt.this.TFq;
                                        int i10 = 0;
                                        long j11 = 0;
                                        while (true) {
                                            int i11 = inputStream.read(bArr, i10, 8192 - i10);
                                            if (i11 == -1) {
                                                break;
                                            }
                                            i10 += i11;
                                            j11 += (long) i11;
                                            boolean z10 = j11 % PlaybackStateCompat.ACTION_PLAY_FROM_URI == 0 || j11 == NOt.this.ZRu - NOt.this.TFq;
                                            long unused = NOt.this.ZRu;
                                            long unused2 = NOt.this.TFq;
                                            NOt.this.aT.edo();
                                            NOt.this.aT.sAl();
                                            if (z10) {
                                                synchronized (NOt.this.NOt) {
                                                    com.bykv.vk.openvk.ZRu.ZRu.NOt.TFq.NOt.ZRu(NOt.this.Vor, bArr, Long.valueOf(j10).intValue(), i10, NOt.this.aT.edo());
                                                }
                                                j10 += (long) i10;
                                                i10 = 0;
                                            }
                                        }
                                        long unused3 = NOt.this.TFq;
                                        long unused4 = NOt.this.ZRu;
                                        long unused5 = NOt.this.ZRu;
                                        long unused6 = NOt.this.TFq;
                                        NOt.this.aT.sAl();
                                        inputStreamMZ = inputStream;
                                    } catch (Throwable unused7) {
                                        try {
                                            NOt.this.FA = false;
                                            NOt nOt3 = NOt.this;
                                            nOt3.ZRu = nOt3.Ht;
                                            if (inputStream != null) {
                                                inputStream.close();
                                            }
                                            if (ybvHt != null) {
                                                ybvHt.close();
                                            }
                                            oKVar.close();
                                            if (NOt.this.FA && NOt.this.mZ.length() == NOt.this.ZRu) {
                                                NOt.this.Ht();
                                                return;
                                            }
                                            return;
                                        } catch (Throwable th) {
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Throwable unused8) {
                                                    throw th;
                                                }
                                            }
                                            if (ybvHt != null) {
                                                ybvHt.close();
                                            }
                                            oKVar.close();
                                            if (NOt.this.FA && NOt.this.mZ.length() == NOt.this.ZRu) {
                                                NOt.this.Ht();
                                            }
                                            throw th;
                                        }
                                    }
                                } catch (Throwable unused9) {
                                    inputStream = null;
                                }
                            }
                            if (inputStreamMZ != null) {
                                inputStreamMZ.close();
                            }
                            if (ybvHt != null) {
                                ybvHt.close();
                            }
                            oKVar.close();
                            if (!NOt.this.FA || NOt.this.mZ.length() != NOt.this.ZRu) {
                                return;
                            }
                            NOt.this.Ht();
                        } catch (Throwable unused10) {
                        }
                    } catch (Throwable unused11) {
                        ybvHt = null;
                        inputStream = null;
                    }
                } else {
                    NOt.this.FA = false;
                    NOt nOt4 = NOt.this;
                    nOt4.ZRu = nOt4.Ht;
                }
            }
        });
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.ZRu.ZRu.mZ
    public int ZRu(long j10, byte[] bArr, int i10, int i11) throws IOException {
        try {
            if (j10 == this.ZRu) {
                return -1;
            }
            int i12 = 0;
            int i13 = 0;
            while (!this.Mm) {
                synchronized (this.NOt) {
                    try {
                        if (j10 < TFq()) {
                            this.Vor.seek(j10);
                            i13 = this.Vor.read(bArr, i10, i11);
                        } else {
                            i12 += 33;
                            this.NOt.wait(33L);
                        }
                    } finally {
                    }
                }
                if (i13 > 0) {
                    return i13;
                }
                if (i12 >= 20000) {
                    throw new SocketTimeoutException();
                }
            }
            return -1;
        } catch (Throwable th) {
            if (th instanceof IOException) {
                throw th;
            }
            throw new IOException();
        }
    }
}

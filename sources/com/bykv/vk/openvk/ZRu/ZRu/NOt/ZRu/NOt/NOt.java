package com.bykv.vk.openvk.ZRu.ZRu.NOt.ZRu.NOt;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.compose.ui.input.pointer.C2151s;
import com.bykv.vk.openvk.ZRu.ZRu.ZRu.TFq.ZRu;
import com.bytedance.sdk.component.NOt.ZRu.ZH;
import com.bytedance.sdk.component.NOt.ZRu.oK;
import com.bytedance.sdk.component.NOt.ZRu.sAl;
import com.bytedance.sdk.component.NOt.ZRu.yBV;
import com.prism.gaia.download.a;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class NOt {
    private com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ NOt;
    private File TFq;
    private Context ZRu;
    private File uR;
    private volatile boolean mZ = false;
    private final List<ZRu.InterfaceC0375ZRu> Ht = new ArrayList();
    private volatile boolean Mm = false;

    public NOt(Context context, com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ mZVar) {
        this.uR = null;
        this.TFq = null;
        this.ZRu = context;
        this.NOt = mZVar;
        this.uR = com.bykv.vk.openvk.ZRu.ZRu.NOt.TFq.NOt.NOt(mZVar.NOt(), mZVar.edo());
        this.TFq = com.bykv.vk.openvk.ZRu.ZRu.NOt.TFq.NOt.mZ(mZVar.NOt(), mZVar.edo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void TFq() {
        try {
            if (this.uR.renameTo(this.TFq)) {
                return;
            }
            throw new IOException("Error renaming file " + this.uR + " to " + this.TFq + " for completion!");
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void mZ() {
        ZH.ZRu zRuNOt = com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.uR() != null ? com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.uR().NOt() : new ZH.ZRu("v_preload");
        long jYBV = this.NOt.yBV();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zRuNOt.ZRu(jYBV, timeUnit).NOt(this.NOt.WMI(), timeUnit).mZ(this.NOt.qF(), timeUnit);
        ZH zhZRu = zRuNOt.ZRu();
        sAl.ZRu zRu = new sAl.ZRu();
        final long length = this.uR.length();
        int iMZ = this.NOt.mZ();
        boolean zAT = this.NOt.aT();
        int iZRu = this.NOt.ZRu();
        if (iZRu > 0) {
            if (iZRu >= this.NOt.Vor()) {
                zAT = true;
            } else {
                iMZ = iZRu;
            }
        }
        zRu.ZRu("videoPreload").ZRu(6);
        if (zAT) {
            zRu.ZRu("RANGE", C2151s.a("bytes=", length, a.f164606q)).NOt(this.NOt.sAl()).ZRu().NOt();
        } else {
            zRu.ZRu("RANGE", "bytes=" + length + a.f164606q + iMZ).NOt(this.NOt.sAl()).ZRu().NOt();
        }
        zhZRu.ZRu(zRu.NOt()).ZRu(new com.bytedance.sdk.component.NOt.ZRu.mZ() { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.ZRu.NOt.NOt.1
            @Override // com.bytedance.sdk.component.NOt.ZRu.mZ
            public void ZRu(com.bytedance.sdk.component.NOt.ZRu.NOt nOt, IOException iOException) {
                NOt nOt2 = NOt.this;
                nOt2.ZRu(nOt2.NOt, 601, iOException.getMessage());
                mZ.ZRu(NOt.this.NOt);
            }

            @Override // com.bytedance.sdk.component.NOt.ZRu.mZ
            public void ZRu(com.bytedance.sdk.component.NOt.ZRu.NOt nOt, oK oKVar) throws IOException {
                InputStream inputStreamMZ;
                RandomAccessFile randomAccessFile;
                yBV ybvHt;
                long jZRu;
                long j10 = length;
                yBV ybv = null;
                ybv = null;
                randomAccessFile = null;
                randomAccessFile = null;
                RandomAccessFile randomAccessFile2 = null;
                try {
                } catch (Throwable th) {
                    th = th;
                    inputStreamMZ = null;
                    randomAccessFile = null;
                }
                if (oKVar != null) {
                    boolean zUR = oKVar.uR();
                    if (!zUR) {
                        NOt nOt2 = NOt.this;
                        nOt2.ZRu(nOt2.NOt, oKVar.mZ(), oKVar.TFq());
                        NOt.this.ZRu((Closeable) null);
                        NOt.this.ZRu((Closeable) null);
                        NOt.this.ZRu(ybv);
                        NOt.this.ZRu(oKVar);
                        NOt.this.NOt.sAl();
                        NOt.this.NOt.mZ();
                        mZ.ZRu(NOt.this.NOt);
                    }
                    ybvHt = oKVar.Ht();
                    try {
                        ybvHt = oKVar.Ht();
                        if (!zUR || ybvHt == null) {
                            inputStreamMZ = null;
                            jZRu = 0;
                        } else {
                            jZRu = length + ybvHt.ZRu();
                            inputStreamMZ = ybvHt.mZ();
                        }
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            randomAccessFile = randomAccessFile2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStreamMZ = null;
                        randomAccessFile = null;
                    }
                    if (inputStreamMZ == null) {
                        NOt nOt3 = NOt.this;
                        nOt3.ZRu(nOt3.NOt, oKVar.mZ(), oKVar.TFq());
                    } else {
                        randomAccessFile = new RandomAccessFile(NOt.this.uR, "rw");
                        try {
                            byte[] bArr = new byte[8192];
                            int i10 = 0;
                            long j11 = 0;
                            while (true) {
                                int i11 = inputStreamMZ.read(bArr, i10, 8192 - i10);
                                if (i11 != -1) {
                                    if (NOt.this.mZ) {
                                        NOt nOt4 = NOt.this;
                                        nOt4.NOt(nOt4.NOt, oKVar.mZ());
                                        NOt.this.ZRu(randomAccessFile);
                                        break;
                                    } else {
                                        i10 += i11;
                                        j11 += (long) i11;
                                        if (j11 % PlaybackStateCompat.ACTION_PLAY_FROM_URI == 0 || j11 == jZRu - length) {
                                            com.bykv.vk.openvk.ZRu.ZRu.NOt.TFq.NOt.ZRu(randomAccessFile, bArr, Long.valueOf(j10).intValue(), i10, NOt.this.NOt.edo());
                                            j10 += (long) i10;
                                            i10 = 0;
                                        }
                                    }
                                } else {
                                    if (NOt.this.NOt.aT() && jZRu == NOt.this.uR.length()) {
                                        NOt.this.TFq();
                                    }
                                    NOt nOt5 = NOt.this;
                                    nOt5.ZRu(nOt5.NOt, oKVar.mZ());
                                    randomAccessFile2 = randomAccessFile;
                                }
                            }
                            NOt.this.ZRu(inputStreamMZ);
                            NOt.this.ZRu(ybvHt);
                        } catch (Throwable th4) {
                            th = th4;
                            ybv = ybvHt;
                            try {
                                NOt.this.uR();
                                NOt nOt6 = NOt.this;
                                nOt6.ZRu(nOt6.NOt, oKVar != null ? oKVar.mZ() : 601, th.getMessage());
                                NOt.this.ZRu(randomAccessFile);
                                NOt.this.ZRu(inputStreamMZ);
                                NOt.this.ZRu(ybv);
                            } catch (Throwable th5) {
                                NOt.this.ZRu(randomAccessFile);
                                NOt.this.ZRu(inputStreamMZ);
                                NOt.this.ZRu(ybv);
                                NOt.this.ZRu(oKVar);
                                NOt.this.NOt.sAl();
                                NOt.this.NOt.mZ();
                                mZ.ZRu(NOt.this.NOt);
                                throw th5;
                            }
                        }
                        NOt.this.ZRu(oKVar);
                        NOt.this.NOt.sAl();
                        NOt.this.NOt.mZ();
                        mZ.ZRu(NOt.this.NOt);
                    }
                } else {
                    NOt nOt7 = NOt.this;
                    nOt7.ZRu(nOt7.NOt, 601, "Network link failed.");
                    ybvHt = null;
                    inputStreamMZ = null;
                }
                NOt.this.ZRu(randomAccessFile2);
                NOt.this.ZRu(inputStreamMZ);
                NOt.this.ZRu(ybvHt);
                NOt.this.ZRu(oKVar);
                NOt.this.NOt.sAl();
                NOt.this.NOt.mZ();
                mZ.ZRu(NOt.this.NOt);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uR() {
        try {
            this.TFq.delete();
            this.uR.delete();
        } catch (Throwable unused) {
        }
    }

    private boolean NOt() {
        if (this.TFq.exists()) {
            return true;
        }
        if (!this.NOt.aT()) {
            if (this.uR.length() >= this.NOt.mZ()) {
                return true;
            }
            if (this.NOt.ZRu() > 0 && this.uR.length() >= this.NOt.ZRu()) {
                return true;
            }
        }
        return false;
    }

    public void ZRu(ZRu.InterfaceC0375ZRu interfaceC0375ZRu) {
        if (this.Mm) {
            synchronized (ZRu.InterfaceC0375ZRu.class) {
                this.Ht.add(interfaceC0375ZRu);
            }
            return;
        }
        this.Ht.add(interfaceC0375ZRu);
        if (NOt()) {
            this.NOt.Mm(1);
            ZRu(this.NOt, 200);
            mZ.ZRu(this.NOt);
        } else {
            this.Mm = true;
            this.NOt.Mm(0);
            mZ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NOt(com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ mZVar, int i10) {
        synchronized (ZRu.InterfaceC0375ZRu.class) {
            try {
                for (ZRu.InterfaceC0375ZRu interfaceC0375ZRu : this.Ht) {
                    if (interfaceC0375ZRu != null) {
                        interfaceC0375ZRu.NOt(mZVar, i10);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ ZRu() {
        return this.NOt;
    }

    public void ZRu(boolean z10) {
        this.mZ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ mZVar, int i10) {
        synchronized (ZRu.InterfaceC0375ZRu.class) {
            try {
                for (ZRu.InterfaceC0375ZRu interfaceC0375ZRu : this.Ht) {
                    if (interfaceC0375ZRu != null) {
                        interfaceC0375ZRu.ZRu(mZVar, i10);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ mZVar, int i10, String str) {
        synchronized (ZRu.InterfaceC0375ZRu.class) {
            try {
                for (ZRu.InterfaceC0375ZRu interfaceC0375ZRu : this.Ht) {
                    if (interfaceC0375ZRu != null) {
                        interfaceC0375ZRu.ZRu(mZVar, i10, str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

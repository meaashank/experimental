package com.bykv.vk.openvk.ZRu.ZRu.NOt.uR;

import android.graphics.SurfaceTexture;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ;
import com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu;
import com.bytedance.sdk.component.FA.Vor;
import com.bytedance.sdk.component.utils.ru;
import com.mbridge.msdk.MBridgeConstans;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.HttpStatus;
import s0.x;

/* JADX INFO: loaded from: classes2.dex */
public class uR implements mZ.Ht, mZ.Mm, mZ.NOt, mZ.TFq, mZ.ZRu, mZ.InterfaceC0374mZ, mZ.uR, com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu, ru.ZRu {
    private static final SparseIntArray ru = new SparseIntArray();
    private SurfaceHolder NOt;
    private boolean OCA;
    private boolean Vor;
    private SurfaceTexture ZRu;
    private boolean aT;
    private volatile boolean gI;
    private boolean le;
    private ru sAl;
    private ArrayList<Runnable> to;
    private int uR;
    private int mZ = 0;
    private boolean TFq = false;
    private volatile mZ Ht = null;
    private final boolean Mm = false;
    private boolean FA = false;
    private volatile int ZH = 201;
    private long lp = -1;
    private boolean edo = false;
    private long oK = 0;
    private long yBV = Long.MIN_VALUE;
    private long WMI = 0;
    private long qF = 0;
    private long om = 0;
    private int xY = 0;
    private String Zf = MBridgeConstans.ENDCARD_URL_TYPE_PL;
    private final List<WeakReference<ZRu.InterfaceC0376ZRu>> MR = new CopyOnWriteArrayList();
    private com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ fcs = null;

    /* JADX INFO: renamed from: Nb, reason: collision with root package name */
    private boolean f140094Nb = false;
    private CountDownLatch VdW = new CountDownLatch(1);
    private volatile int th = 200;
    private AtomicBoolean WD = new AtomicBoolean(false);
    private Surface fWk = null;
    private final Runnable Yx = new Runnable() { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.uR.1
        @Override // java.lang.Runnable
        public void run() {
            if (uR.this.Ht == null) {
                return;
            }
            long jWMI = uR.this.WMI();
            if (jWMI > 0 && uR.this.Ht() && uR.this.yBV != Long.MIN_VALUE) {
                try {
                    if (uR.this.yBV == jWMI) {
                        if (!uR.this.edo && uR.this.WMI >= 400) {
                            uR.this.NOt(x.h.f238408k, 800);
                            uR.this.edo = true;
                        }
                        uR.this.WMI += (long) uR.this.th;
                    } else {
                        if (uR.this.edo) {
                            uR.this.oK += uR.this.WMI;
                            uR.this.NOt(x.h.f238409l, 800);
                            long unused = uR.this.oK;
                            int unused2 = uR.this.mZ;
                        }
                        uR.this.WMI = 0L;
                        uR.this.edo = false;
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            if (uR.this.yBV() > 0) {
                if (uR.this.yBV != jWMI) {
                    if (com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.TFq()) {
                        long unused3 = uR.this.yBV;
                    }
                    uR uRVar = uR.this;
                    uRVar.ZRu(jWMI, uRVar.yBV());
                }
                uR.this.yBV = jWMI;
            }
            if (uR.this.NOt()) {
                uR uRVar2 = uR.this;
                uRVar2.ZRu(uRVar2.yBV(), uR.this.yBV());
            } else if (uR.this.sAl != null) {
                uR.this.sAl.postDelayed(this, uR.this.th);
            }
        }
    };
    private final ZRu Cox = new ZRu();
    private long Ho = 0;
    private long bO = 0;
    private boolean AK = false;

    public class ZRu implements Runnable {
        private long NOt;
        private boolean mZ;

        public ZRu() {
        }

        public void ZRu(boolean z10) {
            this.mZ = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (uR.this.Ht != null) {
                try {
                    if (!this.mZ) {
                        long jVor = uR.this.Ht.Vor();
                        uR.this.lp = Math.max(this.NOt, jVor);
                    }
                    long unused = uR.this.lp;
                } catch (Throwable th) {
                    th.toString();
                }
            }
            if (uR.this.sAl != null) {
                uR.this.sAl.sendEmptyMessageDelayed(100, 0L);
            }
        }

        public void ZRu(long j10) {
            this.NOt = j10;
        }
    }

    public uR() {
        ZRu("SSMediaPlayerWrapper");
    }

    private void MR() {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.om;
        for (WeakReference<ZRu.InterfaceC0376ZRu> weakReference : this.MR) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().ZRu(this, jElapsedRealtime);
            }
        }
        this.TFq = true;
    }

    private void Nb() {
        if (this.Vor) {
            return;
        }
        this.Vor = true;
        ArrayList arrayList = new ArrayList(this.to);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        this.to.clear();
        this.Vor = false;
    }

    private void OCA() {
        this.oK = 0L;
        this.mZ = 0;
        this.WMI = 0L;
        this.edo = false;
        this.yBV = Long.MIN_VALUE;
    }

    private void VdW() {
        ArrayList<Runnable> arrayList = this.to;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Nb();
    }

    private boolean ZRu(int i10, int i11) {
        boolean z10 = i10 == -1010 || i10 == -1007 || i10 == -1004 || i10 == -110 || i10 == 100 || i10 == 200;
        if (i11 == 1 || i11 == 700 || i11 == 800) {
            return true;
        }
        return z10;
    }

    private void Zf() {
        if (this.Ht == null) {
            return;
        }
        try {
            this.Ht.lp();
        } catch (Throwable unused) {
        }
        this.Ht.ZRu((mZ.NOt) null);
        this.Ht.ZRu((mZ.Mm) null);
        this.Ht.ZRu((mZ.ZRu) null);
        this.Ht.ZRu((mZ.uR) null);
        this.Ht.ZRu((mZ.InterfaceC0374mZ) null);
        this.Ht.ZRu((mZ.TFq) null);
        this.Ht.ZRu((mZ.Ht) null);
        try {
            this.Ht.ZH();
        } catch (Throwable unused2) {
        }
    }

    private void fcs() {
        ru ruVar = this.sAl;
        if (ruVar != null) {
            ruVar.post(new Runnable() { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.uR.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        uR.this.Ht.Mm();
                        uR.this.ZH = 207;
                        uR.this.gI = false;
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    private void le() {
        SparseIntArray sparseIntArray = ru;
        sparseIntArray.put(this.xY, sparseIntArray.get(this.xY) + 1);
    }

    private void ru() {
        ru ruVar = this.sAl;
        if (ruVar == null || ruVar.getLooper() == null) {
            return;
        }
        this.sAl.post(new Runnable() { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.uR.6
            @Override // java.lang.Runnable
            public void run() {
                if (uR.this.sAl == null || uR.this.sAl.getLooper() == null) {
                    return;
                }
                try {
                    com.bytedance.sdk.component.FA.ZRu.ZRu.ZRu().ZRu(uR.this.sAl);
                    uR.this.sAl = null;
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void th() {
        ArrayList<Runnable> arrayList = this.to;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.to.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void to() {
        ru ruVar = this.sAl;
        if (ruVar != null) {
            ruVar.post(new Runnable() { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.uR.10
                @Override // java.lang.Runnable
                public void run() {
                    if (uR.this.Ht == null) {
                        try {
                            uR.this.Ht = new NOt();
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                        if (uR.this.Ht == null) {
                            return;
                        }
                        mZ unused = uR.this.Ht;
                        uR.this.Zf = MBridgeConstans.ENDCARD_URL_TYPE_PL;
                        uR.this.Ht.ZRu((mZ.TFq) uR.this);
                        uR.this.Ht.ZRu((mZ.NOt) uR.this);
                        uR.this.Ht.ZRu((mZ.InterfaceC0374mZ) uR.this);
                        uR.this.Ht.ZRu((mZ.ZRu) uR.this);
                        uR.this.Ht.ZRu((mZ.Ht) uR.this);
                        uR.this.Ht.ZRu((mZ.uR) uR.this);
                        uR.this.Ht.ZRu((mZ.Mm) uR.this);
                        try {
                            uR.this.Ht.mZ(false);
                        } catch (Throwable unused2) {
                        }
                        uR.this.FA = false;
                    }
                }
            });
        }
    }

    private void xY() {
        NOt(new Runnable() { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.uR.14
            @Override // java.lang.Runnable
            public void run() {
                if (uR.this.sAl != null) {
                    uR.this.sAl.sendEmptyMessage(104);
                }
            }
        });
    }

    public long WMI() {
        if (FA()) {
            return 0L;
        }
        if (this.ZH == 206 || this.ZH == 207) {
            try {
                return this.Ht.Vor();
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public long edo() {
        if (this.edo) {
            long j10 = this.WMI;
            if (j10 > 0) {
                return this.oK + j10;
            }
        }
        return this.oK;
    }

    public void lp() {
        if (FA()) {
            return;
        }
        this.aT = true;
        th();
        ru ruVar = this.sAl;
        if (ruVar != null) {
            try {
                ruVar.removeCallbacksAndMessages(null);
                if (this.Ht != null) {
                    this.sAl.sendEmptyMessage(103);
                }
                ru();
            } catch (Throwable unused) {
                ru();
            }
        }
    }

    public int oK() {
        return this.mZ;
    }

    public SurfaceTexture om() {
        return this.ZRu;
    }

    public SurfaceHolder qF() {
        return this.NOt;
    }

    public boolean sAl() {
        return this.ZH == 205;
    }

    public long yBV() {
        long j10 = this.qF;
        if (j10 != 0) {
            return j10;
        }
        if (this.ZH == 206 || this.ZH == 207) {
            try {
                this.qF = this.Ht.aT();
            } catch (Throwable unused) {
            }
        }
        return this.qF;
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu
    public boolean FA() {
        return this.aT;
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu
    public boolean Ht() {
        ru ruVar;
        return (this.ZH == 206 || ((ruVar = this.sAl) != null && ruVar.hasMessages(100))) && !this.gI;
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu
    public boolean Mm() {
        ru ruVar;
        return ((this.ZH != 207 && !this.gI) || (ruVar = this.sAl) == null || ruVar.hasMessages(100)) ? false : true;
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu
    public int TFq() {
        if (this.Ht == null || FA()) {
            return 0;
        }
        return this.Ht.edo();
    }

    public void Vor() {
        if (FA() || this.Ht == null) {
            return;
        }
        this.WD.set(true);
        if (this.ZH != 206) {
            OCA();
            this.gI = false;
            this.Cox.ZRu(true);
            NOt(0L);
            ru ruVar = this.sAl;
            if (ruVar != null) {
                ruVar.removeCallbacks(this.Yx);
                this.sAl.postDelayed(this.Yx, this.th);
            }
        }
        this.VdW.countDown();
    }

    public void ZH() {
        ru ruVar;
        if (FA() || (ruVar = this.sAl) == null) {
            return;
        }
        ruVar.removeMessages(100);
        this.gI = true;
        if (this.AK) {
            if (!this.TFq && !NOt(this.fcs)) {
                ZRu(new Runnable() { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.uR.13
                    @Override // java.lang.Runnable
                    public void run() {
                        if (uR.this.sAl != null) {
                            uR.this.sAl.sendEmptyMessage(101);
                        }
                    }
                });
                return;
            }
            ru ruVar2 = this.sAl;
            if (ruVar2 != null) {
                ruVar2.sendEmptyMessage(101);
                return;
            }
            return;
        }
        if (!this.OCA && !NOt(this.fcs)) {
            ZRu(new Runnable() { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.uR.12
                @Override // java.lang.Runnable
                public void run() {
                    if (uR.this.sAl != null) {
                        uR.this.sAl.sendEmptyMessage(101);
                    }
                }
            });
            return;
        }
        ru ruVar3 = this.sAl;
        if (ruVar3 != null) {
            ruVar3.sendEmptyMessage(101);
        }
    }

    public void aT() {
        if (FA() || this.sAl == null) {
            return;
        }
        this.WD.set(true);
        this.sAl.post(new Runnable() { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.uR.11
            @Override // java.lang.Runnable
            public void run() {
                if (!uR.this.Mm() || uR.this.Ht == null) {
                    return;
                }
                try {
                    uR.this.Ht.TFq();
                    for (WeakReference weakReference : uR.this.MR) {
                        if (weakReference != null && weakReference.get() != null) {
                            ((ZRu.InterfaceC0376ZRu) weakReference.get()).TFq(uR.this);
                        }
                    }
                    uR.this.ZH = 206;
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        });
    }

    private void NOt(long j10) {
        this.Cox.ZRu(j10);
        if (this.le) {
            NOt(this.Cox);
        } else if (NOt(this.fcs)) {
            NOt(this.Cox);
        } else {
            ZRu(this.Cox);
        }
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu
    public boolean mZ() {
        return sAl() || Ht() || Mm();
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu
    public int uR() {
        if (this.Ht == null || FA()) {
            return 0;
        }
        return this.Ht.sAl();
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ.Ht
    public void mZ(mZ mZVar) {
        for (WeakReference<ZRu.InterfaceC0376ZRu> weakReference : this.MR) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().ZRu((com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu) this, true);
            }
        }
    }

    private boolean NOt(com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ mZVar) {
        return mZVar != null && mZVar.uR();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(long j10, long j11) {
        long j12;
        long j13;
        for (WeakReference<ZRu.InterfaceC0376ZRu> weakReference : this.MR) {
            if (weakReference == null || weakReference.get() == null) {
                j12 = j10;
                j13 = j11;
            } else {
                j12 = j10;
                j13 = j11;
                weakReference.get().ZRu(this, j12, j13);
            }
            j10 = j12;
            j11 = j13;
        }
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu
    public boolean NOt() {
        return this.ZH == 209;
    }

    private void NOt(String str) throws Throwable {
        FileInputStream fileInputStream = new FileInputStream(str);
        this.Ht.ZRu(fileInputStream.getFD());
        fileInputStream.close();
    }

    private void ZRu(String str) {
        this.xY = 0;
        this.sAl = com.bytedance.sdk.component.FA.ZRu.ZRu.ZRu().ZRu(this, Vor.THREAD_NAME_PRE.concat(String.valueOf(str)));
        this.AK = true;
        to();
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ.uR
    public boolean NOt(mZ mZVar, int i10, int i11) {
        if (this.Ht != mZVar) {
            return false;
        }
        if (i11 == -1004) {
            com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.ZRu zRu = new com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.ZRu(i10, i11);
            for (WeakReference<ZRu.InterfaceC0376ZRu> weakReference : this.MR) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().ZRu(this, zRu);
                }
            }
        }
        NOt(i10, i11);
        return false;
    }

    public void ZRu(final boolean z10) {
        if (FA()) {
            return;
        }
        this.le = z10;
        if (this.Ht != null) {
            this.Ht.ZRu(z10);
            return;
        }
        ru ruVar = this.sAl;
        if (ruVar != null) {
            ruVar.post(new Runnable() { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.uR.9
                @Override // java.lang.Runnable
                public void run() {
                    if (uR.this.Ht != null) {
                        uR.this.Ht.ZRu(z10);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NOt(int i10, int i11) {
        if (i10 == 701) {
            this.Ho = SystemClock.elapsedRealtime();
            this.mZ++;
            for (WeakReference<ZRu.InterfaceC0376ZRu> weakReference : this.MR) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().ZRu(this, Integer.MAX_VALUE, 0, 0);
                }
            }
            return;
        }
        if (i10 == 702) {
            if (this.Ho > 0) {
                this.bO = (SystemClock.elapsedRealtime() - this.Ho) + this.bO;
                this.Ho = 0L;
            }
            for (WeakReference<ZRu.InterfaceC0376ZRu> weakReference2 : this.MR) {
                if (weakReference2 != null && weakReference2.get() != null) {
                    weakReference2.get().ZRu((com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu) this, Integer.MAX_VALUE);
                }
            }
            return;
        }
        if (this.AK && i10 == 3) {
            VdW();
            MR();
            NOt(this.f140094Nb);
        }
    }

    public void ZRu(boolean z10, long j10, boolean z11) {
        if (FA()) {
            return;
        }
        to();
        this.f140094Nb = z11;
        this.WD.set(true);
        this.gI = false;
        NOt(z11);
        if (z10) {
            this.lp = j10;
            xY();
        } else {
            NOt(j10);
        }
        ru ruVar = this.sAl;
        if (ruVar != null) {
            ruVar.removeCallbacks(this.Yx);
            this.sAl.postDelayed(this.Yx, this.th);
        }
        this.VdW.countDown();
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ.TFq
    public void NOt(mZ mZVar) {
        if (FA()) {
            return;
        }
        this.ZH = HttpStatus.SC_RESET_CONTENT;
        try {
            com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ mZVar2 = this.fcs;
            if (mZVar2 != null) {
                float fLp = mZVar2.lp();
                if (fLp > 0.0f) {
                    com.bykv.vk.openvk.ZRu.ZRu.ZRu.NOt nOt = new com.bykv.vk.openvk.ZRu.ZRu.ZRu.NOt();
                    nOt.ZRu(fLp);
                    this.Ht.ZRu(nOt);
                }
            }
        } catch (Throwable unused) {
        }
        if (this.sAl != null) {
            if (this.gI) {
                fcs();
            } else {
                ru ruVar = this.sAl;
                ruVar.sendMessage(ruVar.obtainMessage(100, -1, -1));
            }
        }
        ru.delete(this.xY);
        boolean z10 = this.AK;
        boolean z11 = this.OCA;
        if (!z10 && !z11) {
            MR();
            this.OCA = true;
        }
        for (WeakReference<ZRu.InterfaceC0376ZRu> weakReference : this.MR) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().NOt(this);
            }
        }
    }

    public void ZRu(final long j10) {
        if (FA()) {
            return;
        }
        if (this.ZH == 207 || this.ZH == 206 || this.ZH == 209) {
            NOt(new Runnable() { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.uR.2
                @Override // java.lang.Runnable
                public void run() {
                    if (uR.this.sAl != null) {
                        uR.this.sAl.obtainMessage(106, Long.valueOf(j10)).sendToTarget();
                    }
                }
            });
        }
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu
    public boolean ZRu() {
        return this.TFq;
    }

    public void ZRu(final SurfaceTexture surfaceTexture) {
        if (FA()) {
            return;
        }
        this.ZRu = surfaceTexture;
        ZRu(true);
        NOt(new Runnable() { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.uR.3
            @Override // java.lang.Runnable
            public void run() {
                uR.this.to();
                if (uR.this.sAl != null) {
                    uR.this.sAl.obtainMessage(111, surfaceTexture).sendToTarget();
                }
            }
        });
    }

    public void ZRu(final SurfaceHolder surfaceHolder) {
        if (FA()) {
            return;
        }
        this.NOt = surfaceHolder;
        ZRu(true);
        NOt(new Runnable() { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.uR.4
            @Override // java.lang.Runnable
            public void run() {
                uR.this.to();
                if (uR.this.sAl != null) {
                    uR.this.sAl.obtainMessage(110, surfaceHolder).sendToTarget();
                }
            }
        });
    }

    public void ZRu(final com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ mZVar) {
        if (FA()) {
            return;
        }
        this.fcs = mZVar;
        if (mZVar != null) {
            this.AK = this.AK && !mZVar.uR();
        }
        NOt(new Runnable() { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.uR.5
            @Override // java.lang.Runnable
            public void run() {
                uR.this.to();
                if (uR.this.sAl != null) {
                    uR.this.sAl.obtainMessage(107, mZVar).sendToTarget();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.component.utils.ru.ZRu
    public void ZRu(Message message) {
        int i10 = this.ZH;
        int i11 = message.what;
        if (this.Ht != null) {
            try {
                switch (message.what) {
                    case 100:
                        if (this.ZH == 205 || this.ZH == 207 || this.ZH == 209) {
                            this.Ht.TFq();
                            this.om = SystemClock.elapsedRealtime();
                            this.ZH = 206;
                            if (this.lp > 0) {
                                this.Ht.ZRu(this.lp, this.uR);
                                this.lp = -1L;
                            }
                            if (this.fcs != null) {
                                NOt(this.f140094Nb);
                                return;
                            }
                            return;
                        }
                        break;
                    case 101:
                        if (this.edo) {
                            this.oK += this.WMI;
                        }
                        this.edo = false;
                        this.WMI = 0L;
                        this.yBV = Long.MIN_VALUE;
                        if (this.ZH == 206 || this.ZH == 207 || this.ZH == 209) {
                            this.Ht.Mm();
                            this.ZH = 207;
                            this.gI = false;
                            for (WeakReference<ZRu.InterfaceC0376ZRu> weakReference : this.MR) {
                                if (weakReference != null && weakReference.get() != null) {
                                    weakReference.get().uR(this);
                                }
                            }
                            return;
                        }
                        break;
                    case 102:
                        this.Ht.lp();
                        this.ZH = 201;
                        return;
                    case 103:
                        try {
                            Zf();
                            break;
                        } catch (Throwable unused) {
                        }
                        for (WeakReference<ZRu.InterfaceC0376ZRu> weakReference2 : this.MR) {
                            if (weakReference2 != null && weakReference2.get() != null) {
                                weakReference2.get().mZ(this);
                            }
                        }
                        this.ZH = 203;
                        return;
                    case 104:
                        if (this.ZH == 202 || this.ZH == 208) {
                            this.Ht.FA();
                            return;
                        }
                        break;
                    case 105:
                        if (this.ZH == 205 || this.ZH == 206 || this.ZH == 208 || this.ZH == 207 || this.ZH == 209) {
                            this.Ht.Ht();
                            this.ZH = 208;
                            return;
                        }
                        break;
                    case 106:
                        if (this.ZH == 206 || this.ZH == 207 || this.ZH == 209) {
                            this.Ht.ZRu(((Long) message.obj).longValue(), this.uR);
                            return;
                        }
                        break;
                    case 107:
                        OCA();
                        if (this.ZH == 201 || this.ZH == 203) {
                            com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ mZVar = (com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ) message.obj;
                            if (TextUtils.isEmpty(mZVar.NOt())) {
                                mZVar.ZRu(com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.NOt());
                            }
                            File file = new File(mZVar.NOt(), mZVar.edo());
                            if (file.exists()) {
                                file.getAbsolutePath();
                                if (com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ()) {
                                    NOt(file.getAbsolutePath());
                                } else {
                                    this.Ht.ZRu(file.getAbsolutePath());
                                }
                            } else {
                                mZVar.sAl();
                                this.Ht.ZRu(mZVar);
                                mZVar.sAl();
                            }
                            this.ZH = 202;
                            return;
                        }
                        break;
                    case 108:
                    case 109:
                    default:
                        return;
                    case 110:
                        this.Ht.ZRu((SurfaceHolder) message.obj);
                        this.Ht.NOt(true);
                        this.VdW.await(1L, TimeUnit.SECONDS);
                        VdW();
                        return;
                    case 111:
                        this.fWk = new Surface((SurfaceTexture) message.obj);
                        this.Ht.ZRu(this.fWk);
                        this.Ht.NOt(true);
                        this.VdW.await(1L, TimeUnit.SECONDS);
                        VdW();
                        return;
                }
                this.ZH = 200;
                if (this.FA) {
                    return;
                }
                com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.ZRu zRu = new com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.ZRu(308, i11);
                zRu.ZRu(i10 + "," + i11);
                for (WeakReference<ZRu.InterfaceC0376ZRu> weakReference3 : this.MR) {
                    if (weakReference3 != null && weakReference3.get() != null) {
                        weakReference3.get().ZRu(this, zRu);
                    }
                }
                this.FA = true;
            } catch (Throwable unused2) {
            }
        }
    }

    private void NOt(Runnable runnable) {
        if (runnable == null || FA()) {
            return;
        }
        if (!this.aT) {
            runnable.run();
        } else {
            ZRu(runnable);
        }
    }

    public void NOt(final boolean z10) {
        ru ruVar;
        if (FA() || (ruVar = this.sAl) == null) {
            return;
        }
        ruVar.post(new Runnable() { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.uR.8
            @Override // java.lang.Runnable
            public void run() {
                if (uR.this.FA() || uR.this.Ht == null) {
                    return;
                }
                try {
                    uR.this.f140094Nb = z10;
                    uR.this.Ht.uR(z10);
                } catch (Throwable unused) {
                }
            }
        });
    }

    public void NOt(int i10) {
        this.uR = i10;
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ.ZRu
    public void ZRu(mZ mZVar, int i10) {
        if (this.Ht != mZVar) {
            return;
        }
        for (WeakReference<ZRu.InterfaceC0376ZRu> weakReference : this.MR) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().NOt(this, i10);
            }
        }
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ.NOt
    public void ZRu(mZ mZVar) {
        this.ZH = 209;
        ru.delete(this.xY);
        ru ruVar = this.sAl;
        if (ruVar != null) {
            ruVar.removeCallbacks(this.Yx);
        }
        for (WeakReference<ZRu.InterfaceC0376ZRu> weakReference : this.MR) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().ZRu(this);
            }
        }
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ.InterfaceC0374mZ
    public boolean ZRu(mZ mZVar, int i10, int i11) {
        le();
        this.ZH = 200;
        ru ruVar = this.sAl;
        if (ruVar != null) {
            ruVar.removeCallbacks(this.Yx);
        }
        if (ZRu(i10, i11)) {
            ru();
        }
        if (!this.WD.get()) {
            return true;
        }
        this.WD.set(false);
        com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.ZRu zRu = new com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.ZRu(i10, i11);
        for (WeakReference<ZRu.InterfaceC0376ZRu> weakReference : this.MR) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().ZRu(this, zRu);
            }
        }
        return true;
    }

    private void ZRu(Runnable runnable) {
        try {
            if (this.to == null) {
                this.to = new ArrayList<>();
            }
            this.to.add(runnable);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.uR.mZ.Mm
    public void ZRu(mZ mZVar, int i10, int i11, int i12, int i13) {
        for (WeakReference<ZRu.InterfaceC0376ZRu> weakReference : this.MR) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().ZRu((com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu) this, i10, i11);
            }
        }
    }

    public void ZRu(ZRu.InterfaceC0376ZRu interfaceC0376ZRu) {
        if (interfaceC0376ZRu == null) {
            return;
        }
        for (WeakReference<ZRu.InterfaceC0376ZRu> weakReference : this.MR) {
            if (weakReference != null && weakReference.get() == interfaceC0376ZRu) {
                return;
            }
        }
        this.MR.add(new WeakReference<>(interfaceC0376ZRu));
    }

    public void ZRu(int i10) {
        if (FA()) {
            return;
        }
        this.th = i10;
    }
}

package com.bytedance.sdk.component.TFq.mZ;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import androidx.core.view.C2462i0;
import com.bytedance.sdk.component.TFq.OCA;
import com.bytedance.sdk.component.TFq.Vor;
import com.bytedance.sdk.component.TFq.ZH;
import com.bytedance.sdk.component.TFq.aT;
import com.bytedance.sdk.component.TFq.edo;
import com.bytedance.sdk.component.TFq.yBV;
import com.prism.gaia.server.content.j;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public class mZ implements Vor {
    private int FA;
    private ImageView.ScaleType Ht;
    private int MR;
    private Bitmap.Config Mm;
    private String NOt;

    /* JADX INFO: renamed from: Nb, reason: collision with root package name */
    private boolean f140645Nb;
    private boolean OCA;
    private yBV TFq;
    private ExecutorService VdW;
    private int Vor;
    private edo WD;
    private int WMI;
    private int ZH;
    Future<?> ZRu;
    private Ht Zf;
    private com.bytedance.sdk.component.TFq.FA aT;
    private boolean edo;
    private int fcs;
    private com.bytedance.sdk.component.TFq.NOt le;
    private WeakReference<ImageView> lp;
    private String mZ;
    private boolean oK;
    private final Handler om;
    private Queue<com.bytedance.sdk.component.TFq.uR.Vor> qF;
    private com.bytedance.sdk.component.TFq.mZ.ZRu ru;
    private volatile boolean sAl;
    private boolean th;
    private com.bytedance.sdk.component.TFq.Mm to;
    private String uR;
    private int xY;
    private OCA yBV;

    public static class NOt implements aT {
        private int FA;
        private Bitmap.Config Ht;
        private int Mm;
        private ImageView NOt;
        private boolean OCA;
        private ImageView.ScaleType TFq;
        private com.bytedance.sdk.component.TFq.FA WMI;
        private OCA ZH;
        private yBV ZRu;
        private edo Zf;
        private String edo;
        private boolean lp;
        private String mZ;
        private com.bytedance.sdk.component.TFq.NOt oK;
        private int om;
        private int qF;
        private boolean sAl;
        private ExecutorService to;
        private String uR;
        private boolean xY;
        private Ht yBV;
        private int Vor = 1;
        private int aT = 5;

        public NOt(Ht ht) {
            this.yBV = ht;
        }

        @Override // com.bytedance.sdk.component.TFq.aT
        public aT NOt(int i10) {
            this.FA = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.TFq.aT
        public aT TFq(int i10) {
            this.om = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.TFq.aT
        public aT ZRu(String str) {
            this.mZ = str;
            return this;
        }

        public aT mZ(String str) {
            this.uR = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.TFq.aT
        public aT uR(int i10) {
            this.qF = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.TFq.aT
        public aT NOt(String str) {
            this.edo = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.TFq.aT
        public aT ZRu(ImageView.ScaleType scaleType) {
            this.TFq = scaleType;
            return this;
        }

        @Override // com.bytedance.sdk.component.TFq.aT
        public aT mZ(int i10) {
            this.Vor = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.TFq.aT
        public aT ZRu(Bitmap.Config config) {
            this.Ht = config;
            return this;
        }

        @Override // com.bytedance.sdk.component.TFq.aT
        public aT ZRu(int i10) {
            this.Mm = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.TFq.aT
        public aT ZRu(OCA oca) {
            this.ZH = oca;
            return this;
        }

        @Override // com.bytedance.sdk.component.TFq.aT
        public aT ZRu(boolean z10) {
            this.sAl = z10;
            return this;
        }

        @Override // com.bytedance.sdk.component.TFq.aT
        public Vor ZRu(yBV ybv, int i10) {
            this.aT = i10;
            return ZRu(ybv);
        }

        @Override // com.bytedance.sdk.component.TFq.aT
        public Vor ZRu(yBV ybv) {
            this.ZRu = ybv;
            return new mZ(this).ru();
        }

        @Override // com.bytedance.sdk.component.TFq.aT
        public Vor ZRu(ImageView imageView) {
            this.NOt = imageView;
            return new mZ(this).ru();
        }

        @Override // com.bytedance.sdk.component.TFq.aT
        public aT ZRu(com.bytedance.sdk.component.TFq.FA fa2) {
            this.WMI = fa2;
            return this;
        }
    }

    public class ZRu implements yBV {
        private yBV NOt;

        public ZRu(yBV ybv) {
            this.NOt = ybv;
        }

        @Override // com.bytedance.sdk.component.TFq.yBV
        public void ZRu(final ZH zh) {
            Bitmap bitmapZRu;
            final ImageView imageView = (ImageView) mZ.this.lp.get();
            if (imageView != null && mZ.this.ZH != 3 && ZRu(imageView) && (zh.NOt() instanceof Bitmap)) {
                final Bitmap bitmap = (Bitmap) zh.NOt();
                mZ.this.om.post(new Runnable() { // from class: com.bytedance.sdk.component.TFq.mZ.mZ.ZRu.1
                    @Override // java.lang.Runnable
                    public void run() {
                        imageView.setImageBitmap(bitmap);
                    }
                });
            }
            try {
                if (mZ.this.aT != null && (zh.NOt() instanceof Bitmap) && (bitmapZRu = mZ.this.aT.ZRu((Bitmap) zh.NOt())) != null) {
                    zh.ZRu(bitmapZRu);
                }
            } catch (Throwable unused) {
            }
            if (mZ.this.WMI == 5) {
                mZ.this.om.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.TFq.mZ.mZ.ZRu.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (ZRu.this.NOt != null) {
                            ZRu.this.NOt.ZRu(zh);
                        }
                    }
                });
                return;
            }
            yBV ybv = this.NOt;
            if (ybv != null) {
                ybv.ZRu(zh);
            }
        }

        private boolean ZRu(ImageView imageView) {
            Object tag;
            return (imageView == null || (tag = imageView.getTag(1094453505)) == null || !tag.equals(mZ.this.mZ)) ? false : true;
        }

        @Override // com.bytedance.sdk.component.TFq.yBV
        public void ZRu(final int i10, final String str, final Throwable th) {
            if (mZ.this.WMI == 5) {
                mZ.this.om.post(new Runnable() { // from class: com.bytedance.sdk.component.TFq.mZ.mZ.ZRu.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (ZRu.this.NOt != null) {
                            ZRu.this.NOt.ZRu(i10, str, th);
                        }
                    }
                });
                return;
            }
            yBV ybv = this.NOt;
            if (ybv != null) {
                ybv.ZRu(i10, str, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Vor ru() {
        try {
            Ht ht = this.Zf;
            if (ht == null) {
                yBV ybv = this.TFq;
                if (ybv != null) {
                    ybv.ZRu(1005, "not init !", null);
                    return this;
                }
            } else {
                ExecutorService executorServiceHt = this.VdW == null ? ht.Ht() : null;
                Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.TFq.mZ.mZ.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.component.TFq.uR.Vor vor;
                        while (!mZ.this.sAl && (vor = (com.bytedance.sdk.component.TFq.uR.Vor) mZ.this.qF.poll()) != null) {
                            try {
                                if (mZ.this.yBV != null) {
                                    mZ.this.yBV.ZRu(vor.ZRu(), mZ.this);
                                }
                                vor.ZRu(mZ.this);
                                if (mZ.this.yBV != null) {
                                    mZ.this.yBV.NOt(vor.ZRu(), mZ.this);
                                }
                            } catch (Throwable th) {
                                mZ.this.ZRu(2000, th.getMessage(), th);
                                if (mZ.this.yBV != null) {
                                    mZ.this.yBV.NOt("exception", mZ.this);
                                    return;
                                }
                                return;
                            }
                        }
                        if (mZ.this.sAl) {
                            mZ.this.ZRu(C2462i0.f111917f, j.f167256W, null);
                        }
                    }
                };
                if (this.th) {
                    runnable.run();
                    return this;
                }
                ExecutorService executorService = this.VdW;
                if (executorService != null) {
                    this.ZRu = executorService.submit(runnable);
                    return this;
                }
                if (executorServiceHt != null) {
                    this.ZRu = executorServiceHt.submit(runnable);
                }
            }
            return this;
        } catch (Exception e10) {
            Log.e("ImageRequest", e10.getMessage());
            return this;
        }
    }

    public com.bytedance.sdk.component.TFq.NOt OCA() {
        return this.le;
    }

    public int WMI() {
        return this.xY;
    }

    public Bitmap.Config ZH() {
        return this.Mm;
    }

    public String Zf() {
        return TFq() + lp();
    }

    public boolean edo() {
        return this.oK;
    }

    public int lp() {
        return this.ZH;
    }

    public boolean oK() {
        return this.OCA;
    }

    public Ht om() {
        return this.Zf;
    }

    public com.bytedance.sdk.component.TFq.mZ.ZRu qF() {
        return this.ru;
    }

    public boolean sAl() {
        return this.edo;
    }

    public boolean to() {
        return this.f140645Nb;
    }

    public edo xY() {
        return this.WD;
    }

    public com.bytedance.sdk.component.TFq.Mm yBV() {
        return this.to;
    }

    private mZ(NOt nOt) {
        this.qF = new LinkedBlockingQueue();
        this.om = new Handler(Looper.getMainLooper());
        this.OCA = true;
        this.NOt = nOt.uR;
        this.TFq = new ZRu(nOt.ZRu);
        this.lp = new WeakReference<>(nOt.NOt);
        this.Ht = nOt.TFq;
        this.Mm = nOt.Ht;
        this.FA = nOt.Mm;
        this.Vor = nOt.FA;
        this.ZH = nOt.Vor;
        this.WMI = nOt.aT;
        this.yBV = nOt.ZH;
        this.le = ZRu(nOt);
        if (!TextUtils.isEmpty(nOt.mZ)) {
            NOt(nOt.mZ);
            ZRu(nOt.mZ);
        }
        this.edo = nOt.lp;
        this.oK = nOt.sAl;
        this.Zf = nOt.yBV;
        this.aT = nOt.WMI;
        this.fcs = nOt.om;
        this.MR = nOt.qF;
        this.VdW = nOt.to;
        this.f140645Nb = nOt.OCA;
        this.th = nOt.xY;
        this.WD = nOt.Zf;
        this.qF.add(new com.bytedance.sdk.component.TFq.uR.mZ());
    }

    public int FA() {
        return this.fcs;
    }

    @Override // com.bytedance.sdk.component.TFq.Vor
    public Bitmap.Config Ht() {
        return this.Mm;
    }

    public int Mm() {
        return this.MR;
    }

    public void NOt(String str) {
        WeakReference<ImageView> weakReference = this.lp;
        if (weakReference != null && weakReference.get() != null) {
            this.lp.get().setTag(1094453505, str);
        }
        this.mZ = str;
    }

    @Override // com.bytedance.sdk.component.TFq.Vor
    public String TFq() {
        return this.mZ;
    }

    public yBV Vor() {
        return this.TFq;
    }

    public String aT() {
        return this.uR;
    }

    @Override // com.bytedance.sdk.component.TFq.Vor
    public int mZ() {
        return this.Vor;
    }

    @Override // com.bytedance.sdk.component.TFq.Vor
    public ImageView.ScaleType uR() {
        return this.Ht;
    }

    private com.bytedance.sdk.component.TFq.NOt ZRu(NOt nOt) {
        if (nOt.oK != null) {
            return nOt.oK;
        }
        if (!TextUtils.isEmpty(nOt.edo)) {
            return com.bytedance.sdk.component.TFq.mZ.ZRu.ZRu.ZRu(new File(nOt.edo));
        }
        return com.bytedance.sdk.component.TFq.mZ.ZRu.ZRu.Mm();
    }

    @Override // com.bytedance.sdk.component.TFq.Vor
    public int NOt() {
        return this.FA;
    }

    @Override // com.bytedance.sdk.component.TFq.Vor
    public String ZRu() {
        return this.NOt;
    }

    public void ZRu(String str) {
        this.uR = str;
    }

    public void ZRu(boolean z10) {
        this.OCA = z10;
    }

    public void ZRu(com.bytedance.sdk.component.TFq.Mm mm) {
        this.to = mm;
    }

    public void ZRu(int i10) {
        this.xY = i10;
    }

    public void ZRu(com.bytedance.sdk.component.TFq.mZ.ZRu zRu) {
        this.ru = zRu;
    }

    public boolean ZRu(com.bytedance.sdk.component.TFq.uR.Vor vor) {
        if (this.sAl) {
            return false;
        }
        return this.qF.add(vor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(int i10, String str, Throwable th) {
        new com.bytedance.sdk.component.TFq.uR.FA(i10, str, th).ZRu(this);
        this.qF.clear();
    }
}

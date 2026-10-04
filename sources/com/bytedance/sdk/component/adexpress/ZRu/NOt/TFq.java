package com.bytedance.sdk.component.adexpress.ZRu.NOt;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu;
import com.bytedance.sdk.component.utils.WMI;
import com.bytedance.sdk.component.utils.lp;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public class TFq extends mZ {
    private static volatile TFq NOt;
    private static File ZRu;
    private AtomicBoolean mZ = new AtomicBoolean(true);
    private AtomicBoolean uR = new AtomicBoolean(false);
    private boolean TFq = false;
    private AtomicBoolean Ht = new AtomicBoolean(false);
    private AtomicInteger Mm = new AtomicInteger(0);
    private AtomicLong FA = new AtomicLong();

    private TFq() {
        aT();
    }

    public static File FA() {
        if (ZRu == null) {
            try {
                File file = new File(new File(uR.ZRu(), "tt_tmpl_pkg"), "template");
                file.mkdirs();
                ZRu = file;
            } catch (Throwable th) {
                lp.ZRu("TemplateManager", "getTemplateDir error", th);
            }
        }
        return ZRu;
    }

    public static TFq NOt() {
        if (NOt == null) {
            synchronized (TFq.class) {
                try {
                    if (NOt == null) {
                        NOt = new TFq();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return NOt;
    }

    private void ZH() {
        if (this.Mm.getAndSet(0) <= 0 || System.currentTimeMillis() - this.FA.get() <= 600000) {
            return;
        }
        Mm();
    }

    private void aT() {
        com.bytedance.sdk.component.adexpress.uR.uR.NOt(new com.bytedance.sdk.component.FA.FA("init") { // from class: com.bytedance.sdk.component.adexpress.ZRu.NOt.TFq.1
            @Override // java.lang.Runnable
            public void run() {
                FA.ZRu();
                TFq.this.mZ.set(false);
                TFq.this.uR();
                TFq.this.Mm();
                if (com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ() == null || !WMI.ZRu(com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ().NOt())) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ().mZ().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ZRu.NOt.TFq.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ() != null) {
                            com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ().uR();
                        }
                    }
                });
            }
        }, 10);
    }

    public com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu Ht() {
        return FA.NOt();
    }

    public void Mm() {
        ZRu(false);
    }

    public boolean TFq() {
        return this.TFq;
    }

    public void Vor() {
        this.Ht.set(true);
        this.TFq = false;
        this.uR.set(false);
    }

    public void mZ() {
        aT();
    }

    public void uR() {
        com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu zRuNOt = FA.NOt();
        if (zRuNOt == null || !zRuNOt.Mm()) {
            return;
        }
        boolean zZRu = ZRu(zRuNOt);
        if (!zZRu) {
            FA.uR();
        }
        this.TFq = zZRu;
    }

    public boolean ZRu(com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu zRu) {
        if (zRu == null) {
            return false;
        }
        return ZRu(zRu.ZRu()) || ZRu(zRu.TFq()) || ZRu(zRu.Ht());
    }

    @Override // com.bytedance.sdk.component.adexpress.ZRu.NOt.mZ
    public File ZRu() {
        return FA();
    }

    public void ZRu(boolean z10) {
        List<ZRu.C0421ZRu> listZRu;
        boolean z11;
        if (this.mZ.get()) {
            return;
        }
        try {
            if (this.uR.get()) {
                if (z10) {
                    this.Mm.getAndIncrement();
                    return;
                }
                return;
            }
            boolean z12 = true;
            this.uR.set(true);
            com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu zRuTFq = com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ().TFq();
            com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu zRuNOt = FA.NOt();
            if (zRuTFq != null && zRuTFq.Mm()) {
                if (!FA.NOt(zRuTFq)) {
                    this.uR.set(false);
                    this.FA.set(System.currentTimeMillis());
                    return;
                }
                if (com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ() != null) {
                    com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ().mZ().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ZRu.NOt.TFq.2
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.component.adexpress.TFq.TFq.ZRu().NOt();
                        }
                    });
                }
                FA.ZRu(zRuTFq);
                boolean zZRu = (zRuTFq.TFq() == null || TextUtils.isEmpty(zRuTFq.TFq().ZRu())) ? false : ZRu(zRuTFq.TFq().ZRu());
                if (zRuTFq.ZRu().size() != 0) {
                    listZRu = ZRu(zRuTFq, zRuNOt);
                    z11 = listZRu != null;
                } else {
                    listZRu = null;
                    z11 = zZRu;
                }
                if (!zZRu) {
                    List<ZRu.C0421ZRu> listNOt = NOt(zRuTFq, zRuNOt);
                    if (listZRu == null || listNOt == null) {
                        listZRu = listNOt;
                    } else {
                        listZRu.addAll(listNOt);
                    }
                    if (listNOt == null) {
                        z12 = false;
                    }
                    if (listNOt == null) {
                        this.uR.set(false);
                    }
                    z11 = z12;
                }
                if (z11 && ZRu(zRuTFq)) {
                    FA.ZRu(zRuTFq);
                    FA.mZ();
                    NOt(listZRu);
                }
                uR();
                this.uR.set(false);
                this.FA.set(System.currentTimeMillis());
                ZH();
                return;
            }
            this.uR.set(false);
            ZRu(109);
        } catch (Throwable unused) {
        }
    }

    public void NOt(boolean z10) {
        this.Ht.set(z10);
    }
}

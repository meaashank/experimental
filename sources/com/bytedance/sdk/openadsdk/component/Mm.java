package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.ru;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.component.Ht;
import com.bytedance.sdk.openadsdk.core.FA;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.core.edo;
import com.bytedance.sdk.openadsdk.core.model.OCA;
import com.bytedance.sdk.openadsdk.core.model.qF;
import com.bytedance.sdk.openadsdk.core.om;
import com.bytedance.sdk.openadsdk.core.settings.yBV;
import com.bytedance.sdk.openadsdk.utils.WD;
import com.bytedance.sdk.openadsdk.utils.fWk;
import i2.C4544a;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class Mm implements ru.ZRu {
    private int FA;
    private AdSlot Ht;
    private PAGAppOpenAdLoadListener Mm;
    private final om<com.bytedance.sdk.openadsdk.uR.ZRu> NOt;
    private boolean ZH;
    private final Context ZRu;
    private final Ht mZ;
    private final AtomicBoolean uR = new AtomicBoolean(false);
    private int TFq = 0;
    private volatile int Vor = 0;
    private final com.bytedance.sdk.openadsdk.core.model.ru aT = new com.bytedance.sdk.openadsdk.core.model.ru();

    public Mm(Context context) {
        if (context != null) {
            this.ZRu = context.getApplicationContext();
        } else {
            this.ZRu = WMI.ZRu();
        }
        this.NOt = WMI.mZ();
        this.mZ = Ht.ZRu(this.ZRu);
    }

    private void NOt(@NonNull final AdSlot adSlot) {
        final fWk fwkZRu = fWk.ZRu();
        this.Vor = 1;
        OCA oca = new OCA();
        oca.aT = this.aT;
        oca.uR = 1;
        oca.FA = 2;
        this.NOt.ZRu(adSlot, oca, 3, new om.ZRu() { // from class: com.bytedance.sdk.openadsdk.component.Mm.1
            @Override // com.bytedance.sdk.openadsdk.core.om.ZRu
            public void ZRu(int i10, String str) {
                Mm.this.Vor = 3;
                Mm.this.ZRu(new com.bytedance.sdk.openadsdk.component.TFq.NOt(2, 100, i10, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.om.ZRu
            public void ZRu(final com.bytedance.sdk.openadsdk.core.model.ZRu zRu, com.bytedance.sdk.openadsdk.core.model.NOt nOt) {
                Mm.this.Vor = 2;
                if (zRu == null || zRu.mZ() == null || zRu.mZ().size() == 0) {
                    Mm.this.Vor = 3;
                    Mm.this.ZRu(new com.bytedance.sdk.openadsdk.component.TFq.NOt(2, 100, 20001, FA.ZRu(20001)));
                    nOt.ZRu(-3);
                    com.bytedance.sdk.openadsdk.core.model.NOt.ZRu(nOt);
                    return;
                }
                final qF qFVar = zRu.mZ().get(0);
                long jEdo = qFVar.edo();
                Mm.this.aT.NOt = jEdo;
                boolean zHt = qF.Ht(qFVar);
                if (qFVar.oZ()) {
                    Mm.this.ZRu(new com.bytedance.sdk.openadsdk.component.TFq.NOt(1, 100, qFVar, zRu));
                    return;
                }
                if (zHt) {
                    Mm.this.ZRu(new com.bytedance.sdk.openadsdk.component.TFq.NOt(1, 100, qFVar, zRu));
                    if (qF.TFq(qFVar)) {
                        Mm.this.ZRu(qFVar, adSlot, false, zRu);
                        return;
                    } else {
                        Mm.this.ZRu(qFVar, false, zRu);
                        return;
                    }
                }
                if (qF.TFq(qFVar)) {
                    int iLp = WMI.uR().lp();
                    if (iLp == 1 || iLp == 3) {
                        Mm.this.aT.NOt = -1L;
                        Mm.this.aT.ZRu(3);
                        Mm.this.ZRu(new com.bytedance.sdk.openadsdk.component.TFq.NOt(1, 100, qFVar, zRu));
                        Mm.this.ZRu(qFVar, adSlot, false, zRu);
                        return;
                    }
                    Mm.this.ZRu(qFVar, adSlot, !r0.aT.ZRu, zRu);
                } else {
                    if (WMI.uR().ZH() == 1) {
                        Mm.this.aT.NOt = -1L;
                        Mm.this.aT.ZRu(3);
                        Mm.this.ZRu(new com.bytedance.sdk.openadsdk.component.TFq.NOt(1, 100, qFVar, zRu));
                        Mm.this.ZRu(qFVar, false, zRu);
                        return;
                    }
                    Mm.this.ZRu(qFVar, !r0.aT.ZRu, zRu);
                }
                if (Mm.this.aT.ZRu) {
                    com.bytedance.sdk.openadsdk.edo.mZ.ZRu(qFVar, fwkZRu.mZ());
                    if (jEdo == 0) {
                        Mm.this.aT.ZRu(2);
                        Mm.this.ZRu(new com.bytedance.sdk.openadsdk.component.TFq.NOt(1, 100, qFVar, zRu));
                    } else {
                        edo.NOt().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.Mm.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Mm.this.aT.ZRu(2);
                                Mm.this.ZRu(new com.bytedance.sdk.openadsdk.component.TFq.NOt(1, 100, qFVar, zRu));
                            }
                        }, jEdo);
                    }
                }
            }
        });
    }

    public static Mm ZRu(Context context) {
        return new Mm(context);
    }

    public void ZRu(@NonNull AdSlot adSlot, com.bytedance.sdk.openadsdk.common.Ht ht, int i10) {
        if (ht == null) {
            return;
        }
        if (i10 <= 0) {
            i10 = C4544a.f202779h;
        }
        this.Ht = adSlot;
        this.aT.ZRu = !TextUtils.isEmpty(adSlot.getBidAdm());
        if (ht instanceof PAGAppOpenAdLoadListener) {
            this.Mm = (PAGAppOpenAdLoadListener) ht;
        }
        this.TFq = ZRu(this.Ht);
        this.FA = i10;
        this.aT.ZRu(fWk.ZRu());
        if (this.aT.ZRu || yBV.CH().le(this.Ht.getCodeId()) == 0) {
            NOt(this.Ht);
        }
        if (this.aT.ZRu) {
            return;
        }
        new ru(edo.NOt().getLooper(), this).sendEmptyMessageDelayed(1, i10);
        ZRu();
    }

    private void ZRu() {
        WD.NOt(new com.bytedance.sdk.component.FA.FA("tryGetAppOpenAdFromCache") { // from class: com.bytedance.sdk.openadsdk.component.Mm.2
            @Override // java.lang.Runnable
            public void run() {
                int iLp;
                qF qFVarTFq = Mm.this.mZ.TFq(Mm.this.TFq);
                if (qFVarTFq == null) {
                    Mm.this.ZRu(false);
                    return;
                }
                if (qFVarTFq.WD() == null) {
                    qFVarTFq.ZRu(Mm.this.Ht);
                }
                boolean zTFq = qF.TFq(qFVarTFq);
                if (qFVarTFq.oZ()) {
                    Mm.this.ZRu(new com.bytedance.sdk.openadsdk.component.TFq.NOt(1, 101, qFVarTFq, (com.bytedance.sdk.openadsdk.core.model.ZRu) null));
                    return;
                }
                if (!zTFq && WMI.uR().ZH() == 1) {
                    Mm.this.ZRu(new com.bytedance.sdk.openadsdk.component.TFq.NOt(1, 101, qFVarTFq, (com.bytedance.sdk.openadsdk.core.model.ZRu) null));
                    return;
                }
                if (zTFq && ((iLp = WMI.uR().lp()) == 2 || iLp == 3)) {
                    Mm.this.ZRu(new com.bytedance.sdk.openadsdk.component.TFq.NOt(1, 101, qFVarTFq, (com.bytedance.sdk.openadsdk.core.model.ZRu) null));
                    return;
                }
                if (!Mm.this.mZ.NOt(Mm.this.TFq) && !Mm.this.mZ.uR(Mm.this.TFq)) {
                    Mm.this.ZRu(true);
                    return;
                }
                if (yBV.CH().le(Mm.this.Ht.getCodeId()) == 0) {
                    Mm.this.mZ.Mm(Mm.this.TFq);
                }
                if (zTFq) {
                    if (!TextUtils.isEmpty(Mm.this.mZ.ZRu(qFVarTFq))) {
                        Mm.this.ZRu(new com.bytedance.sdk.openadsdk.component.TFq.NOt(1, 101, qFVarTFq, (com.bytedance.sdk.openadsdk.core.model.ZRu) null));
                        return;
                    } else {
                        Mm.this.ZRu(false);
                        com.bytedance.sdk.openadsdk.component.uR.ZRu.NOt(qFVarTFq);
                        return;
                    }
                }
                if (Mm.this.mZ.NOt(qFVarTFq)) {
                    Mm.this.ZRu(new com.bytedance.sdk.openadsdk.component.TFq.NOt(1, 101, qFVarTFq, (com.bytedance.sdk.openadsdk.core.model.ZRu) null));
                } else {
                    Mm.this.ZRu(false);
                    com.bytedance.sdk.openadsdk.component.uR.ZRu.NOt(qFVarTFq);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(boolean z10) {
        if (z10) {
            this.mZ.Mm(this.TFq);
        }
        if (yBV.CH().le(this.Ht.getCodeId()) == 1) {
            NOt(this.Ht);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(@NonNull final qF qFVar, AdSlot adSlot, final boolean z10, final com.bytedance.sdk.openadsdk.core.model.ZRu zRu) {
        this.mZ.ZRu(qFVar, adSlot, this.aT, new Ht.mZ() { // from class: com.bytedance.sdk.openadsdk.component.Mm.3
            @Override // com.bytedance.sdk.openadsdk.component.Ht.mZ
            public void ZRu() {
                Log.d("TTAppOpenAdLoadManager", "preLoadSuccess: video load success");
                if (z10) {
                    Mm.this.Vor = 4;
                    com.bytedance.sdk.openadsdk.component.TFq.NOt nOt = new com.bytedance.sdk.openadsdk.component.TFq.NOt(1, 100, qFVar, zRu);
                    nOt.ZRu(true);
                    Mm.this.ZRu(nOt);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.Ht.mZ
            public void ZRu(int i10, String str) {
                if (z10) {
                    Mm.this.Vor = 5;
                    Mm.this.ZRu(new com.bytedance.sdk.openadsdk.component.TFq.NOt(2, 100, 10003, FA.ZRu(10003)));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(@NonNull final qF qFVar, final boolean z10, final com.bytedance.sdk.openadsdk.core.model.ZRu zRu) {
        this.mZ.ZRu(qFVar, this.aT, new Ht.NOt() { // from class: com.bytedance.sdk.openadsdk.component.Mm.4
            @Override // com.bytedance.sdk.openadsdk.component.Ht.NOt
            public void ZRu(com.bytedance.sdk.openadsdk.WMI.ZRu.NOt nOt) {
                Log.d("TTAppOpenAdLoadManager", "preLoadSuccess: image load success");
                if (z10) {
                    Mm.this.Vor = 4;
                    com.bytedance.sdk.openadsdk.component.TFq.NOt nOt2 = new com.bytedance.sdk.openadsdk.component.TFq.NOt(1, 100, qFVar, zRu);
                    nOt2.ZRu(true);
                    Mm.this.ZRu(nOt2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.Ht.NOt
            public void ZRu() {
                Log.d("TTAppOpenAdLoadManager", "preLoadFail: image load fail");
                if (z10) {
                    Mm.this.Vor = 5;
                    Mm.this.ZRu(new com.bytedance.sdk.openadsdk.component.TFq.NOt(2, 100, 10003, FA.ZRu(10003)));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(com.bytedance.sdk.openadsdk.component.TFq.NOt nOt) {
        int iMZ = nOt.mZ();
        int iUR = nOt.uR();
        if (this.uR.get()) {
            if (iMZ == 1 && iUR == 100 && nOt.NOt()) {
                Ht.ZRu(WMI.ZRu()).ZRu(new com.bytedance.sdk.openadsdk.component.TFq.ZRu(this.TFq, nOt.TFq(), nOt.ZRu()));
                if (this.ZH) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.uR.ZRu.ZRu(nOt.TFq(), 1, this.aT);
                return;
            }
            return;
        }
        if (iMZ != 1) {
            if (iMZ == 2 || iMZ == 3) {
                PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener = this.Mm;
                if (pAGAppOpenAdLoadListener != null) {
                    pAGAppOpenAdLoadListener.onError(nOt.Ht(), nOt.Mm());
                }
                this.uR.set(true);
                if (iMZ == 3) {
                    com.bytedance.sdk.openadsdk.component.uR.ZRu.ZRu(this.Vor, this.FA);
                    return;
                }
                return;
            }
            return;
        }
        if (this.Mm != null) {
            this.Mm.onAdLoaded(new uR(this.ZRu, nOt.TFq(), iUR == 101, this.Ht));
        }
        this.uR.set(true);
        if (iUR == 101) {
            com.bytedance.sdk.openadsdk.component.uR.ZRu.ZRu(nOt.TFq(), this.aT.ZRu().mZ());
            return;
        }
        if (iUR == 100) {
            com.bytedance.sdk.openadsdk.component.uR.ZRu.ZRu(nOt.TFq(), 0, this.aT);
            this.ZH = true;
            if (this.aT.ZRu || qF.Ht(nOt.TFq())) {
                return;
            }
            if (yBV.CH().le(this.Ht.getCodeId()) == 0) {
                this.mZ.ZRu(this.Ht);
            } else {
                this.mZ.ZRu(new com.bytedance.sdk.openadsdk.component.TFq.ZRu(this.TFq, nOt.TFq(), nOt.ZRu()));
            }
        }
    }

    public int ZRu(@NonNull AdSlot adSlot) {
        try {
            return Integer.parseInt(adSlot.getCodeId());
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.component.utils.ru.ZRu
    public void ZRu(Message message) {
        if (message.what != 1 || this.uR.get()) {
            return;
        }
        ZRu(new com.bytedance.sdk.openadsdk.component.TFq.NOt(3, 102, 10002, FA.ZRu(10002)));
    }
}

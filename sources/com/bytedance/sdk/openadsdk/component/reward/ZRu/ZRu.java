package com.bytedance.sdk.openadsdk.component.reward.ZRu;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.ru;
import com.bytedance.sdk.openadsdk.utils.Ht;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu {

    @NonNull
    public final Activity AK;
    private long CXy;

    @NonNull
    public final edo Cox;
    public com.bytedance.sdk.openadsdk.common.sAl GC;
    public int HX;
    public final com.bytedance.sdk.openadsdk.component.reward.view.aT Ho;
    public final int Ht;
    public final ru Hvv;
    public com.bytedance.sdk.openadsdk.utils.ZH IOC;
    public final boolean IZ;
    public boolean Jem;

    @Nullable
    public com.bytedance.sdk.openadsdk.activity.Ht MO;
    public final com.bytedance.sdk.openadsdk.component.reward.view.FA MR;
    public boolean MU;
    public final boolean Mm;
    public boolean NBW;
    public final com.bytedance.sdk.openadsdk.core.model.qF NOt;

    /* JADX INFO: renamed from: Nb, reason: collision with root package name */
    public final ZH f140658Nb;
    public float Np;

    /* JADX INFO: renamed from: Oc, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.component.reward.NOt.NOt f140659Oc;
    public final Context Qg;
    public final String TFq;
    public final Ht VdW;
    public final com.bytedance.sdk.openadsdk.core.sAl.uR.NOt Vr;
    public com.bytedance.sdk.openadsdk.lp.FA WD;
    public boolean Wo;
    public final oK Yx;
    public boolean ZRJ;
    public final int ZRu;

    @NonNull
    public final WMI Zf;
    public final com.bytedance.sdk.openadsdk.component.reward.view.Mm bO;
    public final qF fWk;
    public final lp fcs;
    public final TFq gI;
    public boolean gaw;
    public int gmt;
    public final FA le;
    public final boolean mZ;
    public String nqR;
    private long pDA;
    public final uR ru;
    public final mZ th;
    public final boolean uR;
    public boolean vE;
    public com.bytedance.sdk.openadsdk.component.reward.top.mZ wZ;
    public boolean yM;
    public int yz;
    public int FA = 0;
    public int Vor = 0;
    public final AtomicBoolean aT = new AtomicBoolean(false);
    public final AtomicBoolean ZH = new AtomicBoolean(false);
    public final AtomicBoolean lp = new AtomicBoolean(false);
    public final AtomicBoolean sAl = new AtomicBoolean(false);
    public final AtomicBoolean edo = new AtomicBoolean(false);
    public final AtomicBoolean oK = new AtomicBoolean(false);
    public final AtomicBoolean yBV = new AtomicBoolean(false);
    public final AtomicBoolean WMI = new AtomicBoolean(false);
    public final AtomicBoolean qF = new AtomicBoolean(false);
    public final AtomicBoolean om = new AtomicBoolean(false);
    public final AtomicBoolean OCA = new AtomicBoolean(false);
    public final AtomicBoolean to = new AtomicBoolean(false);
    public final AtomicBoolean xY = new AtomicBoolean(false);
    public boolean Nl = false;
    public int Gis = 1;
    public long gX = 0;

    public ZRu(@NonNull Activity activity, ru ruVar, @NonNull com.bytedance.sdk.openadsdk.core.model.qF qFVar, com.bytedance.sdk.openadsdk.core.sAl.uR.NOt nOt, int i10) {
        this.AK = activity;
        this.Vr = nOt;
        Context contextZRu = com.bytedance.sdk.openadsdk.core.WMI.ZRu();
        this.Qg = contextZRu;
        this.NOt = qFVar;
        this.ZRu = i10;
        this.IZ = i10 == 0 || i10 == 2;
        this.gaw = i10 == 0 || i10 == 1;
        this.Hvv = ruVar;
        boolean z10 = qFVar.WD().getDurationSlotType() == 7;
        this.uR = z10;
        this.TFq = z10 ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.vE = qFVar.ZRu();
        this.Mm = com.bytedance.sdk.openadsdk.core.model.yBV.Vor(qFVar);
        int iGE = qFVar.GE();
        this.Ht = iGE;
        this.NBW = com.bytedance.sdk.openadsdk.core.WMI.uR().WMI(String.valueOf(iGE));
        this.mZ = com.bytedance.sdk.openadsdk.core.settings.yBV.CH().edo(String.valueOf(iGE));
        this.fcs = i10 == 2 ? new sAl(this) : new lp(this);
        this.Ho = i10 == 2 ? new com.bytedance.sdk.openadsdk.component.reward.view.ZH(this) : qFVar.ZRu() ? new com.bytedance.sdk.openadsdk.component.reward.view.aT(this) : new com.bytedance.sdk.openadsdk.component.reward.view.Vor(this);
        this.bO = new com.bytedance.sdk.openadsdk.component.reward.view.Mm(this);
        this.Zf = new WMI(this);
        this.ru = new uR(this);
        this.le = new FA(this, qFVar);
        this.MR = new com.bytedance.sdk.openadsdk.component.reward.view.FA(this);
        this.fWk = new qF(this);
        this.Yx = new oK(this);
        this.Cox = new edo(this);
        this.gI = new TFq(this);
        this.f140658Nb = new ZH(this);
        this.VdW = new Ht(this);
        this.th = new mZ(this);
        this.WD = new com.bytedance.sdk.openadsdk.lp.FA(contextZRu);
        this.IOC = com.bytedance.sdk.openadsdk.utils.Ht.ZRu(activity, new Ht.ZRu() { // from class: com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu.1
            @Override // com.bytedance.sdk.openadsdk.utils.Ht.ZRu
            public void NOt() {
                edo edoVar = ZRu.this.Cox;
                if (edoVar != null) {
                    edoVar.Ht();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.utils.Ht.ZRu
            public View ZRu() {
                com.bytedance.sdk.openadsdk.component.reward.view.aT aTVar = ZRu.this.Ho;
                if (aTVar != null) {
                    return aTVar.aT();
                }
                return null;
            }
        });
    }

    public void NOt() {
        if (this.CXy <= 0) {
            this.CXy = SystemClock.elapsedRealtime();
        }
        this.pDA = (SystemClock.elapsedRealtime() - this.CXy) + this.pDA;
    }

    public void ZRu(boolean z10) {
        this.MU = z10;
        this.Cox.uR(z10);
    }

    public long mZ() {
        return (SystemClock.elapsedRealtime() - this.CXy) + this.pDA;
    }

    public void ZRu() {
        this.CXy = SystemClock.elapsedRealtime();
    }
}

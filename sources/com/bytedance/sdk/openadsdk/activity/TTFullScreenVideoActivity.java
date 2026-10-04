package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.ZRu.ZRu.ZRu.uR.mZ;
import com.bytedance.sdk.component.utils.lp;
import com.bytedance.sdk.component.utils.om;
import com.bytedance.sdk.openadsdk.component.reward.ZRu.FA;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.core.Zf;
import com.bytedance.sdk.openadsdk.core.model.qF;
import com.bytedance.sdk.openadsdk.core.model.xY;
import com.bytedance.sdk.openadsdk.core.model.yBV;
import com.bytedance.sdk.openadsdk.core.ru;
import com.bytedance.sdk.openadsdk.uR.Mm;
import com.bytedance.sdk.openadsdk.uR.TFq.NOt.oK;
import com.bytedance.sdk.openadsdk.utils.OCA;
import com.bytedance.sdk.openadsdk.utils.WD;
import com.bytedance.sdk.openadsdk.utils.ZH;

/* JADX INFO: loaded from: classes3.dex */
public class TTFullScreenVideoActivity extends TTBaseVideoActivity {
    private static com.bytedance.sdk.openadsdk.ZRu.mZ.NOt lp;
    private com.bytedance.sdk.openadsdk.ZRu.mZ.NOt ZH;
    private boolean sAl;

    private boolean NOt(qF qFVar) {
        if (qFVar == null) {
            return false;
        }
        return WMI.uR().OCA(String.valueOf(this.NOt.Ht));
    }

    private void OCA() {
        if (this.FA) {
            return;
        }
        this.FA = true;
        OCA.ZRu("BVA", "invoke callback onAdClose, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
            ZRu("onAdClose");
            return;
        }
        com.bytedance.sdk.openadsdk.ZRu.mZ.NOt nOt = this.ZH;
        if (nOt != null) {
            nOt.NOt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void om() {
        OCA.ZRu("BVA", "invoke callback onAdClicked, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
            ZRu("onAdVideoBarClick");
            return;
        }
        com.bytedance.sdk.openadsdk.ZRu.mZ.NOt nOt = this.ZH;
        if (nOt != null) {
            nOt.onAdClicked();
        }
    }

    private void uR(int i10) {
        this.NOt.Cox.ZRu(null, String.format(om.ZRu(WMI.ZRu(), "tt_skip_ad_time_text"), Integer.valueOf(i10)));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void TFq() {
        if (com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
            ZRu("onAdShow");
        } else {
            com.bytedance.sdk.openadsdk.ZRu.mZ.NOt nOt = this.ZH;
            if (nOt != null) {
                nOt.ZRu();
            }
        }
        if (qF()) {
            this.NOt.MR.aT();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean WMI() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sAl.uR.NOt
    public void ZRu(int i10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.sAl.uR.NOt
    public void c_() {
        if (this.NOt.NOt.cvm() != 100.0f) {
            this.sAl = true;
        }
        om();
    }

    @Override // com.bytedance.sdk.openadsdk.core.sAl.uR.NOt
    public void edo() {
    }

    public void finalize() throws Throwable {
        super.finalize();
        lp = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.NOt != null) {
            com.bytedance.sdk.openadsdk.Ht.NOt.ZRu().ZRu("videoForceBreak", this.NOt.NOt);
            com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu zRu = this.NOt;
            zRu.le.ZRu(zRu.yM);
        }
        try {
            OCA();
        } catch (Exception unused) {
        }
        super.finish();
    }

    public void mZ(int i10) {
        int iOm = WMI.uR().om(String.valueOf(this.NOt.Ht));
        if (!WMI.uR().Ht(String.valueOf(this.NOt.Ht)) || (!qF.TFq(this.NOt.NOt) && !this.NOt.mZ)) {
            if (i10 >= iOm) {
                com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu zRu = this.NOt;
                if (!zRu.MU) {
                    zRu.ZRu(true);
                }
                ZRu();
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu zRu2 = this.NOt;
        if (!zRu2.MU) {
            zRu2.ZRu(true);
        }
        if (i10 > iOm) {
            ZRu();
        } else {
            uR(iOm - i10);
            this.NOt.Cox.TFq(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu zRu = this.NOt;
        if (zRu == null || qF.TFq(zRu.NOt)) {
            return;
        }
        com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.NOt nOtQg = this.NOt.NOt.Qg();
        if (nOtQg == null) {
            com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.NOt nOt = new com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.NOt();
            nOt.ZRu(10.0d);
            this.NOt.NOt.ZRu(nOt);
        } else if (nOtQg.Ht() <= 0.0d) {
            nOtQg.ZRu(10.0d);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        OCA();
        if (com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
            ZRu("recycleRes");
        }
        this.ZH = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        com.bytedance.sdk.openadsdk.component.reward.view.NOt nOtZRu;
        super.onResume();
        com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu zRu = this.NOt;
        if (zRu == null || (nOtZRu = zRu.MR.ZRu()) == null) {
            return;
        }
        nOtZRu.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.Ht() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.core.widget.Ht
            public void ZRu() {
                TTFullScreenVideoActivity.this.om();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        lp = this.ZH;
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu zRu = this.NOt;
        if (zRu == null || !NOt(zRu.NOt) || ZRu(this.NOt.NOt)) {
            return;
        }
        if (this.sAl) {
            this.sAl = false;
            finish();
        } else if (this.NOt.fWk.Yx()) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void yBV() {
        final View viewAT = this.NOt.Ho.aT();
        if (viewAT != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.3
                /* JADX WARN: Removed duplicated region for block: B:31:0x00ec  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onClick(android.view.View r5) {
                    /*
                        Method dump skipped, instruction units count: 273
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.AnonymousClass3.onClick(android.view.View):void");
                }
            };
            viewAT.setOnClickListener(onClickListener);
            viewAT.setTag(viewAT.getId(), onClickListener);
        }
        this.NOt.Cox.ZRu(new com.bytedance.sdk.openadsdk.component.reward.top.NOt() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.4
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.NOt
            public void NOt(View view) {
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                tTFullScreenVideoActivity.NOt.NBW = !r0.NBW;
                com.bytedance.sdk.openadsdk.component.reward.NOt.NOt nOt = tTFullScreenVideoActivity.mZ;
                if (nOt != null && nOt.uR() != null) {
                    TTFullScreenVideoActivity.this.mZ.uR().ZRu(TTFullScreenVideoActivity.this.NOt.NBW);
                }
                com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu zRu = TTFullScreenVideoActivity.this.NOt;
                zRu.Zf.NOt(zRu.NBW);
                if (!xY.om(TTFullScreenVideoActivity.this.NOt.NOt) || TTFullScreenVideoActivity.this.NOt.aT.get()) {
                    if (xY.Mm(TTFullScreenVideoActivity.this.NOt.NOt)) {
                        com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu zRu2 = TTFullScreenVideoActivity.this.NOt;
                        zRu2.WD.ZRu(zRu2.NBW, true);
                    }
                    com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu zRu3 = TTFullScreenVideoActivity.this.NOt;
                    zRu3.fWk.uR(zRu3.NBW);
                    com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu zRu4 = TTFullScreenVideoActivity.this.NOt;
                    zRu4.le.Ht(zRu4.NBW);
                    qF qFVar = TTFullScreenVideoActivity.this.NOt.NOt;
                    if (qFVar == null || qFVar.AOL() == null || TTFullScreenVideoActivity.this.NOt.NOt.AOL().ZRu() == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu zRu5 = TTFullScreenVideoActivity.this.NOt;
                    if (zRu5.Zf != null) {
                        if (zRu5.NBW) {
                            zRu5.NOt.AOL().ZRu().FA(TTFullScreenVideoActivity.this.NOt.Zf.Mm());
                        } else {
                            zRu5.NOt.AOL().ZRu().Vor(TTFullScreenVideoActivity.this.NOt.Zf.Mm());
                        }
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.NOt
            public void ZRu(View view) {
                if (xY.Ht(TTFullScreenVideoActivity.this.NOt.NOt) || (xY.TFq(TTFullScreenVideoActivity.this.NOt.NOt) && TTFullScreenVideoActivity.this.NOt.le.FA(FA.NOt))) {
                    if (xY.aT(TTFullScreenVideoActivity.this.NOt.NOt)) {
                        TTFullScreenVideoActivity.this.NOt.le.WMI();
                        return;
                    }
                    View view2 = viewAT;
                    if (view2 != null) {
                        view2.performClick();
                        return;
                    } else {
                        TTFullScreenVideoActivity.this.finish();
                        return;
                    }
                }
                if (xY.FA(TTFullScreenVideoActivity.this.NOt.NOt) && (xY.qF(TTFullScreenVideoActivity.this.NOt.NOt) || TTFullScreenVideoActivity.this.NOt.aT.get())) {
                    if (TTFullScreenVideoActivity.this.NOt.le.ZRu()) {
                        TTFullScreenVideoActivity.this.NOt.le.ZRu(5);
                        return;
                    } else {
                        TTFullScreenVideoActivity.this.NOt.fWk.FA();
                        return;
                    }
                }
                if (xY.qF(TTFullScreenVideoActivity.this.NOt.NOt) || (yBV.ZRu(TTFullScreenVideoActivity.this.NOt.NOt) && !TTFullScreenVideoActivity.this.NOt.yBV.get())) {
                    if (!xY.FA(TTFullScreenVideoActivity.this.NOt.NOt) && TTFullScreenVideoActivity.this.NOt.le.ZRu()) {
                        TTFullScreenVideoActivity.this.NOt.le.ZRu(4);
                    }
                    TTFullScreenVideoActivity.this.finish();
                    return;
                }
                if (TTFullScreenVideoActivity.this.NOt.NOt.FqN()) {
                    if (TTFullScreenVideoActivity.this.NOt.Ho.ZH() != null) {
                        TTFullScreenVideoActivity.this.NOt.NOt.Yx(2);
                        TTFullScreenVideoActivity.this.NOt.Ho.WMI();
                        return;
                    }
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu zRu = TTFullScreenVideoActivity.this.NOt;
                if (!zRu.mZ && zRu.NOt.vk() && !TTFullScreenVideoActivity.this.NOt.NOt.wcb()) {
                    TTFullScreenVideoActivity.this.NOt.NOt.Yx(13);
                    try {
                        TTFullScreenVideoActivity.this.NOt.Ho.WMI();
                        return;
                    } catch (Exception unused) {
                    }
                }
                oK.ZRu zRu2 = new oK.ZRu();
                zRu2.ZRu(TTFullScreenVideoActivity.this.NOt.Zf.Mm());
                zRu2.mZ(TTFullScreenVideoActivity.this.NOt.Zf.om());
                zRu2.NOt(TTFullScreenVideoActivity.this.NOt.Zf.ZH());
                zRu2.mZ(3);
                zRu2.uR(TTFullScreenVideoActivity.this.NOt.Zf.qF());
                com.bytedance.sdk.openadsdk.uR.TFq.ZRu.ZRu.ZRu(TTFullScreenVideoActivity.this.NOt.Zf.mZ(), zRu2, TTFullScreenVideoActivity.this.NOt.Zf.ZRu());
                Zf.mZ(TTFullScreenVideoActivity.this.NOt.Ht);
                TTFullScreenVideoActivity.this.NOt.Zf.ZRu("skip", false);
                TTFullScreenVideoActivity.this.NOt.Cox.uR(false);
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                if (tTFullScreenVideoActivity.NOt.mZ) {
                    tTFullScreenVideoActivity.ZRu(true, 4);
                } else {
                    tTFullScreenVideoActivity.finish();
                }
                qF qFVar = TTFullScreenVideoActivity.this.NOt.NOt;
                if (qFVar != null && qFVar.AOL() != null) {
                    com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu zRu3 = TTFullScreenVideoActivity.this.NOt;
                    if (zRu3.Zf != null) {
                        zRu3.NOt.AOL().ZRu().Ht(TTFullScreenVideoActivity.this.NOt.Zf.Mm());
                        TTFullScreenVideoActivity.this.NOt.NOt.AOL().ZRu().TFq(TTFullScreenVideoActivity.this.NOt.Zf.Mm());
                    }
                }
                com.bytedance.sdk.openadsdk.Zf.ZRu.TFq.ZRu(TTFullScreenVideoActivity.this.NOt.NOt, 5);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.NOt
            public void mZ(View view) {
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                tTFullScreenVideoActivity.NOt.th.ZRu(tTFullScreenVideoActivity.mZ);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.NOt
            public void uR(View view) {
                View view2 = viewAT;
                if (view2 != null) {
                    view2.performClick();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.sAl.uR.NOt
    public void ZRu(boolean z10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.sAl.uR.NOt
    public void uR() {
        om();
        this.NOt.NOt.Iyd();
        this.NOt.NOt.ZRu(true);
        if (qF.TFq(this.NOt.NOt)) {
            com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu zRu = this.NOt;
            qF qFVar = zRu.NOt;
            com.bytedance.sdk.openadsdk.uR.mZ.NOt(qFVar, zRu.TFq, qFVar.CF());
        }
    }

    private void ZRu(final String str) {
        WD.mZ(new com.bytedance.sdk.component.FA.FA("FullScreen_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTFullScreenVideoActivity.this.NOt(1).executeFullVideoCallback(TTFullScreenVideoActivity.this.NOt.nqR, str);
                } catch (Throwable th) {
                    lp.ZRu("TTAD.FSVA", "fullscreen_interstitial_ad", "executeFullVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void ZRu(@NonNull Intent intent) {
        super.ZRu(intent);
        this.NOt.yM = intent.getBooleanExtra("is_verity_playable", false);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.sAl.uR.NOt
    public void ZRu(Bundle bundle) {
        if (!com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
            this.ZH = ru.ZRu().uR();
        }
        if (this.ZH != null || bundle == null) {
            return;
        }
        this.ZH = lp;
        lp = null;
    }

    public boolean ZRu(long j10, boolean z10) {
        Mm mm = new Mm();
        mm.ZRu(System.currentTimeMillis(), 1.0f);
        com.bytedance.sdk.openadsdk.component.reward.NOt.NOt nOt = this.mZ;
        if (nOt != null && (nOt instanceof com.bytedance.sdk.openadsdk.component.reward.NOt.FA)) {
            this.NOt.Zf.ZRu(((com.bytedance.sdk.openadsdk.component.reward.NOt.FA) nOt).VdW(), mm);
        } else {
            com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu zRu = this.NOt;
            zRu.Zf.ZRu(zRu.Ho.Ht(), mm);
        }
        mZ.ZRu zRu2 = new mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.5
            boolean ZRu;

            @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.uR.mZ.ZRu
            public void NOt(long j11, int i10) {
                TTFullScreenVideoActivity.this.uR.removeMessages(300);
                if (TTFullScreenVideoActivity.this.NOt.Zf.NOt()) {
                    TTFullScreenVideoActivity.this.sAl();
                    return;
                }
                TTFullScreenVideoActivity.this.NOt.Zf.sAl();
                lp.ZRu("TTAD.FSVA", "fullscreen_interstitial_ad", "onError、、、、、、、、");
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                if (!tTFullScreenVideoActivity.NOt.mZ) {
                    tTFullScreenVideoActivity.finish();
                    return;
                }
                tTFullScreenVideoActivity.ZRu(false, true, 3);
                com.bytedance.sdk.openadsdk.component.reward.ZRu.WMI wmi = TTFullScreenVideoActivity.this.NOt.Zf;
                wmi.ZRu(!wmi.fcs() ? 1 : 0, 2);
            }

            @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.uR.mZ.ZRu
            public void ZRu(long j11, int i10) {
                ZH zh;
                if (this.ZRu) {
                    return;
                }
                this.ZRu = true;
                TTFullScreenVideoActivity.this.uR.removeMessages(300);
                TTFullScreenVideoActivity.this.oK();
                TTFullScreenVideoActivity.this.NOt.Zf.ZRu(j11, j11);
                TTFullScreenVideoActivity.this.NOt.om.set(true);
                if (TTFullScreenVideoActivity.this.NOt.NOt.yBV() == 36) {
                    com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu zRu3 = TTFullScreenVideoActivity.this.NOt;
                    if (zRu3.mZ) {
                        zRu3.ru.mZ().uR();
                        com.bytedance.sdk.openadsdk.utils.lp.NOt();
                    }
                }
                if (TTFullScreenVideoActivity.this.NOt.NOt.pD()) {
                    TTFullScreenVideoActivity.this.NOt.NOt.Yx(1);
                    TTFullScreenVideoActivity.this.NOt.Ho.WMI();
                }
                if (TTFullScreenVideoActivity.this.NOt.NOt.yBV() == 21 && !TTFullScreenVideoActivity.this.NOt.NOt.uR()) {
                    TTFullScreenVideoActivity.this.NOt.NOt.NOt(true);
                    TTFullScreenVideoActivity.this.NOt.Ho.WMI();
                }
                com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu zRu4 = TTFullScreenVideoActivity.this.NOt;
                if (!zRu4.mZ) {
                    if (zRu4.NOt.mGD()) {
                        TTFullScreenVideoActivity.this.NOt.Cox.mZ();
                        return;
                    }
                    if (!qF.TFq(TTFullScreenVideoActivity.this.NOt.NOt)) {
                        TTFullScreenVideoActivity.this.NOt.Zf.ZRu("skip", true);
                    }
                    TTFullScreenVideoActivity.this.finish();
                    return;
                }
                if (zRu4.NOt.mGD()) {
                    TTFullScreenVideoActivity.this.NOt.Cox.mZ();
                    return;
                }
                TTFullScreenVideoActivity.this.ZRu(false, 5);
                if (yBV.NOt(TTFullScreenVideoActivity.this.NOt.NOt) && (zh = TTFullScreenVideoActivity.this.NOt.IOC) != null) {
                    zh.ZRu(0L);
                }
                if (qF.TFq(TTFullScreenVideoActivity.this.NOt.NOt)) {
                    return;
                }
                TTFullScreenVideoActivity.this.NOt.Zf.ZRu("skip", true);
            }

            @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.uR.mZ.ZRu
            public void ZRu() {
                TTFullScreenVideoActivity.this.uR.removeMessages(300);
                TTFullScreenVideoActivity.this.oK();
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                if (tTFullScreenVideoActivity.NOt.mZ) {
                    tTFullScreenVideoActivity.ZRu(false, true, 6);
                } else {
                    tTFullScreenVideoActivity.finish();
                }
                com.bytedance.sdk.openadsdk.component.reward.ZRu.WMI wmi = TTFullScreenVideoActivity.this.NOt.Zf;
                wmi.ZRu(!wmi.fcs() ? 1 : 0, 1 ^ (TTFullScreenVideoActivity.this.NOt.Zf.fcs() ? 1 : 0));
                TTFullScreenVideoActivity.this.NOt.Zf.sAl();
            }

            @Override // com.bykv.vk.openvk.ZRu.ZRu.ZRu.uR.mZ.ZRu
            public void ZRu(long j11, long j12) {
                com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu zRu3 = TTFullScreenVideoActivity.this.NOt;
                if (!zRu3.Nl && zRu3.Zf.NOt()) {
                    TTFullScreenVideoActivity.this.NOt.Zf.oK();
                }
                if (TTFullScreenVideoActivity.this.NOt.aT.get()) {
                    return;
                }
                TTFullScreenVideoActivity.this.uR.removeMessages(300);
                if (j11 != TTFullScreenVideoActivity.this.NOt.Zf.FA()) {
                    TTFullScreenVideoActivity.this.oK();
                }
                TTFullScreenVideoActivity.this.NOt.Zf.ZRu(j11, j12);
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                long j13 = j11 / 1000;
                tTFullScreenVideoActivity.Ht = (int) (tTFullScreenVideoActivity.NOt.Zf.Nb() - j13);
                int i10 = (int) j13;
                if ((TTFullScreenVideoActivity.this.NOt.OCA.get() || TTFullScreenVideoActivity.this.NOt.ZH.get()) && TTFullScreenVideoActivity.this.NOt.Zf.NOt()) {
                    TTFullScreenVideoActivity.this.NOt.Zf.oK();
                }
                TTFullScreenVideoActivity.this.mZ(i10);
                TTFullScreenVideoActivity tTFullScreenVideoActivity2 = TTFullScreenVideoActivity.this;
                int i11 = tTFullScreenVideoActivity2.Ht;
                if (i11 >= 0) {
                    tTFullScreenVideoActivity2.NOt.Cox.ZRu(String.valueOf(i11), null);
                }
            }
        };
        this.NOt.Zf.ZRu(zRu2);
        yBV ybv = this.NOt.Ho.oK;
        if (ybv != null) {
            ybv.ZRu(zRu2);
        }
        return this.NOt.Zf.ZRu(j10, z10, null, this.mZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ZRu() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu r0 = r3.NOt
            com.bytedance.sdk.openadsdk.core.model.qF r0 = r0.NOt
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.qF.TFq(r0)
            r1 = 0
            if (r0 != 0) goto L19
            com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu r0 = r3.NOt
            boolean r2 = r0.mZ
            if (r2 != 0) goto L19
            com.bytedance.sdk.openadsdk.component.reward.ZRu.edo r0 = r0.Cox
            java.lang.String r2 = "X"
            r0.ZRu(r1, r2)
            goto L24
        L19:
            com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu r0 = r3.NOt
            com.bytedance.sdk.openadsdk.component.reward.ZRu.edo r0 = r0.Cox
            java.lang.String r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.getSkipText()
            r0.ZRu(r1, r2)
        L24:
            com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu r0 = r3.NOt
            com.bytedance.sdk.openadsdk.component.reward.ZRu.edo r0 = r0.Cox
            r1 = 1
            r0.TFq(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.ZRu():void");
    }

    private boolean ZRu(qF qFVar) {
        return qFVar == null || qFVar.cvm() == 100.0f;
    }
}

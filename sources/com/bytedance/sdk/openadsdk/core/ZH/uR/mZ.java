package com.bytedance.sdk.openadsdk.core.ZH.uR;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.Vor;
import com.bytedance.adsdk.ugeno.core.aT;
import com.bytedance.adsdk.ugeno.core.lp;
import com.bytedance.adsdk.ugeno.core.sAl;
import com.bytedance.adsdk.ugeno.uR.NOt;
import com.bytedance.sdk.component.adexpress.NOt.FA;
import com.bytedance.sdk.component.adexpress.NOt.Mm;
import com.bytedance.sdk.component.adexpress.NOt.edo;
import com.bytedance.sdk.openadsdk.core.FA.om;
import com.bytedance.sdk.openadsdk.core.NOt.mZ;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.core.model.edo;
import com.bytedance.sdk.openadsdk.core.model.qF;
import com.bytedance.sdk.openadsdk.core.settings.yBV;
import com.bytedance.sdk.openadsdk.core.widget.Ht;
import com.bytedance.sdk.openadsdk.utils.Cox;
import com.bytedance.sdk.openadsdk.utils.WD;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes3.dex */
public class mZ implements lp, sAl, com.bytedance.sdk.component.adexpress.NOt.uR<View>, com.bytedance.sdk.component.adexpress.dynamic.uR {
    private static float MR = 0.0f;

    /* JADX INFO: renamed from: Nb, reason: collision with root package name */
    private static float f140666Nb = 0.0f;
    private static float VdW = 0.0f;
    private static float fcs = 0.0f;
    private static long le = 0;
    protected static int om = 24;
    protected FA FA;
    protected ZRu Ht;
    protected FrameLayout Mm;
    protected Context NOt;
    protected WeakReference<View> OCA;
    protected qF TFq;
    protected edo Vor;
    private String WD;
    protected long WMI;
    protected com.bytedance.adsdk.ugeno.NOt.mZ ZH;
    protected Vor ZRu;
    private Mm Zf;
    protected float edo;
    private om fWk;
    protected float lp;
    protected com.bytedance.adsdk.ugeno.NOt.mZ<View> mZ;
    protected float oK;
    private final boolean ru;
    protected float sAl;
    private uR th;
    protected JSONObject uR;
    protected JSONObject xY;
    protected long yBV;
    protected boolean qF = true;
    public SparseArray<mZ.ZRu> to = new SparseArray<>();
    private String Yx = "";
    private final com.bytedance.sdk.component.FA.FA Cox = new com.bytedance.sdk.component.FA.FA("ugen_render_template") { // from class: com.bytedance.sdk.openadsdk.core.ZH.uR.mZ.1
        @Override // java.lang.Runnable
        public void run() {
            mZ mZVar = mZ.this;
            mZVar.uR = mZVar.ZRu();
            if (mZ.this.fWk != null) {
                mZ mZVar2 = mZ.this;
                mZVar2.Yx = mZVar2.fWk.getUgenTemplateErrorReason();
            } else {
                mZ.this.Yx = "expressView is null";
            }
            com.bytedance.sdk.openadsdk.core.edo.mZ().post(mZ.this.gI);
        }
    };
    private final Runnable gI = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ZH.uR.mZ.2
        @Override // java.lang.Runnable
        public void run() {
            if (mZ.this.Zf != null) {
                mZ mZVar = mZ.this;
                mZVar.NOt(mZVar.Zf);
            }
        }
    };
    private boolean Ho = false;
    protected AtomicBoolean aT = new AtomicBoolean(false);

    static {
        if (WMI.ZRu() != null) {
            om = WMI.NOt();
        }
    }

    public mZ(Context context, qF qFVar, boolean z10, ZRu zRu, ViewGroup viewGroup) {
        this.NOt = context;
        this.ru = z10;
        this.ZRu = new Vor(context);
        this.TFq = qFVar;
        this.Ht = zRu;
        this.Mm = new FrameLayout(context);
        if (viewGroup instanceof om) {
            this.fWk = (om) viewGroup;
        }
        this.WD = zRu.uR();
        JSONObject jSONObjectNOt = NOt();
        this.xY = jSONObjectNOt;
        this.th = new uR(this.NOt, this.TFq, this.WD, jSONObjectNOt);
    }

    private void FA() {
        com.bytedance.adsdk.ugeno.NOt.mZ<T> mZVarMZ;
        if (this.mZ == null) {
            return;
        }
        if (this.TFq.Uf() && (mZVarMZ = this.mZ.mZ("tvskip")) != 0) {
            mZVarMZ.mZ(8);
        }
        com.bytedance.adsdk.ugeno.NOt.mZ<T> mZVarMZ2 = this.mZ.mZ("skip");
        if (mZVarMZ2 != 0 && (mZVarMZ2 instanceof com.bytedance.adsdk.ugeno.Vor.uR.mZ)) {
            if (!yBV.CH().edo(String.valueOf(this.TFq.GE())) || this.TFq.yBV() == 5 || this.TFq.yBV() == 6 || this.TFq.dkT() == 3) {
                ((com.bytedance.adsdk.ugeno.Vor.uR.mZ) mZVarMZ2).FA("local://tt_close_btn");
                mZVarMZ2.NOt();
            }
        }
    }

    public com.bytedance.adsdk.ugeno.NOt.mZ Ht() {
        com.bytedance.adsdk.ugeno.NOt.mZ<View> mZVar = this.mZ;
        if (mZVar == null) {
            return null;
        }
        return mZVar.mZ("video");
    }

    public com.bytedance.adsdk.ugeno.NOt.mZ Mm() {
        com.bytedance.adsdk.ugeno.NOt.mZ<View> mZVar = this.mZ;
        if (mZVar == null) {
            return null;
        }
        return mZVar.mZ("feedback");
    }

    @Override // com.bytedance.sdk.component.adexpress.NOt.uR
    public View TFq() {
        return this.Mm;
    }

    @Override // com.bytedance.adsdk.ugeno.core.lp
    public void ZRu(com.bytedance.adsdk.ugeno.NOt.mZ mZVar, String str, NOt.ZRu zRu) {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.uR
    public void onvideoComplate() {
    }

    public void setSoundMute(boolean z10) {
        com.bytedance.adsdk.ugeno.NOt.mZ<T> mZVarMZ;
        com.bytedance.adsdk.ugeno.NOt.mZ<View> mZVar = this.mZ;
        if (mZVar == null || (mZVarMZ = mZVar.mZ(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) == 0) {
            return;
        }
        if (z10) {
            ((com.bytedance.adsdk.ugeno.Vor.uR.mZ) mZVarMZ).FA("local://tt_reward_full_mute");
        } else {
            ((com.bytedance.adsdk.ugeno.Vor.uR.mZ) mZVarMZ).FA("local://tt_reward_full_unmute");
        }
        mZVarMZ.NOt();
    }

    public void setTime(CharSequence charSequence, int i10, int i11, boolean z10) {
        if (this.mZ == null) {
            return;
        }
        boolean z11 = i10 == 1;
        ZRu(charSequence, z11, i11, z10);
        NOt(charSequence, z11, i11, z10);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.uR
    public void setTimeUpdate(int i10) {
    }

    public int uR() {
        this.ZRu.ZRu((lp) this);
        this.ZRu.ZRu((sAl) this);
        com.bytedance.adsdk.ugeno.NOt.mZ<View> mZVarZRu = this.ZRu.ZRu(this.uR);
        this.mZ = mZVarZRu;
        uR uRVar = this.th;
        if (uRVar != null && mZVarZRu != null) {
            uRVar.ZRu(mZVarZRu);
        }
        this.Ht.VdW().NOt();
        this.Ht.VdW().mZ();
        this.ZRu.NOt(this.xY);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NOt(Mm mm) {
        this.Ht.VdW().ZRu();
        if (this.uR == null) {
            mm.ZRu(Opcodes.I2L, "ugen template is null real reason is " + this.Yx);
            return;
        }
        if (this.xY == null) {
            mm.ZRu(Opcodes.I2L, "ugen data is null");
            return;
        }
        int iUR = uR();
        if (iUR != 0) {
            mm.ZRu(iUR, "ugen render fail");
            return;
        }
        if (this.mZ == null) {
            mm.ZRu(138, "ugen render error");
            return;
        }
        NOt nOt = new NOt();
        this.Vor = nOt;
        nOt.ZRu(true);
        this.Vor.ZRu(mZ());
        setSoundMute(this.ru);
        FA();
        com.bytedance.adsdk.ugeno.NOt.mZ mZVarHt = Ht();
        this.ZH = mZVarHt;
        if (mZVarHt != null && (mZVarHt instanceof com.bytedance.sdk.openadsdk.core.ZH.NOt.ZRu.NOt)) {
            ((NOt) this.Vor).ZRu((FrameLayout) ((com.bytedance.sdk.openadsdk.core.ZH.NOt.ZRu.NOt) mZVarHt).NBW());
        }
        com.bytedance.adsdk.ugeno.NOt.mZ mZVarMm = Mm();
        uR uRVar = this.th;
        if (uRVar != null) {
            uRVar.ZRu();
        }
        if (mZVarMm != null && mZVarMm.Vor() != null) {
            this.OCA = new WeakReference<>(mZVarMm.Vor());
        }
        this.Mm.addView(this.mZ.Vor(), new FrameLayout.LayoutParams(this.mZ.fWk(), this.mZ.Yx()));
        float fMR = this.Ht.MR();
        float fFcs = this.Ht.fcs();
        float fMZ = Cox.mZ(this.NOt, fMR);
        float fMZ2 = Cox.mZ(this.NOt, fFcs);
        if (mZ() != 7) {
            this.Mm.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        } else if (fFcs <= 0.0f) {
            this.Mm.setLayoutParams(new FrameLayout.LayoutParams((int) fMZ, -2));
        } else {
            this.Mm.setLayoutParams(new FrameLayout.LayoutParams((int) fMZ, (int) fMZ2));
        }
        if (fFcs <= 0.0f || fMR <= 0.0f) {
            this.Mm.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int iUR2 = Cox.uR(this.NOt, this.Mm.getMeasuredWidth());
            int iUR3 = Cox.uR(this.NOt, this.Mm.getMeasuredHeight());
            this.Vor.ZRu(iUR2);
            this.Vor.NOt(iUR3);
        } else {
            this.Vor.ZRu(fMR);
            this.Vor.NOt(fFcs);
        }
        if (this.aT.get()) {
            mm.ZRu(Opcodes.L2F, "ugen render timeout");
        } else {
            mm.ZRu(this.Mm, this.Vor);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.NOt.uR
    public int mZ() {
        return this.TFq.le();
    }

    @Override // com.bytedance.sdk.component.adexpress.NOt.uR
    public void ZRu(Mm mm) {
        this.Zf = mm;
        WD.NOt(this.Cox);
    }

    public JSONObject ZRu() {
        return this.Ht.mZ();
    }

    public void ZRu(boolean z10) {
        this.aT.set(z10);
    }

    public void ZRu(FA fa2) {
        this.FA = fa2;
    }

    public void ZRu(Ht ht) {
        uR uRVar = this.th;
        if (uRVar != null) {
            uRVar.ZRu(ht);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.lp
    public void ZRu(aT aTVar, lp.NOt nOt, lp.ZRu zRu) {
        if (aTVar == null) {
            return;
        }
        if (aTVar.NOt() == 1 || aTVar.NOt() == 4) {
            ZRu(aTVar);
        }
        if (aTVar.NOt() == 10) {
            ZRu(aTVar.mZ());
        }
        if (nOt == null || aTVar.uR() == null) {
            return;
        }
        nOt.ZRu(aTVar.uR());
    }

    private void ZRu(JSONObject jSONObject) {
        com.bytedance.adsdk.ugeno.NOt.mZ<T> mZVarMZ;
        if (this.mZ == null || jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("type");
        String strOptString2 = jSONObject.optString("nodeId");
        if (TextUtils.isEmpty(strOptString2) || (mZVarMZ = this.mZ.mZ(strOptString2)) == 0) {
            return;
        }
        if (TextUtils.equals(strOptString, "onShow")) {
            mZVarMZ.mZ(0);
        } else if (TextUtils.equals(strOptString, "onDismiss")) {
            mZVarMZ.mZ(8);
        }
    }

    private void ZRu(aT aTVar) {
        JSONObject jSONObjectUR;
        boolean zZRu;
        int i10;
        String str;
        uR uRVar;
        uR uRVar2;
        uR uRVar3;
        if (this.FA == null) {
            return;
        }
        String strOptString = aTVar.mZ().optString("type");
        if ("swiperLeft".equals(strOptString) && (uRVar3 = this.th) != null) {
            uRVar3.NOt();
            return;
        }
        if ("swiperRight".equals(strOptString) && (uRVar2 = this.th) != null) {
            uRVar2.mZ();
            return;
        }
        if (!"swiperClick".equals(strOptString) || (uRVar = this.th) == null) {
            jSONObjectUR = null;
            zZRu = false;
            i10 = 0;
        } else {
            zZRu = uRVar.ZRu(aTVar);
            jSONObjectUR = this.th.uR();
            i10 = 2;
        }
        strOptString.getClass();
        switch (strOptString) {
            case "privacy":
                i10 = 7;
                break;
            case "feedback":
                i10 = 3;
                break;
            case "mute":
                i10 = 5;
                break;
            case "skip":
                i10 = 6;
                break;
            case "video":
                i10 = 4;
                break;
            case "creative":
                i10 = 2;
                break;
        }
        com.bytedance.adsdk.ugeno.NOt.mZ mZVarZRu = aTVar.ZRu();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        WeakReference<View> weakReference = this.OCA;
        if (weakReference != null) {
            int[] iArrZRu = Cox.ZRu(weakReference.get());
            if (iArrZRu != null) {
                iArr = iArrZRu;
            }
            int[] iArrMZ = Cox.mZ(this.OCA.get());
            if (iArrMZ != null) {
                iArr2 = iArrMZ;
            }
        }
        edo.ZRu ZRu = new edo.ZRu().uR(this.lp).mZ(this.sAl).NOt(this.edo).ZRu(this.oK).NOt(this.yBV).ZRu(this.WMI).mZ(iArr[0]).uR(iArr[1]).TFq(iArr2[0]).Ht(iArr2[1]).ZRu(this.to).ZRu(aTVar.NOt() != 1 || this.qF);
        if (mZVarZRu == null) {
            str = "";
        } else {
            str = mZVarZRu.WD() + "_" + mZVarZRu.th();
        }
        this.FA.ZRu(aTVar.ZRu().Vor(), i10, ZRu.ZRu(str).NOt(zZRu).NOt(jSONObjectUR).ZRu());
    }

    public JSONObject NOt() {
        return this.Ht.Nb();
    }

    private void NOt(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        com.bytedance.adsdk.ugeno.NOt.mZ<T> mZVarMZ;
        View viewVor;
        com.bytedance.adsdk.ugeno.NOt.mZ<View> mZVar = this.mZ;
        if (mZVar == null || (mZVarMZ = mZVar.mZ("skip")) == 0 || (viewVor = mZVarMZ.Vor()) == null) {
            return;
        }
        int i11 = 0;
        if (!z10 && !z11) {
            i11 = 8;
        }
        viewVor.setVisibility(i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    @Override // com.bytedance.adsdk.ugeno.core.sAl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ZRu(com.bytedance.adsdk.ugeno.NOt.mZ r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ZH.uR.mZ.ZRu(com.bytedance.adsdk.ugeno.NOt.mZ, android.view.MotionEvent):void");
    }

    private void ZRu(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        com.bytedance.adsdk.ugeno.NOt.mZ<T> mZVarMZ;
        int i11;
        com.bytedance.adsdk.ugeno.NOt.mZ<View> mZVar = this.mZ;
        if (mZVar == null || (mZVarMZ = mZVar.mZ("countdown")) == 0) {
            return;
        }
        View viewVor = mZVarMZ.Vor();
        if (viewVor instanceof TextView) {
            try {
                i11 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                com.bytedance.sdk.component.utils.lp.ZRu("UGenRender", "parse duration exception", charSequence);
                i11 = 0;
            }
            if (!z11 && i11 > 0 && !this.Ho) {
                viewVor.setVisibility(0);
                if (!z10 && this.Ht.ZRu() && com.bytedance.sdk.component.adexpress.uR.Mm.NOt(this.Ht.uR())) {
                    ((TextView) viewVor).setText(String.format(com.bytedance.sdk.component.utils.om.ZRu(com.bytedance.sdk.component.adexpress.uR.ZRu(), "tt_reward_full_skip"), Integer.valueOf(i10)));
                    return;
                }
                if (!"open_ad".equals(this.Ht.uR()) && this.Ht.ZRu()) {
                    this.Ho = true;
                    viewVor.setVisibility(8);
                    return;
                } else {
                    ((TextView) viewVor).setText(((Object) charSequence) + "s");
                    return;
                }
            }
            viewVor.setVisibility(8);
        }
    }
}

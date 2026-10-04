package com.bytedance.adsdk.ugeno.NOt;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.activity.D;
import androidx.constraintlayout.widget.d;
import androidx.core.app.NotificationCompat;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bytedance.adsdk.ugeno.Mm.ZRu;
import com.bytedance.adsdk.ugeno.NOt.ZRu;
import com.bytedance.adsdk.ugeno.ZRu;
import com.bytedance.adsdk.ugeno.core.FA;
import com.bytedance.adsdk.ugeno.core.Ht;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.core.Mm;
import com.bytedance.adsdk.ugeno.core.NOt.TFq;
import com.bytedance.adsdk.ugeno.core.NOt.mZ;
import com.bytedance.adsdk.ugeno.core.NOt.uR;
import com.bytedance.adsdk.ugeno.core.TFq;
import com.bytedance.adsdk.ugeno.core.ZH;
import com.bytedance.adsdk.ugeno.core.aT;
import com.bytedance.adsdk.ugeno.core.lp;
import com.bytedance.adsdk.ugeno.core.oK;
import com.bytedance.adsdk.ugeno.core.sAl;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.common.base.Ascii;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.io.encoding.Base64;
import org.json.JSONException;
import org.json.JSONObject;
import t1.b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mZ<T extends View> implements View.OnTouchListener, lp.NOt, lp.ZRu, com.bytedance.adsdk.ugeno.mZ {
    protected boolean AK;
    private GradientDrawable AOL;
    protected sAl AZ;
    private boolean CA;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.NOt.NOt CH;
    private boolean CTl;
    protected float CXy;
    protected int Cox;

    @Deprecated
    private TFq Ds;
    protected ZRu<ViewGroup> FA;
    protected float FFX;
    protected float GC;
    protected boolean Gis;
    private oK Guy;
    protected int HX;
    private boolean HZ;
    protected ImageView.ScaleType Ho;
    protected T Ht;
    protected float Hvv;
    private boolean IJM;
    protected float IOC;
    protected float IZ;
    private boolean JVq;
    protected boolean Jem;
    private String KIc;
    private boolean LO;
    private JSONObject LrZ;
    protected float MO;
    protected float MR;
    protected boolean MU;
    protected ZRu<ViewGroup> Mm;
    protected float NBW;
    private boolean NOt;

    /* JADX INFO: renamed from: Nb, reason: collision with root package name */
    protected float f140637Nb;
    protected boolean Nl;
    protected float Np;
    protected float OCA;

    /* JADX INFO: renamed from: Oc, reason: collision with root package name */
    protected float f140638Oc;
    protected boolean Pzo;
    protected float Qg;
    private boolean RPV;
    protected JSONObject TFq;
    protected float VdW;
    protected TFq.ZRu Vor;
    protected boolean Vr;
    protected boolean WD;
    protected float WMI;
    protected float Wo;

    @Deprecated
    private uR YuF;
    protected boolean Yx;
    protected boolean ZH;
    protected float ZRJ;
    private boolean ZRu;
    protected boolean Zf;
    private boolean aNu;
    protected FA aT;
    private boolean bDW;
    protected float bO;
    private boolean cA;

    /* JADX INFO: renamed from: cb, reason: collision with root package name */
    private boolean f140639cb;
    protected Map<Integer, aT> cvm;
    private com.bytedance.adsdk.ugeno.uR.ZRu.ZRu dkT;
    protected float edo;
    private String eqw;
    private boolean fOq;
    protected boolean fWk;
    protected float fcs;
    protected String gI;
    protected com.bytedance.adsdk.ugeno.ZRu.ZRu gX;
    protected float gaw;
    protected int gmt;
    private float gx;
    protected ZRu.C0388ZRu hNL;
    private boolean hl;
    private boolean jJC;
    private boolean jQo;

    @Deprecated
    private mZ.ZRu kkl;
    private com.bytedance.adsdk.ugeno.uR.TFq klw;
    protected float le;
    protected String lp;
    protected Context mZ;
    protected float nqR;
    protected float oK;
    protected float om;
    protected float pDA;
    private com.bytedance.adsdk.ugeno.core.ZRu pU;
    protected lp pvl;
    protected float qF;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.NOt.ZRu qZ;

    /* JADX INFO: renamed from: rd, reason: collision with root package name */
    private boolean f140640rd;
    protected boolean ru;
    protected String sAl;
    protected boolean th;
    protected boolean to;
    protected JSONObject uR;
    protected float vE;
    protected float wZ;
    private boolean wcb;
    protected boolean xY;
    protected float yBV;
    protected ViewGroup.LayoutParams yM;
    protected boolean yz;
    protected Ht zkn;
    private Mm zr;

    public mZ(Context context) {
        this(context, null);
    }

    private void NBW() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.lp);
        this.Ht.setContentDescription(sb2);
    }

    private void Nl() {
        float f10 = this.Nl ? this.Hvv : this.Qg;
        float f11 = this.yz ? this.nqR : this.Qg;
        float f12 = this.Jem ? this.IZ : this.Qg;
        float f13 = this.Gis ? this.NBW : this.Qg;
        this.AOL.setCornerRadii(new float[]{f10, f10, f11, f11, f13, f13, f12, f12});
    }

    private void nqR() {
        aT aTVar;
        if (this.pvl == null || !NOt(18) || (aTVar = this.cvm.get(18)) == null) {
            return;
        }
        JSONObject jSONObjectMZ = aTVar.mZ();
        if (jSONObjectMZ != null) {
            try {
                jSONObjectMZ.put("rotateZ", com.bytedance.adsdk.ugeno.mZ.NOt.ZRu(jSONObjectMZ.optString("rotateZ"), this.TFq));
            } catch (JSONException unused) {
            }
        }
        this.pvl.ZRu(aTVar, this, this);
    }

    public void AK() {
    }

    public boolean Cox() {
        return this.MU;
    }

    @Override // com.bytedance.adsdk.ugeno.mZ
    public void FA() {
        Mm mm = this.zr;
        if (mm != null) {
            mm.NOt();
        }
        com.bytedance.adsdk.ugeno.ZRu.ZRu zRu = this.gX;
        if (zRu != null) {
            zRu.NOt();
        }
    }

    public com.bytedance.adsdk.ugeno.uR.ZRu.ZRu Ho() {
        return this.dkT;
    }

    public void Ht(String str) {
        this.sAl = str;
    }

    public float Hvv() {
        T t10 = this.Ht;
        if (t10 instanceof com.bytedance.adsdk.ugeno.ZRu.TFq) {
            return ((com.bytedance.adsdk.ugeno.ZRu.TFq) t10).getStretch();
        }
        return 0.0f;
    }

    public float IZ() {
        T t10 = this.Ht;
        if (t10 instanceof com.bytedance.adsdk.ugeno.ZRu.TFq) {
            return ((com.bytedance.adsdk.ugeno.ZRu.TFq) t10).getRubIn();
        }
        return 0.0f;
    }

    public void MR() {
        if (this.Ht != null) {
            ZRu(this.yM);
            TFq((int) this.edo);
            Ht((int) this.oK);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.mZ
    public void Mm() {
        com.bytedance.adsdk.ugeno.core.ZRu zRu = this.pU;
        if (zRu != null) {
            Mm mm = new Mm(this.Ht, zRu);
            this.zr = mm;
            mm.ZRu();
        }
        com.bytedance.adsdk.ugeno.ZRu.ZRu zRu2 = this.gX;
        if (zRu2 != null) {
            zRu2.ZRu();
        }
        com.bytedance.adsdk.ugeno.uR.TFq tFq = this.klw;
        if (tFq != null) {
            tFq.uR();
        }
        if (this.qZ != null && NOt(10)) {
            this.qZ.ZRu();
        }
        if (this.Ds == null || !NOt(9)) {
            return;
        }
        this.Ds.ZRu();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void NOt() {
        Zf();
        ZH();
        mZ(this.gmt);
        ZRu();
        mZ();
        com.bytedance.adsdk.ugeno.uR.TFq tFq = this.klw;
        if (tFq != null) {
            tFq.ZRu();
            this.klw.NOt();
            this.klw.mZ();
        }
        this.Ht.setOnTouchListener(this);
        NBW();
        ViewGroup viewGroup = (ViewGroup) this.Ht.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(!this.bDW);
        }
        com.bytedance.adsdk.ugeno.ZRu.ZRu zRu = this.gX;
        if (zRu != null) {
            zRu.mZ();
        }
    }

    public boolean Nb() {
        return this.ZH;
    }

    public float OCA() {
        return this.Qg;
    }

    public float Qg() {
        T t10 = this.Ht;
        if (t10 instanceof com.bytedance.adsdk.ugeno.ZRu.TFq) {
            return ((com.bytedance.adsdk.ugeno.ZRu.TFq) t10).getShine();
        }
        return 0.0f;
    }

    public void TFq(String str) {
        this.lp = str;
    }

    public ZRu VdW() {
        return this.Mm;
    }

    public T Vor() {
        return this.Ht;
    }

    public float Vr() {
        T t10 = this.Ht;
        if (t10 instanceof com.bytedance.adsdk.ugeno.ZRu.TFq) {
            return ((com.bytedance.adsdk.ugeno.ZRu.TFq) t10).getRipple();
        }
        return 0.0f;
    }

    public String WD() {
        return this.sAl;
    }

    public float WMI() {
        return this.CXy;
    }

    public int Yx() {
        return (int) this.oK;
    }

    public void ZH() {
        this.Ht.setPadding((int) (this.th ? this.MR : this.le), (int) (this.fWk ? this.f140637Nb : this.le), (int) (this.WD ? this.fcs : this.le), (int) (this.Yx ? this.VdW : this.le));
    }

    public void ZRu(JSONObject jSONObject) {
        this.TFq = jSONObject;
        JSONObject jSONObject2 = this.uR;
        if (jSONObject2 == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        ZRu.C0389ZRu c0389ZRuMZ = D.a(this.Mm) ? this.Mm.mZ() : null;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strZRu = com.bytedance.adsdk.ugeno.mZ.NOt.ZRu(this.uR.optString(next), jSONObject);
            ZRu(next, strZRu);
            if (c0389ZRuMZ != null) {
                c0389ZRuMZ.ZRu(this.mZ, next, strZRu);
            }
        }
        if (c0389ZRuMZ != null) {
            ZRu(c0389ZRuMZ.ZRu());
        }
        if (this.LrZ == null || this.TFq == null) {
            return;
        }
        try {
            if (!Nb()) {
                this.TFq.put("i18n", this.LrZ);
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("i18n", this.LrZ);
            this.TFq.put("xNode", jSONObject3);
        } catch (JSONException unused) {
        }
    }

    public void Zf() {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmapZRu;
        if (TextUtils.isEmpty(this.gI)) {
            if (this.Pzo) {
                ZRu(this.hNL);
                return;
            } else {
                this.AOL.setColor(this.Cox);
                uR(this.Cox);
                return;
            }
        }
        if (!this.gI.startsWith("local://")) {
            ru();
            return;
        }
        String strReplace = this.gI.replace("local://", "");
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = this.AK ? Bitmap.Config.ARGB_4444 : Bitmap.Config.RGB_565;
            options.inPurgeable = true;
            options.inInputShareable = true;
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(this.mZ.getResources().openRawResource(com.bytedance.adsdk.ugeno.Mm.uR.ZRu(this.mZ, strReplace)), null, options);
            if (this.AK && (bitmapZRu = com.bytedance.adsdk.ugeno.Mm.FA.ZRu(this.mZ, bitmapDecodeStream, (int) this.bO)) != null) {
                bitmapDrawable = new BitmapDrawable(this.mZ.getResources(), bitmapZRu);
                ZRu(bitmapDrawable);
            } else {
                BitmapDrawable bitmapDrawable2 = new BitmapDrawable(this.mZ.getResources(), bitmapDecodeStream);
                bitmapDrawable = bitmapDrawable2;
                ZRu(bitmapDrawable);
            }
        } catch (Throwable unused) {
        }
    }

    public JSONObject aT() {
        return this.TFq;
    }

    public void bO() {
    }

    public float edo() {
        return this.IOC;
    }

    public int fWk() {
        return (int) this.edo;
    }

    public TFq.ZRu fcs() {
        return this.Vor;
    }

    public int gI() {
        return this.Cox;
    }

    public ViewGroup.LayoutParams le() {
        return this.yM;
    }

    public float lp() {
        return this.vE;
    }

    public float oK() {
        return this.Wo;
    }

    public float om() {
        return this.FFX;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        uR uRVar;
        lp lpVar;
        com.bytedance.adsdk.ugeno.core.NOt.NOt nOt;
        int action = motionEvent.getAction();
        if (action == 0) {
            bO();
        } else if (action == 1 || action == 3) {
            AK();
        }
        sAl sal = this.AZ;
        if (sal != null) {
            sal.ZRu(this, motionEvent);
        }
        if (NOt(17) && motionEvent.getAction() == 0) {
            this.pvl.ZRu(this.cvm.get(17), this, this);
        }
        if (NOt(1) && this.f140640rd && (lpVar = this.pvl) != null && (nOt = this.CH) != null) {
            return nOt.ZRu(lpVar, this, motionEvent);
        }
        lp lpVar2 = this.pvl;
        if (lpVar2 != null && (uRVar = this.YuF) != null) {
            return uRVar.ZRu(lpVar2, this, motionEvent);
        }
        com.bytedance.adsdk.ugeno.uR.TFq tFq = this.klw;
        if (tFq != null) {
            return tFq.ZRu(motionEvent);
        }
        return false;
    }

    public float qF() {
        return this.pDA;
    }

    public void ru() {
        com.bytedance.adsdk.ugeno.uR.ZRu().NOt().ZRu(this.aT, this.gI, new ZRu.InterfaceC0392ZRu() { // from class: com.bytedance.adsdk.ugeno.NOt.mZ.4
            @Override // com.bytedance.adsdk.ugeno.ZRu.InterfaceC0392ZRu
            public void ZRu(final Bitmap bitmap) {
                if (bitmap != null) {
                    mZ mZVar = mZ.this;
                    if (!mZVar.AK) {
                        com.bytedance.adsdk.ugeno.Mm.FA.ZRu(new Runnable() { // from class: com.bytedance.adsdk.ugeno.NOt.mZ.4.2
                            @Override // java.lang.Runnable
                            public void run() {
                                mZ.this.ZRu(new BitmapDrawable(bitmap));
                            }
                        });
                        return;
                    }
                    final Bitmap bitmapZRu = com.bytedance.adsdk.ugeno.Mm.FA.ZRu(mZVar.mZ, bitmap, (int) mZVar.bO);
                    if (bitmapZRu != null) {
                        com.bytedance.adsdk.ugeno.Mm.FA.ZRu(new Runnable() { // from class: com.bytedance.adsdk.ugeno.NOt.mZ.4.1
                            @Override // java.lang.Runnable
                            public void run() {
                                mZ.this.ZRu(new BitmapDrawable(bitmapZRu));
                            }
                        });
                    }
                }
            }
        });
    }

    public float sAl() {
        return this.f140638Oc;
    }

    public String th() {
        return this.lp;
    }

    public lp to() {
        return this.pvl;
    }

    public T uR() {
        return null;
    }

    public JSONObject xY() {
        return this.uR;
    }

    public float yBV() {
        return this.MO;
    }

    public mZ(Context context, ZRu<ViewGroup> zRu) {
        this.edo = -2.0f;
        this.oK = -2.0f;
        this.gmt = 0;
        this.MU = true;
        this.GC = 0.0f;
        this.vE = 0.0f;
        this.f140638Oc = 0.0f;
        this.gaw = 1.0f;
        this.IOC = 1.0f;
        this.Wo = 1.0f;
        this.wZ = 0.0f;
        this.MO = 0.0f;
        this.CXy = 0.0f;
        this.pDA = 0.0f;
        this.FFX = 1.0f;
        this.bDW = true;
        this.JVq = true;
        this.hl = false;
        this.LO = false;
        this.gx = 12.0f;
        this.mZ = context;
        this.Mm = zRu;
        this.cvm = new HashMap();
        this.AOL = new GradientDrawable();
        this.Ht = (T) uR();
    }

    @Deprecated
    private void mZ() {
        com.bytedance.adsdk.ugeno.core.NOt.mZ mZVarUR;
        this.Ht.setVisibility(this.gmt);
        float f10 = this.pDA;
        if (f10 != 0.0f) {
            this.Ht.setRotation(f10);
        }
        TFq.ZRu zRu = this.Vor;
        if (zRu != null && TextUtils.isEmpty(zRu.NOt())) {
            this.Ht.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.NOt.mZ.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    mZ mZVar = mZ.this;
                    if (mZVar.zkn != null) {
                        boolean unused = mZVar.JVq;
                    }
                }
            });
        } else if (NOt(1) && !this.f140640rd) {
            this.Ht.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.NOt.mZ.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    mZ mZVar = mZ.this;
                    if (mZVar.pvl == null || !mZVar.JVq) {
                        return;
                    }
                    mZ mZVar2 = mZ.this;
                    lp lpVar = mZVar2.pvl;
                    aT aTVar = mZVar2.cvm.get(1);
                    mZ mZVar3 = mZ.this;
                    lpVar.ZRu(aTVar, mZVar3, mZVar3);
                }
            });
        }
        if (this.pvl != null && NOt(4)) {
            if (NOt(1)) {
                this.CA = true;
                this.YuF = new uR(this.mZ, this.cvm.get(4), this.cvm.get(1), this.CA);
            } else {
                this.YuF = new uR(this.mZ, this.cvm.get(4), this.CA);
            }
        }
        if (this.pvl != null && NOt(1) && this.f140640rd) {
            this.CH = new com.bytedance.adsdk.ugeno.core.NOt.NOt(this.mZ, this.cvm.get(1));
        }
        nqR();
        if (this.pvl != null && NOt(3) && (mZVarUR = com.bytedance.adsdk.ugeno.uR.ZRu().uR()) != null) {
            this.kkl = mZVarUR.ZRu(this.mZ);
            new Object() { // from class: com.bytedance.adsdk.ugeno.NOt.mZ.3
            };
        }
        if (this.pvl != null && NOt(9)) {
            com.bytedance.adsdk.ugeno.core.NOt.TFq tFq = new com.bytedance.adsdk.ugeno.core.NOt.TFq(this.mZ, this.cvm.get(9), this);
            this.Ds = tFq;
            tFq.ZRu(this.pvl);
        }
        if (NOt(10)) {
            com.bytedance.adsdk.ugeno.core.NOt.ZRu zRu2 = new com.bytedance.adsdk.ugeno.core.NOt.ZRu(this.mZ, this.cvm.get(10), this);
            this.qZ = zRu2;
            zRu2.ZRu(this.pvl);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.mZ
    public void Ht() {
        if (this.Guy == null || this.f140639cb) {
            return;
        }
        this.f140639cb = true;
    }

    @Override // com.bytedance.adsdk.ugeno.mZ
    public void TFq() {
        if (this.Guy == null || this.aNu) {
            return;
        }
        this.aNu = true;
    }

    public void uR(int i10) {
        this.AOL.setShape(0);
        this.AOL.setColor(i10);
        Nl();
        this.AOL.setStroke((int) this.Np, this.HX);
        this.Ht.setBackground(this.AOL);
    }

    private boolean FA(String str) {
        return TextUtils.isEmpty(str) || !TextUtils.equals(str, "hidden");
    }

    public void Ht(int i10) {
        if (Nb()) {
            T t10 = this.Ht;
            if (t10 instanceof NOt) {
                ((NOt) t10).NOt(i10);
                return;
            }
            ViewParent viewParent = (ViewGroup) t10.getParent();
            if (viewParent instanceof NOt) {
                ((NOt) viewParent).NOt(this.Ht, i10);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.Ht.getLayoutParams();
        layoutParams.height = i10;
        this.Ht.setLayoutParams(layoutParams);
    }

    public void TFq(int i10) {
        if (Nb()) {
            T t10 = this.Ht;
            if (t10 instanceof NOt) {
                ((NOt) t10).ZRu(i10);
                return;
            }
            ViewParent viewParent = (ViewGroup) t10.getParent();
            if (viewParent instanceof NOt) {
                ((NOt) viewParent).ZRu(this.Ht, i10);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.Ht.getLayoutParams();
        layoutParams.width = i10;
        this.Ht.setLayoutParams(layoutParams);
    }

    public mZ<T> uR(String str) {
        return NOt(str);
    }

    private ImageView.ScaleType Mm(String str) {
        str.getClass();
        if (str.equals("fit")) {
            this.Ho = ImageView.ScaleType.FIT_CENTER;
        } else if (!str.equals("crop")) {
            this.Ho = ImageView.ScaleType.FIT_XY;
        } else {
            this.Ho = ImageView.ScaleType.CENTER_CROP;
        }
        return this.Ho;
    }

    public boolean NOt(int i10) {
        Map<Integer, aT> map = this.cvm;
        return map != null && map.containsKey(Integer.valueOf(i10));
    }

    public void NOt(JSONObject jSONObject) {
        this.uR = jSONObject;
    }

    private void ZRu() {
        if (this.ZRu) {
            this.Ht.setTranslationX(this.vE);
        }
        if (this.NOt) {
            this.Ht.setTranslationY(this.f140638Oc);
        }
        if (this.HZ) {
            this.Ht.setScaleX(this.IOC);
        }
        if (this.jJC) {
            this.Ht.setScaleY(this.Wo);
        }
        if (this.RPV) {
            this.Ht.setRotation(this.wZ);
        }
        if (this.CTl) {
            this.Ht.setRotationX(this.wZ);
        }
        if (this.fOq) {
            this.Ht.setRotationY(this.CXy);
        }
        if (this.cA) {
            this.Ht.setAlpha(this.FFX);
        }
        float f10 = this.pDA;
        if (f10 != 0.0f) {
            this.Ht.setRotation(f10);
        }
    }

    public mZ<T> NOt(String str) {
        if (TextUtils.isEmpty(this.sAl) || !TextUtils.equals(this.sAl, str)) {
            return null;
        }
        return this;
    }

    public void NOt(String str, String str2) {
        if (TextUtils.isEmpty(str2) || this.cvm == null) {
            return;
        }
        try {
            int iZRu = ZH.ZRu(str).ZRu();
            aT aTVar = new aT();
            aTVar.ZRu(iZRu);
            aTVar.ZRu(this);
            JSONObject jSONObject = new JSONObject(str2);
            if (iZRu == 3) {
                try {
                    this.gx = Float.parseFloat(com.bytedance.adsdk.ugeno.mZ.NOt.ZRu(jSONObject.optString("shakeAmplitude"), this.TFq));
                } catch (NumberFormatException unused) {
                    this.gx = 12.0f;
                }
            }
            lp lpVar = this.pvl;
            if (!(lpVar instanceof com.bytedance.adsdk.ugeno.core.ZRu.ZRu)) {
                ZRu(iZRu, jSONObject, aTVar);
            } else if (!((com.bytedance.adsdk.ugeno.core.ZRu.ZRu) lpVar).ZRu()) {
                ZRu(iZRu, jSONObject, aTVar);
            } else {
                aTVar.ZRu(jSONObject);
                this.cvm.put(Integer.valueOf(iZRu), aTVar);
            }
        } catch (JSONException unused2) {
        }
    }

    public void mZ(int i10) {
        ViewParent viewParent = (ViewGroup) this.Ht.getParent();
        if (viewParent instanceof NOt) {
            ((NOt) viewParent).mZ(this.Ht, i10);
        } else {
            this.Ht.setVisibility(i10);
        }
    }

    public mZ<T> mZ(String str) {
        return ZRu(str);
    }

    @Override // com.bytedance.adsdk.ugeno.mZ
    public void NOt(int i10, int i11, int i12, int i13) {
        Mm mm = this.zr;
        if (mm != null) {
            mm.ZRu(i10, i11);
        }
        com.bytedance.adsdk.ugeno.ZRu.ZRu zRu = this.gX;
        if (zRu != null) {
            zRu.ZRu(i10, i11);
        }
    }

    public void ZRu(oK oKVar) {
        this.Guy = oKVar;
    }

    public void ZRu(sAl sal) {
        this.AZ = sal;
    }

    public void ZRu(lp lpVar) {
        this.pvl = lpVar;
    }

    public mZ NOt(mZ mZVar) {
        return (mZVar.VdW() == null && (mZVar instanceof ZRu)) ? mZVar : NOt(mZVar.VdW());
    }

    public void ZRu(ZRu.C0388ZRu c0388ZRu) {
        if (c0388ZRu == null) {
            return;
        }
        this.AOL.setShape(0);
        this.AOL.setOrientation(c0388ZRu.ZRu);
        if (Build.VERSION.SDK_INT >= 29) {
            this.AOL.setColors(c0388ZRu.NOt, c0388ZRu.mZ);
        } else {
            this.AOL.setColors(c0388ZRu.NOt);
        }
        Nl();
        this.AOL.setStroke((int) this.Np, this.HX);
        this.Ht.setBackground(this.AOL);
    }

    public void ZRu(Drawable drawable) {
        this.Ht.setBackground(drawable);
    }

    public void ZRu(ViewGroup.LayoutParams layoutParams) {
        T t10 = this.Ht;
        if (t10 != null) {
            t10.setLayoutParams(layoutParams);
        }
        this.yM = layoutParams;
    }

    public void ZRu(TFq.ZRu zRu) {
        this.Vor = zRu;
    }

    public mZ<T> ZRu(String str) {
        if (TextUtils.isEmpty(this.lp) || !TextUtils.equals(this.lp, str)) {
            return null;
        }
        return this;
    }

    public void ZRu(boolean z10) {
        this.ZH = z10;
    }

    public void ZRu(ZRu zRu) {
        this.Mm = zRu;
    }

    public void ZRu(FA fa2) {
        this.aT = fa2;
    }

    public void ZRu(Ht ht) {
        this.zkn = ht;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void ZRu(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1964681502:
                if (str.equals("clickable")) {
                    b10 = 0;
                }
                break;
            case -1721943862:
                if (str.equals("translateX")) {
                    b10 = 1;
                }
                break;
            case -1721943861:
                if (str.equals("translateY")) {
                    b10 = 2;
                }
                break;
            case -1501175880:
                if (str.equals("paddingLeft")) {
                    b10 = 3;
                }
                break;
            case -1351184668:
                if (str.equals("onDelay")) {
                    b10 = 4;
                }
                break;
            case -1337252761:
                if (str.equals("onShake")) {
                    b10 = 5;
                }
                break;
            case -1337126126:
                if (str.equals("onSlide")) {
                    b10 = 6;
                }
                break;
            case -1336288090:
                if (str.equals("onTimer")) {
                    b10 = 7;
                }
                break;
            case -1335874424:
                if (str.equals("onTwist")) {
                    b10 = 8;
                }
                break;
            case -1332194002:
                if (str.equals(NotificationCompat.w.f110895C)) {
                    b10 = 9;
                }
                break;
            case -1291329255:
                if (str.equals("events")) {
                    b10 = 10;
                }
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    b10 = 11;
                }
                break;
            case -1228066334:
                if (str.equals("borderTopLeftRadius")) {
                    b10 = 12;
                }
                break;
            case -1221029593:
                if (str.equals(InMobiNetworkValues.HEIGHT)) {
                    b10 = 13;
                }
                break;
            case -1081309778:
                if (str.equals("margin")) {
                    b10 = Ascii.SO;
                }
                break;
            case -1044792121:
                if (str.equals("marginTop")) {
                    b10 = Ascii.SI;
                }
                break;
            case -1013407967:
                if (str.equals("onDown")) {
                    b10 = 16;
                }
                break;
            case -933876756:
                if (str.equals("backgroundDrawable")) {
                    b10 = 17;
                }
                break;
            case -925180581:
                if (str.equals("rotate")) {
                    b10 = Ascii.DC2;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b10 = 19;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b10 = Ascii.DC4;
                }
                break;
            case -806339567:
                if (str.equals("padding")) {
                    b10 = Ascii.NAK;
                }
                break;
            case -681357156:
                if (str.equals("triggerFunc")) {
                    b10 = Ascii.SYN;
                }
                break;
            case -289173127:
                if (str.equals("marginBottom")) {
                    b10 = Ascii.ETB;
                }
                break;
            case 3355:
                if (str.equals("id")) {
                    b10 = Ascii.CAN;
                }
                break;
            case 3176990:
                if (str.equals("i18n")) {
                    b10 = Ascii.EM;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    b10 = Ascii.SUB;
                }
                break;
            case 87811796:
                if (str.equals("backgroundImageBlur")) {
                    b10 = Ascii.ESC;
                }
                break;
            case 90130308:
                if (str.equals("paddingTop")) {
                    b10 = Ascii.FS;
                }
                break;
            case 94750088:
                if (str.equals("click")) {
                    b10 = Ascii.GS;
                }
                break;
            case 105871684:
                if (str.equals("onTap")) {
                    b10 = Ascii.RS;
                }
                break;
            case 108285963:
                if (str.equals(d.f107890U1)) {
                    b10 = Ascii.US;
                }
                break;
            case 109250890:
                if (str.equals("scale")) {
                    b10 = 32;
                }
                break;
            case 113126854:
                if (str.equals(InMobiNetworkValues.WIDTH)) {
                    b10 = 33;
                }
                break;
            case 202355100:
                if (str.equals("paddingBottom")) {
                    b10 = 34;
                }
                break;
            case 320386138:
                if (str.equals("onLoadMore")) {
                    b10 = 35;
                }
                break;
            case 333432965:
                if (str.equals("borderTopRightRadius")) {
                    b10 = 36;
                }
                break;
            case 529642498:
                if (str.equals("overflow")) {
                    b10 = 37;
                }
                break;
            case 581268560:
                if (str.equals("borderBottomLeftRadius")) {
                    b10 = 38;
                }
                break;
            case 588239831:
                if (str.equals("borderBottomRightRadius")) {
                    b10 = 39;
                }
                break;
            case 713848971:
                if (str.equals("paddingRight")) {
                    b10 = 40;
                }
                break;
            case 722830999:
                if (str.equals("borderColor")) {
                    b10 = 41;
                }
                break;
            case 741115130:
                if (str.equals("borderWidth")) {
                    b10 = b.f239025q6;
                }
                break;
            case 843948038:
                if (str.equals("onExposure")) {
                    b10 = 43;
                }
                break;
            case 975087886:
                if (str.equals("marginRight")) {
                    b10 = 44;
                }
                break;
            case 1052832078:
                if (str.equals("translate")) {
                    b10 = 45;
                }
                break;
            case 1087723621:
                if (str.equals("onAnimation")) {
                    b10 = 46;
                }
                break;
            case 1118509956:
                if (str.equals(GlideExecutor.f139627g)) {
                    b10 = b.f238921d6;
                }
                break;
            case 1151851515:
                if (str.equals("animatorSet")) {
                    b10 = 48;
                }
                break;
            case 1158381436:
                if (str.equals("onPullToRefresh")) {
                    b10 = 49;
                }
                break;
            case 1287124693:
                if (str.equals("backgroundColor")) {
                    b10 = 50;
                }
                break;
            case 1292595405:
                if (str.equals("backgroundImage")) {
                    b10 = 51;
                }
                break;
            case 1301532860:
                if (str.equals("backgroundScale")) {
                    b10 = 52;
                }
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    b10 = 53;
                }
                break;
            case 1384173149:
                if (str.equals("rotateX")) {
                    b10 = 54;
                }
                break;
            case 1384173150:
                if (str.equals("rotateY")) {
                    b10 = 55;
                }
                break;
            case 1384173151:
                if (str.equals("rotateZ")) {
                    b10 = 56;
                }
                break;
            case 1490730380:
                if (str.equals("onScroll")) {
                    b10 = 57;
                }
                break;
            case 1671308008:
                if (str.equals("disable")) {
                    b10 = 58;
                }
                break;
            case 1685004456:
                if (str.equals("onLongTap")) {
                    b10 = 59;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    b10 = 60;
                }
                break;
            case 1970934485:
                if (str.equals("marginLeft")) {
                    b10 = Base64.f217719k;
                }
                break;
            case 1997542747:
                if (str.equals("availability")) {
                    b10 = 62;
                }
                break;
        }
        switch (b10) {
            case 0:
                this.JVq = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, true);
                break;
            case 1:
                this.ZRu = true;
                this.vE = com.bytedance.adsdk.ugeno.Mm.FA.ZRu(this.mZ, com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, 0.0f));
                break;
            case 2:
                this.NOt = true;
                this.f140638Oc = com.bytedance.adsdk.ugeno.Mm.FA.ZRu(this.mZ, com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, 0.0f));
                break;
            case 3:
                this.MR = com.bytedance.adsdk.ugeno.Mm.FA.ZRu(this.mZ, str2);
                this.th = true;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 16:
            case 30:
            case 35:
            case 43:
            case 46:
            case 49:
            case 57:
            case 59:
                NOt(str, str2);
                break;
            case 9:
            case 50:
                if (com.bytedance.adsdk.ugeno.Mm.ZRu.mZ(str2)) {
                    this.Pzo = true;
                    this.hNL = com.bytedance.adsdk.ugeno.Mm.ZRu.NOt(str2);
                } else {
                    this.Cox = com.bytedance.adsdk.ugeno.Mm.ZRu.ZRu(str2, 0);
                    this.Pzo = false;
                }
                break;
            case 10:
                this.klw = com.bytedance.adsdk.ugeno.uR.TFq.ZRu(this, str2);
                break;
            case 11:
                this.cA = true;
                this.FFX = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, 1.0f);
                break;
            case 12:
                this.Hvv = com.bytedance.adsdk.ugeno.Mm.FA.ZRu(this.mZ, str2);
                this.Nl = true;
                break;
            case 13:
                if (TextUtils.equals(str2, "match_parent")) {
                    this.oK = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.oK = -2.0f;
                } else {
                    this.oK = com.bytedance.adsdk.ugeno.Mm.FA.ZRu(this.mZ, str2);
                }
                this.LO = true;
                break;
            case 14:
                this.yBV = com.bytedance.adsdk.ugeno.Mm.FA.ZRu(this.mZ, str2);
                break;
            case 15:
                this.om = com.bytedance.adsdk.ugeno.Mm.FA.ZRu(this.mZ, str2);
                this.Zf = true;
                break;
            case 17:
            case 51:
                this.gI = str2;
                break;
            case 18:
                this.RPV = true;
                this.wZ = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, 0.0f);
                break;
            case 19:
                this.HZ = true;
                this.IOC = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, 0.0f);
                break;
            case 20:
                this.jJC = true;
                this.Wo = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, 0.0f);
                break;
            case 21:
                this.le = com.bytedance.adsdk.ugeno.Mm.FA.ZRu(this.mZ, str2);
                break;
            case 22:
                this.eqw = str2;
                break;
            case 23:
                this.OCA = com.bytedance.adsdk.ugeno.Mm.FA.ZRu(this.mZ, str2);
                this.ru = true;
                break;
            case 24:
                this.lp = str2;
                break;
            case 25:
                this.LrZ = com.bytedance.adsdk.ugeno.Mm.NOt.ZRu(str2, (JSONObject) null);
                break;
            case 26:
                this.sAl = str2;
                break;
            case 27:
                float fZRu = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, 0.0f);
                this.bO = fZRu;
                if (fZRu > 0.0f) {
                    this.AK = true;
                }
                break;
            case 28:
                this.f140637Nb = com.bytedance.adsdk.ugeno.Mm.FA.ZRu(this.mZ, str2);
                this.fWk = true;
                break;
            case 29:
                this.KIc = str2;
                break;
            case 31:
                this.ZRJ = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, 0.0f);
                break;
            case 32:
                this.HZ = true;
                this.jJC = true;
                float[] fArrMZ = com.bytedance.adsdk.ugeno.ZRu.mZ.mZ(str2);
                this.IOC = fArrMZ[0];
                this.Wo = fArrMZ[1];
                break;
            case 33:
                if (TextUtils.equals(str2, "match_parent")) {
                    this.edo = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.edo = -2.0f;
                } else {
                    this.edo = com.bytedance.adsdk.ugeno.Mm.FA.ZRu(this.mZ, str2);
                }
                this.hl = true;
                break;
            case 34:
                this.VdW = com.bytedance.adsdk.ugeno.Mm.FA.ZRu(this.mZ, str2);
                this.Yx = true;
                break;
            case 36:
                this.nqR = com.bytedance.adsdk.ugeno.Mm.FA.ZRu(this.mZ, str2);
                this.yz = true;
                break;
            case 37:
                this.bDW = FA(str2);
                break;
            case 38:
                this.IZ = com.bytedance.adsdk.ugeno.Mm.FA.ZRu(this.mZ, str2);
                this.Jem = true;
                break;
            case 39:
                this.NBW = com.bytedance.adsdk.ugeno.Mm.FA.ZRu(this.mZ, str2);
                this.Gis = true;
                break;
            case 40:
                this.fcs = com.bytedance.adsdk.ugeno.Mm.FA.ZRu(this.mZ, str2);
                this.WD = true;
                break;
            case 41:
                this.HX = com.bytedance.adsdk.ugeno.Mm.ZRu.ZRu(str2);
                break;
            case 42:
                this.Np = com.bytedance.adsdk.ugeno.Mm.FA.ZRu(this.mZ, str2);
                break;
            case 44:
                this.qF = com.bytedance.adsdk.ugeno.Mm.FA.ZRu(this.mZ, str2);
                this.xY = true;
                break;
            case 45:
                this.ZRu = true;
                this.NOt = true;
                float[] fArrMZ2 = com.bytedance.adsdk.ugeno.ZRu.mZ.mZ(str2);
                this.vE = com.bytedance.adsdk.ugeno.Mm.FA.ZRu(this.mZ, fArrMZ2[0]);
                this.f140638Oc = com.bytedance.adsdk.ugeno.Mm.FA.ZRu(this.mZ, fArrMZ2[1]);
                break;
            case 47:
                try {
                    this.gX = new com.bytedance.adsdk.ugeno.ZRu.ZRu(this.mZ, this, com.bytedance.adsdk.ugeno.ZRu.mZ.ZRu(new JSONObject(str2)));
                } catch (JSONException unused) {
                    return;
                }
                break;
            case 48:
                this.pU = com.bytedance.adsdk.ugeno.core.ZRu.ZRu(str2, this);
                break;
            case 52:
                this.Vr = true;
                this.Ho = Mm(str2);
                break;
            case 53:
                this.Qg = com.bytedance.adsdk.ugeno.Mm.FA.ZRu(this.mZ, str2);
                break;
            case 54:
                this.CTl = true;
                this.MO = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, 0.0f);
                break;
            case 55:
                this.fOq = true;
                this.CXy = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, 0.0f);
                break;
            case 56:
                this.pDA = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, 0.0f);
                break;
            case 58:
                this.wcb = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, false);
                break;
            case 60:
                if (TextUtils.equals("visible", str2)) {
                    this.gmt = 0;
                } else if (TextUtils.equals("invisible", str2)) {
                    this.gmt = 4;
                } else if (TextUtils.equals("gone", str2) || TextUtils.equals("hidden", str2)) {
                    this.gmt = 8;
                }
                this.Ht.setVisibility(this.gmt);
                break;
            case 61:
                this.WMI = com.bytedance.adsdk.ugeno.Mm.FA.ZRu(this.mZ, str2);
                this.to = true;
                break;
            case 62:
                this.MU = !TextUtils.equals(str2, "unavailable");
                break;
        }
    }

    @Deprecated
    public void ZRu(int i10, JSONObject jSONObject, aT aTVar) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("success");
        if (jSONObjectOptJSONObject != null) {
            aT aTVar2 = new aT();
            aTVar2.ZRu(jSONObjectOptJSONObject);
            aTVar2.ZRu(this);
            aTVar.ZRu(aTVar2);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("fail");
        if (jSONObjectOptJSONObject2 != null) {
            aT aTVar3 = new aT();
            aTVar3.ZRu(jSONObjectOptJSONObject2);
            aTVar3.ZRu(this);
            aTVar.NOt(aTVar3);
        }
        aTVar.ZRu(jSONObject);
        this.cvm.put(Integer.valueOf(i10), aTVar);
    }

    @Override // com.bytedance.adsdk.ugeno.mZ
    public int[] ZRu(int i10, int i11) {
        if (this.ZRJ > 0.0f) {
            if (this.hl) {
                int size = View.MeasureSpec.getSize(i10);
                float f10 = this.ZRJ;
                if (f10 != 0.0f) {
                    i11 = View.MeasureSpec.makeMeasureSpec((int) (size / f10), 1073741824);
                }
            } else if (this.LO) {
                int size2 = View.MeasureSpec.getSize(i11);
                float f11 = this.ZRJ;
                if (f11 != 0.0f) {
                    i10 = View.MeasureSpec.makeMeasureSpec((int) (size2 * f11), 1073741824);
                }
            }
        }
        if (this.Guy != null && !this.IJM) {
            this.IJM = true;
        }
        return new int[]{i10, i11};
    }

    @Override // com.bytedance.adsdk.ugeno.mZ
    public void ZRu(int i10, int i11, int i12, int i13) {
        if (this.Guy == null || this.jQo) {
            return;
        }
        this.jQo = true;
    }

    @Override // com.bytedance.adsdk.ugeno.mZ
    public void ZRu(Canvas canvas, IAnimation iAnimation) {
        Mm mm = this.zr;
        if (mm != null) {
            mm.ZRu(canvas, iAnimation);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.mZ
    public void ZRu(Canvas canvas) {
        com.bytedance.adsdk.ugeno.ZRu.ZRu zRu = this.gX;
        if (zRu != null) {
            zRu.ZRu(canvas);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.lp.NOt
    public void ZRu(aT aTVar) {
        ZRu<ViewGroup> zRu;
        mZ<T> mZVarMZ;
        if (aTVar == null || aTVar.mZ() == null || !TextUtils.equals(aTVar.mZ().optString("type"), "onDismiss")) {
            return;
        }
        String strOptString = aTVar.mZ().optString("nodeId");
        mZ(8);
        this.FA = (ZRu) NOt(this);
        if (TextUtils.isEmpty(strOptString) || (zRu = this.FA) == null || (mZVarMZ = zRu.mZ(strOptString)) == null) {
            return;
        }
        mZVarMZ.mZ(8);
    }

    public void ZRu(com.bytedance.adsdk.ugeno.uR.ZRu.ZRu zRu) {
        this.dkT = zRu;
    }
}

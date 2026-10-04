package com.bytedance.sdk.component.adexpress.dynamic.uR;

import W3.o;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.common.base.Ascii;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.io.encoding.Base64;
import kotlinx.coroutines.N;
import okio.h0;
import org.json.JSONArray;
import org.json.JSONObject;
import t1.b;

/* JADX INFO: loaded from: classes2.dex */
public class Ht {
    private int AK;
    private int AOL;
    private int AZ;
    private boolean CA;
    private int CH;
    private int CTl;
    private boolean CXy;
    private String Cox;
    private JSONObject Ds;
    private float FA;
    private int FFX;
    private int GC;
    private boolean Gis;
    private String Guy;
    private boolean HX;
    private boolean HZ;
    private int Ho;
    private float Ht;
    private double Hvv;
    private int IJM;
    private int IOC;
    private int IZ;
    private String JVq;
    private String Jem;
    private String KIc;
    private String LO;
    private String LrZ;
    private String MO;
    private int MR;
    private JSONObject MU;
    private float Mm;
    private int NBW;
    private float NOt;

    /* JADX INFO: renamed from: Nb, reason: collision with root package name */
    private double f140649Nb;
    private boolean Nl;
    private boolean Np;
    private String OCA;

    /* JADX INFO: renamed from: Oc, reason: collision with root package name */
    private int f140650Oc;
    private int Pzo;
    private int Qg;
    private boolean RPV;
    private boolean TFq;
    private double VdW;
    private float Vor;
    private int Vr;
    private String WD;
    private String WMI;
    private int Wo;
    private int YuF;
    private String Yx;
    private double ZH;
    private String ZRJ;
    private float ZRu;
    private String Zf;
    private boolean aNu;
    private float aT;
    private JSONObject bDW;
    private int bO;
    private double cA;

    /* JADX INFO: renamed from: cb, reason: collision with root package name */
    private int f140651cb;
    private int cvm;
    private String edo;
    private String eqw;
    private boolean fOq;
    private String fWk;
    private int fcs;
    private boolean gI;
    private boolean gX;
    private int gaw;
    private boolean gmt;
    private int hNL;
    private long hl = -1;
    private boolean jJC;
    private int jQo;
    private int kkl;
    private String klw;
    private boolean le;
    private double lp;
    private float mZ;
    private boolean nqR;
    private String oK;
    private String om;
    private int pDA;
    private boolean pU;
    private List<ZRu> pvl;
    private String qF;
    private int qZ;

    /* JADX INFO: renamed from: rd, reason: collision with root package name */
    private int f140652rd;
    private String ru;
    private String sAl;
    private String th;
    private String to;
    private float uR;
    private int vE;
    private String wZ;
    private JSONObject wcb;
    private String xY;
    private String yBV;
    private int yM;
    private int yz;
    private int zkn;
    private int zr;

    public static Ht ZRu(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Ht ht = new Ht();
        ht.NOt(jSONObject.optString("adType", "embeded"));
        ht.oK(jSONObject.optString("clickArea", "creative"));
        ht.yBV(jSONObject.optString("clickTigger", "click"));
        ht.mZ(jSONObject.optString("fontFamily", "PingFangSC"));
        ht.uR(jSONObject.optString("textAlign", "left"));
        ht.TFq(jSONObject.optString("color", "#999999"));
        ht.Ht(jSONObject.optString("bgColor", "transparent"));
        ht.Mm(jSONObject.optString("bgImgUrl", ""));
        ht.fcs(jSONObject.optString("bgImgData", ""));
        ht.FA(jSONObject.optString("borderColor", "#000000"));
        ht.Vor(jSONObject.optString("borderStyle", "solid"));
        ht.aT(jSONObject.optString("heightMode", N.f218775c));
        ht.ZH(jSONObject.optString("widthMode", "fixed"));
        ht.lp(jSONObject.optString("interactText", ""));
        ht.mZ(jSONObject.optBoolean("isShowBgControl", false));
        ht.sAl(jSONObject.optString("interactBgColor", ""));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("interactPosition");
        if (jSONObjectOptJSONObject != null) {
            ht.Mm(jSONObjectOptJSONObject.optInt("translateY", 0));
            ht.FA(jSONObjectOptJSONObject.optInt("translateX", 0));
            ht.uR(jSONObjectOptJSONObject.optDouble("scaleX", 0.0d));
            ht.TFq(jSONObjectOptJSONObject.optDouble("scaleY", 0.0d));
        }
        ht.edo(jSONObject.optString("interactType", ""));
        ht.TFq(jSONObject.optInt("interactSlideDirection", -1));
        ht.WMI(jSONObject.optString("justifyHorizontal", "space-around"));
        ht.qF(jSONObject.optString("justifyVertical", "flex-start"));
        ht.NOt(jSONObject.optDouble("timingStart"));
        ht.mZ(jSONObject.optDouble("timingEnd"));
        ht.uR((float) jSONObject.optDouble(InMobiNetworkValues.WIDTH, 0.0d));
        ht.mZ((float) jSONObject.optDouble(InMobiNetworkValues.HEIGHT, 0.0d));
        ht.ZRu((float) jSONObject.optDouble("borderRadius", 0.0d));
        ht.NOt((float) jSONObject.optDouble("borderSize", 0.0d));
        ht.NOt(jSONObject.optBoolean("interactValidate", false));
        ht.Vor((float) jSONObject.optDouble("fontSize", 0.0d));
        ht.TFq((float) jSONObject.optDouble("paddingBottom", 0.0d));
        ht.Ht((float) jSONObject.optDouble("paddingLeft", 0.0d));
        ht.Mm((float) jSONObject.optDouble("paddingRight", 0.0d));
        ht.FA((float) jSONObject.optDouble("paddingTop", 0.0d));
        ht.uR(jSONObject.optBoolean("lineFeed", false));
        ht.Vor(jSONObject.optInt("lineCount", 0));
        ht.Ht(jSONObject.optDouble("lineHeight", 1.2d));
        ht.edo(jSONObject.optInt("letterSpacing", 0));
        ht.TFq(jSONObject.optBoolean("isDataFixed", false));
        ht.oK(jSONObject.optInt("fontWeight"));
        ht.Ht(jSONObject.optBoolean("lineLimit"));
        ht.yBV(jSONObject.optInt(o.f76584m));
        ht.om(jSONObject.optString("align"));
        ht.Mm(jSONObject.optBoolean("useLeft"));
        ht.FA(jSONObject.optBoolean("useRight"));
        ht.Vor(jSONObject.optBoolean("useTop"));
        ht.aT(jSONObject.optBoolean("useBottom"));
        ht.OCA(jSONObject.optString("data"));
        ht.NOt(jSONObject.optJSONObject("i18n"));
        ht.lp(jSONObject.optInt("marginLeft"));
        ht.sAl(jSONObject.optInt("marginRight"));
        ht.aT(jSONObject.optInt("marginTop"));
        ht.ZH(jSONObject.optInt("marginBottom"));
        ht.WMI(jSONObject.optInt("tagMaxCount"));
        ht.ZH(jSONObject.optBoolean("allowTextFlow"));
        ht.qF(jSONObject.optInt("textFlowType"));
        ht.om(jSONObject.optInt("textFlowDuration"));
        ht.OCA(jSONObject.optInt("left"));
        ht.to(jSONObject.optInt("right"));
        ht.xY(jSONObject.optInt("top"));
        ht.Zf(jSONObject.optInt("bottom"));
        ht.to(jSONObject.optString("alignItems", "flex-start"));
        ht.xY(jSONObject.optString("direction", ""));
        ht.ZRu(jSONObject.optBoolean("loop", false));
        ht.ru(jSONObject.optInt("zIndex"));
        ht.VdW(jSONObject.optInt("interactVisibleTime"));
        ht.le(jSONObject.optInt("interactHiddenTime"));
        ht.sAl(jSONObject.optBoolean("interactEnableMask"));
        ht.edo(jSONObject.optBoolean("interactWontHide"));
        ht.ZRu(jSONObject.optString("bgGradient"));
        ht.WD(jSONObject.optInt("areaType"));
        ht.fWk(jSONObject.optInt("interactSlideThreshold", 0));
        ht.gI(jSONObject.optInt("interactBottomDistance", com.bytedance.sdk.component.adexpress.uR.NOt() ? 0 : 120));
        ht.qF(jSONObject.optBoolean("openPlayableLandingPage", false));
        ht.mZ(jSONObject.optJSONObject("video"));
        ht.uR(jSONObject.optJSONObject("image"));
        ht.Yx(jSONObject.optInt("borderShadowExtent"));
        ht.oK(jSONObject.optBoolean("bgGauseBlur"));
        ht.Cox(jSONObject.optInt("bgGauseBlurRadius"));
        ht.yBV(jSONObject.optBoolean("showTimeProgress", false));
        ht.WMI(jSONObject.optBoolean("showPlayButton", false));
        ht.ZRu(jSONObject.optDouble("bgColorCg", 0.0d));
        ht.Ht(jSONObject.optInt("bgMaterialCenterCalcColor", 0));
        ht.NOt(jSONObject.optInt("borderTopLeftRadius", 0));
        ht.ZRu(jSONObject.optInt("borderTopRightRadius", 0));
        ht.uR(jSONObject.optInt("borderBottomLeftRadius", 0));
        ht.mZ(jSONObject.optInt("borderBottomRightRadius", 0));
        ht.TFq(jSONObject.optJSONObject("interactI18n"));
        ht.ru(jSONObject.optString("imageObjectFit"));
        ht.le(jSONObject.optString("interactTitle"));
        ht.th(jSONObject.optInt("interactTextPositionTop"));
        ht.Zf(jSONObject.optString("imageLottieTosPath"));
        ht.lp(jSONObject.optBoolean("animationsLoop"));
        ht.MR(jSONObject.optInt("lottieAppNameMaxLength"));
        ht.Nb(jSONObject.optInt("lottieAdDescMaxLength"));
        ht.fcs(jSONObject.optInt("lottieAdTitleMaxLength"));
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animations");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                    ZRu zRu = new ZRu();
                    zRu.mZ(jSONObject2.optString("animationType"));
                    zRu.ZRu(jSONObject2.optDouble("animationDuration"));
                    zRu.NOt(jSONObject2.optDouble("animationScaleX"));
                    zRu.mZ(jSONObject2.optDouble("animationScaleY"));
                    zRu.uR(jSONObject2.optString("animationTimeFunction"));
                    zRu.uR(jSONObject2.optDouble("animationDelay"));
                    zRu.Ht(jSONObject2.optInt("animationIterationCount"));
                    zRu.TFq(jSONObject2.optString("animationDirection"));
                    zRu.TFq(jSONObject2.optDouble("animationInterval"));
                    zRu.ZRu(jSONObject2.optInt("animationBorderWidth"));
                    zRu.ZRu(jSONObject2.optLong("key"));
                    zRu.NOt(jSONObject2.optInt("animationEffectWidth"));
                    zRu.mZ(jSONObject2.optInt("animationSwing", 1));
                    zRu.uR(jSONObject2.optInt("animationTranslateX"));
                    zRu.TFq(jSONObject2.optInt("animationTranslateY"));
                    zRu.NOt(jSONObject2.optString("animationRippleBackgroundColor"));
                    zRu.ZRu(jSONObject2.optString("animationScaleDirection"));
                    zRu.Mm(jSONObject2.optInt("animationFadeStart"));
                    zRu.FA(jSONObject2.optInt("animationFadeEnd"));
                    zRu.Ht(jSONObject2.optString("animationFillMode"));
                    zRu.Vor(jSONObject2.optInt("animationBounceHeight"));
                    if (ht.om() > 0.0d) {
                        zRu.uR(zRu.edo() + ht.om());
                    }
                    arrayList.add(zRu);
                }
                ht.ZRu(arrayList);
            }
            if (jSONObject.has("triggerSlideMinDistance")) {
                ht.MR(jSONObject.optString("triggerSlideDirection", MBridgeConstans.ENDCARD_URL_TYPE_PL));
                ht.ZRu(jSONObject.optLong("triggerSlideMinDistance", 0L));
            }
        } catch (Exception unused) {
        }
        return ht;
    }

    private void fcs(String str) {
        this.LO = str;
    }

    public String AK() {
        return this.fWk;
    }

    public int AOL() {
        return this.f140652rd;
    }

    public String AZ() {
        return this.MO;
    }

    public String CA() {
        return this.KIc;
    }

    public int CH() {
        return this.Pzo;
    }

    public int CTl() {
        return this.jQo;
    }

    public int CXy() {
        return this.f140650Oc;
    }

    public double Cox() {
        return this.f140649Nb;
    }

    public int Ds() {
        return this.AZ;
    }

    public double FA() {
        return this.cA;
    }

    public int FFX() {
        return this.IOC;
    }

    public boolean GC() {
        return this.HX;
    }

    public int Gis() {
        return this.IZ;
    }

    public boolean Guy() {
        return this.fOq;
    }

    public int HX() {
        return this.NBW;
    }

    public boolean HZ() {
        return this.aNu;
    }

    public String Ho() {
        return this.th;
    }

    public JSONObject Ht() {
        return this.Ds;
    }

    public boolean Hvv() {
        return this.gI;
    }

    public String IJM() {
        return this.JVq;
    }

    public int IOC() {
        return this.yM;
    }

    public int IZ() {
        return this.Ho;
    }

    public String JVq() {
        return this.LrZ;
    }

    public double Jem() {
        return this.Hvv;
    }

    public List<ZRu> KIc() {
        return this.pvl;
    }

    public long LrZ() {
        return this.hl;
    }

    public int MO() {
        return this.vE;
    }

    public String MR() {
        return this.om;
    }

    public String MU() {
        return this.Jem;
    }

    public int Mm() {
        return this.AOL;
    }

    public int NBW() {
        return this.AK;
    }

    public int NOt() {
        return this.CH;
    }

    public String Nb() {
        return this.xY;
    }

    public int Nl() {
        return this.Vr;
    }

    public boolean Np() {
        return this.nqR;
    }

    public double OCA() {
        return this.lp;
    }

    public String Oc() {
        return this.ZRJ;
    }

    public int Pzo() {
        return this.FFX;
    }

    public String Qg() {
        return this.Cox;
    }

    public int RPV() {
        return this.f140651cb;
    }

    public int TFq() {
        return this.zr;
    }

    public String VdW() {
        return this.Zf;
    }

    public int Vor() {
        return this.qZ;
    }

    public String Vr() {
        return this.Yx;
    }

    public boolean WD() {
        return this.le;
    }

    public float WMI() {
        return this.Vor;
    }

    public boolean Wo() {
        return this.gX;
    }

    public boolean YuF() {
        return this.HZ;
    }

    public int Yx() {
        return this.fcs;
    }

    public float ZH() {
        return this.ZRu;
    }

    public int ZRJ() {
        return this.yz;
    }

    public String Zf() {
        return this.WMI;
    }

    public JSONObject aNu() {
        return this.wcb;
    }

    public String aT() {
        return this.klw;
    }

    public boolean bDW() {
        return this.pU;
    }

    public String bO() {
        return this.WD;
    }

    public int cA() {
        return this.zkn;
    }

    public void cb() {
        ZRu(this, this.bDW);
    }

    public int cvm() {
        return this.pDA;
    }

    public float edo() {
        return this.Ht;
    }

    public boolean eqw() {
        return this.RPV;
    }

    public boolean fOq() {
        return this.CA;
    }

    public int fWk() {
        return this.MR;
    }

    public double gI() {
        return this.VdW;
    }

    public boolean gX() {
        return this.Np;
    }

    public JSONObject gaw() {
        return this.MU;
    }

    public boolean gmt() {
        return this.Nl;
    }

    public String hNL() {
        return this.Guy;
    }

    public int jJC() {
        return this.IJM;
    }

    public void jQo() {
        ZRu(this, this.wcb);
    }

    public int kkl() {
        return this.hNL;
    }

    public String le() {
        return this.LO;
    }

    public float lp() {
        return this.NOt;
    }

    public int mZ() {
        return this.YuF;
    }

    public int nqR() {
        return this.bO;
    }

    public float oK() {
        return this.Mm;
    }

    public double om() {
        return this.ZH;
    }

    public int pDA() {
        return this.gaw;
    }

    public int pU() {
        List<ZRu> list = this.pvl;
        if (list == null) {
            return 0;
        }
        for (ZRu zRu : list) {
            if ("translate".equals(zRu.Vor()) && zRu.Mm() < 0) {
                return -zRu.Mm();
            }
        }
        return 0;
    }

    public String pvl() {
        return this.wZ;
    }

    public float qF() {
        return this.aT;
    }

    public int qZ() {
        return this.cvm;
    }

    public int rd() {
        return this.CTl;
    }

    public String ru() {
        return this.qF;
    }

    public boolean sAl() {
        return this.TFq;
    }

    public String th() {
        return this.ru;
    }

    public String to() {
        return this.oK;
    }

    public int uR() {
        return this.kkl;
    }

    public boolean vE() {
        return this.gmt;
    }

    public int wZ() {
        return this.GC;
    }

    public String wcb() {
        return this.eqw;
    }

    public String xY() {
        return this.yBV;
    }

    public float yBV() {
        return this.FA;
    }

    public boolean yM() {
        return this.Gis;
    }

    public int yz() {
        return this.Qg;
    }

    public int zkn() {
        return this.Wo;
    }

    public boolean zr() {
        return this.jJC;
    }

    public void Cox(int i10) {
        this.hNL = i10;
    }

    public void FA(float f10) {
        this.Vor = f10;
    }

    public void Ht(int i10) {
        this.qZ = i10;
    }

    public void MR(int i10) {
        this.IJM = i10;
    }

    public void Mm(float f10) {
        this.FA = f10;
    }

    public void NOt(int i10) {
        this.YuF = i10;
    }

    public void Nb(int i10) {
        this.jQo = i10;
    }

    public void OCA(String str) {
        this.ZRJ = str;
    }

    public void TFq(int i10) {
        this.AOL = i10;
    }

    public void VdW(int i10) {
        this.zkn = i10;
    }

    public void Vor(float f10) {
        this.aT = f10;
    }

    public void WD(int i10) {
        this.AZ = i10;
    }

    public void WMI(String str) {
        this.Yx = str;
    }

    public void Yx(int i10) {
        this.Pzo = i10;
    }

    public void ZH(String str) {
        this.xY = str;
    }

    public void Zf(int i10) {
        this.Wo = i10;
    }

    public void aT(String str) {
        this.to = str;
    }

    public void edo(String str) {
        this.th = str;
    }

    public void fWk(int i10) {
        this.cvm = i10;
    }

    public String fcs() {
        return this.to;
    }

    public void gI(int i10) {
        this.CTl = i10;
    }

    public void le(int i10) {
        this.FFX = i10;
    }

    public void lp(String str) {
        this.Zf = str;
    }

    public void mZ(int i10) {
        this.kkl = i10;
    }

    public void oK(String str) {
        this.WD = str;
    }

    public void om(String str) {
        this.Jem = str;
    }

    public void qF(String str) {
        this.Cox = str;
    }

    public void ru(int i10) {
        this.pDA = i10;
    }

    public void sAl(String str) {
        this.ru = str;
    }

    public void th(int i10) {
        this.f140652rd = i10;
    }

    public void to(int i10) {
        this.gaw = i10;
    }

    public void uR(int i10) {
        this.zr = i10;
    }

    public void xY(int i10) {
        this.IOC = i10;
    }

    public void yBV(String str) {
        this.fWk = str;
    }

    public void FA(String str) {
        this.om = str;
    }

    public void Ht(float f10) {
        this.Mm = f10;
    }

    public void MR(String str) {
        this.LrZ = str;
    }

    public void Mm(String str) {
        this.qF = str;
    }

    public void NOt(float f10) {
        this.NOt = f10;
    }

    public void OCA(int i10) {
        this.f140650Oc = i10;
    }

    public void TFq(float f10) {
        this.Ht = f10;
    }

    public void Vor(String str) {
        this.OCA = str;
    }

    public void WMI(int i10) {
        this.yM = i10;
    }

    public void ZH(int i10) {
        this.AK = i10;
    }

    public void Zf(String str) {
        this.Guy = str;
    }

    public void aT(int i10) {
        this.bO = i10;
    }

    public void edo(int i10) {
        this.IZ = i10;
    }

    public void fcs(int i10) {
        this.f140651cb = i10;
    }

    public void le(String str) {
        this.JVq = str;
    }

    public void lp(int i10) {
        this.Vr = i10;
    }

    public void mZ(float f10) {
        this.mZ = f10;
    }

    public void oK(int i10) {
        this.NBW = i10;
    }

    public void om(int i10) {
        this.vE = i10;
    }

    public void qF(int i10) {
        this.GC = i10;
    }

    public void ru(String str) {
        this.eqw = str;
    }

    public void sAl(int i10) {
        this.Qg = i10;
    }

    public void to(String str) {
        this.wZ = str;
    }

    public void uR(float f10) {
        this.uR = f10;
    }

    public void xY(String str) {
        this.MO = str;
    }

    public void yBV(int i10) {
        this.yz = i10;
    }

    public void FA(int i10) {
        this.fcs = i10;
    }

    public void Ht(String str) {
        this.WMI = str;
    }

    public void Mm(int i10) {
        this.MR = i10;
    }

    public void NOt(boolean z10) {
        this.TFq = z10;
    }

    public void TFq(String str) {
        this.yBV = str;
    }

    public void Vor(int i10) {
        this.Ho = i10;
    }

    public void WMI(boolean z10) {
        this.RPV = z10;
    }

    public void ZH(boolean z10) {
        this.gX = z10;
    }

    public void aT(boolean z10) {
        this.gmt = z10;
    }

    public void edo(boolean z10) {
        this.pU = z10;
    }

    public void lp(boolean z10) {
        this.aNu = z10;
    }

    public void mZ(double d10) {
        this.lp = d10;
    }

    public void oK(boolean z10) {
        this.HZ = z10;
    }

    public void qF(boolean z10) {
        this.fOq = z10;
    }

    public void sAl(boolean z10) {
        this.CA = z10;
    }

    public void uR(String str) {
        this.oK = str;
    }

    public void yBV(boolean z10) {
        this.jJC = z10;
    }

    public void FA(boolean z10) {
        this.Np = z10;
    }

    public void Ht(double d10) {
        this.Hvv = d10;
    }

    public void Mm(boolean z10) {
        this.Gis = z10;
    }

    public void NOt(double d10) {
        this.ZH = d10;
    }

    public void TFq(double d10) {
        this.VdW = d10;
    }

    public void Vor(boolean z10) {
        this.HX = z10;
    }

    public void mZ(String str) {
        this.edo = str;
    }

    public void uR(double d10) {
        this.f140649Nb = d10;
    }

    public void Ht(boolean z10) {
        this.Nl = z10;
    }

    public void NOt(String str) {
        this.sAl = str;
    }

    public void TFq(boolean z10) {
        this.nqR = z10;
    }

    public void mZ(boolean z10) {
        this.le = z10;
    }

    public void uR(boolean z10) {
        this.gI = z10;
    }

    public void NOt(JSONObject jSONObject) {
        this.MU = jSONObject;
    }

    public void TFq(JSONObject jSONObject) {
        this.Ds = jSONObject;
    }

    public void mZ(JSONObject jSONObject) {
        this.bDW = jSONObject;
    }

    public void uR(JSONObject jSONObject) {
        this.wcb = jSONObject;
    }

    public boolean ZRu() {
        return this.CXy;
    }

    public void ZRu(boolean z10) {
        this.CXy = z10;
    }

    public void ZRu(int i10) {
        this.CH = i10;
    }

    public void ZRu(double d10) {
        this.cA = d10;
    }

    public void ZRu(String str) {
        this.klw = str;
    }

    public void ZRu(float f10) {
        this.ZRu = f10;
    }

    public void ZRu(List<ZRu> list) {
        this.pvl = list;
    }

    public void ZRu(long j10) {
        this.hl = j10;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void ZRu(Ht ht, JSONObject jSONObject) {
        if (ht == null || jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            next.getClass();
            byte b10 = -1;
            switch (next.hashCode()) {
                case -2067713583:
                    if (next.equals("isShowBgControl")) {
                        b10 = 0;
                    }
                    break;
                case -1965619659:
                    if (next.equals("clickArea")) {
                        b10 = 1;
                    }
                    break;
                case -1912831834:
                    if (next.equals("triggerSlideDirection")) {
                        b10 = 2;
                    }
                    break;
                case -1885934767:
                    if (next.equals("bgImgUrl")) {
                        b10 = 3;
                    }
                    break;
                case -1822062213:
                    if (next.equals("lineCount")) {
                        b10 = 4;
                    }
                    break;
                case -1821293778:
                    if (next.equals("openPlayableLandingPage")) {
                        b10 = 5;
                    }
                    break;
                case -1813937113:
                    if (next.equals("lineLimit")) {
                        b10 = 6;
                    }
                    break;
                case -1578250488:
                    if (next.equals("interactBgColor")) {
                        b10 = 7;
                    }
                    break;
                case -1501175880:
                    if (next.equals("paddingLeft")) {
                        b10 = 8;
                    }
                    break;
                case -1422965251:
                    if (next.equals("adType")) {
                        b10 = 9;
                    }
                    break;
                case -1383228885:
                    if (next.equals("bottom")) {
                        b10 = 10;
                    }
                    break;
                case -1224696685:
                    if (next.equals("fontFamily")) {
                        b10 = 11;
                    }
                    break;
                case -1221029593:
                    if (next.equals(InMobiNetworkValues.HEIGHT)) {
                        b10 = 12;
                    }
                    break;
                case -1065511464:
                    if (next.equals("textAlign")) {
                        b10 = 13;
                    }
                    break;
                case -1063257157:
                    if (next.equals("alignItems")) {
                        b10 = Ascii.SO;
                    }
                    break;
                case -1046708884:
                    if (next.equals("interactValidate")) {
                        b10 = Ascii.SI;
                    }
                    break;
                case -1044792121:
                    if (next.equals("marginTop")) {
                        b10 = 16;
                    }
                    break;
                case -1019884910:
                    if (next.equals("useBottom")) {
                        b10 = 17;
                    }
                    break;
                case -1005195314:
                    if (next.equals("triggerSlideMinDistance")) {
                        b10 = Ascii.DC2;
                    }
                    break;
                case -962590849:
                    if (next.equals("direction")) {
                        b10 = 19;
                    }
                    break;
                case -912366651:
                    if (next.equals("tagMaxCount")) {
                        b10 = Ascii.DC4;
                    }
                    break;
                case -848877971:
                    if (next.equals("interactHiddenTime")) {
                        b10 = Ascii.NAK;
                    }
                    break;
                case -836058546:
                    if (next.equals("useTop")) {
                        b10 = Ascii.SYN;
                    }
                    break;
                case -734428249:
                    if (next.equals("fontWeight")) {
                        b10 = Ascii.ETB;
                    }
                    break;
                case -731417480:
                    if (next.equals("zIndex")) {
                        b10 = Ascii.CAN;
                    }
                    break;
                case -709393864:
                    if (next.equals("timingStart")) {
                        b10 = Ascii.EM;
                    }
                    break;
                case -515807685:
                    if (next.equals("lineHeight")) {
                        b10 = Ascii.SUB;
                    }
                    break;
                case -321658193:
                    if (next.equals("textFlowDuration")) {
                        b10 = Ascii.ESC;
                    }
                    break;
                case -295409451:
                    if (next.equals("useRight")) {
                        b10 = Ascii.FS;
                    }
                    break;
                case -289173127:
                    if (next.equals("marginBottom")) {
                        b10 = Ascii.GS;
                    }
                    break;
                case -204859874:
                    if (next.equals("bgColor")) {
                        b10 = Ascii.RS;
                    }
                    break;
                case -148259282:
                    if (next.equals("useLeft")) {
                        b10 = Ascii.US;
                    }
                    break;
                case -51738487:
                    if (next.equals("widthMode")) {
                        b10 = 32;
                    }
                    break;
                case 115029:
                    if (next.equals("top")) {
                        b10 = 33;
                    }
                    break;
                case 3076010:
                    if (next.equals("data")) {
                        b10 = 34;
                    }
                    break;
                case 3317767:
                    if (next.equals("left")) {
                        b10 = 35;
                    }
                    break;
                case 3327652:
                    if (next.equals("loop")) {
                        b10 = 36;
                    }
                    break;
                case 90130308:
                    if (next.equals("paddingTop")) {
                        b10 = 37;
                    }
                    break;
                case 92903173:
                    if (next.equals("align")) {
                        b10 = 38;
                    }
                    break;
                case 94842723:
                    if (next.equals("color")) {
                        b10 = 39;
                    }
                    break;
                case 108511772:
                    if (next.equals("right")) {
                        b10 = 40;
                    }
                    break;
                case 113126854:
                    if (next.equals(InMobiNetworkValues.WIDTH)) {
                        b10 = 41;
                    }
                    break;
                case 164611121:
                    if (next.equals("timingEnd")) {
                        b10 = b.f239025q6;
                    }
                    break;
                case 202355100:
                    if (next.equals("paddingBottom")) {
                        b10 = 43;
                    }
                    break;
                case 247204452:
                    if (next.equals("allowTextFlow")) {
                        b10 = 44;
                    }
                    break;
                case 302841174:
                    if (next.equals("interactWontHide")) {
                        b10 = 45;
                    }
                    break;
                case 365601008:
                    if (next.equals("fontSize")) {
                        b10 = 46;
                    }
                    break;
                case 428975654:
                    if (next.equals("justifyVertical")) {
                        b10 = b.f238921d6;
                    }
                    break;
                case 439444041:
                    if (next.equals("interactVisibleTime")) {
                        b10 = 48;
                    }
                    break;
                case 713848971:
                    if (next.equals("paddingRight")) {
                        b10 = 49;
                    }
                    break;
                case 722830999:
                    if (next.equals("borderColor")) {
                        b10 = 50;
                    }
                    break;
                case 737768677:
                    if (next.equals("borderStyle")) {
                        b10 = 51;
                    }
                    break;
                case 747804969:
                    if (next.equals(o.f76584m)) {
                        b10 = 52;
                    }
                    break;
                case 791643104:
                    if (next.equals("isDataFixed")) {
                        b10 = 53;
                    }
                    break;
                case 975087886:
                    if (next.equals("marginRight")) {
                        b10 = 54;
                    }
                    break;
                case 1110826708:
                    if (next.equals("justifyHorizontal")) {
                        b10 = 55;
                    }
                    break;
                case 1122368895:
                    if (next.equals("interactPosition")) {
                        b10 = 56;
                    }
                    break;
                case 1188229042:
                    if (next.equals("lineFeed")) {
                        b10 = 57;
                    }
                    break;
                case 1332036739:
                    if (next.equals("interactText")) {
                        b10 = 58;
                    }
                    break;
                case 1332055696:
                    if (next.equals("interactType")) {
                        b10 = 59;
                    }
                    break;
                case 1349188574:
                    if (next.equals("borderRadius")) {
                        b10 = 60;
                    }
                    break;
                case 1360828714:
                    if (next.equals("clickTigger")) {
                        b10 = Base64.f217719k;
                    }
                    break;
                case 1490178922:
                    if (next.equals("heightMode")) {
                        b10 = 62;
                    }
                    break;
                case 1761274325:
                    if (next.equals("textFlowType")) {
                        b10 = h0.f225962a;
                    }
                    break;
                case 1824903757:
                    if (next.equals("borderSize")) {
                        b10 = 64;
                    }
                    break;
                case 1970934485:
                    if (next.equals("marginLeft")) {
                        b10 = 65;
                    }
                    break;
                case 2111078717:
                    if (next.equals("letterSpacing")) {
                        b10 = 66;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                    ht.mZ(jSONObject.optBoolean(next, false));
                    break;
                case 1:
                    ht.oK(jSONObject.optString(next));
                    break;
                case 2:
                    ht.MR(jSONObject.optString(next));
                    break;
                case 3:
                    ht.Mm(jSONObject.optString(next));
                    break;
                case 4:
                    ht.Vor(jSONObject.optInt(next));
                    break;
                case 5:
                    ht.qF(jSONObject.optBoolean(next));
                    break;
                case 6:
                    ht.Ht(jSONObject.optBoolean(next));
                    break;
                case 7:
                    ht.sAl(jSONObject.optString(next));
                    break;
                case 8:
                    ht.Ht((float) jSONObject.optDouble(next));
                    break;
                case 9:
                    ht.NOt(jSONObject.optString(next));
                    break;
                case 10:
                    ht.Zf(jSONObject.optInt(next));
                    break;
                case 11:
                    ht.mZ(jSONObject.optString(next));
                    break;
                case 12:
                    ht.mZ((float) jSONObject.optDouble(next));
                    break;
                case 13:
                    ht.uR(jSONObject.optString(next));
                    break;
                case 14:
                    ht.to(jSONObject.optString(next));
                    break;
                case 15:
                    ht.NOt(jSONObject.optBoolean(next));
                    break;
                case 16:
                    ht.aT(jSONObject.optInt(next));
                    break;
                case 17:
                    ht.aT(jSONObject.optBoolean(next));
                    break;
                case 18:
                    ht.ZRu(jSONObject.optLong(next));
                    break;
                case 19:
                    ht.xY(jSONObject.optString(next));
                    break;
                case 20:
                    ht.WMI(jSONObject.optInt(next));
                    break;
                case 21:
                    ht.le(jSONObject.optInt(next));
                    break;
                case 22:
                    ht.Vor(jSONObject.optBoolean(next));
                    break;
                case 23:
                    ht.oK(jSONObject.optInt(next));
                    break;
                case 24:
                    ht.ru(jSONObject.optInt(next));
                    break;
                case 25:
                    ht.NOt(jSONObject.optDouble(next));
                    break;
                case 26:
                    ht.Ht(jSONObject.optDouble(next));
                    break;
                case 27:
                    ht.om(jSONObject.optInt(next));
                    break;
                case 28:
                    ht.FA(jSONObject.optBoolean(next));
                    break;
                case 29:
                    ht.ZH(jSONObject.optInt(next));
                    break;
                case 30:
                    ht.Ht(jSONObject.optString(next));
                    break;
                case 31:
                    ht.Mm(jSONObject.optBoolean(next));
                    break;
                case 32:
                    ht.ZH(jSONObject.optString(next));
                    break;
                case 33:
                    ht.xY(jSONObject.optInt(next));
                    break;
                case 34:
                    ht.OCA(jSONObject.optString(next));
                    break;
                case 35:
                    ht.OCA(jSONObject.optInt(next));
                    break;
                case 36:
                    ht.ZRu(jSONObject.optBoolean(next));
                    break;
                case 37:
                    ht.FA((float) jSONObject.optDouble(next));
                    break;
                case 38:
                    ht.om(jSONObject.optString(next));
                    break;
                case 39:
                    ht.TFq(jSONObject.optString(next));
                    break;
                case 40:
                    ht.to(jSONObject.optInt(next));
                    break;
                case 41:
                    ht.uR((float) jSONObject.optDouble(next));
                    break;
                case 42:
                    ht.mZ(jSONObject.optDouble(next));
                    break;
                case 43:
                    ht.TFq((float) jSONObject.optDouble(next));
                    break;
                case 44:
                    ht.ZH(jSONObject.optBoolean(next));
                    break;
                case 45:
                    ht.edo(jSONObject.optBoolean(next));
                    break;
                case 46:
                    ht.Vor((float) jSONObject.optDouble(next));
                    break;
                case 47:
                    ht.qF(jSONObject.optString(next));
                    break;
                case 48:
                    ht.VdW(jSONObject.optInt(next));
                    break;
                case 49:
                    ht.Mm((float) jSONObject.optDouble(next));
                    break;
                case 50:
                    ht.FA(jSONObject.optString(next));
                    break;
                case 51:
                    ht.Vor(jSONObject.optString(next));
                    break;
                case 52:
                    ht.yBV(jSONObject.optInt(next));
                    break;
                case 53:
                    ht.TFq(jSONObject.optBoolean(next));
                    break;
                case 54:
                    ht.sAl(jSONObject.optInt(next));
                    break;
                case 55:
                    ht.WMI(jSONObject.optString(next));
                    break;
                case 56:
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                    if (jSONObjectOptJSONObject != null) {
                        ht.Mm(jSONObjectOptJSONObject.optInt("translateY", 0));
                        ht.FA(jSONObjectOptJSONObject.optInt("translateX", 0));
                        ht.uR(jSONObjectOptJSONObject.optDouble("scaleX", 0.0d));
                        ht.TFq(jSONObjectOptJSONObject.optDouble("scaleY", 0.0d));
                    }
                    break;
                case 57:
                    ht.uR(jSONObject.optBoolean(next));
                    break;
                case 58:
                    ht.lp(jSONObject.optString(next));
                    break;
                case 59:
                    ht.edo(jSONObject.optString(next));
                    break;
                case 60:
                    ht.ZRu((float) jSONObject.optDouble(next));
                    break;
                case 61:
                    ht.yBV(jSONObject.optString(next));
                    break;
                case 62:
                    ht.aT(jSONObject.optString(next));
                    break;
                case 63:
                    ht.qF(jSONObject.optInt(next));
                    break;
                case 64:
                    ht.NOt((float) jSONObject.optDouble(next));
                    break;
                case 65:
                    ht.lp(jSONObject.optInt(next));
                    break;
                case 66:
                    ht.edo(jSONObject.optInt(next));
                    break;
            }
        }
    }
}

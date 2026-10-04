package com.bytedance.adsdk.ugeno.ZRu.ZRu;

import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.Mm.FA;
import com.bytedance.adsdk.ugeno.Mm.ZRu;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import s0.C5563e;

/* JADX INFO: loaded from: classes2.dex */
public class uR extends ZRu {
    private static final float WMI;
    private static final float edo;
    private static final float oK;
    private static final float yBV;
    private int FA;
    private ZRu.C0388ZRu Ht;
    private int Mm;
    private Path TFq;
    private float Vor;
    private int ZH;
    private int aT;
    private boolean lp;
    private int mZ;
    private float qF;
    private Path sAl;
    private Paint uR;

    static {
        float radians = (float) Math.toRadians(30.0d);
        edo = radians;
        oK = (float) Math.tan(radians);
        yBV = (float) Math.cos(radians);
        WMI = (float) Math.sin(radians);
    }

    public uR(com.bytedance.adsdk.ugeno.NOt.mZ mZVar, JSONObject jSONObject) {
        super(mZVar, jSONObject);
        this.lp = true;
        Paint paint = new Paint();
        this.uR = paint;
        paint.setAntiAlias(true);
        this.TFq = new Path();
        this.Vor = this.NOt.OCA();
        this.sAl = new Path();
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.ZRu.ZRu
    public void NOt() {
        this.mZ = (int) FA.ZRu(this.NOt.Vor().getContext(), this.ZRu.optInt("shineWidth", 30));
        String strOptString = this.ZRu.optString("backgroundColor", "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))");
        String str = TextUtils.isEmpty(strOptString) ? "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))" : strOptString;
        if (str.startsWith(C5563e.f238016l)) {
            this.Ht = com.bytedance.adsdk.ugeno.Mm.ZRu.NOt(str);
        } else {
            int iZRu = com.bytedance.adsdk.ugeno.Mm.ZRu.ZRu(str);
            this.Mm = iZRu;
            this.FA = com.bytedance.adsdk.ugeno.Mm.ZRu.ZRu(iZRu, 32);
            this.lp = false;
        }
        this.qF = yBV * this.mZ;
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.ZRu.ZRu
    @SuppressLint({"DrawAllocation"})
    public void ZRu(Canvas canvas) {
        LinearGradient linearGradient;
        try {
            if (this.NOt.Qg() > 0.0f) {
                int i10 = this.aT;
                float f10 = oK;
                float fQg = ((i10 * f10) + i10) * this.NOt.Qg();
                this.sAl.reset();
                this.sAl.moveTo(fQg, 0.0f);
                int i11 = this.ZH;
                float f11 = fQg - (i11 * f10);
                this.sAl.lineTo(f11, i11);
                this.sAl.lineTo(f11 + this.mZ, this.ZH);
                this.sAl.lineTo(this.mZ + fQg, 0.0f);
                this.sAl.close();
                float f12 = this.qF;
                float f13 = yBV * f12;
                float f14 = f12 * WMI;
                if (!this.lp || this.Ht == null) {
                    int i12 = this.FA;
                    linearGradient = new LinearGradient(fQg, 0.0f, fQg + f13, f14, new int[]{i12, this.Mm, i12}, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    linearGradient = new LinearGradient(fQg, 0.0f, fQg + f13, f14, this.Ht.NOt, (float[]) null, Shader.TileMode.CLAMP);
                }
                this.uR.setShader(linearGradient);
                Path path = this.TFq;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                canvas.drawPath(this.sAl, this.uR);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.ZRu.ZRu
    public List<PropertyValuesHolder> mZ() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(uR(), 0.0f, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.ZRu.ZRu
    public void ZRu(int i10, int i11) {
        this.aT = i10;
        this.ZH = i11;
        try {
            RectF rectF = new RectF(0.0f, 0.0f, i10, i11);
            Path path = this.TFq;
            float f10 = this.Vor;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        } catch (Throwable unused) {
        }
    }
}

package com.bytedance.adsdk.ugeno.ZRu.ZRu;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TFq extends ZRu {
    private boolean FA;
    private float Ht;
    private String Mm;
    private Paint TFq;
    private boolean Vor;
    private Path ZH;
    private Path aT;
    private Path lp;
    private float mZ;
    private PorterDuffXfermode sAl;
    private float uR;

    public TFq(com.bytedance.adsdk.ugeno.NOt.mZ mZVar, JSONObject jSONObject) {
        super(mZVar, jSONObject);
        this.FA = true;
        this.Vor = true;
        Paint paint = new Paint();
        this.TFq = paint;
        paint.setAntiAlias(true);
        this.NOt.Vor().setLayerType(2, null);
        this.sAl = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.aT = new Path();
        this.ZH = new Path();
        this.lp = new Path();
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.ZRu.ZRu
    public void NOt() {
        this.Ht = (float) this.ZRu.optDouble("start", 0.0d);
        this.Mm = this.ZRu.optString("direction", "center");
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.ZRu.ZRu
    public void ZRu(Canvas canvas) {
        int iHvv;
        int iHvv2;
        if (this.NOt.Hvv() > 0.0f) {
            iHvv = (int) (this.NOt.Hvv() * this.mZ);
            iHvv2 = (int) (this.NOt.Hvv() * this.uR);
            this.TFq.setXfermode(this.sAl);
            String str = this.Mm;
            str.getClass();
            switch (str) {
                case "bottom":
                    canvas.drawRect(0.0f, iHvv2, this.mZ, this.uR, this.TFq);
                    break;
                case "center":
                    this.aT.reset();
                    this.ZH.reset();
                    this.lp.reset();
                    Path.Direction direction = Path.Direction.CW;
                    this.aT.addCircle(this.mZ / 2.0f, this.uR / 2.0f, iHvv, direction);
                    Path path = this.ZH;
                    float f10 = this.mZ;
                    path.addRect(f10 / 2.0f, 0.0f, f10, this.uR, direction);
                    Path path2 = this.ZH;
                    Path path3 = this.aT;
                    Path.Op op = Path.Op.DIFFERENCE;
                    path2.op(path3, op);
                    this.lp.addRect(0.0f, 0.0f, this.mZ / 2.0f, this.uR, direction);
                    this.lp.op(this.aT, op);
                    canvas.drawPath(this.ZH, this.TFq);
                    canvas.drawPath(this.lp, this.TFq);
                    break;
                case "top":
                    canvas.drawRect(0.0f, 0.0f, this.mZ, this.uR - iHvv2, this.TFq);
                    break;
                case "left":
                    canvas.drawRect(0.0f, 0.0f, this.mZ - iHvv, this.uR, this.TFq);
                    break;
                case "right":
                    canvas.drawRect(iHvv, 0.0f, this.mZ, this.uR, this.TFq);
                    break;
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.ZRu.ZRu
    public List<PropertyValuesHolder> mZ() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(uR(), this.Ht, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.ZRu.ZRu
    public void ZRu(int i10, int i11) {
        if (i10 > 0 && this.FA) {
            this.mZ = i10;
            this.FA = false;
        }
        if (i11 <= 0 || !this.Vor) {
            return;
        }
        this.uR = i11;
        this.Vor = false;
    }
}

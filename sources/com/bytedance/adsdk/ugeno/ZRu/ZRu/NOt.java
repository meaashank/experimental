package com.bytedance.adsdk.ugeno.ZRu.ZRu;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class NOt extends ZRu {
    private static final int Mm = Color.parseColor("#7ed321");
    private Paint Ht;
    private int TFq;
    private int mZ;
    private int uR;

    public NOt(com.bytedance.adsdk.ugeno.NOt.mZ mZVar, JSONObject jSONObject) {
        super(mZVar, jSONObject);
        Paint paint = new Paint();
        this.Ht = paint;
        paint.setAntiAlias(true);
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.ZRu.ZRu
    public void NOt() {
        this.mZ = com.bytedance.adsdk.ugeno.Mm.ZRu.ZRu(this.ZRu.optString("backgroundColor"), Mm);
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.ZRu.ZRu
    public void ZRu(Canvas canvas) {
        try {
            if (this.NOt.Vr() > 0.0f) {
                this.Ht.setColor(this.mZ);
                this.Ht.setAlpha((int) ((1.0f - this.NOt.Vr()) * 255.0f));
                ((ViewGroup) this.NOt.Vor().getParent()).setClipChildren(true);
                canvas.drawCircle(this.uR, this.TFq, Math.min(r0, r2) * 2 * this.NOt.Vr(), this.Ht);
            }
        } catch (Throwable th) {
            Log.d("BaseEffectWrapper", "ripple animation error " + th.getMessage());
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
        this.uR = i10 / 2;
        this.TFq = i11 / 2;
    }
}

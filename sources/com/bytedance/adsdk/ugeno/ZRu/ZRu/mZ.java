package com.bytedance.adsdk.ugeno.ZRu.ZRu;

import android.animation.PropertyValuesHolder;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class mZ extends ZRu {
    private Paint FA;
    private View Ht;
    private Paint Mm;
    private float TFq;
    private PorterDuffXfermode Vor;
    private Matrix ZH;
    private LinearGradient aT;
    private String mZ;
    private float uR;

    public mZ(com.bytedance.adsdk.ugeno.NOt.mZ mZVar, JSONObject jSONObject) {
        super(mZVar, jSONObject);
        this.Ht = this.NOt.Vor();
        Paint paint = new Paint();
        this.Mm = paint;
        paint.setAntiAlias(true);
        this.Ht.setLayerType(2, null);
        this.Vor = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.FA = new Paint();
        this.ZH = new Matrix();
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.ZRu.ZRu
    public void NOt() {
        this.mZ = this.ZRu.optString("direction", "left");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    @Override // com.bytedance.adsdk.ugeno.ZRu.ZRu.ZRu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ZRu(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.ZRu.ZRu.mZ.ZRu(android.graphics.Canvas):void");
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.ZRu.ZRu
    public List<PropertyValuesHolder> mZ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PropertyValuesHolder.ofFloat("rubIn", 0.0f, 1.0f));
        arrayList.add(PropertyValuesHolder.ofFloat(com.bytedance.adsdk.ugeno.ZRu.uR.ALPHA.NOt(), 0.0f, 1.0f));
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.ZRu.ZRu
    public void ZRu(int i10, int i11) {
        this.uR = i10;
        this.TFq = i11;
        String str = this.mZ;
        str.getClass();
        switch (str) {
            case "bottom":
                this.aT = new LinearGradient(0.0f, -this.TFq, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "top":
                this.aT = new LinearGradient(0.0f, this.TFq, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "left":
                this.aT = new LinearGradient(this.uR, 0.0f, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "right":
                this.aT = new LinearGradient(-this.uR, 0.0f, 0.0f, this.TFq, 0, -1, Shader.TileMode.CLAMP);
                break;
        }
    }
}

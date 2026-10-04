package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ZH;
import com.bytedance.sdk.component.adexpress.dynamic.uR.Mm;
import com.bytedance.sdk.component.adexpress.uR.FA;

/* JADX INFO: loaded from: classes2.dex */
public class mZ {
    private int Ht;
    private int TFq;
    Paint ZRu;
    private int uR;
    Path NOt = new Path();
    Path mZ = new Path();

    public mZ() {
        Paint paint = new Paint();
        this.ZRu = paint;
        paint.setAntiAlias(true);
    }

    public void ZRu(Canvas canvas, IAnimation iAnimation, View view) {
        int iIntValue;
        String str;
        float[] fArrNOt;
        int iIntValue2 = 0;
        if (iAnimation.getRippleValue() != 0.0f) {
            if (com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ() != null) {
                try {
                    str = (String) view.getTag(2097610712);
                    try {
                        fArrNOt = Mm.NOt(str);
                    } catch (Exception unused) {
                        fArrNOt = null;
                    }
                } catch (Exception unused2) {
                    str = "";
                }
                if (str.startsWith("#")) {
                    this.ZRu.setColor(Color.parseColor(str));
                    this.ZRu.setAlpha(90);
                } else if (fArrNOt != null) {
                    this.ZRu.setColor(FA.ZRu((1.0f - iAnimation.getRippleValue()) * fArrNOt[3], fArrNOt[0] / 256.0f, fArrNOt[1] / 256.0f, fArrNOt[2] / 256.0f));
                }
            }
            ((ViewGroup) view.getParent()).setClipChildren(true);
            canvas.drawCircle(this.uR, this.TFq, iAnimation.getRippleValue() * Math.min(r2, r5) * 2, this.ZRu);
        }
        if (iAnimation.getShineValue() != 0.0f) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).setClipChildren(true);
            }
            if (view.getParent().getParent() != null) {
                ((ViewGroup) view.getParent().getParent()).setClipChildren(true);
            }
            this.NOt.reset();
            try {
                iIntValue = ((Integer) view.getTag(2097610711)).intValue();
            } catch (Exception unused3) {
                iIntValue = 0;
            }
            if (iIntValue >= 0) {
                int shineValue = ((int) (iAnimation.getShineValue() * ((this.TFq * 2) + ((iIntValue * 2) + (this.uR * 4))))) - ((this.TFq * 2) + iIntValue);
                float f10 = shineValue;
                int i10 = this.TFq;
                this.ZRu.setShader(new LinearGradient(f10, 0.0f, ((iIntValue + i10) / 2) + shineValue, i10 / 2, new int[]{Color.parseColor("#20ffffff"), Color.parseColor("#60ffffff"), Color.parseColor("#65ffffff")}, (float[]) null, Shader.TileMode.MIRROR));
                this.ZRu.setStrokeWidth(this.uR * 2);
                Path path = this.mZ;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                int i11 = shineValue + iIntValue;
                canvas.drawLine(f10, 0.0f, i11 + r2, this.TFq, this.ZRu);
            }
        }
        if (iAnimation.getMarqueeValue() != 0.0f) {
            try {
                iIntValue2 = ((Integer) view.getTag(2097610709)).intValue();
            } catch (Exception unused4) {
            }
            if (iIntValue2 >= 0) {
                this.NOt.reset();
                this.NOt.moveTo(0.0f, 0.0f);
                this.NOt.lineTo(this.uR * 2, 0.0f);
                this.NOt.lineTo(this.uR * 2, this.TFq * 2);
                this.NOt.lineTo(0.0f, this.TFq * 2);
                this.NOt.lineTo(0.0f, 0.0f);
                this.ZRu.setShader(new LinearGradient(0.0f, 0.0f, this.uR * 2, this.TFq * 2, new int[]{(int) (iAnimation.getMarqueeValue() * (-65536.0f)), (int) ((1.0f - iAnimation.getMarqueeValue()) * (-65536.0f))}, (float[]) null, Shader.TileMode.CLAMP));
                this.ZRu.setColor(-65536);
                this.ZRu.setStyle(Paint.Style.STROKE);
                this.ZRu.setStrokeWidth(iIntValue2);
                canvas.drawPath(this.NOt, this.ZRu);
            }
        }
    }

    public void ZRu(View view, float f10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) (this.Ht * f10);
        view.setTranslationX((r1 - r6) / 2);
        if (view instanceof ZH) {
            int i10 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i10 >= viewGroup.getChildCount()) {
                    break;
                }
                viewGroup.getChildAt(i10).setTranslationX((-(this.Ht - layoutParams.width)) / 2);
                i10++;
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public void ZRu(View view, int i10, int i11) {
        String str;
        this.uR = i10 / 2;
        this.TFq = i11 / 2;
        if (this.Ht == 0 && view.getLayoutParams().width > 0) {
            this.Ht = view.getLayoutParams().width;
        }
        try {
            str = (String) view.getTag(2097610710);
            try {
                this.mZ.addRoundRect(new RectF(0.0f, 0.0f, i10, i11), i11 / 2, i11 / 2, Path.Direction.CW);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = "";
        }
        if ("right".equals(str)) {
            view.setPivotX(this.uR * 2);
            view.setPivotY(this.TFq);
        } else if ("left".equals(str)) {
            view.setPivotX(0.0f);
            view.setPivotY(this.TFq);
        } else {
            view.setPivotX(this.uR);
            view.setPivotY(this.TFq);
        }
    }
}

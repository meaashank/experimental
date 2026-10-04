package com.bytedance.sdk.openadsdk.mZ;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.utils.Cox;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu extends com.bytedance.sdk.openadsdk.core.TFq.FA {
    private float NOt;
    private Paint ZRu;
    private boolean mZ;
    private int uR;

    public ZRu(Context context) {
        super(context);
        ZRu();
    }

    private void ZRu() {
        this.NOt = Cox.ZRu(getContext(), 8.0f);
        this.ZRu = new Paint();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ZRu(getText().toString(), getWidth());
    }

    @Override // com.bytedance.sdk.openadsdk.core.TFq.FA, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.uR = getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, this.uR);
        } else {
            layoutParams.height = this.uR;
        }
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.openadsdk.core.TFq.FA, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        int i10 = this.uR;
        if (i10 == 0 || layoutParams == null) {
            return;
        }
        layoutParams.height = i10;
    }

    public void setMinTextSize(float f10) {
        if (f10 <= 0.0f) {
            return;
        }
        this.NOt = f10;
    }

    private void ZRu(String str, int i10) {
        if (!this.mZ && i10 > 0) {
            float textSize = getTextSize();
            this.ZRu.set(getPaint());
            int paddingLeft = (i10 - getPaddingLeft()) - getPaddingRight();
            float fZRu = ZRu(textSize, str);
            while (fZRu > paddingLeft) {
                textSize -= 1.0f;
                this.ZRu.setTextSize(textSize);
                if (textSize <= this.NOt) {
                    break;
                } else {
                    fZRu = ZRu(textSize, str);
                }
            }
            setTextSize(0, textSize);
            this.mZ = true;
        }
    }

    private float ZRu(float f10, String str) {
        this.ZRu.setTextSize(f10);
        return this.ZRu.measureText(str);
    }
}

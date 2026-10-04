package com.bytedance.sdk.component.adexpress.Ht;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.bytedance.sdk.component.utils.ru;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu extends TextSwitcher implements ViewSwitcher.ViewFactory, ru.ZRu {
    private int FA;
    private TextView Ht;
    private int Mm;
    private List<String> NOt;
    private Context TFq;
    private float Vor;
    private int ZH;
    Animation.AnimationListener ZRu;
    private int aT;
    private Handler edo;
    private int lp;
    private int mZ;
    private int sAl;
    private final int uR;

    public ZRu(Context context, int i10, float f10, int i11, int i12) {
        super(context);
        this.NOt = new ArrayList();
        this.mZ = 0;
        this.uR = 1;
        this.edo = new com.bytedance.sdk.component.utils.ru(Looper.getMainLooper(), this);
        this.ZRu = new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.Ht.ZRu.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (ZRu.this.Ht != null) {
                    ZRu.this.Ht.setText("");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        };
        this.TFq = context;
        this.FA = i10;
        this.Vor = f10;
        this.aT = i11;
        this.sAl = i12;
        mZ();
    }

    private void mZ() {
        setFactory(this);
    }

    public void NOt() {
        List<String> list = this.NOt;
        if (list == null || list.size() <= 0) {
            return;
        }
        int i10 = this.mZ;
        this.mZ = i10 + 1;
        this.ZH = i10;
        setText(this.NOt.get(i10));
        if (this.mZ > this.NOt.size() - 1) {
            this.mZ = 0;
        }
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(getContext());
        this.Ht = textView;
        textView.setTextColor(this.FA);
        this.Ht.setTextSize(this.Vor);
        this.Ht.setMaxLines(this.aT);
        this.Ht.setTextAlignment(this.sAl);
        return this.Ht;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.edo.sendEmptyMessageDelayed(1, this.Mm);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.edo.removeMessages(1);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        try {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(com.bytedance.sdk.component.adexpress.dynamic.TFq.ZH.NOt(this.NOt.get(this.ZH), this.Vor, false)[0], 1073741824), i10);
        } catch (Exception unused) {
            super.onMeasure(i10, i11);
        }
    }

    public void setAnimationDuration(int i10) {
        this.Mm = i10;
    }

    public void setAnimationText(List<String> list) {
        this.NOt = list;
    }

    public void setAnimationType(int i10) {
        this.lp = i10;
    }

    public void setMaxLines(int i10) {
        this.aT = i10;
    }

    public void setTextColor(int i10) {
        this.FA = i10;
    }

    public void setTextSize(float f10) {
        this.Vor = f10;
    }

    public void ZRu() {
        int i10 = this.lp;
        if (i10 == 1) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.om.Vor(this.TFq, "tt_text_animation_y_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.om.Vor(this.TFq, "tt_text_animation_y_out"));
        } else if (i10 == 0) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.om.Vor(this.TFq, "tt_text_animation_x_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.om.Vor(this.TFq, "tt_text_animation_x_in"));
            getInAnimation().setInterpolator(new LinearInterpolator());
            getOutAnimation().setInterpolator(new LinearInterpolator());
            getInAnimation().setAnimationListener(this.ZRu);
            getOutAnimation().setAnimationListener(this.ZRu);
        }
        this.edo.sendEmptyMessage(1);
    }

    @Override // com.bytedance.sdk.component.utils.ru.ZRu
    public void ZRu(Message message) {
        if (message.what != 1) {
            return;
        }
        NOt();
        this.edo.sendEmptyMessageDelayed(1, this.Mm);
    }
}

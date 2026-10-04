package com.bytedance.sdk.component.adexpress.dynamic.animation.ZRu;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class aT extends uR {
    private float Ht;
    private float TFq;
    private ZRu uR;

    public class ZRu {
        private View NOt;

        public ZRu(View view) {
            this.NOt = view;
        }

        public void ZRu(int i10) {
            if (!"top".equals(aT.this.NOt.ZRu())) {
                ViewGroup.LayoutParams layoutParams = this.NOt.getLayoutParams();
                layoutParams.height = i10;
                this.NOt.setLayoutParams(layoutParams);
                this.NOt.requestLayout();
                return;
            }
            if (aT.this.mZ instanceof ViewGroup) {
                for (int i11 = 0; i11 < ((ViewGroup) aT.this.mZ).getChildCount(); i11++) {
                    ((ViewGroup) aT.this.mZ).getChildAt(i11).setTranslationY(i10 - aT.this.TFq);
                }
            }
            aT aTVar = aT.this;
            aTVar.mZ.setTranslationY(aTVar.TFq - i10);
        }
    }

    public aT(View view, com.bytedance.sdk.component.adexpress.dynamic.uR.ZRu zRu) {
        super(view, zRu);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ZRu.uR
    public List<ObjectAnimator> ZRu() {
        int i10;
        String str;
        View view = this.mZ;
        if ((view instanceof ImageView) && (view.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq)) {
            this.mZ = (View) this.mZ.getParent();
        }
        this.mZ.setAlpha(0.0f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.mZ, "alpha", 0.0f, 1.0f).setDuration((int) (this.NOt.aT() * 1000.0d));
        this.uR = new ZRu(this.mZ);
        final int i11 = this.mZ.getLayoutParams().height;
        this.TFq = i11;
        this.Ht = this.mZ.getLayoutParams().width;
        if ("left".equals(this.NOt.ZRu()) || "right".equals(this.NOt.ZRu())) {
            i10 = (int) this.Ht;
            str = InMobiNetworkValues.WIDTH;
        } else {
            str = InMobiNetworkValues.HEIGHT;
            i10 = i11;
        }
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.uR, str, 0, i10).setDuration((int) (this.NOt.aT() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ZRu(duration));
        arrayList.add(ZRu(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ZRu.aT.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator, boolean z10) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                aT.this.uR.ZRu(i11);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator, boolean z10) {
            }
        });
        return arrayList;
    }
}

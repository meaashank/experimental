package com.bytedance.adsdk.ugeno.core;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.adsdk.ugeno.core.ZRu;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Mm {
    private int Ht;
    private String Mm;
    private ZRu NOt;
    private int TFq;
    Paint ZRu;
    private AnimatorSet mZ = new AnimatorSet();
    private View uR;

    public Mm(View view, ZRu zRu) {
        this.uR = view;
        this.NOt = zRu;
        Paint paint = new Paint();
        this.ZRu = paint;
        paint.setAntiAlias(true);
    }

    public void NOt() {
        AnimatorSet animatorSet = this.mZ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void ZRu() {
        ObjectAnimator objectAnimator;
        ArrayList arrayList = new ArrayList();
        List<ZRu.C0394ZRu> listMZ = this.NOt.mZ();
        if (listMZ == null || listMZ.size() <= 0) {
            return;
        }
        for (ZRu.C0394ZRu c0394ZRu : listMZ) {
            if (c0394ZRu != null) {
                objectAnimator = new ObjectAnimator();
                objectAnimator.setDuration(c0394ZRu.ZRu());
                if (TextUtils.equals(c0394ZRu.TFq(), "translateX")) {
                    objectAnimator.setPropertyName("translationX");
                } else if (TextUtils.equals(c0394ZRu.TFq(), "translateY")) {
                    objectAnimator.setPropertyName("translationY");
                } else {
                    objectAnimator.setPropertyName(c0394ZRu.TFq());
                }
                objectAnimator.setStartDelay(c0394ZRu.uR());
                objectAnimator.setTarget(this.uR);
                if (TextUtils.equals(c0394ZRu.TFq(), "backgroundColor")) {
                    objectAnimator.setIntValues((int) c0394ZRu.Ht(), (int) c0394ZRu.Mm());
                    Log.d("UGenAnimation", "playAnimation: from = " + c0394ZRu.Ht() + "; to=" + c0394ZRu.Mm());
                } else {
                    objectAnimator.setFloatValues(c0394ZRu.Ht(), c0394ZRu.Mm());
                }
                int iNOt = (int) this.NOt.NOt();
                if (iNOt != 0) {
                    objectAnimator.setRepeatCount(iNOt);
                } else {
                    objectAnimator.setRepeatCount((int) c0394ZRu.NOt());
                }
                if (TextUtils.equals(c0394ZRu.TFq(), "backgroundColor")) {
                    objectAnimator.setEvaluator(new ArgbEvaluator());
                }
                String strHt = this.NOt.Ht();
                if (TextUtils.isEmpty(strHt)) {
                    strHt = c0394ZRu.mZ();
                }
                if (TextUtils.equals(strHt, "reverse")) {
                    objectAnimator.setRepeatMode(2);
                } else {
                    objectAnimator.setRepeatMode(1);
                }
                if (c0394ZRu.FA() != null && c0394ZRu.FA().length > 0) {
                    objectAnimator.setFloatValues(c0394ZRu.FA());
                }
                if (TextUtils.equals(c0394ZRu.TFq(), "rotationX")) {
                    this.uR.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.Mm.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Mm.this.uR.setPivotX(Mm.this.uR.getWidth() / 2.0f);
                            Mm.this.uR.setPivotY(Mm.this.uR.getHeight());
                        }
                    });
                }
                if (TextUtils.equals(c0394ZRu.TFq(), "ripple")) {
                    this.Mm = c0394ZRu.aT();
                }
                String strVor = c0394ZRu.Vor();
                strVor.getClass();
                switch (strVor) {
                    case "accelerate":
                        objectAnimator.setInterpolator(new AccelerateInterpolator());
                        break;
                    case "decelerate":
                        objectAnimator.setInterpolator(new DecelerateInterpolator());
                        break;
                    case "linear":
                    case "standard":
                        objectAnimator.setInterpolator(new LinearInterpolator());
                        break;
                    case "accelerateDecelerate":
                        objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                        break;
                }
                arrayList.add(objectAnimator);
            }
        }
        if (this.NOt.uR() != 0) {
            this.mZ.setDuration(this.NOt.uR());
        }
        this.mZ.setStartDelay(this.NOt.TFq());
        if (TextUtils.equals(this.NOt.ZRu(), "sequentially")) {
            this.mZ.playSequentially(arrayList);
        } else {
            this.mZ.playTogether(arrayList);
        }
        this.mZ.start();
    }

    public void ZRu(Canvas canvas, IAnimation iAnimation) {
        try {
            if (iAnimation.getRipple() == 0.0f || TextUtils.isEmpty(this.Mm)) {
                return;
            }
            this.ZRu.setColor(com.bytedance.adsdk.ugeno.Mm.ZRu.ZRu(this.Mm));
            this.ZRu.setAlpha(90);
            ((ViewGroup) this.uR.getParent()).setClipChildren(true);
            canvas.drawCircle(this.TFq, this.Ht, Math.min(r0, r2) * 2 * iAnimation.getRipple(), this.ZRu);
        } catch (Throwable th) {
            Log.d("UGenAnimation", "ripple animation error " + th.getMessage());
        }
    }

    public void ZRu(int i10, int i11) {
        this.TFq = i10 / 2;
        this.Ht = i11 / 2;
    }
}

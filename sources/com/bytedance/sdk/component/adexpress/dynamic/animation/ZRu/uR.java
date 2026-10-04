package com.bytedance.sdk.component.adexpress.dynamic.animation.ZRu;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Cox;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class uR implements Cox {
    com.bytedance.sdk.component.adexpress.dynamic.uR.ZRu NOt;
    public View mZ;
    private Set<ScheduledFuture<?>> uR = new HashSet();
    public List<ObjectAnimator> ZRu = ZRu();

    public class ZRu implements Runnable {
        ScheduledFuture<?> NOt;
        ObjectAnimator ZRu;

        public ZRu(ObjectAnimator objectAnimator) {
            this.ZRu = objectAnimator;
        }

        public void ZRu(ScheduledFuture<?> scheduledFuture) {
            this.NOt = scheduledFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ() != null) {
                com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ().mZ().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ZRu.uR.ZRu.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ZRu.this.ZRu.resume();
                    }
                });
                if (this.NOt != null) {
                    uR.this.uR.remove(this.NOt);
                }
            }
        }
    }

    public uR(View view, com.bytedance.sdk.component.adexpress.dynamic.uR.ZRu zRu) {
        this.mZ = view;
        this.NOt = zRu;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Cox
    public void NOt() {
        List<ObjectAnimator> list = this.ZRu;
        if (list == null) {
            return;
        }
        for (ObjectAnimator objectAnimator : list) {
            objectAnimator.cancel();
            objectAnimator.removeAllUpdateListeners();
        }
        Iterator<ScheduledFuture<?>> it = this.uR.iterator();
        while (it.hasNext()) {
            it.next().cancel(true);
        }
    }

    public abstract List<ObjectAnimator> ZRu();

    public void mZ() {
        List<ObjectAnimator> list = this.ZRu;
        if (list == null) {
            return;
        }
        for (final ObjectAnimator objectAnimator : list) {
            objectAnimator.start();
            if (this.NOt.WMI() > 0.0d) {
                objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ZRu.uR.1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                        objectAnimator.pause();
                        ZRu zRu = uR.this.new ZRu(objectAnimator);
                        ScheduledFuture<?> scheduledFutureZRu = com.bytedance.sdk.component.adexpress.uR.uR.ZRu(zRu, (long) (uR.this.NOt.WMI() * 1000.0d), TimeUnit.MILLISECONDS);
                        zRu.ZRu(scheduledFutureZRu);
                        uR.this.uR.add(scheduledFutureZRu);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
            }
        }
    }

    public ObjectAnimator ZRu(final ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay((long) (this.NOt.edo() * 1000.0d));
        if (this.NOt.oK() > 0) {
            objectAnimator.setRepeatCount(this.NOt.oK() - 1);
        } else {
            objectAnimator.setRepeatCount(-1);
        }
        if (!"normal".equals(this.NOt.yBV())) {
            if ("alternate".equals(this.NOt.yBV()) || "alternate-reverse".equals(this.NOt.yBV())) {
                objectAnimator.setRepeatMode(2);
            } else {
                objectAnimator.setRepeatMode(1);
            }
        }
        if ("ease-in-out".equals(this.NOt.sAl())) {
            objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        } else if ("ease-in".equals(this.NOt.yBV())) {
            objectAnimator.setInterpolator(new AccelerateInterpolator());
        } else if ("ease-out".equals(this.NOt.yBV())) {
            objectAnimator.setInterpolator(new DecelerateInterpolator());
        } else {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ZRu.uR.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator.getCurrentPlayTime() > 0) {
                    uR.this.mZ.setVisibility(0);
                    if (uR.this.mZ.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Ht) {
                        ((View) uR.this.mZ.getParent()).setVisibility(0);
                    }
                    objectAnimator.removeAllUpdateListeners();
                }
            }
        });
        return objectAnimator;
    }
}

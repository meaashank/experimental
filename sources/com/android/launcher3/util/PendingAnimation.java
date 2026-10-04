package com.android.launcher3.util;

import android.animation.AnimatorSet;
import android.annotation.TargetApi;
import androidx.core.util.C2428e;
import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(26)
public class PendingAnimation {
    public final AnimatorSet anim;
    private final ArrayList<Consumer<OnEndListener>> mEndListeners = new ArrayList<>();

    public static class OnEndListener {
        public boolean isSuccess;
        public int logAction;

        public OnEndListener(boolean z10, int i10) {
            this.isSuccess = z10;
            this.logAction = i10;
        }
    }

    public PendingAnimation(AnimatorSet animatorSet) {
        this.anim = animatorSet;
    }

    public void addEndListener(Consumer<OnEndListener> consumer) {
        this.mEndListeners.add(consumer);
    }

    public void finish(boolean z10, int i10) {
        ArrayList<Consumer<OnEndListener>> arrayList = this.mEndListeners;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Consumer<OnEndListener> consumer = arrayList.get(i11);
            i11++;
            C2428e.a(consumer).accept(new OnEndListener(z10, i10));
        }
        this.mEndListeners.clear();
    }
}

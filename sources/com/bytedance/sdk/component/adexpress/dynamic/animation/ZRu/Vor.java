package com.bytedance.sdk.component.adexpress.dynamic.animation.ZRu;

import android.animation.ObjectAnimator;
import android.view.View;
import androidx.constraintlayout.motion.widget.f;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Vor extends uR {
    public Vor(View view, com.bytedance.sdk.component.adexpress.dynamic.uR.ZRu zRu) {
        super(view, zRu);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ZRu.uR
    public List<ObjectAnimator> ZRu() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.mZ, f.f106849i, 0.0f, 360.0f).setDuration((int) (this.NOt.aT() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ZRu(duration));
        return arrayList;
    }
}

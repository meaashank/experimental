package com.bytedance.sdk.openadsdk.mZ;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.Cox;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class Ht extends ScrollView {
    private final com.bytedance.sdk.openadsdk.core.TFq.TFq NOt;
    private final aT ZRu;

    public Ht(Context context, aT aTVar) {
        super(context);
        this.ZRu = aTVar;
        com.bytedance.sdk.openadsdk.core.TFq.TFq tFq = new com.bytedance.sdk.openadsdk.core.TFq.TFq(context);
        this.NOt = tFq;
        tFq.setOrientation(1);
        addView(tFq, new FrameLayout.LayoutParams(-1, -2));
        if (aTVar.FA() == 0) {
            ZRu();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setVerticalScrollBarEnabled(false);
    }

    private void NOt(List<FilterWord> list) {
        this.NOt.removeAllViews();
        for (int i10 = 0; i10 < list.size(); i10++) {
            FilterWord filterWord = list.get(i10);
            if (filterWord != null) {
                this.NOt.addView(new Mm(getContext(), filterWord, this.ZRu));
            }
            if (i10 < list.size() - 1) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                int iMZ = Cox.mZ(getContext(), this.ZRu.Vor() ? 16.0f : 8.0f);
                layoutParams.topMargin = iMZ;
                layoutParams.bottomMargin = iMZ;
                this.NOt.addView(new ZH(getContext()), layoutParams);
            }
        }
    }

    private void ZRu() {
        if (this.ZRu.FA() != 0) {
            return;
        }
        this.ZRu.ZRu(Cox.mZ(getContext()), Cox.uR(getContext()));
    }

    private static List<FilterWord> mZ(List<FilterWord> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i10 = 0;
        int i11 = -1;
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (list.get(i12).hasSecondOptions()) {
                i11 = i12;
            }
        }
        if (i11 != -1 && i11 <= list.size()) {
            i10 = i11;
        }
        FilterWord filterWord = list.get(i10);
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            FilterWord next = it.next();
            if (!next.hasSecondOptions()) {
                filterWord.addOption(next);
                it.remove();
            }
        }
        return list;
    }

    public void ZRu(List<FilterWord> list) {
        List<FilterWord> listMZ = mZ(list);
        if (listMZ == null) {
            return;
        }
        NOt(listMZ);
    }
}

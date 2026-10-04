package com.bytedance.adsdk.ugeno.Ht.ZRu;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.Ht.uR;
import com.bytedance.adsdk.ugeno.Mm.FA;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu extends LinearLayout {
    private boolean FA;
    private int Ht;
    private int Mm;
    private int NOt;
    private int TFq;
    private int Vor;
    private List<View> ZRu;
    private int mZ;
    private Context uR;

    public ZRu(Context context) {
        super(context);
        this.NOt = -65536;
        this.mZ = -16776961;
        this.TFq = 5;
        this.Ht = 20;
        this.Mm = 20;
        this.uR = context;
        this.ZRu = new ArrayList();
        ZRu();
    }

    public void NOt() {
        View view = new View(getContext());
        view.setClickable(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.Ht, this.Mm);
        int i10 = this.TFq;
        layoutParams.leftMargin = i10;
        layoutParams.rightMargin = i10;
        addView(view, layoutParams);
        view.setBackground(NOt(this.mZ));
        this.ZRu.add(view);
    }

    public void ZRu(int i10, int i11) {
        Iterator<View> it = this.ZRu.iterator();
        while (it.hasNext()) {
            it.next().setBackground(NOt(this.mZ));
        }
        if (i10 < 0 || i10 >= this.ZRu.size()) {
            i10 = 0;
        }
        if (this.ZRu.size() > 0) {
            this.ZRu.get(i10).setBackground(NOt(this.NOt));
            this.Vor = i11;
        }
    }

    public int getSize() {
        return this.ZRu.size();
    }

    public void setLoop(boolean z10) {
        this.FA = z10;
    }

    public void setSelectedColor(int i10) {
        this.NOt = i10;
    }

    public void setUnSelectedColor(int i10) {
        this.mZ = i10;
    }

    public void ZRu() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        setGravity(17);
        setOrientation(0);
        layoutParams.bottomMargin = (int) FA.ZRu(this.uR, 10.0f);
        setLayoutParams(layoutParams);
    }

    private GradientDrawable NOt(int i10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    public void ZRu(int i10) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.Ht, this.Mm);
        int i11 = this.TFq;
        layoutParams.leftMargin = i11;
        layoutParams.rightMargin = i11;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.Ht, this.Mm);
        int i12 = this.TFq;
        layoutParams2.leftMargin = i12;
        layoutParams2.rightMargin = i12;
        int iZRu = uR.ZRu(this.FA, this.Vor, this.ZRu.size());
        int iZRu2 = uR.ZRu(this.FA, i10, this.ZRu.size());
        if (this.ZRu.size() == 0) {
            iZRu2 = 0;
        }
        if (!this.ZRu.isEmpty() && uR.ZRu(iZRu, this.ZRu) && uR.ZRu(iZRu2, this.ZRu)) {
            this.ZRu.get(iZRu).setBackground(NOt(this.mZ));
            this.ZRu.get(iZRu).setLayoutParams(layoutParams2);
            this.ZRu.get(iZRu2).setBackground(NOt(this.NOt));
            this.ZRu.get(iZRu2).setLayoutParams(layoutParams);
            this.Vor = i10;
        }
    }
}

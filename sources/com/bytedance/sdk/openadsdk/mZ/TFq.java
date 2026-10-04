package com.bytedance.sdk.openadsdk.mZ;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.om;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.mZ.aT;
import com.bytedance.sdk.openadsdk.utils.Cox;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class TFq extends com.bytedance.sdk.openadsdk.core.TFq.TFq implements View.OnClickListener, aT.mZ {
    private final int FA;
    private FilterWord Ht;
    private StateListDrawable Mm;
    private final aT TFq;
    public static FilterWord ZRu = new FilterWord("100:1", "GOOD");
    public static FilterWord NOt = new FilterWord("100:2", "NOT_BAD");
    public static FilterWord mZ = new FilterWord("100:3", "BAD");
    public static List<TFq> uR = new ArrayList(3);

    public TFq(@NonNull Context context, int i10, aT aTVar) {
        super(context);
        this.FA = i10;
        this.TFq = aTVar;
        if (aTVar != null) {
            aTVar.ZRu(this);
        }
        ZRu(i10);
        ZRu();
        NOt();
        uR.add(this);
    }

    private void NOt() {
        com.bytedance.sdk.openadsdk.core.TFq.FA fa2 = new com.bytedance.sdk.openadsdk.core.TFq.FA(getContext());
        fa2.setTextSize(this.TFq.Vor() ? 40 : 30);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.setMargins(0, Cox.mZ(getContext(), 12.0f), 0, Cox.mZ(getContext(), this.TFq.Vor() ? 8.0f : 4.0f));
        addView(fa2, layoutParams);
        ZRu zRu = new ZRu(getContext());
        zRu.setTextSize(this.TFq.Vor() ? 17 : 12);
        zRu.setTextColor(-16777216);
        zRu.setMaxLines(1);
        zRu.setSingleLine();
        zRu.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.setMargins(0, 0, 0, Cox.mZ(getContext(), 12.0f));
        addView(zRu, layoutParams2);
        int i10 = this.FA;
        if (i10 == 1) {
            fa2.setText("😍");
            zRu.setText(om.ZRu(getContext(), "tt_good"));
        } else if (i10 == 2) {
            zRu.setText(om.ZRu(getContext(), "tt_not_bad"));
            fa2.setText("😐");
        } else {
            if (i10 != 3) {
                return;
            }
            zRu.setText(om.ZRu(getContext(), "tt_bad"));
            fa2.setText("😡");
        }
    }

    private void ZRu(int i10) {
        if (i10 == 1) {
            this.Ht = ZRu;
        } else if (i10 == 2) {
            this.Ht = NOt;
        } else {
            if (i10 != 3) {
                return;
            }
            this.Ht = mZ;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (isSelected()) {
            this.TFq.ZRu(aT.ZRu);
        } else {
            this.TFq.ZRu(this.Ht);
        }
    }

    private void ZRu() {
        if (this.Mm == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(Cox.mZ(getContext(), 12.0f));
            gradientDrawable.setColor(Color.parseColor("#F8F8F8"));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setStroke(Cox.mZ(getContext(), 2.0f), Color.parseColor("#FE2C55"));
            gradientDrawable2.setCornerRadius(Cox.mZ(getContext(), 12.0f));
            gradientDrawable2.setColor(Color.parseColor("#12FE2C55"));
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.Mm = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_selected}, gradientDrawable2);
            this.Mm.addState(new int[0], gradientDrawable);
        }
        setBackground(this.Mm);
        setSelected(false);
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setOnClickListener(this);
    }

    @Override // com.bytedance.sdk.openadsdk.mZ.aT.mZ
    public void ZRu(FilterWord filterWord) {
        FilterWord filterWord2;
        if (filterWord == null || (filterWord2 = this.Ht) == null) {
            return;
        }
        setSelected(filterWord.equals(filterWord2));
    }
}

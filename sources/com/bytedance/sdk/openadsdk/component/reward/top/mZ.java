package com.bytedance.sdk.openadsdk.component.reward.top;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.model.qF;
import com.bytedance.sdk.openadsdk.utils.sAl;

/* JADX INFO: loaded from: classes3.dex */
public class mZ extends View implements ZRu<mZ> {
    private ZRu<mZ> ZRu;

    public mZ(Context context) {
        this(context, null);
    }

    public mZ ZRu(@NonNull qF qFVar) {
        if (this.ZRu == null) {
            TopLayoutDislike2 topLayoutDislike2M9load = new TopLayoutDislike2(getContext()).load(qFVar);
            this.ZRu = topLayoutDislike2M9load;
            ViewParent parent = getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ZRu(topLayoutDislike2M9load, (ViewGroup) parent);
            }
        }
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ZRu
    public void clickSkip() {
        ZRu<mZ> zRu = this.ZRu;
        if (zRu != null) {
            zRu.clickSkip();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ZRu
    public void clickSound() {
        ZRu<mZ> zRu = this.ZRu;
        if (zRu != null) {
            zRu.clickSound();
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ZRu
    public View getCloseButton() {
        ZRu<mZ> zRu = this.ZRu;
        if (zRu != null) {
            return zRu.getCloseButton();
        }
        return null;
    }

    public View getITopLayout() {
        Object obj = this.ZRu;
        if (obj instanceof View) {
            return (View) obj;
        }
        return null;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ZRu
    public void setListener(NOt nOt) {
        ZRu<mZ> zRu = this.ZRu;
        if (zRu != null) {
            zRu.setListener(nOt);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ZRu
    public void setShowDislike(boolean z10) {
        ZRu<mZ> zRu = this.ZRu;
        if (zRu != null) {
            zRu.setShowDislike(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ZRu
    public void setShowSkip(boolean z10) {
        ZRu<mZ> zRu = this.ZRu;
        if (zRu != null) {
            zRu.setShowSkip(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ZRu
    public void setShowSound(boolean z10) {
        ZRu<mZ> zRu = this.ZRu;
        if (zRu != null) {
            zRu.setShowSound(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ZRu
    public void setSkipEnable(boolean z10) {
        ZRu<mZ> zRu = this.ZRu;
        if (zRu != null) {
            zRu.setSkipEnable(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ZRu
    public void setSkipInvisiable() {
        ZRu<mZ> zRu = this.ZRu;
        if (zRu != null) {
            zRu.setSkipInvisiable();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ZRu
    public void setSkipText(CharSequence charSequence) {
        ZRu<mZ> zRu = this.ZRu;
        if (zRu != null) {
            zRu.setSkipText(charSequence);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ZRu
    public void setSoundMute(boolean z10) {
        ZRu<mZ> zRu = this.ZRu;
        if (zRu != null) {
            zRu.setSoundMute(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ZRu
    public void setTime(CharSequence charSequence, CharSequence charSequence2) {
        ZRu<mZ> zRu = this.ZRu;
        if (zRu != null) {
            zRu.setTime(charSequence, charSequence2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ZRu
    public void showCloseButton() {
        ZRu<mZ> zRu = this.ZRu;
        if (zRu != null) {
            zRu.showCloseButton();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ZRu
    public void showCountDownText() {
        ZRu<mZ> zRu = this.ZRu;
        if (zRu != null) {
            zRu.showCountDownText();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ZRu
    public void showSkipButton() {
        ZRu<mZ> zRu = this.ZRu;
        if (zRu != null) {
            zRu.showSkipButton();
        }
    }

    public mZ(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public mZ(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setVisibility(8);
        setWillNotDraw(true);
    }

    private void ZRu(View view, ViewGroup viewGroup) {
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
        if (view != null) {
            view.setId(sAl.MEE);
        }
    }
}

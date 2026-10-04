package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.W;
import com.google.android.material.R;

/* JADX INFO: loaded from: classes4.dex */
public class TabItem extends View {
    public final int customLayout;
    public final Drawable icon;
    public final CharSequence text;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        W wF = W.F(context, attributeSet, R.styleable.TabItem);
        this.text = wF.f86249b.getText(R.styleable.TabItem_android_text);
        this.icon = wF.h(R.styleable.TabItem_android_icon);
        this.customLayout = wF.f86249b.getResourceId(R.styleable.TabItem_android_layout, 0);
        wF.I();
    }
}

package com.android.launcher3.views;

import android.R;
import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public class ButtonPreference extends Preference {
    private boolean mWidgetFrameVisible;

    public ButtonPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.mWidgetFrameVisible = false;
    }

    @Override // android.preference.Preference
    public void onBindView(View view) {
        super.onBindView(view);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.widget_frame);
        if (viewGroup != null) {
            viewGroup.setVisibility(this.mWidgetFrameVisible ? 0 : 8);
        }
    }

    public void setWidgetFrameVisible(boolean z10) {
        if (this.mWidgetFrameVisible != z10) {
            this.mWidgetFrameVisible = z10;
            notifyChanged();
        }
    }

    public ButtonPreference(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mWidgetFrameVisible = false;
    }

    public ButtonPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mWidgetFrameVisible = false;
    }

    public ButtonPreference(Context context) {
        super(context);
        this.mWidgetFrameVisible = false;
    }
}

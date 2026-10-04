package com.prism.commons.ui.settings;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import c6.C2947b;
import com.prism.commons.ui.FromLayoutFileLayout;

/* JADX INFO: loaded from: classes5.dex */
public class SettingEntryLayout extends FromLayoutFileLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f162019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppCompatTextView f162020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f162021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f162022g;

    public SettingEntryLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f162022g = false;
    }

    @Override // com.prism.commons.ui.FromLayoutFileLayout
    public int a() {
        return C2947b.k.f129432X;
    }

    @Override // com.prism.commons.ui.FromLayoutFileLayout
    public void b(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super.b(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C2947b.o.vt, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(C2947b.o.yt);
        if (string == null) {
            string = "";
        }
        this.f162019d = (TextView) findViewById(C2947b.h.f129163i5);
        this.f162021f = (ImageView) findViewById(C2947b.h.f129232r2);
        this.f162019d.setText(string);
        String string2 = typedArrayObtainStyledAttributes.getString(C2947b.o.wt);
        this.f162020e = (AppCompatTextView) findViewById(C2947b.h.f129131e5);
        f(string2);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(C2947b.o.At, false);
        this.f162022g = z10;
        if (z10) {
            findViewById(C2947b.h.f129139f5).setVisibility(8);
        }
    }

    public String d() {
        return this.f162019d.getText().toString();
    }

    public void e(boolean z10) {
        this.f162020e.setTextIsSelectable(z10);
        this.f162020e.setSelectAllOnFocus(z10);
    }

    public void f(String str) {
        if (str == null) {
            this.f162020e.setVisibility(8);
        } else {
            this.f162020e.setText(str);
            this.f162020e.setVisibility(0);
        }
    }

    public void g(String str, int i10) {
        if (str == null) {
            this.f162020e.setVisibility(8);
            return;
        }
        this.f162020e.setText(str);
        this.f162020e.setVisibility(0);
        this.f162020e.setTextColor(i10);
    }

    public void h(String str) {
        this.f162019d.setText(str);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f162019d.setEnabled(z10);
        ImageView imageView = this.f162021f;
        if (imageView != null) {
            imageView.setEnabled(z10);
        }
    }

    public SettingEntryLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f162022g = false;
    }
}

package com.prism.commons.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import c6.C2947b;
import com.prism.commons.utils.l0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class FromLayoutFileLayout extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f162013c = l0.b("FromLayoutFileLayout");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewGroup f162014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f162015b;

    public FromLayoutFileLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, attributeSet);
    }

    public abstract int a();

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (view == this.f162015b) {
            super.addView(view);
        } else {
            this.f162014a.addView(view);
        }
    }

    public void b(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        c(context.getTheme().obtainStyledAttributes(attributeSet, C2947b.o.uh, 0, 0));
        this.f162014a = (ViewGroup) findViewById(C2947b.h.f128985M0);
    }

    public final void c(TypedArray typedArray) {
        int resourceId = typedArray.getResourceId(C2947b.o.vh, -1);
        if (resourceId < 0) {
            resourceId = a();
        }
        View viewInflate = View.inflate(getContext(), resourceId, null);
        this.f162015b = viewInflate;
        if (viewInflate == null) {
            throw new IllegalStateException("can not inflate fromLayout attribute as a View");
        }
        addView(viewInflate);
    }

    public FromLayoutFileLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b(context, attributeSet);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        if (view == this.f162015b) {
            super.addView(view, i10);
        } else {
            this.f162014a.addView(view, i10);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        if (view == this.f162015b) {
            super.addView(view, i10, i11);
        } else {
            this.f162014a.addView(view, i10, i11);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view == this.f162015b) {
            super.addView(view, layoutParams);
        } else {
            this.f162014a.addView(view, layoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view == this.f162015b) {
            super.addView(view, i10, layoutParams);
        } else {
            this.f162014a.addView(view, i10, layoutParams);
        }
    }
}

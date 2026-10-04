package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.C2507z0;
import g.C4426a;
import h.C4472a;

/* JADX INFO: renamed from: androidx.appcompat.widget.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class C1500f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CheckedTextView f86354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f86355b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f86356c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f86357d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f86358e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f86359f;

    public C1500f(@NonNull CheckedTextView checkedTextView) {
        this.f86354a = checkedTextView;
    }

    public void a() {
        Drawable checkMarkDrawable = this.f86354a.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f86357d || this.f86358e) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f86357d) {
                    drawableMutate.setTintList(this.f86355b);
                }
                if (this.f86358e) {
                    drawableMutate.setTintMode(this.f86356c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f86354a.getDrawableState());
                }
                this.f86354a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public ColorStateList b() {
        return this.f86355b;
    }

    public PorterDuff.Mode c() {
        return this.f86356c;
    }

    public void d(@Nullable AttributeSet attributeSet, int i10) {
        int i11;
        int resourceId;
        int resourceId2;
        Context context = this.f86354a.getContext();
        int[] iArr = C4426a.m.f202108s3;
        W wG = W.G(context, attributeSet, iArr, i10, 0);
        CheckedTextView checkedTextView = this.f86354a;
        C2507z0.E1(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, wG.f86249b, i10, 0);
        try {
            int i12 = C4426a.m.f202124u3;
            if (!wG.f86249b.hasValue(i12) || (resourceId2 = wG.f86249b.getResourceId(i12, 0)) == 0) {
                i11 = C4426a.m.f202116t3;
                if (wG.f86249b.hasValue(i11) && (resourceId = wG.f86249b.getResourceId(i11, 0)) != 0) {
                    CheckedTextView checkedTextView2 = this.f86354a;
                    checkedTextView2.setCheckMarkDrawable(C4472a.b(checkedTextView2.getContext(), resourceId));
                }
            } else {
                try {
                    CheckedTextView checkedTextView3 = this.f86354a;
                    checkedTextView3.setCheckMarkDrawable(C4472a.b(checkedTextView3.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    i11 = C4426a.m.f202116t3;
                    if (wG.f86249b.hasValue(i11)) {
                        CheckedTextView checkedTextView22 = this.f86354a;
                        checkedTextView22.setCheckMarkDrawable(C4472a.b(checkedTextView22.getContext(), resourceId));
                    }
                }
            }
            int i13 = C4426a.m.f202132v3;
            if (wG.f86249b.hasValue(i13)) {
                this.f86354a.setCheckMarkTintList(wG.d(i13));
            }
            int i14 = C4426a.m.f202140w3;
            if (wG.f86249b.hasValue(i14)) {
                this.f86354a.setCheckMarkTintMode(B.e(wG.f86249b.getInt(i14, -1), null));
            }
            wG.I();
        } catch (Throwable th) {
            wG.I();
            throw th;
        }
    }

    public void e() {
        if (this.f86359f) {
            this.f86359f = false;
        } else {
            this.f86359f = true;
            a();
        }
    }

    public void f(ColorStateList colorStateList) {
        this.f86355b = colorStateList;
        this.f86357d = true;
        a();
    }

    public void g(@Nullable PorterDuff.Mode mode) {
        this.f86356c = mode;
        this.f86358e = true;
        a();
    }
}

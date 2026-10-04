package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.C2507z0;
import g.C4426a;
import h.C4472a;

/* JADX INFO: renamed from: androidx.appcompat.widget.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1501g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CompoundButton f86368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f86369b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f86370c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f86371d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f86372e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f86373f;

    public C1501g(@NonNull CompoundButton compoundButton) {
        this.f86368a = compoundButton;
    }

    public void a() {
        Drawable buttonDrawable = this.f86368a.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f86371d || this.f86372e) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f86371d) {
                    drawableMutate.setTintList(this.f86369b);
                }
                if (this.f86372e) {
                    drawableMutate.setTintMode(this.f86370c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f86368a.getDrawableState());
                }
                this.f86368a.setButtonDrawable(drawableMutate);
            }
        }
    }

    public int b(int i10) {
        return i10;
    }

    public ColorStateList c() {
        return this.f86369b;
    }

    public PorterDuff.Mode d() {
        return this.f86370c;
    }

    public void e(@Nullable AttributeSet attributeSet, int i10) {
        int i11;
        int resourceId;
        int resourceId2;
        Context context = this.f86368a.getContext();
        int[] iArr = C4426a.m.f202148x3;
        W wG = W.G(context, attributeSet, iArr, i10, 0);
        CompoundButton compoundButton = this.f86368a;
        C2507z0.E1(compoundButton, compoundButton.getContext(), iArr, attributeSet, wG.f86249b, i10, 0);
        try {
            int i12 = C4426a.m.f202164z3;
            if (!wG.f86249b.hasValue(i12) || (resourceId2 = wG.f86249b.getResourceId(i12, 0)) == 0) {
                i11 = C4426a.m.f202156y3;
                if (wG.f86249b.hasValue(i11) && (resourceId = wG.f86249b.getResourceId(i11, 0)) != 0) {
                    CompoundButton compoundButton2 = this.f86368a;
                    compoundButton2.setButtonDrawable(C4472a.b(compoundButton2.getContext(), resourceId));
                }
            } else {
                try {
                    CompoundButton compoundButton3 = this.f86368a;
                    compoundButton3.setButtonDrawable(C4472a.b(compoundButton3.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    i11 = C4426a.m.f202156y3;
                    if (wG.f86249b.hasValue(i11)) {
                        CompoundButton compoundButton22 = this.f86368a;
                        compoundButton22.setButtonDrawable(C4472a.b(compoundButton22.getContext(), resourceId));
                    }
                }
            }
            int i13 = C4426a.m.f201746A3;
            if (wG.f86249b.hasValue(i13)) {
                this.f86368a.setButtonTintList(wG.d(i13));
            }
            int i14 = C4426a.m.f201754B3;
            if (wG.f86249b.hasValue(i14)) {
                this.f86368a.setButtonTintMode(B.e(wG.f86249b.getInt(i14, -1), null));
            }
            wG.I();
        } catch (Throwable th) {
            wG.I();
            throw th;
        }
    }

    public void f() {
        if (this.f86373f) {
            this.f86373f = false;
        } else {
            this.f86373f = true;
            a();
        }
    }

    public void g(ColorStateList colorStateList) {
        this.f86369b = colorStateList;
        this.f86371d = true;
        a();
    }

    public void h(@Nullable PorterDuff.Mode mode) {
        this.f86370c = mode;
        this.f86372e = true;
        a();
    }
}

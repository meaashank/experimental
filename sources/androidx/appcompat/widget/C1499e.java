package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.C2507z0;
import g.C4426a;

/* JADX INFO: renamed from: androidx.appcompat.widget.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1499e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f86332a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public U f86335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public U f86336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public U f86337f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f86334c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1502h f86333b = C1502h.b();

    public C1499e(@NonNull View view) {
        this.f86332a = view;
    }

    public final boolean a(@NonNull Drawable drawable) {
        if (this.f86337f == null) {
            this.f86337f = new U();
        }
        U u10 = this.f86337f;
        u10.a();
        ColorStateList colorStateListO = C2507z0.O(this.f86332a);
        if (colorStateListO != null) {
            u10.f86241d = true;
            u10.f86238a = colorStateListO;
        }
        PorterDuff.Mode modeH = C2507z0.h.h(this.f86332a);
        if (modeH != null) {
            u10.f86240c = true;
            u10.f86239b = modeH;
        }
        if (!u10.f86241d && !u10.f86240c) {
            return false;
        }
        C1502h.j(drawable, u10, this.f86332a.getDrawableState());
        return true;
    }

    public void b() {
        Drawable background = this.f86332a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            U u10 = this.f86336e;
            if (u10 != null) {
                C1502h.j(background, u10, this.f86332a.getDrawableState());
                return;
            }
            U u11 = this.f86335d;
            if (u11 != null) {
                C1502h.j(background, u11, this.f86332a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        U u10 = this.f86336e;
        if (u10 != null) {
            return u10.f86238a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        U u10 = this.f86336e;
        if (u10 != null) {
            return u10.f86239b;
        }
        return null;
    }

    public void e(@Nullable AttributeSet attributeSet, int i10) {
        Context context = this.f86332a.getContext();
        int[] iArr = C4426a.m.f201976c7;
        W wG = W.G(context, attributeSet, iArr, i10, 0);
        View view = this.f86332a;
        C2507z0.E1(view, view.getContext(), iArr, attributeSet, wG.f86249b, i10, 0);
        try {
            int i11 = C4426a.m.f201985d7;
            if (wG.f86249b.hasValue(i11)) {
                this.f86334c = wG.f86249b.getResourceId(i11, -1);
                ColorStateList colorStateListF = this.f86333b.f(this.f86332a.getContext(), this.f86334c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            int i12 = C4426a.m.f201994e7;
            if (wG.f86249b.hasValue(i12)) {
                C2507z0.h.q(this.f86332a, wG.d(i12));
            }
            int i13 = C4426a.m.f202003f7;
            if (wG.f86249b.hasValue(i13)) {
                C2507z0.h.r(this.f86332a, B.e(wG.f86249b.getInt(i13, -1), null));
            }
            wG.I();
        } catch (Throwable th) {
            wG.I();
            throw th;
        }
    }

    public void f(Drawable drawable) {
        this.f86334c = -1;
        h(null);
        b();
    }

    public void g(int i10) {
        this.f86334c = i10;
        C1502h c1502h = this.f86333b;
        h(c1502h != null ? c1502h.f(this.f86332a.getContext(), i10) : null);
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f86335d == null) {
                this.f86335d = new U();
            }
            U u10 = this.f86335d;
            u10.f86238a = colorStateList;
            u10.f86241d = true;
        } else {
            this.f86335d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.f86336e == null) {
            this.f86336e = new U();
        }
        U u10 = this.f86336e;
        u10.f86238a = colorStateList;
        u10.f86241d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.f86336e == null) {
            this.f86336e = new U();
        }
        U u10 = this.f86336e;
        u10.f86239b = mode;
        u10.f86240c = true;
        b();
    }

    public final boolean k() {
        return this.f86335d != null;
    }
}

package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.annotation.Nullable;
import e.T;

/* JADX INFO: loaded from: classes.dex */
@T(21)
public class b implements e {
    @Override // androidx.cardview.widget.e
    public float a(d dVar) {
        return ((f) dVar.d()).d();
    }

    @Override // androidx.cardview.widget.e
    public float b(d dVar) {
        return ((f) dVar.d()).c();
    }

    @Override // androidx.cardview.widget.e
    public float c(d dVar) {
        return a(dVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.e
    public float d(d dVar) {
        return dVar.f().getElevation();
    }

    @Override // androidx.cardview.widget.e
    public void e(d dVar) {
        if (!dVar.a()) {
            dVar.setShadowPadding(0, 0, 0, 0);
            return;
        }
        float fB = b(dVar);
        float fA = a(dVar);
        int iCeil = (int) Math.ceil(g.c(fB, fA, dVar.e()));
        int iCeil2 = (int) Math.ceil(g.d(fB, fA, dVar.e()));
        dVar.setShadowPadding(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // androidx.cardview.widget.e
    public float f(d dVar) {
        return a(dVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.e
    public void g(d dVar, float f10) {
        ((f) dVar.d()).g(f10, dVar.a(), dVar.e());
        e(dVar);
    }

    @Override // androidx.cardview.widget.e
    public void h(d dVar, float f10) {
        ((f) dVar.d()).h(f10);
    }

    @Override // androidx.cardview.widget.e
    public void i(d dVar, float f10) {
        dVar.f().setElevation(f10);
    }

    @Override // androidx.cardview.widget.e
    public ColorStateList j(d dVar) {
        return ((f) dVar.d()).b();
    }

    @Override // androidx.cardview.widget.e
    public void k(d dVar) {
        g(dVar, b(dVar));
    }

    @Override // androidx.cardview.widget.e
    public void l(d dVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        dVar.c(new f(colorStateList, f10));
        View viewF = dVar.f();
        viewF.setClipToOutline(true);
        viewF.setElevation(f11);
        g(dVar, f12);
    }

    @Override // androidx.cardview.widget.e
    public void m(d dVar) {
        g(dVar, b(dVar));
    }

    @Override // androidx.cardview.widget.e
    public void n() {
    }

    @Override // androidx.cardview.widget.e
    public void o(d dVar, @Nullable ColorStateList colorStateList) {
        ((f) dVar.d()).f(colorStateList);
    }

    public final f p(d dVar) {
        return (f) dVar.d();
    }
}

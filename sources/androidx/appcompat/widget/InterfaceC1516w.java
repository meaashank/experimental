package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.o;
import androidx.core.view.I0;

/* JADX INFO: renamed from: androidx.appcompat.widget.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface InterfaceC1516w {
    void A(Drawable drawable);

    void B(SparseArray<Parcelable> sparseArray);

    void C(int i10);

    int D();

    void E(View view);

    void F();

    void G(Drawable drawable);

    void H(CharSequence charSequence);

    void I(int i10);

    Menu J();

    I0 K(int i10, long j10);

    ViewGroup L();

    void M(boolean z10);

    void N(int i10);

    void O(M m10);

    boolean P();

    void Q(int i10);

    void R(o.a aVar, h.a aVar2);

    void S(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener);

    void T(SparseArray<Parcelable> sparseArray);

    CharSequence U();

    boolean a();

    boolean b();

    void c(CharSequence charSequence);

    void collapseActionView();

    boolean d();

    void e(Window.Callback callback);

    boolean f();

    boolean g();

    Context getContext();

    int getHeight();

    CharSequence getTitle();

    int getVisibility();

    void h(Menu menu, o.a aVar);

    void i(CharSequence charSequence);

    void j();

    void k(int i10);

    boolean l();

    boolean m();

    boolean n();

    boolean o();

    void p(int i10);

    int q();

    void r(int i10);

    int s();

    void setBackgroundDrawable(Drawable drawable);

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setVisibility(int i10);

    void t(int i10);

    void u();

    int v();

    void w(boolean z10);

    void x();

    View y();

    void z(Drawable drawable);
}

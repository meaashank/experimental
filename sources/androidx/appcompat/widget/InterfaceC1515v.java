package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.o;

/* JADX INFO: renamed from: androidx.appcompat.widget.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface InterfaceC1515v {
    boolean a();

    boolean b();

    boolean d();

    void e(Window.Callback callback);

    boolean f();

    boolean g();

    CharSequence getTitle();

    void h(Menu menu, o.a aVar);

    void i(CharSequence charSequence);

    void j();

    void k(int i10);

    boolean l();

    boolean m();

    void n(SparseArray<Parcelable> sparseArray);

    void o(int i10);

    void p(SparseArray<Parcelable> sparseArray);

    void q(int i10);

    void r();

    void setIcon(int i10);

    void setIcon(Drawable drawable);
}

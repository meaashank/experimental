package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.InterfaceC4332f;
import g.C4426a;

/* JADX INFO: renamed from: androidx.appcompat.widget.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1507m extends PopupWindow {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f86400b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f86401a;

    public C1507m(@NonNull Context context, @Nullable AttributeSet attributeSet, @InterfaceC4332f int i10) {
        super(context, attributeSet, i10);
        a(context, attributeSet, i10, 0);
    }

    public final void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        W wG = W.G(context, attributeSet, C4426a.m.f201891S4, i10, i11);
        int i12 = C4426a.m.f201915V4;
        if (wG.f86249b.hasValue(i12)) {
            b(wG.f86249b.getBoolean(i12, false));
        }
        setBackgroundDrawable(wG.h(C4426a.m.f201899T4));
        wG.I();
    }

    public final void b(boolean z10) {
        if (f86400b) {
            this.f86401a = z10;
        } else {
            setOverlapAnchor(z10);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        if (f86400b && this.f86401a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f86400b && this.f86401a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }

    public C1507m(@NonNull Context context, @Nullable AttributeSet attributeSet, @InterfaceC4332f int i10, @e.a0 int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f86400b && this.f86401a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }
}

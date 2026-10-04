package Ja;

import android.content.Context;
import android.widget.Scroller;

/* JADX INFO: loaded from: classes7.dex */
public class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Scroller f58147a;

    public c(Context context) {
        this.f58147a = new Scroller(context);
    }

    @Override // Ja.d
    public boolean a() {
        return this.f58147a.computeScrollOffset();
    }

    @Override // Ja.d
    public void b(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f58147a.fling(i10, i11, i12, i13, i14, i15, i16, i17);
    }

    @Override // Ja.d
    public void c(boolean z10) {
        this.f58147a.forceFinished(z10);
    }

    @Override // Ja.d
    public int d() {
        return this.f58147a.getCurrX();
    }

    @Override // Ja.d
    public int e() {
        return this.f58147a.getCurrY();
    }

    @Override // Ja.d
    public boolean g() {
        return this.f58147a.isFinished();
    }
}

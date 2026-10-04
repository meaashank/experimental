package Ja;

import android.annotation.TargetApi;
import android.content.Context;
import android.widget.OverScroller;

/* JADX INFO: loaded from: classes7.dex */
@TargetApi(9)
public class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OverScroller f58146a;

    public a(Context context) {
        this.f58146a = new OverScroller(context);
    }

    @Override // Ja.d
    public boolean a() {
        return this.f58146a.computeScrollOffset();
    }

    @Override // Ja.d
    public void b(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f58146a.fling(i10, i11, i12, i13, i14, i15, i16, i17, i18, i19);
    }

    @Override // Ja.d
    public void c(boolean z10) {
        this.f58146a.forceFinished(z10);
    }

    @Override // Ja.d
    public int d() {
        return this.f58146a.getCurrX();
    }

    @Override // Ja.d
    public int e() {
        return this.f58146a.getCurrY();
    }

    @Override // Ja.d
    public boolean g() {
        return this.f58146a.isFinished();
    }
}

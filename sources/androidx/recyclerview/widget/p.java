package androidx.recyclerview.widget;

import android.view.View;
import androidx.activity.C1477d;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public class p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f116878j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f116879k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f116880l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f116881m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f116882n = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f116884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f116885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f116886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f116887e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f116890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f116891i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f116883a = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f116888f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f116889g = 0;

    public boolean a(RecyclerView.z zVar) {
        int i10 = this.f116885c;
        return i10 >= 0 && i10 < zVar.d();
    }

    public View b(RecyclerView.u uVar) {
        View viewQ = uVar.q(this.f116885c, false);
        this.f116885c += this.f116886d;
        return viewQ;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LayoutState{mAvailable=");
        sb2.append(this.f116884b);
        sb2.append(", mCurrentPosition=");
        sb2.append(this.f116885c);
        sb2.append(", mItemDirection=");
        sb2.append(this.f116886d);
        sb2.append(", mLayoutDirection=");
        sb2.append(this.f116887e);
        sb2.append(", mStartLine=");
        sb2.append(this.f116888f);
        sb2.append(", mEndLine=");
        return C1477d.a(sb2, this.f116889g, '}');
    }
}

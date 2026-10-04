package d1;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends AbstractC4294a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f194578l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f194579m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LayoutInflater f194580n;

    @Deprecated
    public c(Context context, int i10, Cursor cursor) {
        super(context, cursor);
        this.f194579m = i10;
        this.f194578l = i10;
        this.f194580n = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // d1.AbstractC4294a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f194580n.inflate(this.f194579m, viewGroup, false);
    }

    @Override // d1.AbstractC4294a
    public View i(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f194580n.inflate(this.f194578l, viewGroup, false);
    }

    public void m(int i10) {
        this.f194579m = i10;
    }

    public void n(int i10) {
        this.f194578l = i10;
    }

    @Deprecated
    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f194579m = i10;
        this.f194578l = i10;
        this.f194580n = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public c(Context context, int i10, Cursor cursor, int i11) {
        super(context, cursor, i11);
        this.f194579m = i10;
        this.f194578l = i10;
        this.f194580n = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}

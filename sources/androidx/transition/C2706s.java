package androidx.transition;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.C2705q;

/* JADX INFO: renamed from: androidx.transition.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2706s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f119533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f119534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f119535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f119536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f119537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Runnable f119538f;

    public C2706s(@NonNull ViewGroup viewGroup) {
        this.f119534b = -1;
        this.f119535c = viewGroup;
    }

    @Nullable
    public static C2706s c(@NonNull ViewGroup viewGroup) {
        return (C2706s) viewGroup.getTag(C2705q.g.f118506R1);
    }

    @NonNull
    public static C2706s d(@NonNull ViewGroup viewGroup, @e.G int i10, @NonNull Context context) {
        int i11 = C2705q.g.f118515U1;
        SparseArray sparseArray = (SparseArray) viewGroup.getTag(i11);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            viewGroup.setTag(i11, sparseArray);
        }
        C2706s c2706s = (C2706s) sparseArray.get(i10);
        if (c2706s != null) {
            return c2706s;
        }
        C2706s c2706s2 = new C2706s(viewGroup, i10, context);
        sparseArray.put(i10, c2706s2);
        return c2706s2;
    }

    public static void g(@NonNull ViewGroup viewGroup, @Nullable C2706s c2706s) {
        viewGroup.setTag(C2705q.g.f118506R1, c2706s);
    }

    public void a() {
        if (this.f119534b > 0 || this.f119536d != null) {
            e().removeAllViews();
            if (this.f119534b > 0) {
                LayoutInflater.from(this.f119533a).inflate(this.f119534b, this.f119535c);
            } else {
                this.f119535c.addView(this.f119536d);
            }
        }
        Runnable runnable = this.f119537e;
        if (runnable != null) {
            runnable.run();
        }
        g(this.f119535c, this);
    }

    public void b() {
        Runnable runnable;
        if (c(this.f119535c) != this || (runnable = this.f119538f) == null) {
            return;
        }
        runnable.run();
    }

    @NonNull
    public ViewGroup e() {
        return this.f119535c;
    }

    public boolean f() {
        return this.f119534b > 0;
    }

    public void h(@Nullable Runnable runnable) {
        this.f119537e = runnable;
    }

    public void i(@Nullable Runnable runnable) {
        this.f119538f = runnable;
    }

    public C2706s(ViewGroup viewGroup, int i10, Context context) {
        this.f119533a = context;
        this.f119535c = viewGroup;
        this.f119534b = i10;
    }

    public C2706s(@NonNull ViewGroup viewGroup, @NonNull View view) {
        this.f119534b = -1;
        this.f119535c = viewGroup;
        this.f119536d = view;
    }
}

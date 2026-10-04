package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.cookiegames.smartcookie.p;
import com.google.android.material.appbar.MaterialToolbar;

/* JADX INFO: renamed from: a4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1428b implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f84596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f84597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final MaterialToolbar f84598c;

    public C1428b(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull MaterialToolbar materialToolbar) {
        this.f84596a = linearLayout;
        this.f84597b = recyclerView;
        this.f84598c = materialToolbar;
    }

    @NonNull
    public static C1428b a(@NonNull View view) {
        int i10 = p.j.f144663d5;
        RecyclerView recyclerView = (RecyclerView) D2.c.a(view, i10);
        if (recyclerView != null) {
            i10 = p.j.f144805mc;
            MaterialToolbar materialToolbar = (MaterialToolbar) D2.c.a(view, i10);
            if (materialToolbar != null) {
                return new C1428b((LinearLayout) view, recyclerView, materialToolbar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static C1428b c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static C1428b d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145106E, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public LinearLayout b() {
        return this.f84596a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84596a;
    }
}

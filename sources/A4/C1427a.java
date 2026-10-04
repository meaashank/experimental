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

/* JADX INFO: renamed from: a4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1427a implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f84593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f84594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final MaterialToolbar f84595c;

    public C1427a(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull MaterialToolbar materialToolbar) {
        this.f84593a = linearLayout;
        this.f84594b = recyclerView;
        this.f84595c = materialToolbar;
    }

    @NonNull
    public static C1427a a(@NonNull View view) {
        int i10 = p.j.f144856q3;
        RecyclerView recyclerView = (RecyclerView) D2.c.a(view, i10);
        if (recyclerView != null) {
            i10 = p.j.f144805mc;
            MaterialToolbar materialToolbar = (MaterialToolbar) D2.c.a(view, i10);
            if (materialToolbar != null) {
                return new C1427a((LinearLayout) view, recyclerView, materialToolbar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static C1427a c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static C1427a d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145098C, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public LinearLayout b() {
        return this.f84593a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84593a;
    }
}

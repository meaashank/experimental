package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.cookiegames.smartcookie.p;
import com.google.android.material.appbar.MaterialToolbar;

/* JADX INFO: renamed from: a4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1431e implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f84641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f84642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final MaterialToolbar f84643c;

    public C1431e(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FrameLayout frameLayout, @NonNull MaterialToolbar materialToolbar) {
        this.f84641a = coordinatorLayout;
        this.f84642b = frameLayout;
        this.f84643c = materialToolbar;
    }

    @NonNull
    public static C1431e a(@NonNull View view) {
        int i10 = p.j.f144825o2;
        FrameLayout frameLayout = (FrameLayout) D2.c.a(view, i10);
        if (frameLayout != null) {
            i10 = p.j.f144805mc;
            MaterialToolbar materialToolbar = (MaterialToolbar) D2.c.a(view, i10);
            if (materialToolbar != null) {
                return new C1431e((CoordinatorLayout) view, frameLayout, materialToolbar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static C1431e c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static C1431e d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145122I, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public CoordinatorLayout b() {
        return this.f84641a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84641a;
    }
}

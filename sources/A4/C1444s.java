package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.cookiegames.smartcookie.p;

/* JADX INFO: renamed from: a4.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1444s implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f84690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f84691b;

    public C1444s(@NonNull LinearLayout linearLayout, @NonNull View view) {
        this.f84690a = linearLayout;
        this.f84691b = view;
    }

    @NonNull
    public static C1444s a(@NonNull View view) {
        int i10 = p.j.f144656cd;
        View viewA = D2.c.a(view, i10);
        if (viewA != null) {
            return new C1444s((LinearLayout) view, viewA);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static C1444s c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static C1444s d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145295u0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public LinearLayout b() {
        return this.f84690a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84690a;
    }
}

package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.cookiegames.smartcookie.p;
import com.google.android.material.appbar.MaterialToolbar;

/* JADX INFO: renamed from: a4.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1426D implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f84505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f84506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f84507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final MaterialToolbar f84508d;

    public C1426D(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull MaterialToolbar materialToolbar) {
        this.f84505a = linearLayout;
        this.f84506b = textView;
        this.f84507c = textView2;
        this.f84508d = materialToolbar;
    }

    @NonNull
    public static C1426D a(@NonNull View view) {
        int i10 = p.j.f144400Kb;
        TextView textView = (TextView) D2.c.a(view, i10);
        if (textView != null) {
            i10 = p.j.f144414Lb;
            TextView textView2 = (TextView) D2.c.a(view, i10);
            if (textView2 != null) {
                i10 = p.j.f144805mc;
                MaterialToolbar materialToolbar = (MaterialToolbar) D2.c.a(view, i10);
                if (materialToolbar != null) {
                    return new C1426D((LinearLayout) view, textView, textView2, materialToolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static C1426D c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static C1426D d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145213d3, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public LinearLayout b() {
        return this.f84505a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84505a;
    }
}

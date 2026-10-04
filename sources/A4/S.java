package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import com.cookiegames.smartcookie.p;

/* JADX INFO: loaded from: classes3.dex */
public final class S implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f84583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Toolbar f84584b;

    public S(@NonNull LinearLayout linearLayout, @NonNull Toolbar toolbar) {
        this.f84583a = linearLayout;
        this.f84584b = toolbar;
    }

    @NonNull
    public static S a(@NonNull View view) {
        int i10 = p.j.f144805mc;
        Toolbar toolbar = (Toolbar) D2.c.a(view, i10);
        if (toolbar != null) {
            return new S((LinearLayout) view, toolbar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static S c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static S d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145303v3, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public LinearLayout b() {
        return this.f84583a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84583a;
    }
}

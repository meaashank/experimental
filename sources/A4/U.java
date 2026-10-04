package a4;

import android.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.cookiegames.smartcookie.p;

/* JADX INFO: loaded from: classes3.dex */
public final class U implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f84590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ProgressBar f84591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f84592c;

    public U(@NonNull LinearLayout linearLayout, @NonNull ProgressBar progressBar, @NonNull LinearLayout linearLayout2) {
        this.f84590a = linearLayout;
        this.f84591b = progressBar;
        this.f84592c = linearLayout2;
    }

    @NonNull
    public static U a(@NonNull View view) {
        ProgressBar progressBar = (ProgressBar) D2.c.a(view, R.id.progress);
        if (progressBar == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.progress)));
        }
        LinearLayout linearLayout = (LinearLayout) view;
        return new U(linearLayout, progressBar, linearLayout);
    }

    @NonNull
    public static U c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static U d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145313x3, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public LinearLayout b() {
        return this.f84590a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84590a;
    }
}

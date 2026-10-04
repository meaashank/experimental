package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.cookiegames.smartcookie.p;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: renamed from: a4.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1446u implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f84694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f84695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f84696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f84697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ProgressBar f84698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f84699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final MaterialButton f84700g;

    public C1446u(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull ProgressBar progressBar, @NonNull TextView textView3, @NonNull MaterialButton materialButton) {
        this.f84694a = constraintLayout;
        this.f84695b = textView;
        this.f84696c = imageView;
        this.f84697d = textView2;
        this.f84698e = progressBar;
        this.f84699f = textView3;
        this.f84700g = materialButton;
    }

    @NonNull
    public static C1446u a(@NonNull View view) {
        int i10 = p.j.f144706g3;
        TextView textView = (TextView) D2.c.a(view, i10);
        if (textView != null) {
            i10 = p.j.f144721h3;
            ImageView imageView = (ImageView) D2.c.a(view, i10);
            if (imageView != null) {
                i10 = p.j.f144736i3;
                TextView textView2 = (TextView) D2.c.a(view, i10);
                if (textView2 != null) {
                    i10 = p.j.f144751j3;
                    ProgressBar progressBar = (ProgressBar) D2.c.a(view, i10);
                    if (progressBar != null) {
                        i10 = p.j.f144766k3;
                        TextView textView3 = (TextView) D2.c.a(view, i10);
                        if (textView3 != null) {
                            i10 = p.j.f144781l3;
                            MaterialButton materialButton = (MaterialButton) D2.c.a(view, i10);
                            if (materialButton != null) {
                                return new C1446u((ConstraintLayout) view, textView, imageView, textView2, progressBar, textView3, materialButton);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static C1446u c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static C1446u d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145305w0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public ConstraintLayout b() {
        return this.f84694a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84694a;
    }
}

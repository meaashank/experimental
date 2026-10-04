package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.cookiegames.smartcookie.p;

/* JADX INFO: loaded from: classes3.dex */
public final class P implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f84561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final AppCompatImageButton f84562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final AppCompatImageButton f84563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final AppCompatImageButton f84564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final AppCompatImageButton f84565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ListView f84566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final AppCompatImageButton f84567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final LinearLayout f84568h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f84569i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final LinearLayout f84570j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f84571k;

    public P(@NonNull RelativeLayout relativeLayout, @NonNull AppCompatImageButton appCompatImageButton, @NonNull AppCompatImageButton appCompatImageButton2, @NonNull AppCompatImageButton appCompatImageButton3, @NonNull AppCompatImageButton appCompatImageButton4, @NonNull ListView listView, @NonNull AppCompatImageButton appCompatImageButton5, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull LinearLayout linearLayout2, @NonNull ConstraintLayout constraintLayout) {
        this.f84561a = relativeLayout;
        this.f84562b = appCompatImageButton;
        this.f84563c = appCompatImageButton2;
        this.f84564d = appCompatImageButton3;
        this.f84565e = appCompatImageButton4;
        this.f84566f = listView;
        this.f84567g = appCompatImageButton5;
        this.f84568h = linearLayout;
        this.f84569i = relativeLayout2;
        this.f84570j = linearLayout2;
        this.f84571k = constraintLayout;
    }

    @NonNull
    public static P a(@NonNull View view) {
        int i10 = p.j.f144779l1;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) D2.c.a(view, i10);
        if (appCompatImageButton != null) {
            i10 = p.j.f144914u1;
            AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) D2.c.a(view, i10);
            if (appCompatImageButton2 != null) {
                i10 = p.j.f144705g2;
                AppCompatImageButton appCompatImageButton3 = (AppCompatImageButton) D2.c.a(view, i10);
                if (appCompatImageButton3 != null) {
                    i10 = p.j.f144449O4;
                    AppCompatImageButton appCompatImageButton4 = (AppCompatImageButton) D2.c.a(view, i10);
                    if (appCompatImageButton4 != null) {
                        i10 = p.j.f144381J6;
                        ListView listView = (ListView) D2.c.a(view, i10);
                        if (listView != null) {
                            i10 = p.j.f144711g8;
                            AppCompatImageButton appCompatImageButton5 = (AppCompatImageButton) D2.c.a(view, i10);
                            if (appCompatImageButton5 != null) {
                                i10 = p.j.f144526Tb;
                                LinearLayout linearLayout = (LinearLayout) D2.c.a(view, i10);
                                if (linearLayout != null) {
                                    RelativeLayout relativeLayout = (RelativeLayout) view;
                                    i10 = p.j.f144865qc;
                                    LinearLayout linearLayout2 = (LinearLayout) D2.c.a(view, i10);
                                    if (linearLayout2 != null) {
                                        i10 = p.j.f144261Ac;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) D2.c.a(view, i10);
                                        if (constraintLayout != null) {
                                            return new P(relativeLayout, appCompatImageButton, appCompatImageButton2, appCompatImageButton3, appCompatImageButton4, listView, appCompatImageButton5, linearLayout, relativeLayout, linearLayout2, constraintLayout);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static P c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static P d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145293t3, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public RelativeLayout b() {
        return this.f84561a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84561a;
    }
}

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
public final class Q implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f84572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final AppCompatImageButton f84573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final AppCompatImageButton f84574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final AppCompatImageButton f84575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final AppCompatImageButton f84576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ListView f84577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final AppCompatImageButton f84578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final LinearLayout f84579h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f84580i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final LinearLayout f84581j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f84582k;

    public Q(@NonNull RelativeLayout relativeLayout, @NonNull AppCompatImageButton appCompatImageButton, @NonNull AppCompatImageButton appCompatImageButton2, @NonNull AppCompatImageButton appCompatImageButton3, @NonNull AppCompatImageButton appCompatImageButton4, @NonNull ListView listView, @NonNull AppCompatImageButton appCompatImageButton5, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull LinearLayout linearLayout2, @NonNull ConstraintLayout constraintLayout) {
        this.f84572a = relativeLayout;
        this.f84573b = appCompatImageButton;
        this.f84574c = appCompatImageButton2;
        this.f84575d = appCompatImageButton3;
        this.f84576e = appCompatImageButton4;
        this.f84577f = listView;
        this.f84578g = appCompatImageButton5;
        this.f84579h = linearLayout;
        this.f84580i = relativeLayout2;
        this.f84581j = linearLayout2;
        this.f84582k = constraintLayout;
    }

    @NonNull
    public static Q a(@NonNull View view) {
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
                                            return new Q(relativeLayout, appCompatImageButton, appCompatImageButton2, appCompatImageButton3, appCompatImageButton4, listView, appCompatImageButton5, linearLayout, relativeLayout, linearLayout2, constraintLayout);
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
    public static Q c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static Q d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145298u3, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public RelativeLayout b() {
        return this.f84572a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84572a;
    }
}

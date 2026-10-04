package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.cookiegames.smartcookie.icon.TabCountView;
import com.cookiegames.smartcookie.p;
import com.cookiegames.smartcookie.view.SearchView;

/* JADX INFO: loaded from: classes3.dex */
public final class O implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f84549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f84550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f84551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f84552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f84553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final FrameLayout f84554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f84555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final SearchView f84556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f84557i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final ImageView f84558j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final ImageView f84559k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TabCountView f84560l;

    public O(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView2, @NonNull FrameLayout frameLayout3, @NonNull ImageView imageView3, @NonNull SearchView searchView, @NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull TabCountView tabCountView) {
        this.f84549a = linearLayout;
        this.f84550b = frameLayout;
        this.f84551c = imageView;
        this.f84552d = frameLayout2;
        this.f84553e = imageView2;
        this.f84554f = frameLayout3;
        this.f84555g = imageView3;
        this.f84556h = searchView;
        this.f84557i = constraintLayout;
        this.f84558j = imageView4;
        this.f84559k = imageView5;
        this.f84560l = tabCountView;
    }

    @NonNull
    public static O a(@NonNull View view) {
        int i10 = p.j.f144826o3;
        FrameLayout frameLayout = (FrameLayout) D2.c.a(view, i10);
        if (frameLayout != null) {
            i10 = p.j.f144841p3;
            ImageView imageView = (ImageView) D2.c.a(view, i10);
            if (imageView != null) {
                i10 = p.j.f144738i5;
                FrameLayout frameLayout2 = (FrameLayout) D2.c.a(view, i10);
                if (frameLayout2 != null) {
                    i10 = p.j.f144753j5;
                    ImageView imageView2 = (ImageView) D2.c.a(view, i10);
                    if (imageView2 != null) {
                        i10 = p.j.f144665d7;
                        FrameLayout frameLayout3 = (FrameLayout) D2.c.a(view, i10);
                        if (frameLayout3 != null) {
                            i10 = p.j.f144756j8;
                            ImageView imageView3 = (ImageView) D2.c.a(view, i10);
                            if (imageView3 != null) {
                                i10 = p.j.f144342G9;
                                SearchView searchView = (SearchView) D2.c.a(view, i10);
                                if (searchView != null) {
                                    i10 = p.j.f144412L9;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) D2.c.a(view, i10);
                                    if (constraintLayout != null) {
                                        i10 = p.j.f144496R9;
                                        ImageView imageView4 = (ImageView) D2.c.a(view, i10);
                                        if (imageView4 != null) {
                                            i10 = p.j.f144524T9;
                                            ImageView imageView5 = (ImageView) D2.c.a(view, i10);
                                            if (imageView5 != null) {
                                                i10 = p.j.f144699fb;
                                                TabCountView tabCountView = (TabCountView) D2.c.a(view, i10);
                                                if (tabCountView != null) {
                                                    return new O((LinearLayout) view, frameLayout, imageView, frameLayout2, imageView2, frameLayout3, imageView3, searchView, constraintLayout, imageView4, imageView5, tabCountView);
                                                }
                                            }
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
    public static O c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static O d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145288s3, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public LinearLayout b() {
        return this.f84549a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84549a;
    }
}

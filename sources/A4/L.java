package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.cookiegames.smartcookie.p;

/* JADX INFO: loaded from: classes3.dex */
public final class L implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f84533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f84534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f84535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f84536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f84537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f84538f;

    public L(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout2, @NonNull TextView textView) {
        this.f84533a = linearLayout;
        this.f84534b = imageView;
        this.f84535c = frameLayout;
        this.f84536d = imageView2;
        this.f84537e = linearLayout2;
        this.f84538f = textView;
    }

    @NonNull
    public static L a(@NonNull View view) {
        int i10 = p.j.f144447O2;
        ImageView imageView = (ImageView) D2.c.a(view, i10);
        if (imageView != null) {
            i10 = p.j.f144962x4;
            FrameLayout frameLayout = (FrameLayout) D2.c.a(view, i10);
            if (frameLayout != null) {
                i10 = p.j.f144947w4;
                ImageView imageView2 = (ImageView) D2.c.a(view, i10);
                if (imageView2 != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i10 = p.j.f144372Ib;
                    TextView textView = (TextView) D2.c.a(view, i10);
                    if (textView != null) {
                        return new L(linearLayout, imageView, frameLayout, imageView2, linearLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static L c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static L d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145273p3, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public LinearLayout b() {
        return this.f84533a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84533a;
    }
}

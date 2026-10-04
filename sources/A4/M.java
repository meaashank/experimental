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
public final class M implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f84539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f84540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f84541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f84542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f84543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f84544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f84545g;

    public M(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout2, @NonNull TextView textView) {
        this.f84539a = linearLayout;
        this.f84540b = frameLayout;
        this.f84541c = imageView;
        this.f84542d = frameLayout2;
        this.f84543e = imageView2;
        this.f84544f = linearLayout2;
        this.f84545g = textView;
    }

    @NonNull
    public static M a(@NonNull View view) {
        int i10 = p.j.f144447O2;
        FrameLayout frameLayout = (FrameLayout) D2.c.a(view, i10);
        if (frameLayout != null) {
            i10 = p.j.f144461P2;
            ImageView imageView = (ImageView) D2.c.a(view, i10);
            if (imageView != null) {
                i10 = p.j.f144962x4;
                FrameLayout frameLayout2 = (FrameLayout) D2.c.a(view, i10);
                if (frameLayout2 != null) {
                    i10 = p.j.f144947w4;
                    ImageView imageView2 = (ImageView) D2.c.a(view, i10);
                    if (imageView2 != null) {
                        LinearLayout linearLayout = (LinearLayout) view;
                        i10 = p.j.f144372Ib;
                        TextView textView = (TextView) D2.c.a(view, i10);
                        if (textView != null) {
                            return new M(linearLayout, frameLayout, imageView, frameLayout2, imageView2, linearLayout, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static M c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static M d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145278q3, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public LinearLayout b() {
        return this.f84539a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84539a;
    }
}

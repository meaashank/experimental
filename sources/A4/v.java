package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.cookiegames.smartcookie.p;
import com.google.android.material.slider.Slider;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f84701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final CardView f84702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f84703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f84704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Slider f84705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final Space f84706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f84707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f84708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f84709i;

    public v(@NonNull ConstraintLayout constraintLayout, @NonNull CardView cardView, @NonNull RelativeLayout relativeLayout, @NonNull FrameLayout frameLayout, @NonNull Slider slider, @NonNull Space space, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView) {
        this.f84701a = constraintLayout;
        this.f84702b = cardView;
        this.f84703c = relativeLayout;
        this.f84704d = frameLayout;
        this.f84705e = slider;
        this.f84706f = space;
        this.f84707g = imageView;
        this.f84708h = imageView2;
        this.f84709i = textView;
    }

    @NonNull
    public static v a(@NonNull View view) {
        int i10 = p.j.f144488R1;
        CardView cardView = (CardView) D2.c.a(view, i10);
        if (cardView != null) {
            i10 = p.j.f144280C3;
            RelativeLayout relativeLayout = (RelativeLayout) D2.c.a(view, i10);
            if (relativeLayout != null) {
                i10 = p.j.f144962x4;
                FrameLayout frameLayout = (FrameLayout) D2.c.a(view, i10);
                if (frameLayout != null) {
                    i10 = p.j.f144552V9;
                    Slider slider = (Slider) D2.c.a(view, i10);
                    if (slider != null) {
                        i10 = p.j.f144938va;
                        Space space = (Space) D2.c.a(view, i10);
                        if (space != null) {
                            i10 = p.j.f144714gb;
                            ImageView imageView = (ImageView) D2.c.a(view, i10);
                            if (imageView != null) {
                                i10 = p.j.f144744ib;
                                ImageView imageView2 = (ImageView) D2.c.a(view, i10);
                                if (imageView2 != null) {
                                    i10 = p.j.f144759jb;
                                    TextView textView = (TextView) D2.c.a(view, i10);
                                    if (textView != null) {
                                        return new v((ConstraintLayout) view, cardView, relativeLayout, frameLayout, slider, space, imageView, imageView2, textView);
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
    public static v c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static v d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145131K0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public ConstraintLayout b() {
        return this.f84701a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84701a;
    }
}

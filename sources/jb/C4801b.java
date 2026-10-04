package jb;

import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.prism.lib_google_billing.p;

/* JADX INFO: renamed from: jb.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4801b implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f214249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f214250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f214251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f214252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f214253e;

    public C4801b(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f214249a = constraintLayout;
        this.f214250b = imageView;
        this.f214251c = textView;
        this.f214252d = textView2;
        this.f214253e = textView3;
    }

    @NonNull
    public static C4801b a(@NonNull View view) {
        int i10 = p.h.f191827N2;
        ImageView imageView = (ImageView) c.a(view, i10);
        if (imageView != null) {
            i10 = p.h.f192053n7;
            TextView textView = (TextView) c.a(view, i10);
            if (textView != null) {
                i10 = p.h.f192071p7;
                TextView textView2 = (TextView) c.a(view, i10);
                if (textView2 != null) {
                    i10 = p.h.f192080q7;
                    TextView textView3 = (TextView) c.a(view, i10);
                    if (textView3 != null) {
                        return new C4801b((ConstraintLayout) view, imageView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static C4801b c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static C4801b d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.k.f192291V, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public ConstraintLayout b() {
        return this.f214249a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f214249a;
    }
}

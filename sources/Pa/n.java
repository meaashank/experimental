package Pa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.lib.pfs.d;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f65660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f65661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f65662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f65663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f65664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f65665f;

    public n(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull LinearLayout linearLayout6) {
        this.f65660a = linearLayout;
        this.f65661b = linearLayout2;
        this.f65662c = linearLayout3;
        this.f65663d = linearLayout4;
        this.f65664e = linearLayout5;
        this.f65665f = linearLayout6;
    }

    @NonNull
    public static n a(@NonNull View view) {
        int i10 = d.h.f186780x1;
        LinearLayout linearLayout = (LinearLayout) D2.c.a(view, i10);
        if (linearLayout != null) {
            i10 = d.h.f186762v2;
            LinearLayout linearLayout2 = (LinearLayout) D2.c.a(view, i10);
            if (linearLayout2 != null) {
                LinearLayout linearLayout3 = (LinearLayout) view;
                i10 = d.h.f186438N5;
                LinearLayout linearLayout4 = (LinearLayout) D2.c.a(view, i10);
                if (linearLayout4 != null) {
                    i10 = d.h.f186736s6;
                    LinearLayout linearLayout5 = (LinearLayout) D2.c.a(view, i10);
                    if (linearLayout5 != null) {
                        return new n(linearLayout3, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static n c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static n d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(d.k.f187004o0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public LinearLayout b() {
        return this.f65660a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f65660a;
    }
}

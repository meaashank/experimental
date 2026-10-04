package Pa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.lib.pfs.d;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f65653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f65654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f65655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f65656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f65657e;

    public l(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5) {
        this.f65653a = linearLayout;
        this.f65654b = linearLayout2;
        this.f65655c = linearLayout3;
        this.f65656d = linearLayout4;
        this.f65657e = linearLayout5;
    }

    @NonNull
    public static l a(@NonNull View view) {
        int i10 = d.h.f186780x1;
        LinearLayout linearLayout = (LinearLayout) D2.c.a(view, i10);
        if (linearLayout != null) {
            i10 = d.h.f186762v2;
            LinearLayout linearLayout2 = (LinearLayout) D2.c.a(view, i10);
            if (linearLayout2 != null) {
                LinearLayout linearLayout3 = (LinearLayout) view;
                i10 = d.h.f186736s6;
                LinearLayout linearLayout4 = (LinearLayout) D2.c.a(view, i10);
                if (linearLayout4 != null) {
                    return new l(linearLayout3, linearLayout, linearLayout2, linearLayout3, linearLayout4);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static l c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static l d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(d.k.f186998m0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public LinearLayout b() {
        return this.f65653a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f65653a;
    }
}

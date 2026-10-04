package Pa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.lib.pfs.d;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f65626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f65627b;

    public e(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2) {
        this.f65626a = linearLayout;
        this.f65627b = linearLayout2;
    }

    @NonNull
    public static e a(@NonNull View view) {
        int i10 = d.h.f186800z3;
        LinearLayout linearLayout = (LinearLayout) D2.c.a(view, i10);
        if (linearLayout != null) {
            return new e((LinearLayout) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static e c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static e d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(d.k.f186968c0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public LinearLayout b() {
        return this.f65626a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f65626a;
    }
}

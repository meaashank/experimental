package Pa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.lib.media.ui.widget.dock.FloatingRoundDockLayout;
import com.prism.lib.pfs.d;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final FloatingRoundDockLayout f65636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final FloatingRoundDockLayout f65637b;

    public h(@NonNull FloatingRoundDockLayout floatingRoundDockLayout, @NonNull FloatingRoundDockLayout floatingRoundDockLayout2) {
        this.f65636a = floatingRoundDockLayout;
        this.f65637b = floatingRoundDockLayout2;
    }

    @NonNull
    public static h a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FloatingRoundDockLayout floatingRoundDockLayout = (FloatingRoundDockLayout) view;
        return new h(floatingRoundDockLayout, floatingRoundDockLayout);
    }

    @NonNull
    public static h c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static h d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(d.k.f186983h0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public FloatingRoundDockLayout b() {
        return this.f65636a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f65636a;
    }
}

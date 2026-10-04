package Pa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import com.prism.lib.pfs.d;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f65634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final SwitchCompat f65635b;

    public g(@NonNull FrameLayout frameLayout, @NonNull SwitchCompat switchCompat) {
        this.f65634a = frameLayout;
        this.f65635b = switchCompat;
    }

    @NonNull
    public static g a(@NonNull View view) {
        int i10 = d.h.f186667l7;
        SwitchCompat switchCompat = (SwitchCompat) D2.c.a(view, i10);
        if (switchCompat != null) {
            return new g((FrameLayout) view, switchCompat);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static g c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static g d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(d.k.f186974e0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public FrameLayout b() {
        return this.f65634a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f65634a;
    }
}

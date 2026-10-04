package a4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.cookiegames.smartcookie.p;

/* JADX INFO: loaded from: classes3.dex */
public final class G implements D2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f84518a;

    public G(@NonNull FrameLayout frameLayout) {
        this.f84518a = frameLayout;
    }

    @NonNull
    public static G a(@NonNull View view) {
        if (view != null) {
            return new G((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static G c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static G d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(p.m.f145228g3, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @NonNull
    public FrameLayout b() {
        return this.f84518a;
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.f84518a;
    }
}

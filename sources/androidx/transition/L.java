package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
@e.T(18)
public class L implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewOverlay f117758a;

    public L(@NonNull View view) {
        this.f117758a = view.getOverlay();
    }

    @Override // androidx.transition.M
    public void add(@NonNull Drawable drawable) {
        this.f117758a.add(drawable);
    }

    @Override // androidx.transition.M
    public void remove(@NonNull Drawable drawable) {
        this.f117758a.remove(drawable);
    }
}

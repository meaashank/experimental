package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
@e.T(18)
public class E implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroupOverlay f117728a;

    public E(@NonNull ViewGroup viewGroup) {
        this.f117728a = viewGroup.getOverlay();
    }

    @Override // androidx.transition.M
    public void add(@NonNull Drawable drawable) {
        this.f117728a.add(drawable);
    }

    @Override // androidx.transition.M
    public void remove(@NonNull Drawable drawable) {
        this.f117728a.remove(drawable);
    }

    @Override // androidx.transition.F
    public void add(@NonNull View view) {
        this.f117728a.add(view);
    }

    @Override // androidx.transition.F
    public void remove(@NonNull View view) {
        this.f117728a.remove(view);
    }
}

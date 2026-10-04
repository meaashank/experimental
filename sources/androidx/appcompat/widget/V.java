package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class V extends K {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference<Context> f86242b;

    public V(@NonNull Context context, @NonNull Resources resources) {
        super(resources);
        this.f86242b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.K, android.content.res.Resources
    public Drawable getDrawable(int i10) throws Resources.NotFoundException {
        Drawable drawableA = a(i10);
        Context context = this.f86242b.get();
        if (drawableA != null && context != null) {
            J.h().x(context, i10, drawableA);
        }
        return drawableA;
    }
}

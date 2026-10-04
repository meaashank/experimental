package androidx.transition;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: renamed from: androidx.transition.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2702n {
    public static <T> ObjectAnimator a(T t10, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofObject(t10, property, (TypeConverter) null, path);
    }
}

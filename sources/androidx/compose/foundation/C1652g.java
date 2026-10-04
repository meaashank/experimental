package androidx.compose.foundation;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@e.T(31)
public final class C1652g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C1652g f89117a = new C1652g();

    @InterfaceC4345t
    @NotNull
    public final EdgeEffect a(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    @InterfaceC4345t
    public final float b(@NotNull EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    @InterfaceC4345t
    public final float c(@NotNull EdgeEffect edgeEffect, float f10, float f11) {
        try {
            return edgeEffect.onPullDistance(f10, f11);
        } catch (Throwable unused) {
            edgeEffect.onPull(f10, f11);
            return 0.0f;
        }
    }
}

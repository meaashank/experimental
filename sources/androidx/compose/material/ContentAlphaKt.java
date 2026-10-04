package androidx.compose.material;

import androidx.compose.runtime.AbstractC1885a1;
import androidx.compose.runtime.CompositionLocalKt;
import ed.InterfaceC4376a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class ContentAlphaKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final AbstractC1885a1<Float> f95954a = CompositionLocalKt.e(null, new InterfaceC4376a<Float>() { // from class: androidx.compose.material.ContentAlphaKt$LocalContentAlpha$1
        @NotNull
        public final Float g() {
            return Float.valueOf(1.0f);
        }

        @Override // ed.InterfaceC4376a
        public /* bridge */ /* synthetic */ Float invoke() {
            return Float.valueOf(1.0f);
        }
    }, 1, null);

    @NotNull
    public static final AbstractC1885a1<Float> a() {
        return f95954a;
    }
}

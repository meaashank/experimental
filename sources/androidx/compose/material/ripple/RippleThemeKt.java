package androidx.compose.material.ripple;

import androidx.compose.runtime.AbstractC1885a1;
import androidx.compose.runtime.Y1;
import ed.InterfaceC4376a;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class RippleThemeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final AbstractC1885a1<m> f98846a = new Y1(new InterfaceC4376a<m>() { // from class: androidx.compose.material.ripple.RippleThemeKt$LocalRippleTheme$1
        @NotNull
        public final m g() {
            return b.f98865b;
        }

        @Override // ed.InterfaceC4376a
        public m invoke() {
            return b.f98865b;
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final e f98847b = new e(0.16f, 0.24f, 0.08f, 0.24f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final e f98848c = new e(0.08f, 0.12f, 0.04f, 0.12f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final e f98849d = new e(0.08f, 0.12f, 0.04f, 0.1f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f98850e = "RippleTheme and LocalRippleTheme have been deprecated - they are not compatible with the new ripple implementation using the new Indication APIs that provide notable performance improvements. For a migration guide and background information, please visit developer.android.com";

    @NotNull
    public static final AbstractC1885a1<m> d() {
        return f98846a;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = f98850e)
    public static /* synthetic */ void e() {
    }
}

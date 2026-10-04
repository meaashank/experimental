package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.ui.text.font.InterfaceC2324v;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC4982o(message = "Replaced with PlatformFontLoader during the introduction of async fonts, all usages should be replaced", replaceWith = @InterfaceC4852c0(expression = "PlatformFontLoader", imports = {}))
@androidx.compose.runtime.internal.r(parameters = 0)
public final class H implements InterfaceC2324v.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f103570b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f103571a;

    public H(@NotNull Context context) {
        this.f103571a = context;
    }

    @Override // androidx.compose.ui.text.font.InterfaceC2324v.b
    @InterfaceC4982o(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @InterfaceC4852c0(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Typeface a(@NotNull InterfaceC2324v interfaceC2324v) {
        if (!(interfaceC2324v instanceof androidx.compose.ui.text.font.c0)) {
            throw new IllegalArgumentException("Unknown font type: " + interfaceC2324v);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return J.f103601a.a(this.f103571a, ((androidx.compose.ui.text.font.c0) interfaceC2324v).f104607c);
        }
        Typeface typefaceJ = D0.i.j(this.f103571a, ((androidx.compose.ui.text.font.c0) interfaceC2324v).f104607c);
        kotlin.jvm.internal.G.m(typefaceJ);
        return typefaceJ;
    }
}

package androidx.compose.ui.tooling;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.text.font.InterfaceC2324v;
import androidx.compose.ui.text.font.c0;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class e implements InterfaceC2324v.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f105419b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f105420a;

    public e(@NotNull Context context) {
        this.f105420a = context;
    }

    @Override // androidx.compose.ui.text.font.InterfaceC2324v.b
    @InterfaceC4982o(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @InterfaceC4852c0(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Typeface a(@NotNull InterfaceC2324v interfaceC2324v) {
        if (!(interfaceC2324v instanceof c0) || Build.VERSION.SDK_INT < 26) {
            throw new IllegalArgumentException("Unknown font type: ".concat(interfaceC2324v.getClass().getName()));
        }
        return j.f105424a.a(this.f105420a, (c0) interfaceC2324v);
    }
}

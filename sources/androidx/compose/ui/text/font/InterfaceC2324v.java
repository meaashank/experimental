package androidx.compose.ui.text.font;

import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public interface InterfaceC2324v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f104654a = a.f104656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f104655b = 15000;

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.v$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f104656a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final long f104657b = 15000;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.v$b */
    @InterfaceC4982o(message = "Replaced with FontFamily.Resolver during the introduction of async fonts, all usages should be replaced. Custom subclasses can be converted into a FontFamily.Resolver by calling createFontFamilyResolver(myFontFamilyResolver, context)")
    public interface b {
        @InterfaceC4982o(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @InterfaceC4852c0(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
        @NotNull
        Object a(@NotNull InterfaceC2324v interfaceC2324v);
    }

    int a();

    int b();

    @NotNull
    L getWeight();
}

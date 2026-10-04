package h0;

import android.util.Log;
import androidx.compose.runtime.internal.r;
import java.util.List;
import java.util.Locale;
import kotlin.collections.H;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: h0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@r(parameters = 1)
public final class C4473a implements InterfaceC4482j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f202373a = 0;

    @Override // h0.InterfaceC4482j
    @NotNull
    public Locale a(@NotNull String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (G.g(localeForLanguageTag.toLanguageTag(), "und")) {
            Log.e(C4478f.f202378a, "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtags delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }

    @Override // h0.InterfaceC4482j
    @NotNull
    public C4481i b() {
        return new C4481i((List<C4480h>) H.l(new C4480h(Locale.getDefault())));
    }
}

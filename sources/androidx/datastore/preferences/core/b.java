package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.a;
import dd.j;
import java.util.Arrays;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import w7.i;

/* JADX INFO: loaded from: classes2.dex */
@j(name = "PreferencesFactory")
public final class b {
    @j(name = i.f240159x)
    @NotNull
    public static final a a(@NotNull a.b<?>... pairs) {
        G.p(pairs, "pairs");
        return c((a.b[]) Arrays.copyOf(pairs, pairs.length));
    }

    @j(name = "createEmpty")
    @NotNull
    public static final a b() {
        return new MutablePreferences(null, true, 1, null);
    }

    @j(name = "createMutable")
    @NotNull
    public static final MutablePreferences c(@NotNull a.b<?>... pairs) {
        G.p(pairs, "pairs");
        MutablePreferences mutablePreferences = new MutablePreferences(null, false, 1, null);
        mutablePreferences.m((a.b[]) Arrays.copyOf(pairs, pairs.length));
        return mutablePreferences;
    }
}

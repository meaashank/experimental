package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.a;
import dd.j;
import java.util.Set;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@j(name = "PreferencesKeys")
public final class c {
    @j(name = "booleanKey")
    @NotNull
    public static final a.C0292a<Boolean> a(@NotNull String name) {
        G.p(name, "name");
        return new a.C0292a<>(name);
    }

    @j(name = "doubleKey")
    @NotNull
    public static final a.C0292a<Double> b(@NotNull String name) {
        G.p(name, "name");
        return new a.C0292a<>(name);
    }

    @j(name = "floatKey")
    @NotNull
    public static final a.C0292a<Float> c(@NotNull String name) {
        G.p(name, "name");
        return new a.C0292a<>(name);
    }

    @j(name = "intKey")
    @NotNull
    public static final a.C0292a<Integer> d(@NotNull String name) {
        G.p(name, "name");
        return new a.C0292a<>(name);
    }

    @j(name = "longKey")
    @NotNull
    public static final a.C0292a<Long> e(@NotNull String name) {
        G.p(name, "name");
        return new a.C0292a<>(name);
    }

    @j(name = "stringKey")
    @NotNull
    public static final a.C0292a<String> f(@NotNull String name) {
        G.p(name, "name");
        return new a.C0292a<>(name);
    }

    @j(name = "stringSetKey")
    @NotNull
    public static final a.C0292a<Set<String>> g(@NotNull String name) {
        G.p(name, "name");
        return new a.C0292a<>(name);
    }
}

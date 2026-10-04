package androidx.datastore.preferences.core;

import java.util.Map;
import kotlin.collections.n0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.datastore.preferences.core.a$a, reason: collision with other inner class name */
    public static final class C0292a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f112491a;

        public C0292a(@NotNull String name) {
            G.p(name, "name");
            this.f112491a = name;
        }

        @NotNull
        public final String a() {
            return this.f112491a;
        }

        @NotNull
        public final b<T> b(T t10) {
            return new b<>(this, t10);
        }

        public boolean equals(@Nullable Object obj) {
            if (obj instanceof C0292a) {
                return G.g(this.f112491a, ((C0292a) obj).f112491a);
            }
            return false;
        }

        public int hashCode() {
            return this.f112491a.hashCode();
        }

        @NotNull
        public String toString() {
            return this.f112491a;
        }
    }

    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final C0292a<T> f112492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f112493b;

        public b(@NotNull C0292a<T> key, T t10) {
            G.p(key, "key");
            this.f112492a = key;
            this.f112493b = t10;
        }

        @NotNull
        public final C0292a<T> a() {
            return this.f112492a;
        }

        public final T b() {
            return this.f112493b;
        }
    }

    @NotNull
    public abstract Map<C0292a<?>, Object> a();

    public abstract <T> boolean b(@NotNull C0292a<T> c0292a);

    @Nullable
    public abstract <T> T c(@NotNull C0292a<T> c0292a);

    @NotNull
    public final MutablePreferences d() {
        return new MutablePreferences(n0.J0(a()), false);
    }

    @NotNull
    public final a e() {
        return new MutablePreferences(n0.J0(a()), true);
    }
}

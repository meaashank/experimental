package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.a;
import com.bumptech.glide.load.engine.GlideException;
import ed.l;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.U;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class MutablePreferences extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<a.C0292a<?>, Object> f112479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f112480b;

    /* JADX WARN: Multi-variable type inference failed */
    public MutablePreferences() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @Override // androidx.datastore.preferences.core.a
    @NotNull
    public Map<a.C0292a<?>, Object> a() {
        Map<a.C0292a<?>, Object> mapUnmodifiableMap = Collections.unmodifiableMap(this.f112479a);
        G.o(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        return mapUnmodifiableMap;
    }

    @Override // androidx.datastore.preferences.core.a
    public <T> boolean b(@NotNull a.C0292a<T> key) {
        G.p(key, "key");
        return this.f112479a.containsKey(key);
    }

    @Override // androidx.datastore.preferences.core.a
    @Nullable
    public <T> T c(@NotNull a.C0292a<T> key) {
        G.p(key, "key");
        return (T) this.f112479a.get(key);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof MutablePreferences) {
            return G.g(this.f112479a, ((MutablePreferences) obj).f112479a);
        }
        return false;
    }

    public final void f() {
        if (this.f112480b.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void g() {
        f();
        this.f112479a.clear();
    }

    public final void h() {
        this.f112480b.set(true);
    }

    public int hashCode() {
        return this.f112479a.hashCode();
    }

    @NotNull
    public final Map<a.C0292a<?>, Object> i() {
        return this.f112479a;
    }

    public final void j(@NotNull a.C0292a<?> key) {
        G.p(key, "key");
        f();
        n(key);
    }

    public final void k(@NotNull a.b<?> pair) {
        G.p(pair, "pair");
        f();
        m(pair);
    }

    public final void l(@NotNull a prefs) {
        G.p(prefs, "prefs");
        f();
        this.f112479a.putAll(prefs.a());
    }

    public final void m(@NotNull a.b<?>... pairs) {
        G.p(pairs, "pairs");
        f();
        for (a.b<?> bVar : pairs) {
            p(bVar.f112492a, bVar.f112493b);
        }
    }

    public final <T> T n(@NotNull a.C0292a<T> key) {
        G.p(key, "key");
        f();
        return (T) this.f112479a.remove(key);
    }

    public final <T> void o(@NotNull a.C0292a<T> key, T t10) {
        G.p(key, "key");
        p(key, t10);
    }

    public final void p(@NotNull a.C0292a<?> key, @Nullable Object obj) {
        G.p(key, "key");
        f();
        if (obj == null) {
            n(key);
            return;
        }
        if (!(obj instanceof Set)) {
            this.f112479a.put(key, obj);
            return;
        }
        Map<a.C0292a<?>, Object> map = this.f112479a;
        Set setUnmodifiableSet = Collections.unmodifiableSet(U.f6((Iterable) obj));
        G.o(setUnmodifiableSet, "unmodifiableSet(value.toSet())");
        map.put(key, setUnmodifiableSet);
    }

    @NotNull
    public String toString() {
        return U.r3(this.f112479a.entrySet(), ",\n", "{\n", "\n}", 0, null, new l<Map.Entry<a.C0292a<?>, Object>, CharSequence>() { // from class: androidx.datastore.preferences.core.MutablePreferences.toString.1
            @Override // ed.l
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(@NotNull Map.Entry<a.C0292a<?>, Object> entry) {
                G.p(entry, "entry");
                return GlideException.a.f139488d + entry.getKey().f112491a + " = " + entry.getValue();
            }
        }, 24, null);
    }

    public MutablePreferences(@NotNull Map<a.C0292a<?>, Object> preferencesMap, boolean z10) {
        G.p(preferencesMap, "preferencesMap");
        this.f112479a = preferencesMap;
        this.f112480b = new AtomicBoolean(z10);
    }

    public /* synthetic */ MutablePreferences(Map map, boolean z10, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map, (i10 & 2) != 0 ? true : z10);
    }
}

package androidx.datastore.migrations;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.U;
import kotlin.collections.m0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SharedPreferences f112458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Set<String> f112459b;

    public b(@NotNull SharedPreferences prefs, @Nullable Set<String> set) {
        G.p(prefs, "prefs");
        this.f112458a = prefs;
        this.f112459b = set;
    }

    public static /* synthetic */ String i(b bVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return bVar.h(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Set k(b bVar, String str, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            set = null;
        }
        return bVar.j(str, set);
    }

    public final String a(String str) {
        Set<String> set = this.f112459b;
        if (set == null || set.contains(str)) {
            return str;
        }
        throw new IllegalStateException(G.C("Can't access key outside migration: ", str).toString());
    }

    public final boolean b(@NotNull String key) {
        G.p(key, "key");
        SharedPreferences sharedPreferences = this.f112458a;
        a(key);
        return sharedPreferences.contains(key);
    }

    @NotNull
    public final Map<String, Object> c() {
        Map<String, ?> all = this.f112458a.getAll();
        G.o(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set<String> set = this.f112459b;
            if (set == null ? true : set.contains(key)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(m0.j(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = U.f6((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }

    public final boolean d(@NotNull String key, boolean z10) {
        G.p(key, "key");
        SharedPreferences sharedPreferences = this.f112458a;
        a(key);
        return sharedPreferences.getBoolean(key, z10);
    }

    public final float e(@NotNull String key, float f10) {
        G.p(key, "key");
        SharedPreferences sharedPreferences = this.f112458a;
        a(key);
        return sharedPreferences.getFloat(key, f10);
    }

    public final int f(@NotNull String key, int i10) {
        G.p(key, "key");
        SharedPreferences sharedPreferences = this.f112458a;
        a(key);
        return sharedPreferences.getInt(key, i10);
    }

    public final long g(@NotNull String key, long j10) {
        G.p(key, "key");
        SharedPreferences sharedPreferences = this.f112458a;
        a(key);
        return sharedPreferences.getLong(key, j10);
    }

    @Nullable
    public final String h(@NotNull String key, @Nullable String str) {
        G.p(key, "key");
        SharedPreferences sharedPreferences = this.f112458a;
        a(key);
        return sharedPreferences.getString(key, str);
    }

    @Nullable
    public final Set<String> j(@NotNull String key, @Nullable Set<String> set) {
        G.p(key, "key");
        SharedPreferences sharedPreferences = this.f112458a;
        a(key);
        Set<String> stringSet = sharedPreferences.getStringSet(key, set);
        if (stringSet == null) {
            return null;
        }
        return U.e6(stringSet);
    }
}

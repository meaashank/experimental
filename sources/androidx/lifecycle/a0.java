package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.annotation.RestrictTo;
import androidx.core.os.C2406e;
import androidx.savedstate.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.C4969v;
import kotlinx.coroutines.flow.FlowKt__ShareKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nSavedStateHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,489:1\n361#2,3:490\n364#2,4:494\n1#3:493\n*S KotlinDebug\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n*L\n227#1:490,3\n227#1:494,4\n*E\n"})
public final class a0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f114167g = "values";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f114168h = "keys";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<String, Object> f114170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<String, d.c> f114171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<String, b<?>> f114172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<String, kotlinx.coroutines.flow.j<Object>> f114173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final d.c f114174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f114166f = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Class<? extends Object>[] f114169i = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    public static final class a {
        public a() {
        }

        @dd.o
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final a0 a(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new a0();
                }
                HashMap map = new HashMap();
                for (String key : bundle2.keySet()) {
                    kotlin.jvm.internal.G.o(key, "key");
                    map.put(key, bundle2.get(key));
                }
                return new a0(map);
            }
            ClassLoader classLoader = a0.class.getClassLoader();
            kotlin.jvm.internal.G.m(classLoader);
            bundle.setClassLoader(classLoader);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(a0.f114167g);
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = parcelableArrayList.get(i10);
                kotlin.jvm.internal.G.n(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
            }
            return new a0(linkedHashMap);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final boolean b(@Nullable Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : a0.f114169i) {
                kotlin.jvm.internal.G.m(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        public a(C4969v c4969v) {
        }
    }

    public a0(@NotNull Map<String, ? extends Object> initialState) {
        kotlin.jvm.internal.G.p(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f114170a = linkedHashMap;
        this.f114171b = new LinkedHashMap();
        this.f114172c = new LinkedHashMap();
        this.f114173d = new LinkedHashMap();
        this.f114174e = new d.c() { // from class: androidx.lifecycle.Z
            @Override // androidx.savedstate.d.c
            public final Bundle a() {
                return a0.p(this.f114162a);
            }
        };
        linkedHashMap.putAll(initialState);
    }

    @dd.o
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final a0 g(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
        return f114166f.a(bundle, bundle2);
    }

    public static final Bundle p(a0 this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        for (Map.Entry entry : kotlin.collections.n0.D0(this$0.f114171b).entrySet()) {
            this$0.q((String) entry.getKey(), ((d.c) entry.getValue()).a());
        }
        Set<String> setKeySet = this$0.f114170a.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(this$0.f114170a.get(str));
        }
        return C2406e.b(new Pair("keys", arrayList), new Pair(f114167g, arrayList2));
    }

    @e.I
    public final void e(@NotNull String key) {
        kotlin.jvm.internal.G.p(key, "key");
        this.f114171b.remove(key);
    }

    @e.I
    public final boolean f(@NotNull String key) {
        kotlin.jvm.internal.G.p(key, "key");
        return this.f114170a.containsKey(key);
    }

    @e.I
    @Nullable
    public final <T> T h(@NotNull String key) {
        kotlin.jvm.internal.G.p(key, "key");
        try {
            return (T) this.f114170a.get(key);
        } catch (ClassCastException unused) {
            n(key);
            return null;
        }
    }

    @e.I
    @NotNull
    public final <T> P<T> i(@NotNull String key) {
        kotlin.jvm.internal.G.p(key, "key");
        return k(key, false, null);
    }

    @e.I
    @NotNull
    public final <T> P<T> j(@NotNull String key, T t10) {
        kotlin.jvm.internal.G.p(key, "key");
        return k(key, true, t10);
    }

    public final <T> P<T> k(String str, boolean z10, T t10) {
        b<?> bVar;
        b<?> bVar2 = this.f114172c.get(str);
        b<?> bVar3 = bVar2 instanceof P ? bVar2 : null;
        if (bVar3 != null) {
            return bVar3;
        }
        if (this.f114170a.containsKey(str)) {
            bVar = new b<>(this, str, this.f114170a.get(str));
        } else if (z10) {
            this.f114170a.put(str, t10);
            bVar = new b<>(this, str, t10);
        } else {
            bVar = new b<>(this, str);
        }
        this.f114172c.put(str, bVar);
        return bVar;
    }

    @e.I
    @NotNull
    public final <T> kotlinx.coroutines.flow.u<T> l(@NotNull String key, T t10) {
        kotlin.jvm.internal.G.p(key, "key");
        Map<String, kotlinx.coroutines.flow.j<Object>> map = this.f114173d;
        kotlinx.coroutines.flow.j<Object> jVarA = map.get(key);
        if (jVarA == null) {
            if (!this.f114170a.containsKey(key)) {
                this.f114170a.put(key, t10);
            }
            jVarA = kotlinx.coroutines.flow.v.a(this.f114170a.get(key));
            this.f114173d.put(key, jVarA);
            map.put(key, jVarA);
        }
        return FlowKt__ShareKt.b(jVarA);
    }

    @e.I
    @NotNull
    public final Set<String> m() {
        return z0.C(z0.C(this.f114170a.keySet(), this.f114171b.keySet()), this.f114172c.keySet());
    }

    @e.I
    @Nullable
    public final <T> T n(@NotNull String key) {
        kotlin.jvm.internal.G.p(key, "key");
        T t10 = (T) this.f114170a.remove(key);
        b<?> bVarRemove = this.f114172c.remove(key);
        if (bVarRemove != null) {
            bVarRemove.f114176n = null;
        }
        this.f114173d.remove(key);
        return t10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final d.c o() {
        return this.f114174e;
    }

    @e.I
    public final <T> void q(@NotNull String key, @Nullable T t10) {
        kotlin.jvm.internal.G.p(key, "key");
        if (!f114166f.b(t10)) {
            StringBuilder sb2 = new StringBuilder("Can't put value with type ");
            kotlin.jvm.internal.G.m(t10);
            sb2.append(t10.getClass());
            sb2.append(" into saved state");
            throw new IllegalArgumentException(sb2.toString());
        }
        b<?> bVar = this.f114172c.get(key);
        b<?> bVar2 = bVar instanceof P ? bVar : null;
        if (bVar2 != null) {
            bVar2.r(t10);
        } else {
            this.f114170a.put(key, t10);
        }
        kotlinx.coroutines.flow.j<Object> jVar = this.f114173d.get(key);
        if (jVar == null) {
            return;
        }
        jVar.setValue(t10);
    }

    @e.I
    public final void r(@NotNull String key, @NotNull d.c provider) {
        kotlin.jvm.internal.G.p(key, "key");
        kotlin.jvm.internal.G.p(provider, "provider");
        this.f114171b.put(key, provider);
    }

    public static final class b<T> extends P<T> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        public String f114175m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Nullable
        public a0 f114176n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@Nullable a0 a0Var, @NotNull String key, T t10) {
            super(t10);
            kotlin.jvm.internal.G.p(key, "key");
            this.f114175m = key;
            this.f114176n = a0Var;
        }

        @Override // androidx.lifecycle.P, androidx.lifecycle.K
        public void r(T t10) {
            a0 a0Var = this.f114176n;
            if (a0Var != null) {
                a0Var.f114170a.put(this.f114175m, t10);
                kotlinx.coroutines.flow.j<Object> jVar = a0Var.f114173d.get(this.f114175m);
                if (jVar != null) {
                    jVar.setValue(t10);
                }
            }
            super.r(t10);
        }

        public final void s() {
            this.f114176n = null;
        }

        public b(@Nullable a0 a0Var, @NotNull String key) {
            kotlin.jvm.internal.G.p(key, "key");
            this.f114175m = key;
            this.f114176n = a0Var;
        }
    }

    public a0() {
        this.f114170a = new LinkedHashMap();
        this.f114171b = new LinkedHashMap();
        this.f114172c = new LinkedHashMap();
        this.f114173d = new LinkedHashMap();
        this.f114174e = new d.c() { // from class: androidx.lifecycle.Z
            @Override // androidx.savedstate.d.c
            public final Bundle a() {
                return a0.p(this.f114162a);
            }
        };
    }
}

package androidx.compose.runtime.internal;

import J.u;
import androidx.compose.runtime.A;
import androidx.compose.runtime.E;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.i2;
import java.util.Map;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 1)
public final class PersistentCompositionLocalHashMap extends J.d<A<Object>, i2<Object>> implements PersistentCompositionLocalMap {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final a f99931i = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f99932j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final PersistentCompositionLocalHashMap f99933k;

    @r(parameters = 0)
    public static final class Builder extends J.f<A<Object>, i2<Object>> implements PersistentCompositionLocalMap.Builder {
        public static final int $stable = 8;

        @NotNull
        private PersistentCompositionLocalHashMap map;

        public Builder(@NotNull PersistentCompositionLocalHashMap persistentCompositionLocalHashMap) {
            super(persistentCompositionLocalHashMap);
            this.map = persistentCompositionLocalHashMap;
        }

        public /* bridge */ boolean containsKey(A<Object> a10) {
            return super.containsKey(a10);
        }

        public /* bridge */ boolean containsValue(i2<Object> i2Var) {
            return super.containsValue((Object) i2Var);
        }

        public /* bridge */ i2<Object> get(A<Object> a10) {
            return (i2) super.get(a10);
        }

        @NotNull
        public final PersistentCompositionLocalHashMap getMap$runtime_release() {
            return this.map;
        }

        public /* bridge */ i2<Object> getOrDefault(A<Object> a10, i2<Object> i2Var) {
            return (i2) super.getOrDefault((Object) a10, i2Var);
        }

        public /* bridge */ i2<Object> remove(A<Object> a10) {
            return (i2) super.remove(a10);
        }

        public final void setMap$runtime_release(@NotNull PersistentCompositionLocalHashMap persistentCompositionLocalHashMap) {
            this.map = persistentCompositionLocalHashMap;
        }

        @Override // J.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof A) {
                return containsKey((A<Object>) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof i2) {
                return containsValue((i2<Object>) obj);
            }
            return false;
        }

        @Override // J.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ i2<Object> get(Object obj) {
            if (obj instanceof A) {
                return get((A<Object>) obj);
            }
            return null;
        }

        public final /* bridge */ i2 getOrDefault(Object obj, i2 i2Var) {
            return !(obj instanceof A) ? i2Var : getOrDefault((A<Object>) obj, (i2<Object>) i2Var);
        }

        @Override // J.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ i2<Object> remove(Object obj) {
            if (obj instanceof A) {
                return remove((A<Object>) obj);
            }
            return null;
        }

        @Override // J.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof A) {
                return get((A<Object>) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof A) ? obj2 : getOrDefault((A<Object>) obj, (i2<Object>) obj2);
        }

        @Override // J.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof A) {
                return remove((A<Object>) obj);
            }
            return null;
        }

        @Override // J.f, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
        @NotNull
        /* JADX INFO: renamed from: build, reason: merged with bridge method [inline-methods] */
        public PersistentMap<A<Object>, i2<Object>> build2() {
            Object node$runtime_release = getNode$runtime_release();
            PersistentCompositionLocalHashMap persistentCompositionLocalHashMap = this.map;
            if (node$runtime_release != persistentCompositionLocalHashMap.f53062d) {
                setOwnership(new M.f());
                persistentCompositionLocalHashMap = new PersistentCompositionLocalHashMap(getNode$runtime_release(), size());
            }
            this.map = persistentCompositionLocalHashMap;
            return persistentCompositionLocalHashMap;
        }
    }

    public static final class a {
        public a() {
        }

        public static /* synthetic */ void b() {
        }

        @NotNull
        public final PersistentCompositionLocalHashMap a() {
            return PersistentCompositionLocalHashMap.f99933k;
        }

        public a(C4969v c4969v) {
        }
    }

    static {
        J.u.f53093e.getClass();
        J.u uVar = J.u.f53095g;
        G.n(uVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.ValueHolder<kotlin.Any?>>");
        f99933k = new PersistentCompositionLocalHashMap(uVar, 0);
    }

    public PersistentCompositionLocalHashMap(@NotNull J.u<A<Object>, i2<Object>> uVar, int i10) {
        super(uVar, i10);
    }

    @NotNull
    public Builder D() {
        return new Builder(this);
    }

    public /* bridge */ boolean E(A<Object> a10) {
        return super.containsKey(a10);
    }

    public /* bridge */ boolean F(i2<Object> i2Var) {
        return super.containsValue(i2Var);
    }

    public /* bridge */ i2<Object> G(A<Object> a10) {
        return (i2) super.get(a10);
    }

    public final /* bridge */ i2<Object> H(Object obj) {
        if (obj instanceof A) {
            return (i2) super.get((A) obj);
        }
        return null;
    }

    public /* bridge */ i2<Object> I(A<Object> a10, i2<Object> i2Var) {
        return (i2) super.getOrDefault(a10, i2Var);
    }

    public final /* bridge */ i2 J(Object obj, i2 i2Var) {
        return !(obj instanceof A) ? i2Var : (i2) super.getOrDefault((A) obj, i2Var);
    }

    @Override // androidx.compose.runtime.D
    public <T> T b(@NotNull A<T> a10) {
        return (T) E.c(this, a10);
    }

    @Override // J.d, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentMap.Builder<A<Object>, i2<Object>> builder() {
        return new Builder(this);
    }

    @Override // androidx.compose.runtime.PersistentCompositionLocalMap, androidx.compose.runtime.B
    public Object c(A a10) {
        return E.c(this, a10);
    }

    @Override // J.d, kotlin.collections.AbstractC4863f, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof A) {
            return super.containsKey((A) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractC4863f, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof i2) {
            return super.containsValue((i2) obj);
        }
        return false;
    }

    @Override // J.d, kotlin.collections.AbstractC4863f, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof A) {
            return (i2) super.get((A) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof A) ? obj2 : (i2) super.getOrDefault((A) obj, (i2) obj2);
    }

    @Override // J.d
    /* JADX INFO: renamed from: r */
    public J.f<A<Object>, i2<Object>> builder() {
        return new Builder(this);
    }

    @Override // J.d, H.d
    @NotNull
    public H.e<Map.Entry<A<Object>, i2<Object>>> s() {
        return new J.o(this);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.compose.runtime.PersistentCompositionLocalMap
    @NotNull
    public PersistentCompositionLocalMap y(@NotNull A<Object> a10, @NotNull i2<Object> i2Var) {
        u.b bVarS = this.f53062d.S(a10.hashCode(), a10, i2Var, 0);
        return bVarS == null ? this : new PersistentCompositionLocalHashMap(bVarS.f53101a, this.f53063e + bVarS.f53102b);
    }

    @Override // J.d, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    /* JADX INFO: renamed from: builder, reason: avoid collision after fix types in other method */
    public PersistentMap.Builder<A<Object>, i2<Object>> builder2() {
        return new Builder(this);
    }
}

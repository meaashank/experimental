package kotlin.coroutines;

import androidx.compose.runtime.R0;
import ed.p;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.InterfaceC4887e0;
import kotlin.L0;
import kotlin.coroutines.i;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.3")
@V({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1#2:201\n*E\n"})
public final class CombinedContext implements i, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final i f217669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final i.b f217670b;

    @V({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,200:1\n13471#2,3:201\n*S KotlinDebug\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n*L\n197#1:201,3\n*E\n"})
    public static final class Serialized implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f217671b = new a();
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final i[] f217672a;

        public static final class a {
            public a() {
            }

            public a(C4969v c4969v) {
            }
        }

        public Serialized(@NotNull i[] elements) {
            G.p(elements, "elements");
            this.f217672a = elements;
        }

        private final Object readResolve() {
            i[] iVarArr = this.f217672a;
            i iVarPlus = EmptyCoroutineContext.f217673a;
            for (i iVar : iVarArr) {
                iVarPlus = iVarPlus.plus(iVar);
            }
            return iVarPlus;
        }

        @NotNull
        public final i[] d() {
            return this.f217672a;
        }
    }

    public CombinedContext(@NotNull i left, @NotNull i.b element) {
        G.p(left, "left");
        G.p(element, "element");
        this.f217669a = left;
        this.f217670b = element;
    }

    private final int l() {
        int i10 = 2;
        CombinedContext combinedContext = this;
        while (true) {
            i iVar = combinedContext.f217669a;
            combinedContext = iVar instanceof CombinedContext ? (CombinedContext) iVar : null;
            if (combinedContext == null) {
                return i10;
            }
            i10++;
        }
    }

    public static final String m(String acc, i.b element) {
        G.p(acc, "acc");
        G.p(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + U6.j.f68738d + element;
    }

    public static final L0 p(i[] iVarArr, Ref.IntRef intRef, L0 l02, i.b element) {
        G.p(l02, "<unused var>");
        G.p(element, "element");
        int i10 = intRef.f217902a;
        intRef.f217902a = i10 + 1;
        iVarArr[i10] = element;
        return L0.f217464a;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int iL = l();
        final i[] iVarArr = new i[iL];
        final Ref.IntRef intRef = new Ref.IntRef();
        fold(L0.f217464a, new p() { // from class: kotlin.coroutines.c
            @Override // ed.p
            public final Object invoke(Object obj, Object obj2) {
                return CombinedContext.p(iVarArr, intRef, (L0) obj, (i.b) obj2);
            }
        });
        if (intRef.f217902a == iL) {
            return new Serialized(iVarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CombinedContext)) {
            return false;
        }
        CombinedContext combinedContext = (CombinedContext) obj;
        return combinedContext.l() == l() && combinedContext.j(this);
    }

    @Override // kotlin.coroutines.i
    public <R> R fold(R r10, @NotNull p<? super R, ? super i.b, ? extends R> operation) {
        G.p(operation, "operation");
        return operation.invoke((Object) this.f217669a.fold(r10, operation), this.f217670b);
    }

    @Override // kotlin.coroutines.i
    @Nullable
    public <E extends i.b> E get(@NotNull i.c<E> key) {
        G.p(key, "key");
        CombinedContext combinedContext = this;
        while (true) {
            E e10 = (E) combinedContext.f217670b.get(key);
            if (e10 != null) {
                return e10;
            }
            i iVar = combinedContext.f217669a;
            if (!(iVar instanceof CombinedContext)) {
                return (E) iVar.get(key);
            }
            combinedContext = (CombinedContext) iVar;
        }
    }

    public int hashCode() {
        return this.f217670b.hashCode() + this.f217669a.hashCode();
    }

    public final boolean i(i.b bVar) {
        return G.g(get(bVar.getKey()), bVar);
    }

    public final boolean j(CombinedContext combinedContext) {
        while (i(combinedContext.f217670b)) {
            i iVar = combinedContext.f217669a;
            if (!(iVar instanceof CombinedContext)) {
                G.n(iVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                i.b bVar = (i.b) iVar;
                return G.g(get(bVar.getKey()), bVar);
            }
            combinedContext = (CombinedContext) iVar;
        }
        return false;
    }

    @Override // kotlin.coroutines.i
    @NotNull
    public i minusKey(@NotNull i.c<?> key) {
        G.p(key, "key");
        if (this.f217670b.get(key) != null) {
            return this.f217669a;
        }
        i iVarMinusKey = this.f217669a.minusKey(key);
        return iVarMinusKey == this.f217669a ? this : iVarMinusKey == EmptyCoroutineContext.f217673a ? this.f217670b : new CombinedContext(iVarMinusKey, this.f217670b);
    }

    @Override // kotlin.coroutines.i
    @NotNull
    public /* bridge */ i plus(@NotNull i iVar) {
        return i.a.b(this, iVar);
    }

    @NotNull
    public String toString() {
        return R0.a(new StringBuilder("["), (String) fold("", new d()), ']');
    }
}

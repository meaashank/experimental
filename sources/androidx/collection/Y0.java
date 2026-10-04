package androidx.collection;

import ed.InterfaceC4376a;
import fd.InterfaceC4418a;
import java.util.Iterator;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlin.collections.AbstractC4864f0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Y0 {

    public static final class a extends AbstractC4864f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f86920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ W0<T> f86921b;

        public a(W0<T> w02) {
            this.f86921b = w02;
        }

        public final int b() {
            return this.f86920a;
        }

        public final void d(int i10) {
            this.f86920a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f86920a < this.f86921b.y();
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
        @Override // kotlin.collections.AbstractC4864f0
        public int nextInt() {
            W0<T> w02 = this.f86921b;
            int i10 = this.f86920a;
            this.f86920a = i10 + 1;
            return w02.m(i10);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class b<T> implements Iterator<T>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f86922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ W0<T> f86923b;

        public b(W0<T> w02) {
            this.f86923b = w02;
        }

        public final int b() {
            return this.f86922a;
        }

        public final void d(int i10) {
            this.f86922a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f86922a < this.f86923b.y();
        }

        @Override // java.util.Iterator
        public T next() {
            W0<T> w02 = this.f86923b;
            int i10 = this.f86922a;
            this.f86922a = i10 + 1;
            return w02.z(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> boolean a(@NotNull W0<T> w02, int i10) {
        kotlin.jvm.internal.G.p(w02, "<this>");
        return w02.d(i10);
    }

    public static final <T> void b(@NotNull W0<T> w02, @NotNull ed.p<? super Integer, ? super T, kotlin.L0> action) {
        kotlin.jvm.internal.G.p(w02, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        int iY = w02.y();
        for (int i10 = 0; i10 < iY; i10++) {
            action.invoke(Integer.valueOf(w02.m(i10)), w02.z(i10));
        }
    }

    public static final <T> T c(@NotNull W0<T> w02, int i10, T t10) {
        kotlin.jvm.internal.G.p(w02, "<this>");
        return w02.h(i10, t10);
    }

    public static final <T> T d(@NotNull W0<T> w02, int i10, @NotNull InterfaceC4376a<? extends T> defaultValue) {
        kotlin.jvm.internal.G.p(w02, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        T tG = w02.g(i10);
        return tG == null ? defaultValue.invoke() : tG;
    }

    public static final <T> int e(@NotNull W0<T> w02) {
        kotlin.jvm.internal.G.p(w02, "<this>");
        return w02.y();
    }

    public static final <T> boolean f(@NotNull W0<T> w02) {
        kotlin.jvm.internal.G.p(w02, "<this>");
        return !w02.l();
    }

    @NotNull
    public static final <T> AbstractC4864f0 g(@NotNull W0<T> w02) {
        kotlin.jvm.internal.G.p(w02, "<this>");
        return new a(w02);
    }

    @NotNull
    public static final <T> W0<T> h(@NotNull W0<T> w02, @NotNull W0<T> other) {
        kotlin.jvm.internal.G.p(w02, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        W0<T> w03 = new W0<>(other.y() + w02.y());
        w03.p(w02);
        w03.p(other);
        return w03;
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Replaced with member function. Remove extension import!")
    public static final /* synthetic */ boolean i(W0 w02, int i10, Object obj) {
        kotlin.jvm.internal.G.p(w02, "<this>");
        return w02.s(i10, obj);
    }

    public static final <T> void j(@NotNull W0<T> w02, int i10, T t10) {
        kotlin.jvm.internal.G.p(w02, "<this>");
        w02.n(i10, t10);
    }

    @NotNull
    public static final <T> Iterator<T> k(@NotNull W0<T> w02) {
        kotlin.jvm.internal.G.p(w02, "<this>");
        return new b(w02);
    }
}

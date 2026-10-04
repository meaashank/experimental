package androidx.lifecycle;

import androidx.annotation.CheckResult;
import androidx.lifecycle.Transformations;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlin.L0;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p.InterfaceC5376a;

/* JADX INFO: loaded from: classes2.dex */
@dd.j(name = "Transformations")
public final class Transformations {

    public static final class a implements Q, kotlin.jvm.internal.B {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ed.l f114106a;

        public a(ed.l function) {
            kotlin.jvm.internal.G.p(function, "function");
            this.f114106a = function;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void a(Object obj) {
            this.f114106a.invoke(obj);
        }

        @Override // kotlin.jvm.internal.B
        @NotNull
        public final kotlin.A<?> b() {
            return this.f114106a;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.B)) {
                return kotlin.jvm.internal.G.g(this.f114106a, ((kotlin.jvm.internal.B) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return this.f114106a.hashCode();
        }
    }

    @dd.j(name = "distinctUntilChanged")
    @NotNull
    @CheckResult
    @e.I
    public static final <X> K<X> a(@NotNull K<X> k10) {
        final N n10;
        kotlin.jvm.internal.G.p(k10, "<this>");
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.f217897a = true;
        if (k10.j()) {
            booleanRef.f217897a = false;
            n10 = new N(k10.f());
        } else {
            n10 = new N();
        }
        n10.s(k10, new a(new ed.l<X, L0>() { // from class: androidx.lifecycle.Transformations$distinctUntilChanged$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void e(X x10) {
                X xF = n10.f();
                if (booleanRef.f217897a || ((xF == null && x10 != null) || !(xF == null || xF.equals(x10)))) {
                    booleanRef.f217897a = false;
                    n10.r(x10);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ed.l
            public /* bridge */ /* synthetic */ L0 invoke(Object obj) {
                e(obj);
                return L0.f217464a;
            }
        }));
        return n10;
    }

    @dd.j(name = "map")
    @NotNull
    @CheckResult
    @e.I
    public static final <X, Y> K<Y> b(@NotNull K<X> k10, @NotNull final ed.l<X, Y> transform) {
        kotlin.jvm.internal.G.p(k10, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        final N n10 = k10.j() ? new N(transform.invoke(k10.f())) : new N();
        n10.s(k10, new a(new ed.l<X, L0>() { // from class: androidx.lifecycle.Transformations$map$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            public final void e(X x10) {
                n10.r((Y) transform.invoke(x10));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ed.l
            public /* bridge */ /* synthetic */ L0 invoke(Object obj) {
                e(obj);
                return L0.f217464a;
            }
        }));
        return n10;
    }

    @dd.j(name = "map")
    @CheckResult
    @e.I
    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    public static final /* synthetic */ K c(K k10, final InterfaceC5376a mapFunction) {
        kotlin.jvm.internal.G.p(k10, "<this>");
        kotlin.jvm.internal.G.p(mapFunction, "mapFunction");
        final N n10 = new N();
        n10.s(k10, new a(new ed.l<Object, L0>() { // from class: androidx.lifecycle.Transformations$map$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void e(Object obj) {
                n10.r(mapFunction.apply(obj));
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ L0 invoke(Object obj) {
                e(obj);
                return L0.f217464a;
            }
        }));
        return n10;
    }

    @dd.j(name = "switchMap")
    @NotNull
    @CheckResult
    @e.I
    public static final <X, Y> K<Y> d(@NotNull K<X> k10, @NotNull final ed.l<X, K<Y>> transform) {
        K<Y> kInvoke;
        kotlin.jvm.internal.G.p(k10, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final N n10 = (k10.j() && (kInvoke = transform.invoke(k10.f())) != null && kInvoke.j()) ? new N(kInvoke.f()) : new N();
        n10.s(k10, new a(new ed.l<X, L0>() { // from class: androidx.lifecycle.Transformations$switchMap$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v2, types: [T, androidx.lifecycle.K] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final void e(X x10) {
                ?? r42 = (K) transform.invoke(x10);
                T t10 = objectRef.f217904a;
                if (t10 != r42) {
                    if (t10 != 0) {
                        n10.t((K) t10);
                    }
                    objectRef.f217904a = r42;
                    if (r42 != 0) {
                        final N<Y> n11 = n10;
                        n11.s(r42, new Transformations.a(new ed.l<Y, L0>() { // from class: androidx.lifecycle.Transformations$switchMap$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void e(Y y10) {
                                n11.r(y10);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // ed.l
                            public /* bridge */ /* synthetic */ L0 invoke(Object obj) {
                                e(obj);
                                return L0.f217464a;
                            }
                        }));
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ed.l
            public /* bridge */ /* synthetic */ L0 invoke(Object obj) {
                e(obj);
                return L0.f217464a;
            }
        }));
        return n10;
    }

    @dd.j(name = "switchMap")
    @CheckResult
    @e.I
    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    public static final /* synthetic */ K e(K k10, final InterfaceC5376a switchMapFunction) {
        kotlin.jvm.internal.G.p(k10, "<this>");
        kotlin.jvm.internal.G.p(switchMapFunction, "switchMapFunction");
        final N n10 = new N();
        n10.s(k10, new Q<Object>() { // from class: androidx.lifecycle.Transformations$switchMap$2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public K<Object> f114117a;

            @Override // androidx.lifecycle.Q
            public void a(Object obj) {
                K<Object> kApply = switchMapFunction.apply(obj);
                K<Object> k11 = this.f114117a;
                if (k11 == kApply) {
                    return;
                }
                if (k11 != null) {
                    n10.t(k11);
                }
                this.f114117a = kApply;
                if (kApply != null) {
                    final N<Object> n11 = n10;
                    n11.s(kApply, new Transformations.a(new ed.l<Object, L0>() { // from class: androidx.lifecycle.Transformations$switchMap$2$onChanged$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void e(Object obj2) {
                            n11.r(obj2);
                        }

                        @Override // ed.l
                        public /* bridge */ /* synthetic */ L0 invoke(Object obj2) {
                            e(obj2);
                            return L0.f217464a;
                        }
                    }));
                }
            }

            @Nullable
            public final K<Object> b() {
                return this.f114117a;
            }

            public final void c(@Nullable K<Object> k11) {
                this.f114117a = k11;
            }
        });
        return n10;
    }
}

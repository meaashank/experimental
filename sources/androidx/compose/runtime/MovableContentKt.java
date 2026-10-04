package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import h3.C4488b;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes.dex */
public final class MovableContentKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f99142a = 126665345;

    @NotNull
    public static final ed.p<InterfaceC1946s, Integer, kotlin.L0> a(@NotNull final ed.p<? super InterfaceC1946s, ? super Integer, kotlin.L0> pVar) {
        final C1984z0 c1984z0 = new C1984z0(new ComposableLambdaImpl(-1079330685, true, new ed.q<kotlin.L0, InterfaceC1946s, Integer, kotlin.L0>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @InterfaceC1917i
            public final void e(@NotNull kotlin.L0 l02, @Nullable InterfaceC1946s interfaceC1946s, int i10) {
                if ((i10 & 17) == 16 && interfaceC1946s.c()) {
                    interfaceC1946s.o();
                    return;
                }
                if (C1968u.c0()) {
                    C1968u.p0(-1079330685, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:37)");
                }
                pVar.invoke(interfaceC1946s, 0);
                if (C1968u.c0()) {
                    C1968u.o0();
                }
            }

            @Override // ed.q
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(kotlin.L0 l02, InterfaceC1946s interfaceC1946s, Integer num) {
                e(l02, interfaceC1946s, num.intValue());
                return kotlin.L0.f217464a;
            }
        }));
        return new ComposableLambdaImpl(-642339857, true, new ed.p<InterfaceC1946s, Integer, kotlin.L0>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @InterfaceC1917i
            public final void e(@Nullable InterfaceC1946s interfaceC1946s, int i10) {
                if ((i10 & 3) == 2 && interfaceC1946s.c()) {
                    interfaceC1946s.o();
                    return;
                }
                if (C1968u.c0()) {
                    C1968u.p0(-642339857, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:39)");
                }
                interfaceC1946s.U(c1984z0, kotlin.L0.f217464a);
                if (C1968u.c0()) {
                    C1968u.o0();
                }
            }

            @Override // ed.p
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(InterfaceC1946s interfaceC1946s, Integer num) {
                e(interfaceC1946s, num.intValue());
                return kotlin.L0.f217464a;
            }
        });
    }

    @NotNull
    public static final <P> ed.q<P, InterfaceC1946s, Integer, kotlin.L0> b(@NotNull ed.q<? super P, ? super InterfaceC1946s, ? super Integer, kotlin.L0> qVar) {
        final C1984z0 c1984z0 = new C1984z0(qVar);
        return new ComposableLambdaImpl(-434707029, true, new ed.q<P, InterfaceC1946s, Integer, kotlin.L0>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @InterfaceC1917i
            public final void e(P p10, @Nullable InterfaceC1946s interfaceC1946s, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? interfaceC1946s.x(p10) : interfaceC1946s.c0(p10) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && interfaceC1946s.c()) {
                    interfaceC1946s.o();
                    return;
                }
                if (C1968u.c0()) {
                    C1968u.p0(-434707029, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:64)");
                }
                interfaceC1946s.U(c1984z0, p10);
                if (C1968u.c0()) {
                    C1968u.o0();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ed.q
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(Object obj, InterfaceC1946s interfaceC1946s, Integer num) {
                e(obj, interfaceC1946s, num.intValue());
                return kotlin.L0.f217464a;
            }
        });
    }

    @NotNull
    public static final <P1, P2> ed.r<P1, P2, InterfaceC1946s, Integer, kotlin.L0> c(@NotNull final ed.r<? super P1, ? super P2, ? super InterfaceC1946s, ? super Integer, kotlin.L0> rVar) {
        final C1984z0 c1984z0 = new C1984z0(new ComposableLambdaImpl(1849814513, true, new ed.q<Pair<? extends P1, ? extends P2>, InterfaceC1946s, Integer, kotlin.L0>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

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
            @InterfaceC1917i
            public final void e(@NotNull Pair<? extends P1, ? extends P2> pair, @Nullable InterfaceC1946s interfaceC1946s, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? interfaceC1946s.x(pair) : interfaceC1946s.c0(pair) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && interfaceC1946s.c()) {
                    interfaceC1946s.o();
                    return;
                }
                if (C1968u.c0()) {
                    C1968u.p0(1849814513, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:87)");
                }
                rVar.x(pair.f217467a, pair.f217468b, interfaceC1946s, 0);
                if (C1968u.c0()) {
                    C1968u.o0();
                }
            }

            @Override // ed.q
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(Object obj, InterfaceC1946s interfaceC1946s, Integer num) {
                e((Pair) obj, interfaceC1946s, num.intValue());
                return kotlin.L0.f217464a;
            }
        }));
        return new ComposableLambdaImpl(-1200019734, true, new ed.r<P1, P2, InterfaceC1946s, Integer, kotlin.L0>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @InterfaceC1917i
            public final void e(P1 p12, P2 p22, @Nullable InterfaceC1946s interfaceC1946s, int i10) {
                int i11;
                if ((i10 & 6) == 0) {
                    i11 = ((i10 & 8) == 0 ? interfaceC1946s.x(p12) : interfaceC1946s.c0(p12) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 48) == 0) {
                    i11 |= (i10 & 64) == 0 ? interfaceC1946s.x(p22) : interfaceC1946s.c0(p22) ? 32 : 16;
                }
                if ((i11 & Opcodes.I2S) == 146 && interfaceC1946s.c()) {
                    interfaceC1946s.o();
                    return;
                }
                if (C1968u.c0()) {
                    C1968u.p0(-1200019734, i11, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:89)");
                }
                interfaceC1946s.U(c1984z0, new Pair(p12, p22));
                if (C1968u.c0()) {
                    C1968u.o0();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ed.r
            public /* bridge */ /* synthetic */ kotlin.L0 x(Object obj, Object obj2, InterfaceC1946s interfaceC1946s, Integer num) {
                e(obj, obj2, interfaceC1946s, num.intValue());
                return kotlin.L0.f217464a;
            }
        });
    }

    @NotNull
    public static final <P1, P2, P3> ed.s<P1, P2, P3, InterfaceC1946s, Integer, kotlin.L0> d(@NotNull final ed.s<? super P1, ? super P2, ? super P3, ? super InterfaceC1946s, ? super Integer, kotlin.L0> sVar) {
        final C1984z0 c1984z0 = new C1984z0(new ComposableLambdaImpl(-284417101, true, new ed.q<Pair<? extends Pair<? extends P1, ? extends P2>, ? extends P3>, InterfaceC1946s, Integer, kotlin.L0>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            /* JADX WARN: Multi-variable type inference failed */
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
            @InterfaceC1917i
            public final void e(@NotNull Pair<? extends Pair<? extends P1, ? extends P2>, ? extends P3> pair, @Nullable InterfaceC1946s interfaceC1946s, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? interfaceC1946s.x(pair) : interfaceC1946s.c0(pair) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && interfaceC1946s.c()) {
                    interfaceC1946s.o();
                    return;
                }
                if (C1968u.c0()) {
                    C1968u.p0(-284417101, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:115)");
                }
                ed.s<P1, P2, P3, InterfaceC1946s, Integer, kotlin.L0> sVar2 = sVar;
                Pair pair2 = (Pair) pair.f217467a;
                sVar2.p(pair2.f217467a, pair2.f217468b, pair.f217468b, interfaceC1946s, 0);
                if (C1968u.c0()) {
                    C1968u.o0();
                }
            }

            @Override // ed.q
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(Object obj, InterfaceC1946s interfaceC1946s, Integer num) {
                e((Pair) obj, interfaceC1946s, num.intValue());
                return kotlin.L0.f217464a;
            }
        }));
        return new ComposableLambdaImpl(-1083870185, true, new ed.s<P1, P2, P3, InterfaceC1946s, Integer, kotlin.L0>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(5);
            }

            @InterfaceC1917i
            public final void e(P1 p12, P2 p22, P3 p32, @Nullable InterfaceC1946s interfaceC1946s, int i10) {
                int i11;
                if ((i10 & 6) == 0) {
                    i11 = ((i10 & 8) == 0 ? interfaceC1946s.x(p12) : interfaceC1946s.c0(p12) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 48) == 0) {
                    i11 |= (i10 & 64) == 0 ? interfaceC1946s.x(p22) : interfaceC1946s.c0(p22) ? 32 : 16;
                }
                if ((i10 & C4488b.f202390b) == 0) {
                    i11 |= (i10 & 512) == 0 ? interfaceC1946s.x(p32) : interfaceC1946s.c0(p32) ? 256 : 128;
                }
                if ((i11 & 1171) == 1170 && interfaceC1946s.c()) {
                    interfaceC1946s.o();
                    return;
                }
                if (C1968u.c0()) {
                    C1968u.p0(-1083870185, i11, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:118)");
                }
                interfaceC1946s.U(c1984z0, new Pair(new Pair(p12, p22), p32));
                if (C1968u.c0()) {
                    C1968u.o0();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ed.s
            public /* bridge */ /* synthetic */ kotlin.L0 p(Object obj, Object obj2, Object obj3, InterfaceC1946s interfaceC1946s, Integer num) {
                e(obj, obj2, obj3, interfaceC1946s, num.intValue());
                return kotlin.L0.f217464a;
            }
        });
    }

    @NotNull
    public static final <P1, P2, P3, P4> ed.t<P1, P2, P3, P4, InterfaceC1946s, Integer, kotlin.L0> e(@NotNull final ed.t<? super P1, ? super P2, ? super P3, ? super P4, ? super InterfaceC1946s, ? super Integer, kotlin.L0> tVar) {
        final C1984z0 c1984z0 = new C1984z0(new ComposableLambdaImpl(1876318581, true, new ed.q<Pair<? extends Pair<? extends P1, ? extends P2>, ? extends Pair<? extends P3, ? extends P4>>, InterfaceC1946s, Integer, kotlin.L0>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            /* JADX WARN: Multi-variable type inference failed */
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
            @InterfaceC1917i
            public final void e(@NotNull Pair<? extends Pair<? extends P1, ? extends P2>, ? extends Pair<? extends P3, ? extends P4>> pair, @Nullable InterfaceC1946s interfaceC1946s, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? interfaceC1946s.x(pair) : interfaceC1946s.c0(pair) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && interfaceC1946s.c()) {
                    interfaceC1946s.o();
                    return;
                }
                if (C1968u.c0()) {
                    C1968u.p0(1876318581, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:144)");
                }
                ed.t<P1, P2, P3, P4, InterfaceC1946s, Integer, kotlin.L0> tVar2 = tVar;
                Pair pair2 = (Pair) pair.f217467a;
                A a10 = pair2.f217467a;
                B b10 = pair2.f217468b;
                Pair pair3 = (Pair) pair.f217468b;
                tVar2.F(a10, b10, pair3.f217467a, pair3.f217468b, interfaceC1946s, 0);
                if (C1968u.c0()) {
                    C1968u.o0();
                }
            }

            @Override // ed.q
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(Object obj, InterfaceC1946s interfaceC1946s, Integer num) {
                e((Pair) obj, interfaceC1946s, num.intValue());
                return kotlin.L0.f217464a;
            }
        }));
        return new ComposableLambdaImpl(-1741877681, true, new ed.t<P1, P2, P3, P4, InterfaceC1946s, Integer, kotlin.L0>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(6);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ed.t
            public /* bridge */ /* synthetic */ kotlin.L0 F(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC1946s interfaceC1946s, Integer num) {
                e(obj, obj2, obj3, obj4, interfaceC1946s, num.intValue());
                return kotlin.L0.f217464a;
            }

            @InterfaceC1917i
            public final void e(P1 p12, P2 p22, P3 p32, P4 p42, @Nullable InterfaceC1946s interfaceC1946s, int i10) {
                int i11;
                if ((i10 & 6) == 0) {
                    i11 = ((i10 & 8) == 0 ? interfaceC1946s.x(p12) : interfaceC1946s.c0(p12) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 48) == 0) {
                    i11 |= (i10 & 64) == 0 ? interfaceC1946s.x(p22) : interfaceC1946s.c0(p22) ? 32 : 16;
                }
                if ((i10 & C4488b.f202390b) == 0) {
                    i11 |= (i10 & 512) == 0 ? interfaceC1946s.x(p32) : interfaceC1946s.c0(p32) ? 256 : 128;
                }
                if ((i10 & 3072) == 0) {
                    i11 |= (i10 & 4096) == 0 ? interfaceC1946s.x(p42) : interfaceC1946s.c0(p42) ? 2048 : 1024;
                }
                if ((i11 & 9363) == 9362 && interfaceC1946s.c()) {
                    interfaceC1946s.o();
                    return;
                }
                if (C1968u.c0()) {
                    C1968u.p0(-1741877681, i11, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:147)");
                }
                interfaceC1946s.U(c1984z0, new Pair(new Pair(p12, p22), new Pair(p32, p42)));
                if (C1968u.c0()) {
                    C1968u.o0();
                }
            }
        });
    }

    @InterfaceC1920j(scheme = "[0[0]:[_]]")
    @NotNull
    public static final <R> ed.q<R, InterfaceC1946s, Integer, kotlin.L0> f(@NotNull final ed.q<? super R, ? super InterfaceC1946s, ? super Integer, kotlin.L0> qVar) {
        final C1984z0 c1984z0 = new C1984z0(new ComposableLambdaImpl(250838178, true, new ed.q<R, InterfaceC1946s, Integer, kotlin.L0>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @InterfaceC1917i
            public final void e(R r10, @Nullable InterfaceC1946s interfaceC1946s, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? interfaceC1946s.x(r10) : interfaceC1946s.c0(r10) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && interfaceC1946s.c()) {
                    interfaceC1946s.o();
                    return;
                }
                if (C1968u.c0()) {
                    C1968u.p0(250838178, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:170)");
                }
                qVar.invoke(r10, interfaceC1946s, Integer.valueOf(i10 & 14));
                if (C1968u.c0()) {
                    C1968u.o0();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ed.q
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(Object obj, InterfaceC1946s interfaceC1946s, Integer num) {
                e(obj, interfaceC1946s, num.intValue());
                return kotlin.L0.f217464a;
            }
        }));
        return new ComposableLambdaImpl(506997506, true, new ed.q<R, InterfaceC1946s, Integer, kotlin.L0>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @InterfaceC1917i
            public final void e(R r10, @Nullable InterfaceC1946s interfaceC1946s, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? interfaceC1946s.x(r10) : interfaceC1946s.c0(r10) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && interfaceC1946s.c()) {
                    interfaceC1946s.o();
                    return;
                }
                if (C1968u.c0()) {
                    C1968u.p0(506997506, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:172)");
                }
                interfaceC1946s.U(c1984z0, r10);
                if (C1968u.c0()) {
                    C1968u.o0();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ed.q
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(Object obj, InterfaceC1946s interfaceC1946s, Integer num) {
                e(obj, interfaceC1946s, num.intValue());
                return kotlin.L0.f217464a;
            }
        });
    }

    @NotNull
    public static final <R, P> ed.r<R, P, InterfaceC1946s, Integer, kotlin.L0> g(@NotNull final ed.r<? super R, ? super P, ? super InterfaceC1946s, ? super Integer, kotlin.L0> rVar) {
        final C1984z0 c1984z0 = new C1984z0(new ComposableLambdaImpl(812082854, true, new ed.q<Pair<? extends R, ? extends P>, InterfaceC1946s, Integer, kotlin.L0>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

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
            @InterfaceC1917i
            public final void e(@NotNull Pair<? extends R, ? extends P> pair, @Nullable InterfaceC1946s interfaceC1946s, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? interfaceC1946s.x(pair) : interfaceC1946s.c0(pair) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && interfaceC1946s.c()) {
                    interfaceC1946s.o();
                    return;
                }
                if (C1968u.c0()) {
                    C1968u.p0(812082854, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:197)");
                }
                rVar.x(pair.f217467a, pair.f217468b, interfaceC1946s, 0);
                if (C1968u.c0()) {
                    C1968u.o0();
                }
            }

            @Override // ed.q
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(Object obj, InterfaceC1946s interfaceC1946s, Integer num) {
                e((Pair) obj, interfaceC1946s, num.intValue());
                return kotlin.L0.f217464a;
            }
        }));
        return new ComposableLambdaImpl(627354118, true, new ed.r<R, P, InterfaceC1946s, Integer, kotlin.L0>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @InterfaceC1917i
            public final void e(R r10, P p10, @Nullable InterfaceC1946s interfaceC1946s, int i10) {
                int i11;
                if ((i10 & 6) == 0) {
                    i11 = ((i10 & 8) == 0 ? interfaceC1946s.x(r10) : interfaceC1946s.c0(r10) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 48) == 0) {
                    i11 |= (i10 & 64) == 0 ? interfaceC1946s.x(p10) : interfaceC1946s.c0(p10) ? 32 : 16;
                }
                if ((i11 & Opcodes.I2S) == 146 && interfaceC1946s.c()) {
                    interfaceC1946s.o();
                    return;
                }
                if (C1968u.c0()) {
                    C1968u.p0(627354118, i11, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:199)");
                }
                interfaceC1946s.U(c1984z0, new Pair(r10, p10));
                if (C1968u.c0()) {
                    C1968u.o0();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ed.r
            public /* bridge */ /* synthetic */ kotlin.L0 x(Object obj, Object obj2, InterfaceC1946s interfaceC1946s, Integer num) {
                e(obj, obj2, interfaceC1946s, num.intValue());
                return kotlin.L0.f217464a;
            }
        });
    }

    @NotNull
    public static final <R, P1, P2> ed.s<R, P1, P2, InterfaceC1946s, Integer, kotlin.L0> h(@NotNull final ed.s<? super R, ? super P1, ? super P2, ? super InterfaceC1946s, ? super Integer, kotlin.L0> sVar) {
        final C1984z0 c1984z0 = new C1984z0(new ComposableLambdaImpl(-1322148760, true, new ed.q<Pair<? extends Pair<? extends R, ? extends P1>, ? extends P2>, InterfaceC1946s, Integer, kotlin.L0>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            /* JADX WARN: Multi-variable type inference failed */
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
            @InterfaceC1917i
            public final void e(@NotNull Pair<? extends Pair<? extends R, ? extends P1>, ? extends P2> pair, @Nullable InterfaceC1946s interfaceC1946s, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? interfaceC1946s.x(pair) : interfaceC1946s.c0(pair) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && interfaceC1946s.c()) {
                    interfaceC1946s.o();
                    return;
                }
                if (C1968u.c0()) {
                    C1968u.p0(-1322148760, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:225)");
                }
                ed.s<R, P1, P2, InterfaceC1946s, Integer, kotlin.L0> sVar2 = sVar;
                Pair pair2 = (Pair) pair.f217467a;
                sVar2.p(pair2.f217467a, pair2.f217468b, pair.f217468b, interfaceC1946s, 0);
                if (C1968u.c0()) {
                    C1968u.o0();
                }
            }

            @Override // ed.q
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(Object obj, InterfaceC1946s interfaceC1946s, Integer num) {
                e((Pair) obj, interfaceC1946s, num.intValue());
                return kotlin.L0.f217464a;
            }
        }));
        return new ComposableLambdaImpl(583402949, true, new ed.s<R, P1, P2, InterfaceC1946s, Integer, kotlin.L0>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(5);
            }

            @InterfaceC1917i
            public final void e(R r10, P1 p12, P2 p22, @Nullable InterfaceC1946s interfaceC1946s, int i10) {
                int i11;
                if ((i10 & 6) == 0) {
                    i11 = ((i10 & 8) == 0 ? interfaceC1946s.x(r10) : interfaceC1946s.c0(r10) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 48) == 0) {
                    i11 |= (i10 & 64) == 0 ? interfaceC1946s.x(p12) : interfaceC1946s.c0(p12) ? 32 : 16;
                }
                if ((i10 & C4488b.f202390b) == 0) {
                    i11 |= (i10 & 512) == 0 ? interfaceC1946s.x(p22) : interfaceC1946s.c0(p22) ? 256 : 128;
                }
                if ((i11 & 1171) == 1170 && interfaceC1946s.c()) {
                    interfaceC1946s.o();
                    return;
                }
                if (C1968u.c0()) {
                    C1968u.p0(583402949, i11, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:228)");
                }
                interfaceC1946s.U(c1984z0, new Pair(new Pair(r10, p12), p22));
                if (C1968u.c0()) {
                    C1968u.o0();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ed.s
            public /* bridge */ /* synthetic */ kotlin.L0 p(Object obj, Object obj2, Object obj3, InterfaceC1946s interfaceC1946s, Integer num) {
                e(obj, obj2, obj3, interfaceC1946s, num.intValue());
                return kotlin.L0.f217464a;
            }
        });
    }

    @NotNull
    public static final <R, P1, P2, P3> ed.t<R, P1, P2, P3, InterfaceC1946s, Integer, kotlin.L0> i(@NotNull final ed.t<? super R, ? super P1, ? super P2, ? super P3, ? super InterfaceC1946s, ? super Integer, kotlin.L0> tVar) {
        final C1984z0 c1984z0 = new C1984z0(new ComposableLambdaImpl(838586922, true, new ed.q<Pair<? extends Pair<? extends R, ? extends P1>, ? extends Pair<? extends P2, ? extends P3>>, InterfaceC1946s, Integer, kotlin.L0>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            /* JADX WARN: Multi-variable type inference failed */
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
            @InterfaceC1917i
            public final void e(@NotNull Pair<? extends Pair<? extends R, ? extends P1>, ? extends Pair<? extends P2, ? extends P3>> pair, @Nullable InterfaceC1946s interfaceC1946s, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? interfaceC1946s.x(pair) : interfaceC1946s.c0(pair) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && interfaceC1946s.c()) {
                    interfaceC1946s.o();
                    return;
                }
                if (C1968u.c0()) {
                    C1968u.p0(838586922, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:254)");
                }
                ed.t<R, P1, P2, P3, InterfaceC1946s, Integer, kotlin.L0> tVar2 = tVar;
                Pair pair2 = (Pair) pair.f217467a;
                A a10 = pair2.f217467a;
                B b10 = pair2.f217468b;
                Pair pair3 = (Pair) pair.f217468b;
                tVar2.F(a10, b10, pair3.f217467a, pair3.f217468b, interfaceC1946s, 0);
                if (C1968u.c0()) {
                    C1968u.o0();
                }
            }

            @Override // ed.q
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(Object obj, InterfaceC1946s interfaceC1946s, Integer num) {
                e((Pair) obj, interfaceC1946s, num.intValue());
                return kotlin.L0.f217464a;
            }
        }));
        return new ComposableLambdaImpl(1468683306, true, new ed.t<R, P1, P2, P3, InterfaceC1946s, Integer, kotlin.L0>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(6);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ed.t
            public /* bridge */ /* synthetic */ kotlin.L0 F(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC1946s interfaceC1946s, Integer num) {
                e(obj, obj2, obj3, obj4, interfaceC1946s, num.intValue());
                return kotlin.L0.f217464a;
            }

            @InterfaceC1917i
            public final void e(R r10, P1 p12, P2 p22, P3 p32, @Nullable InterfaceC1946s interfaceC1946s, int i10) {
                int i11;
                if ((i10 & 6) == 0) {
                    i11 = ((i10 & 8) == 0 ? interfaceC1946s.x(r10) : interfaceC1946s.c0(r10) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 48) == 0) {
                    i11 |= (i10 & 64) == 0 ? interfaceC1946s.x(p12) : interfaceC1946s.c0(p12) ? 32 : 16;
                }
                if ((i10 & C4488b.f202390b) == 0) {
                    i11 |= (i10 & 512) == 0 ? interfaceC1946s.x(p22) : interfaceC1946s.c0(p22) ? 256 : 128;
                }
                if ((i10 & 3072) == 0) {
                    i11 |= (i10 & 4096) == 0 ? interfaceC1946s.x(p32) : interfaceC1946s.c0(p32) ? 2048 : 1024;
                }
                if ((i11 & 9363) == 9362 && interfaceC1946s.c()) {
                    interfaceC1946s.o();
                    return;
                }
                if (C1968u.c0()) {
                    C1968u.p0(1468683306, i11, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:257)");
                }
                interfaceC1946s.U(c1984z0, new Pair(new Pair(r10, p12), new Pair(p22, p32)));
                if (C1968u.c0()) {
                    C1968u.o0();
                }
            }
        });
    }
}

package kotlinx.coroutines.rx3;

import java.util.NoSuchElementException;
import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.C5102o;
import kotlinx.coroutines.InterfaceC5100n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zc.F;
import zc.I;
import zc.InterfaceC5888e;
import zc.InterfaceC5891h;
import zc.T;
import zc.a0;
import zc.d0;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nRxAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RxAwait.kt\nkotlinx/coroutines/rx3/RxAwaitKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,274:1\n318#2,11:275\n318#2,11:286\n318#2,11:297\n318#2,11:308\n*S KotlinDebug\n*F\n+ 1 RxAwait.kt\nkotlinx/coroutines/rx3/RxAwaitKt\n*L\n21#1:275,11\n40#1:286,11\n117#1:297,11\n219#1:308,11\n*E\n"})
public final class RxAwaitKt {

    public static final class a implements InterfaceC5888e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5100n<L0> f220544a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC5100n<? super L0> interfaceC5100n) {
            this.f220544a = interfaceC5100n;
        }

        @Override // zc.InterfaceC5888e
        public void onComplete() {
            this.f220544a.resumeWith(L0.f217464a);
        }

        @Override // zc.InterfaceC5888e
        public void onError(@NotNull Throwable th) {
            this.f220544a.resumeWith(C4885d0.a(th));
        }

        @Override // zc.InterfaceC5888e
        public void onSubscribe(@NotNull io.reactivex.rxjava3.disposables.d dVar) {
            RxAwaitKt.p(this.f220544a, dVar);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class b<T> implements a0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5100n<T> f220561a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC5100n<? super T> interfaceC5100n) {
            this.f220561a = interfaceC5100n;
        }

        @Override // zc.a0, zc.InterfaceC5888e
        public void onError(@NotNull Throwable th) {
            this.f220561a.resumeWith(C4885d0.a(th));
        }

        @Override // zc.a0, zc.InterfaceC5888e
        public void onSubscribe(@NotNull io.reactivex.rxjava3.disposables.d dVar) {
            RxAwaitKt.p(this.f220561a, dVar);
        }

        @Override // zc.a0
        public void onSuccess(@NotNull T t10) {
            this.f220561a.resumeWith(t10);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class c<T> implements F<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5100n<T> f220562a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(InterfaceC5100n<? super T> interfaceC5100n) {
            this.f220562a = interfaceC5100n;
        }

        @Override // zc.F, zc.InterfaceC5888e
        public void onComplete() {
            this.f220562a.resumeWith(null);
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(@NotNull Throwable th) {
            this.f220562a.resumeWith(C4885d0.a(th));
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onSubscribe(@NotNull io.reactivex.rxjava3.disposables.d dVar) {
            RxAwaitKt.p(this.f220562a, dVar);
        }

        @Override // zc.F, zc.a0
        public void onSuccess(@NotNull T t10) {
            this.f220562a.resumeWith(t10);
        }
    }

    @Nullable
    public static final Object b(@NotNull InterfaceC5891h interfaceC5891h, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        C5102o c5102o = new C5102o(IntrinsicsKt__IntrinsicsJvmKt.e(eVar), 1);
        c5102o.n0();
        interfaceC5891h.d(new a(c5102o));
        Object objZ = c5102o.z();
        return objZ == CoroutineSingletons.COROUTINE_SUSPENDED ? objZ : L0.f217464a;
    }

    @Nullable
    public static final <T> Object d(@NotNull d0<T> d0Var, @NotNull kotlin.coroutines.e<? super T> eVar) {
        C5102o c5102o = new C5102o(IntrinsicsKt__IntrinsicsJvmKt.e(eVar), 1);
        c5102o.n0();
        d0Var.d(new b(c5102o));
        Object objZ = c5102o.z();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objZ;
    }

    @Nullable
    public static final <T> Object e(@NotNull T<T> t10, @NotNull kotlin.coroutines.e<? super T> eVar) {
        Object objK = k(t10, Mode.FIRST, null, eVar, 2, null);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objK;
    }

    @Nullable
    public static final <T> Object f(@NotNull T<T> t10, T t11, @NotNull kotlin.coroutines.e<? super T> eVar) {
        Object objJ = j(t10, Mode.FIRST_OR_DEFAULT, t11, eVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object g(@org.jetbrains.annotations.NotNull zc.T<T> r7, @org.jetbrains.annotations.NotNull ed.InterfaceC4376a<? extends T> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.rx3.RxAwaitKt$awaitFirstOrElse$1
            if (r0 == 0) goto L14
            r0 = r9
            kotlinx.coroutines.rx3.RxAwaitKt$awaitFirstOrElse$1 r0 = (kotlinx.coroutines.rx3.RxAwaitKt$awaitFirstOrElse$1) r0
            int r1 = r0.f220547c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f220547c = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            kotlinx.coroutines.rx3.RxAwaitKt$awaitFirstOrElse$1 r0 = new kotlinx.coroutines.rx3.RxAwaitKt$awaitFirstOrElse$1
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.f220546b
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.f220547c
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r7 = r4.f220545a
            r8 = r7
            ed.a r8 = (ed.InterfaceC4376a) r8
            kotlin.C4885d0.n(r9)
            goto L4b
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.C4885d0.n(r9)
            r9 = r2
            kotlinx.coroutines.rx3.Mode r2 = kotlinx.coroutines.rx3.Mode.FIRST_OR_DEFAULT
            r4.f220545a = r8
            r4.f220547c = r9
            r3 = 0
            r5 = 2
            r6 = 0
            r1 = r7
            java.lang.Object r9 = k(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L4b
            return r0
        L4b:
            if (r9 != 0) goto L52
            java.lang.Object r7 = r8.invoke()
            return r7
        L52:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx3.RxAwaitKt.g(zc.T, ed.a, kotlin.coroutines.e):java.lang.Object");
    }

    @Nullable
    public static final <T> Object h(@NotNull T<T> t10, @NotNull kotlin.coroutines.e<? super T> eVar) {
        return k(t10, Mode.FIRST_OR_DEFAULT, null, eVar, 2, null);
    }

    @Nullable
    public static final <T> Object i(@NotNull T<T> t10, @NotNull kotlin.coroutines.e<? super T> eVar) {
        Object objK = k(t10, Mode.LAST, null, eVar, 2, null);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objK;
    }

    public static final <T> Object j(T<T> t10, final Mode mode, final T t11, kotlin.coroutines.e<? super T> eVar) {
        final C5102o c5102o = new C5102o(IntrinsicsKt__IntrinsicsJvmKt.e(eVar), 1);
        c5102o.n0();
        t10.a(new zc.V<T>() { // from class: kotlinx.coroutines.rx3.RxAwaitKt$awaitOne$2$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public io.reactivex.rxjava3.disposables.d f220548a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public T f220549b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f220550c;

            public /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f220554a;

                static {
                    int[] iArr = new int[Mode.values().length];
                    try {
                        iArr[Mode.FIRST.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Mode.FIRST_OR_DEFAULT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Mode.LAST.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[Mode.SINGLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f220554a = iArr;
                }
            }

            @Override // zc.V
            public void onComplete() {
                if (this.f220550c) {
                    if (c5102o.isActive()) {
                        c5102o.resumeWith(this.f220549b);
                    }
                } else if (mode == Mode.FIRST_OR_DEFAULT) {
                    c5102o.resumeWith(t11);
                } else if (c5102o.isActive()) {
                    c5102o.resumeWith(C4885d0.a(new NoSuchElementException("No value received via onNext for " + mode)));
                }
            }

            @Override // zc.V
            public void onError(@NotNull Throwable th) {
                c5102o.resumeWith(C4885d0.a(th));
            }

            @Override // zc.V
            public void onNext(@NotNull T t12) {
                int i10 = a.f220554a[mode.ordinal()];
                if (i10 == 1 || i10 == 2) {
                    if (this.f220550c) {
                        return;
                    }
                    this.f220550c = true;
                    c5102o.resumeWith(t12);
                    io.reactivex.rxjava3.disposables.d dVar = this.f220548a;
                    if (dVar != null) {
                        dVar.dispose();
                        return;
                    } else {
                        G.S("subscription");
                        throw null;
                    }
                }
                if (i10 == 3 || i10 == 4) {
                    if (mode != Mode.SINGLE || !this.f220550c) {
                        this.f220549b = t12;
                        this.f220550c = true;
                        return;
                    }
                    if (c5102o.isActive()) {
                        c5102o.resumeWith(C4885d0.a(new IllegalArgumentException("More than one onNext value for " + mode)));
                    }
                    io.reactivex.rxjava3.disposables.d dVar2 = this.f220548a;
                    if (dVar2 != null) {
                        dVar2.dispose();
                    } else {
                        G.S("subscription");
                        throw null;
                    }
                }
            }

            @Override // zc.V
            public void onSubscribe(@NotNull final io.reactivex.rxjava3.disposables.d dVar) {
                this.f220548a = dVar;
                c5102o.k0(new ed.l<Throwable, L0>() { // from class: kotlinx.coroutines.rx3.RxAwaitKt$awaitOne$2$1$onSubscribe$1
                    {
                        super(1);
                    }

                    public final void e(@Nullable Throwable th) {
                        dVar.dispose();
                    }

                    @Override // ed.l
                    public /* bridge */ /* synthetic */ L0 invoke(Throwable th) {
                        e(th);
                        return L0.f217464a;
                    }
                });
            }
        });
        Object objZ = c5102o.z();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objZ;
    }

    public static /* synthetic */ Object k(T t10, Mode mode, Object obj, kotlin.coroutines.e eVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        return j(t10, mode, obj, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @kotlin.InterfaceC4982o(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in favor of awaitSingleOrNull()", replaceWith = @kotlin.InterfaceC4852c0(expression = "this.awaitSingleOrNull() ?: default", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object l(zc.I r4, java.lang.Object r5, kotlin.coroutines.e r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.rx3.RxAwaitKt$awaitOrDefault$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.rx3.RxAwaitKt$awaitOrDefault$1 r0 = (kotlinx.coroutines.rx3.RxAwaitKt$awaitOrDefault$1) r0
            int r1 = r0.f220558c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220558c = r1
            goto L18
        L13:
            kotlinx.coroutines.rx3.RxAwaitKt$awaitOrDefault$1 r0 = new kotlinx.coroutines.rx3.RxAwaitKt$awaitOrDefault$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f220557b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f220558c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r5 = r0.f220556a
            kotlin.C4885d0.n(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.C4885d0.n(r6)
            r0.f220556a = r5
            r0.f220558c = r3
            java.lang.Object r6 = o(r4, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            if (r6 != 0) goto L42
            return r5
        L42:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx3.RxAwaitKt.l(zc.I, java.lang.Object, kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object m(@org.jetbrains.annotations.NotNull zc.I<T> r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.rx3.RxAwaitKt$awaitSingle$1
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.rx3.RxAwaitKt$awaitSingle$1 r0 = (kotlinx.coroutines.rx3.RxAwaitKt$awaitSingle$1) r0
            int r1 = r0.f220560b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220560b = r1
            goto L18
        L13:
            kotlinx.coroutines.rx3.RxAwaitKt$awaitSingle$1 r0 = new kotlinx.coroutines.rx3.RxAwaitKt$awaitSingle$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f220559a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f220560b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.C4885d0.n(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            kotlin.C4885d0.n(r5)
            r0.f220560b = r3
            java.lang.Object r5 = o(r4, r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            if (r5 == 0) goto L3e
            return r5
        L3e:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx3.RxAwaitKt.m(zc.I, kotlin.coroutines.e):java.lang.Object");
    }

    @Nullable
    public static final <T> Object n(@NotNull T<T> t10, @NotNull kotlin.coroutines.e<? super T> eVar) {
        Object objK = k(t10, Mode.SINGLE, null, eVar, 2, null);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objK;
    }

    @Nullable
    public static final <T> Object o(@NotNull I<T> i10, @NotNull kotlin.coroutines.e<? super T> eVar) {
        C5102o c5102o = new C5102o(IntrinsicsKt__IntrinsicsJvmKt.e(eVar), 1);
        c5102o.n0();
        i10.b(new c(c5102o));
        Object objZ = c5102o.z();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objZ;
    }

    public static final void p(@NotNull InterfaceC5100n<?> interfaceC5100n, @NotNull final io.reactivex.rxjava3.disposables.d dVar) {
        interfaceC5100n.k0(new ed.l<Throwable, L0>() { // from class: kotlinx.coroutines.rx3.RxAwaitKt$disposeOnCancellation$1
            {
                super(1);
            }

            public final void e(@Nullable Throwable th) {
                dVar.dispose();
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ L0 invoke(Throwable th) {
                e(th);
                return L0.f217464a;
            }
        });
    }
}

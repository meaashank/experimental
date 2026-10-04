package androidx.compose.ui.text.font;

import ed.InterfaceC4376a;
import f0.C4383b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,432:1\n26#2:433\n26#2:434\n26#2:435\n26#2:436\n26#2:437\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n*L\n369#1:433\n380#1:434\n392#1:435\n399#1:436\n420#1:437\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class AsyncTypefaceCache {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f104462e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Object f104463a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C4383b<b, a> f104464b = new C4383b<>(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final f0.c<b, a> f104465c = new f0.c<>(0, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final androidx.compose.ui.text.platform.y f104466d = new androidx.compose.ui.text.platform.y();

    @dd.h
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Object f104467a;

        public /* synthetic */ a(Object obj) {
            this.f104467a = obj;
        }

        public static final /* synthetic */ a a(Object obj) {
            return new a(obj);
        }

        @NotNull
        public static Object b(@Nullable Object obj) {
            return obj;
        }

        public static boolean c(Object obj, Object obj2) {
            return (obj2 instanceof a) && kotlin.jvm.internal.G.g(obj, ((a) obj2).f104467a);
        }

        public static final boolean d(Object obj, Object obj2) {
            return kotlin.jvm.internal.G.g(obj, obj2);
        }

        public static int f(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public static final boolean g(Object obj) {
            return obj == null;
        }

        public static String h(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        @Nullable
        public final Object e() {
            return this.f104467a;
        }

        public boolean equals(Object obj) {
            return c(this.f104467a, obj);
        }

        public int hashCode() {
            return f(this.f104467a);
        }

        public final /* synthetic */ Object i() {
            return this.f104467a;
        }

        public String toString() {
            return h(this.f104467a);
        }
    }

    @androidx.compose.runtime.internal.r(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f104468c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final InterfaceC2324v f104469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Object f104470b;

        public b(@NotNull InterfaceC2324v interfaceC2324v, @Nullable Object obj) {
            this.f104469a = interfaceC2324v;
            this.f104470b = obj;
        }

        public static b d(b bVar, InterfaceC2324v interfaceC2324v, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                interfaceC2324v = bVar.f104469a;
            }
            if ((i10 & 2) != 0) {
                obj = bVar.f104470b;
            }
            bVar.getClass();
            return new b(interfaceC2324v, obj);
        }

        @NotNull
        public final InterfaceC2324v a() {
            return this.f104469a;
        }

        @Nullable
        public final Object b() {
            return this.f104470b;
        }

        @NotNull
        public final b c(@NotNull InterfaceC2324v interfaceC2324v, @Nullable Object obj) {
            return new b(interfaceC2324v, obj);
        }

        @NotNull
        public final InterfaceC2324v e() {
            return this.f104469a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.G.g(this.f104469a, bVar.f104469a) && kotlin.jvm.internal.G.g(this.f104470b, bVar.f104470b);
        }

        @Nullable
        public final Object f() {
            return this.f104470b;
        }

        public int hashCode() {
            int iHashCode = this.f104469a.hashCode() * 31;
            Object obj = this.f104470b;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        @NotNull
        public String toString() {
            return "Key(font=" + this.f104469a + ", loaderKey=" + this.f104470b + ')';
        }
    }

    public static /* synthetic */ void f(AsyncTypefaceCache asyncTypefaceCache, InterfaceC2324v interfaceC2324v, U u10, Object obj, boolean z10, int i10, Object obj2) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        asyncTypefaceCache.e(interfaceC2324v, u10, obj, z10);
    }

    @Nullable
    public final a d(@NotNull InterfaceC2324v interfaceC2324v, @NotNull U u10) {
        a aVarG;
        b bVar = new b(interfaceC2324v, u10.a());
        synchronized (this.f104466d) {
            aVarG = this.f104464b.g(bVar);
            if (aVarG == null) {
                aVarG = this.f104465c.e(bVar);
            }
        }
        return aVarG;
    }

    public final void e(@NotNull InterfaceC2324v interfaceC2324v, @NotNull U u10, @Nullable Object obj, boolean z10) {
        b bVar = new b(interfaceC2324v, u10.a());
        synchronized (this.f104466d) {
            try {
                if (obj == null) {
                    this.f104465c.n(bVar, new a(this.f104463a));
                } else if (z10) {
                    this.f104465c.n(bVar, new a(obj));
                } else {
                    this.f104464b.k(bVar, new a(obj));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(@org.jetbrains.annotations.NotNull androidx.compose.ui.text.font.InterfaceC2324v r5, @org.jetbrains.annotations.NotNull androidx.compose.ui.text.font.U r6, boolean r7, @org.jetbrains.annotations.NotNull ed.l<? super kotlin.coroutines.e<java.lang.Object>, ? extends java.lang.Object> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<java.lang.Object> r9) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r9 instanceof androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = (androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1) r0
            int r1 = r0.f104476f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f104476f = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = new androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.f104474d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f104476f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r7 = r0.f104473c
            java.lang.Object r5 = r0.f104472b
            androidx.compose.ui.text.font.AsyncTypefaceCache$b r5 = (androidx.compose.ui.text.font.AsyncTypefaceCache.b) r5
            java.lang.Object r6 = r0.f104471a
            androidx.compose.ui.text.font.AsyncTypefaceCache r6 = (androidx.compose.ui.text.font.AsyncTypefaceCache) r6
            kotlin.C4885d0.n(r9)
            goto L77
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.C4885d0.n(r9)
            androidx.compose.ui.text.font.AsyncTypefaceCache$b r9 = new androidx.compose.ui.text.font.AsyncTypefaceCache$b
            java.lang.Object r6 = r6.a()
            r9.<init>(r5, r6)
            androidx.compose.ui.text.platform.y r5 = r4.f104466d
            monitor-enter(r5)
            f0.b<androidx.compose.ui.text.font.AsyncTypefaceCache$b, androidx.compose.ui.text.font.AsyncTypefaceCache$a> r6 = r4.f104464b     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r6 = r6.g(r9)     // Catch: java.lang.Throwable -> L5b
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r6 = (androidx.compose.ui.text.font.AsyncTypefaceCache.a) r6     // Catch: java.lang.Throwable -> L5b
            if (r6 != 0) goto L5d
            f0.c<androidx.compose.ui.text.font.AsyncTypefaceCache$b, androidx.compose.ui.text.font.AsyncTypefaceCache$a> r6 = r4.f104465c     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r6 = r6.e(r9)     // Catch: java.lang.Throwable -> L5b
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r6 = (androidx.compose.ui.text.font.AsyncTypefaceCache.a) r6     // Catch: java.lang.Throwable -> L5b
            goto L5d
        L5b:
            r6 = move-exception
            goto La6
        L5d:
            if (r6 == 0) goto L63
            java.lang.Object r6 = r6.f104467a     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r5)
            return r6
        L63:
            monitor-exit(r5)
            r0.f104471a = r4
            r0.f104472b = r9
            r0.f104473c = r7
            r0.f104476f = r3
            java.lang.Object r5 = r8.invoke(r0)
            if (r5 != r1) goto L73
            return r1
        L73:
            r6 = r9
            r9 = r5
            r5 = r6
            r6 = r4
        L77:
            androidx.compose.ui.text.platform.y r8 = r6.f104466d
            monitor-enter(r8)
            if (r9 != 0) goto L8b
            f0.c<androidx.compose.ui.text.font.AsyncTypefaceCache$b, androidx.compose.ui.text.font.AsyncTypefaceCache$a> r7 = r6.f104465c     // Catch: java.lang.Throwable -> L89
            java.lang.Object r6 = r6.f104463a     // Catch: java.lang.Throwable -> L89
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r0 = new androidx.compose.ui.text.font.AsyncTypefaceCache$a     // Catch: java.lang.Throwable -> L89
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L89
            r7.n(r5, r0)     // Catch: java.lang.Throwable -> L89
            goto La2
        L89:
            r5 = move-exception
            goto La4
        L8b:
            if (r7 == 0) goto L98
            f0.c<androidx.compose.ui.text.font.AsyncTypefaceCache$b, androidx.compose.ui.text.font.AsyncTypefaceCache$a> r6 = r6.f104465c     // Catch: java.lang.Throwable -> L89
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r7 = new androidx.compose.ui.text.font.AsyncTypefaceCache$a     // Catch: java.lang.Throwable -> L89
            r7.<init>(r9)     // Catch: java.lang.Throwable -> L89
            r6.n(r5, r7)     // Catch: java.lang.Throwable -> L89
            goto La2
        L98:
            f0.b<androidx.compose.ui.text.font.AsyncTypefaceCache$b, androidx.compose.ui.text.font.AsyncTypefaceCache$a> r6 = r6.f104464b     // Catch: java.lang.Throwable -> L89
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r7 = new androidx.compose.ui.text.font.AsyncTypefaceCache$a     // Catch: java.lang.Throwable -> L89
            r7.<init>(r9)     // Catch: java.lang.Throwable -> L89
            r6.k(r5, r7)     // Catch: java.lang.Throwable -> L89
        La2:
            monitor-exit(r8)
            return r9
        La4:
            monitor-exit(r8)
            throw r5
        La6:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncTypefaceCache.g(androidx.compose.ui.text.font.v, androidx.compose.ui.text.font.U, boolean, ed.l, kotlin.coroutines.e):java.lang.Object");
    }

    @Nullable
    public final Object h(@NotNull InterfaceC2324v interfaceC2324v, @NotNull U u10, @NotNull InterfaceC4376a<? extends Object> interfaceC4376a) {
        synchronized (this.f104466d) {
            try {
                b bVar = new b(interfaceC2324v, u10.a());
                a aVarG = this.f104464b.g(bVar);
                if (aVarG == null) {
                    aVarG = this.f104465c.e(bVar);
                }
                if (aVarG != null) {
                    return aVarG.f104467a;
                }
                Object objInvoke = interfaceC4376a.invoke();
                e(interfaceC2324v, u10, objInvoke, false);
                return objInvoke;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

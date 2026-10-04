package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import e.InterfaceC4326A;
import ed.InterfaceC4376a;
import ed.l;
import ed.p;
import j1.C4775a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.G;
import kotlin.I;
import kotlin.L0;
import kotlin.collections.EmptyList;
import kotlin.collections.U;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C4969v;
import kotlinx.coroutines.C5052b0;
import kotlinx.coroutines.C5119x;
import kotlinx.coroutines.C5121y;
import kotlinx.coroutines.InterfaceC5117w;
import kotlinx.coroutines.L;
import kotlinx.coroutines.M;
import kotlinx.coroutines.Y0;
import kotlinx.coroutines.flow.m;
import kotlinx.coroutines.flow.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleProcessDataStore<T> implements d<T> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final a f112335k = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @InterfaceC4326A("activeFilesLock")
    @NotNull
    public static final Set<String> f112336l = new LinkedHashSet();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final Object f112337m = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC4376a<File> f112338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final i<T> f112339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final androidx.datastore.core.a<T> f112340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final L f112341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final kotlinx.coroutines.flow.e<T> f112342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f112343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final G f112344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final kotlinx.coroutines.flow.j<j<T>> f112345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public List<? extends p<? super g<T>, ? super kotlin.coroutines.e<? super L0>, ? extends Object>> f112346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final SimpleActor<b<T>> f112347j;

    public static final class a {
        public a() {
        }

        @NotNull
        public final Set<String> a() {
            return SingleProcessDataStore.f112336l;
        }

        @NotNull
        public final Object b() {
            return SingleProcessDataStore.f112337m;
        }

        public a(C4969v c4969v) {
        }
    }

    public static abstract class b<T> {

        public static final class a<T> extends b<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public final j<T> f112353a;

            public a(@Nullable j<T> jVar) {
                this.f112353a = jVar;
            }

            @Override // androidx.datastore.core.SingleProcessDataStore.b
            @Nullable
            public j<T> a() {
                return this.f112353a;
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$b$b, reason: collision with other inner class name */
        public static final class C0291b<T> extends b<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final p<T, kotlin.coroutines.e<? super T>, Object> f112354a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final InterfaceC5117w<T> f112355b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public final j<T> f112356c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            public final kotlin.coroutines.i f112357d;

            /* JADX WARN: Multi-variable type inference failed */
            public C0291b(@NotNull p<? super T, ? super kotlin.coroutines.e<? super T>, ? extends Object> transform, @NotNull InterfaceC5117w<T> ack, @Nullable j<T> jVar, @NotNull kotlin.coroutines.i callerContext) {
                kotlin.jvm.internal.G.p(transform, "transform");
                kotlin.jvm.internal.G.p(ack, "ack");
                kotlin.jvm.internal.G.p(callerContext, "callerContext");
                this.f112354a = transform;
                this.f112355b = ack;
                this.f112356c = jVar;
                this.f112357d = callerContext;
            }

            @Override // androidx.datastore.core.SingleProcessDataStore.b
            @Nullable
            public j<T> a() {
                return this.f112356c;
            }

            @NotNull
            public final InterfaceC5117w<T> b() {
                return this.f112355b;
            }

            @NotNull
            public final kotlin.coroutines.i c() {
                return this.f112357d;
            }

            @NotNull
            public final p<T, kotlin.coroutines.e<? super T>, Object> d() {
                return this.f112354a;
            }
        }

        public b() {
        }

        @Nullable
        public abstract j<T> a();

        public b(C4969v c4969v) {
        }
    }

    public static final class c extends OutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final FileOutputStream f112358a;

        public c(@NotNull FileOutputStream fileOutputStream) {
            kotlin.jvm.internal.G.p(fileOutputStream, "fileOutputStream");
            this.f112358a = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @NotNull
        public final FileOutputStream d() {
            return this.f112358a;
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f112358a.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            this.f112358a.write(i10);
        }

        @Override // java.io.OutputStream
        public void write(@NotNull byte[] b10) throws IOException {
            kotlin.jvm.internal.G.p(b10, "b");
            this.f112358a.write(b10);
        }

        @Override // java.io.OutputStream
        public void write(@NotNull byte[] bytes, int i10, int i11) throws IOException {
            kotlin.jvm.internal.G.p(bytes, "bytes");
            this.f112358a.write(bytes, i10, i11);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SingleProcessDataStore(InterfaceC4376a interfaceC4376a, i iVar, List list, androidx.datastore.core.a aVar, L l10, int i10, C4969v c4969v) {
        List list2 = (i10 & 4) != 0 ? EmptyList.f217510a : list;
        androidx.datastore.core.a c4775a = (i10 & 8) != 0 ? new C4775a() : aVar;
        if ((i10 & 16) != 0) {
            C5052b0 c5052b0 = C5052b0.f218827a;
            l10 = M.a(C5052b0.f218830d.plus(Y0.c(null, 1, null)));
        }
        this(interfaceC4376a, iVar, list2, c4775a, l10);
    }

    public static /* synthetic */ void q() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.io.FileOutputStream] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A(T r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.A(java.lang.Object, kotlin.coroutines.e):java.lang.Object");
    }

    @Override // androidx.datastore.core.d
    @Nullable
    public Object a(@NotNull p<? super T, ? super kotlin.coroutines.e<? super T>, ? extends Object> pVar, @NotNull kotlin.coroutines.e<? super T> eVar) {
        InterfaceC5117w interfaceC5117wC = C5121y.c(null, 1, null);
        this.f112347j.e(new b.C0291b(pVar, interfaceC5117wC, this.f112345h.getValue(), eVar.getContext()));
        Object objT = ((C5119x) interfaceC5117wC).T(eVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objT;
    }

    @Override // androidx.datastore.core.d
    @NotNull
    public kotlinx.coroutines.flow.e<T> getData() {
        return this.f112342e;
    }

    public final void p(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException(kotlin.jvm.internal.G.C("Unable to create parent directories of ", file));
        }
    }

    public final File r() {
        return (File) this.f112344g.getValue();
    }

    public final Object s(b.a<T> aVar, kotlin.coroutines.e<? super L0> eVar) throws Throwable {
        j<T> value = this.f112345h.getValue();
        if (!(value instanceof androidx.datastore.core.b)) {
            if (value instanceof h) {
                if (value == aVar.f112353a) {
                    Object objW = w(eVar);
                    return objW == CoroutineSingletons.COROUTINE_SUSPENDED ? objW : L0.f217464a;
                }
            } else {
                if (kotlin.jvm.internal.G.g(value, k.f112440a)) {
                    Object objW2 = w(eVar);
                    return objW2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objW2 : L0.f217464a;
                }
                if (value instanceof f) {
                    throw new IllegalStateException("Can't read in final state.");
                }
            }
        }
        return L0.f217464a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ab, code lost:
    
        if (r9 != r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.datastore.core.SingleProcessDataStore, androidx.datastore.core.SingleProcessDataStore<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14, types: [kotlinx.coroutines.w] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(androidx.datastore.core.SingleProcessDataStore.b.C0291b<T> r9, kotlin.coroutines.e<? super kotlin.L0> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.t(androidx.datastore.core.SingleProcessDataStore$b$b, kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.datastore.core.SingleProcessDataStore, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r13v0, types: [androidx.datastore.core.SingleProcessDataStore, androidx.datastore.core.SingleProcessDataStore<T>, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(kotlin.coroutines.e<? super kotlin.L0> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.u(kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(kotlin.coroutines.e<? super kotlin.L0> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) r0
            int r1 = r0.f112402d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f112402d = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f112400b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f112402d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f112399a
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            kotlin.C4885d0.n(r5)     // Catch: java.lang.Throwable -> L2b
            goto L43
        L2b:
            r5 = move-exception
            goto L48
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.C4885d0.n(r5)
            r0.f112399a = r4     // Catch: java.lang.Throwable -> L46
            r0.f112402d = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Object r5 = r4.u(r0)     // Catch: java.lang.Throwable -> L46
            if (r5 != r1) goto L43
            return r1
        L43:
            kotlin.L0 r5 = kotlin.L0.f217464a
            return r5
        L46:
            r5 = move-exception
            r0 = r4
        L48:
            kotlinx.coroutines.flow.j<androidx.datastore.core.j<T>> r0 = r0.f112345h
            androidx.datastore.core.h r1 = new androidx.datastore.core.h
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.v(kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(kotlin.coroutines.e<? super kotlin.L0> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1) r0
            int r1 = r0.f112406d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f112406d = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f112404b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f112406d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f112403a
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            kotlin.C4885d0.n(r5)     // Catch: java.lang.Throwable -> L2b
            goto L4f
        L2b:
            r5 = move-exception
            goto L45
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.C4885d0.n(r5)
            r0.f112403a = r4     // Catch: java.lang.Throwable -> L43
            r0.f112406d = r3     // Catch: java.lang.Throwable -> L43
            java.lang.Object r5 = r4.u(r0)     // Catch: java.lang.Throwable -> L43
            if (r5 != r1) goto L4f
            return r1
        L43:
            r5 = move-exception
            r0 = r4
        L45:
            kotlinx.coroutines.flow.j<androidx.datastore.core.j<T>> r0 = r0.f112345h
            androidx.datastore.core.h r1 = new androidx.datastore.core.h
            r1.<init>(r5)
            r0.setValue(r1)
        L4f:
            kotlin.L0 r5 = kotlin.L0.f217464a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.w(kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.SingleProcessDataStore$readData$1, kotlin.coroutines.e] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.FileInputStream, java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r6v9, types: [androidx.datastore.core.i, androidx.datastore.core.i<T>] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(kotlin.coroutines.e<? super T> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.SingleProcessDataStore$readData$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.core.SingleProcessDataStore$readData$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readData$1) r0
            int r1 = r0.f112412f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f112412f = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessDataStore$readData$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readData$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f112410d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f112412f
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r1 = r0.f112409c
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f112408b
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r0 = r0.f112407a
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            kotlin.C4885d0.n(r6)     // Catch: java.lang.Throwable -> L33
            goto L5d
        L33:
            r6 = move-exception
            goto L65
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3d:
            kotlin.C4885d0.n(r6)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L6b
            java.io.File r6 = r5.r()     // Catch: java.io.FileNotFoundException -> L6b
            r2.<init>(r6)     // Catch: java.io.FileNotFoundException -> L6b
            androidx.datastore.core.i<T> r6 = r5.f112339b     // Catch: java.lang.Throwable -> L63
            r0.f112407a = r5     // Catch: java.lang.Throwable -> L63
            r0.f112408b = r2     // Catch: java.lang.Throwable -> L63
            r4 = 0
            r0.f112409c = r4     // Catch: java.lang.Throwable -> L63
            r0.f112412f = r3     // Catch: java.lang.Throwable -> L63
            java.lang.Object r6 = r6.readFrom(r2, r0)     // Catch: java.lang.Throwable -> L63
            if (r6 != r1) goto L5b
            return r1
        L5b:
            r0 = r5
            r1 = r4
        L5d:
            kotlin.io.b.a(r2, r1)     // Catch: java.io.FileNotFoundException -> L61
            return r6
        L61:
            r6 = move-exception
            goto L6d
        L63:
            r6 = move-exception
            r0 = r5
        L65:
            throw r6     // Catch: java.lang.Throwable -> L66
        L66:
            r1 = move-exception
            kotlin.io.b.a(r2, r6)     // Catch: java.io.FileNotFoundException -> L61
            throw r1     // Catch: java.io.FileNotFoundException -> L61
        L6b:
            r6 = move-exception
            r0 = r5
        L6d:
            java.io.File r1 = r0.r()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L7e
            androidx.datastore.core.i<T> r6 = r0.f112339b
            java.lang.Object r6 = r6.getDefaultValue()
            return r6
        L7e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.x(kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.datastore.core.SingleProcessDataStore, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.datastore.core.SingleProcessDataStore, androidx.datastore.core.SingleProcessDataStore<T>, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object y(kotlin.coroutines.e<? super T> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1) r0
            int r1 = r0.f112417e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f112417e = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f112415c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f112417e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L49
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r1 = r0.f112414b
            java.lang.Object r0 = r0.f112413a
            androidx.datastore.core.CorruptionException r0 = (androidx.datastore.core.CorruptionException) r0
            kotlin.C4885d0.n(r8)     // Catch: java.io.IOException -> L33
            return r1
        L33:
            r8 = move-exception
            goto L87
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3d:
            java.lang.Object r2 = r0.f112414b
            androidx.datastore.core.CorruptionException r2 = (androidx.datastore.core.CorruptionException) r2
            java.lang.Object r4 = r0.f112413a
            androidx.datastore.core.SingleProcessDataStore r4 = (androidx.datastore.core.SingleProcessDataStore) r4
            kotlin.C4885d0.n(r8)
            goto L77
        L49:
            java.lang.Object r2 = r0.f112413a
            androidx.datastore.core.SingleProcessDataStore r2 = (androidx.datastore.core.SingleProcessDataStore) r2
            kotlin.C4885d0.n(r8)     // Catch: androidx.datastore.core.CorruptionException -> L51
            return r8
        L51:
            r8 = move-exception
            goto L64
        L53:
            kotlin.C4885d0.n(r8)
            r0.f112413a = r7     // Catch: androidx.datastore.core.CorruptionException -> L62
            r0.f112417e = r5     // Catch: androidx.datastore.core.CorruptionException -> L62
            java.lang.Object r8 = r7.x(r0)     // Catch: androidx.datastore.core.CorruptionException -> L62
            if (r8 != r1) goto L61
            goto L83
        L61:
            return r8
        L62:
            r8 = move-exception
            r2 = r7
        L64:
            androidx.datastore.core.a<T> r5 = r2.f112340c
            r0.f112413a = r2
            r0.f112414b = r8
            r0.f112417e = r4
            java.lang.Object r4 = r5.a(r8, r0)
            if (r4 != r1) goto L73
            goto L83
        L73:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L77:
            r0.f112413a = r2     // Catch: java.io.IOException -> L85
            r0.f112414b = r8     // Catch: java.io.IOException -> L85
            r0.f112417e = r3     // Catch: java.io.IOException -> L85
            java.lang.Object r0 = r4.A(r8, r0)     // Catch: java.io.IOException -> L85
            if (r0 != r1) goto L84
        L83:
            return r1
        L84:
            return r8
        L85:
            r8 = move-exception
            r0 = r2
        L87:
            kotlin.C4987s.a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.y(kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(ed.p<? super T, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r8, kotlin.coroutines.i r9, kotlin.coroutines.e<? super T> r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1 r0 = (androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1) r0
            int r1 = r0.f112423f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f112423f = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1 r0 = new androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f112421d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f112423f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r8 = r0.f112419b
            java.lang.Object r9 = r0.f112418a
            androidx.datastore.core.SingleProcessDataStore r9 = (androidx.datastore.core.SingleProcessDataStore) r9
            kotlin.C4885d0.n(r10)
            goto L8a
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.lang.Object r8 = r0.f112420c
            java.lang.Object r9 = r0.f112419b
            androidx.datastore.core.b r9 = (androidx.datastore.core.b) r9
            java.lang.Object r2 = r0.f112418a
            androidx.datastore.core.SingleProcessDataStore r2 = (androidx.datastore.core.SingleProcessDataStore) r2
            kotlin.C4885d0.n(r10)
            goto L6f
        L47:
            kotlin.C4885d0.n(r10)
            kotlinx.coroutines.flow.j<androidx.datastore.core.j<T>> r10 = r7.f112345h
            java.lang.Object r10 = r10.getValue()
            androidx.datastore.core.b r10 = (androidx.datastore.core.b) r10
            r10.a()
            T r2 = r10.f112435a
            androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1 r6 = new androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1
            r6.<init>(r8, r2, r3)
            r0.f112418a = r7
            r0.f112419b = r10
            r0.f112420c = r2
            r0.f112423f = r5
            java.lang.Object r8 = kotlinx.coroutines.C5092j.g(r9, r6, r0)
            if (r8 != r1) goto L6b
            goto L87
        L6b:
            r9 = r10
            r10 = r8
            r8 = r2
            r2 = r7
        L6f:
            r9.a()
            boolean r9 = kotlin.jvm.internal.G.g(r8, r10)
            if (r9 == 0) goto L79
            return r8
        L79:
            r0.f112418a = r2
            r0.f112419b = r10
            r0.f112420c = r3
            r0.f112423f = r4
            java.lang.Object r8 = r2.A(r10, r0)
            if (r8 != r1) goto L88
        L87:
            return r1
        L88:
            r8 = r10
            r9 = r2
        L8a:
            kotlinx.coroutines.flow.j<androidx.datastore.core.j<T>> r9 = r9.f112345h
            androidx.datastore.core.b r10 = new androidx.datastore.core.b
            if (r8 == 0) goto L95
            int r0 = r8.hashCode()
            goto L96
        L95:
            r0 = 0
        L96:
            r10.<init>(r8, r0)
            r9.setValue(r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.z(ed.p, kotlin.coroutines.i, kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SingleProcessDataStore(@NotNull InterfaceC4376a<? extends File> produceFile, @NotNull i<T> serializer, @NotNull List<? extends p<? super g<T>, ? super kotlin.coroutines.e<? super L0>, ? extends Object>> initTasksList, @NotNull androidx.datastore.core.a<T> corruptionHandler, @NotNull L scope) {
        kotlin.jvm.internal.G.p(produceFile, "produceFile");
        kotlin.jvm.internal.G.p(serializer, "serializer");
        kotlin.jvm.internal.G.p(initTasksList, "initTasksList");
        kotlin.jvm.internal.G.p(corruptionHandler, "corruptionHandler");
        kotlin.jvm.internal.G.p(scope, "scope");
        this.f112338a = produceFile;
        this.f112339b = serializer;
        this.f112340c = corruptionHandler;
        this.f112341d = scope;
        this.f112342e = new m(new SingleProcessDataStore$data$1(this, null));
        this.f112343f = ".tmp";
        this.f112344g = I.a(new InterfaceC4376a<File>(this) { // from class: androidx.datastore.core.SingleProcessDataStore$file$2

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ SingleProcessDataStore<T> f112371d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f112371d = this;
            }

            @Override // ed.InterfaceC4376a
            @NotNull
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final File invoke() {
                File file = (File) this.f112371d.f112338a.invoke();
                String it = file.getAbsolutePath();
                SingleProcessDataStore.a aVar = SingleProcessDataStore.f112335k;
                aVar.getClass();
                synchronized (SingleProcessDataStore.f112337m) {
                    aVar.getClass();
                    if (SingleProcessDataStore.f112336l.contains(it)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    aVar.getClass();
                    Set set = SingleProcessDataStore.f112336l;
                    kotlin.jvm.internal.G.o(it, "it");
                    set.add(it);
                }
                return file;
            }
        });
        this.f112345h = v.a(k.f112440a);
        this.f112346i = U.a6(initTasksList);
        this.f112347j = new SimpleActor<>(scope, new l<Throwable, L0>(this) { // from class: androidx.datastore.core.SingleProcessDataStore$actor$1

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ SingleProcessDataStore<T> f112348d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f112348d = this;
            }

            public final void e(@Nullable Throwable th) {
                if (th != null) {
                    this.f112348d.f112345h.setValue(new f(th));
                }
                SingleProcessDataStore.a aVar = SingleProcessDataStore.f112335k;
                aVar.getClass();
                Object obj = SingleProcessDataStore.f112337m;
                SingleProcessDataStore<T> singleProcessDataStore = this.f112348d;
                synchronized (obj) {
                    aVar.getClass();
                    SingleProcessDataStore.f112336l.remove(singleProcessDataStore.r().getAbsolutePath());
                }
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ L0 invoke(Throwable th) {
                e(th);
                return L0.f217464a;
            }
        }, new p<b<T>, Throwable, L0>() { // from class: androidx.datastore.core.SingleProcessDataStore$actor$2
            public final void e(@NotNull SingleProcessDataStore.b<T> msg, @Nullable Throwable th) {
                kotlin.jvm.internal.G.p(msg, "msg");
                if (msg instanceof SingleProcessDataStore.b.C0291b) {
                    InterfaceC5117w<T> interfaceC5117w = ((SingleProcessDataStore.b.C0291b) msg).f112355b;
                    if (th == null) {
                        th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                    }
                    interfaceC5117w.b(th);
                }
            }

            @Override // ed.p
            public /* bridge */ /* synthetic */ L0 invoke(Object obj, Throwable th) {
                e((SingleProcessDataStore.b) obj, th);
                return L0.f217464a;
            }
        }, new SingleProcessDataStore$actor$3(this, null));
    }
}

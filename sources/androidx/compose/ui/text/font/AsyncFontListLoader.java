package androidx.compose.ui.text.font;

import androidx.compose.runtime.M1;
import androidx.compose.runtime.X1;
import androidx.compose.ui.text.font.r0;
import java.util.List;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncFontListLoader\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,432:1\n81#2:433\n107#2,2:434\n33#3,6:436\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncFontListLoader\n*L\n256#1:433\n256#1:434,2\n263#1:436,6\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public final class AsyncFontListLoader implements X1<Object> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f104436h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<InterfaceC2324v> f104437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final q0 f104438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final AsyncTypefaceCache f104439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ed.l<r0.b, L0> f104440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final U f104441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f104442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f104443g = true;

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncFontListLoader(@NotNull List<? extends InterfaceC2324v> list, @NotNull Object obj, @NotNull q0 q0Var, @NotNull AsyncTypefaceCache asyncTypefaceCache, @NotNull ed.l<? super r0.b, L0> lVar, @NotNull U u10) {
        this.f104437a = list;
        this.f104438b = q0Var;
        this.f104439c = asyncTypefaceCache;
        this.f104440d = lVar;
        this.f104441e = u10;
        this.f104442f = M1.g(obj, null, 2, null);
    }

    private void setValue(Object obj) {
        this.f104442f.setValue(obj);
    }

    @Override // androidx.compose.runtime.X1
    @NotNull
    public Object getValue() {
        return this.f104442f.getValue();
    }

    public final boolean h() {
        return this.f104443g;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac A[Catch: all -> 0x0061, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:35:0x00ac, B:38:0x00d8, B:20:0x0058), top: B:52:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8 A[Catch: all -> 0x0061, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:35:0x00ac, B:38:0x00d8, B:20:0x0058), top: B:52:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:45:0x00f5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00eb -> B:42:0x00ec). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.i(kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(@org.jetbrains.annotations.NotNull androidx.compose.ui.text.font.InterfaceC2324v r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<java.lang.Object> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = (androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1) r0
            int r1 = r0.f104458d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f104458d = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f104456b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f104458d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.f104455a
            androidx.compose.ui.text.font.v r7 = (androidx.compose.ui.text.font.InterfaceC2324v) r7
            kotlin.C4885d0.n(r8)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2e
            return r8
        L2c:
            r8 = move-exception
            goto L4e
        L2e:
            r7 = move-exception
            goto L77
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            kotlin.C4885d0.n(r8)
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2 r8 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2e
            r8.<init>(r6, r7, r4)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2e
            r0.f104455a = r7     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2e
            r0.f104458d = r3     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2e
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r7 = kotlinx.coroutines.TimeoutKt.e(r2, r8, r0)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2e
            if (r7 != r1) goto L4d
            return r1
        L4d:
            return r7
        L4e:
            kotlin.coroutines.i r1 = r0.getContext()
            kotlinx.coroutines.H$b r2 = kotlinx.coroutines.H.f218728z3
            kotlin.coroutines.i$b r1 = r1.get(r2)
            kotlinx.coroutines.H r1 = (kotlinx.coroutines.H) r1
            if (r1 == 0) goto L81
            kotlin.coroutines.i r0 = r0.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to load font "
            r3.<init>(r5)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.<init>(r7, r8)
            r1.handleException(r0, r2)
            goto L81
        L77:
            kotlin.coroutines.i r8 = r0.getContext()
            boolean r8 = kotlinx.coroutines.JobKt__JobKt.C(r8)
            if (r8 == 0) goto L82
        L81:
            return r4
        L82:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.j(androidx.compose.ui.text.font.v, kotlin.coroutines.e):java.lang.Object");
    }

    public final void k(boolean z10) {
        this.f104443g = z10;
    }
}

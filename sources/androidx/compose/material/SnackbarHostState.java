package androidx.compose.material;

import androidx.compose.runtime.M1;
import androidx.compose.runtime.T1;
import kotlinx.coroutines.InterfaceC5100n;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@T1
@kotlin.jvm.internal.V({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,381:1\n81#2:382\n107#2,2:383\n120#3,8:385\n129#3:404\n314#4,11:393\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostState\n*L\n75#1:382\n75#1:383,2\n105#1:385,8\n105#1:404\n107#1:393,11\n*E\n"})
public final class SnackbarHostState {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f97480c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final kotlinx.coroutines.sync.a f97481a = MutexKt.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f97482b = M1.g(null, null, 2, null);

    @T1
    public static final class a implements y0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f97483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f97484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final SnackbarDuration f97485c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final InterfaceC5100n<SnackbarResult> f97486d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull String str, @Nullable String str2, @NotNull SnackbarDuration snackbarDuration, @NotNull InterfaceC5100n<? super SnackbarResult> interfaceC5100n) {
            this.f97483a = str;
            this.f97484b = str2;
            this.f97485c = snackbarDuration;
            this.f97486d = interfaceC5100n;
        }

        @Override // androidx.compose.material.y0
        public void a() {
            if (this.f97486d.isActive()) {
                this.f97486d.resumeWith(SnackbarResult.ActionPerformed);
            }
        }

        @Override // androidx.compose.material.y0
        @Nullable
        public String b() {
            return this.f97484b;
        }

        @Override // androidx.compose.material.y0
        public void dismiss() {
            if (this.f97486d.isActive()) {
                this.f97486d.resumeWith(SnackbarResult.Dismissed);
            }
        }

        @Override // androidx.compose.material.y0
        @NotNull
        public SnackbarDuration getDuration() {
            return this.f97485c;
        }

        @Override // androidx.compose.material.y0
        @NotNull
        public String getMessage() {
            return this.f97483a;
        }
    }

    public static /* synthetic */ Object e(SnackbarHostState snackbarHostState, String str, String str2, SnackbarDuration snackbarDuration, kotlin.coroutines.e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            snackbarDuration = SnackbarDuration.Short;
        }
        return snackbarHostState.d(str, str2, snackbarDuration, eVar);
    }

    @Nullable
    public final y0 b() {
        return (y0) this.f97482b.getValue();
    }

    public final void c(y0 y0Var) {
        this.f97482b.setValue(y0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(@org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.Nullable java.lang.String r10, @org.jetbrains.annotations.NotNull androidx.compose.material.SnackbarDuration r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super androidx.compose.material.SnackbarResult> r12) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r12 instanceof androidx.compose.material.SnackbarHostState$showSnackbar$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.material.SnackbarHostState$showSnackbar$1 r0 = (androidx.compose.material.SnackbarHostState$showSnackbar$1) r0
            int r1 = r0.f97495i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f97495i = r1
            goto L18
        L13:
            androidx.compose.material.SnackbarHostState$showSnackbar$1 r0 = new androidx.compose.material.SnackbarHostState$showSnackbar$1
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.f97493g
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f97495i
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L6d
            if (r2 == r4) goto L4f
            if (r2 != r3) goto L47
            java.lang.Object r9 = r0.f97492f
            androidx.compose.material.SnackbarHostState$showSnackbar$1 r9 = (androidx.compose.material.SnackbarHostState$showSnackbar$1) r9
            java.lang.Object r9 = r0.f97491e
            kotlinx.coroutines.sync.a r9 = (kotlinx.coroutines.sync.a) r9
            java.lang.Object r10 = r0.f97490d
            androidx.compose.material.SnackbarDuration r10 = (androidx.compose.material.SnackbarDuration) r10
            java.lang.Object r10 = r0.f97489c
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.f97488b
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.f97487a
            androidx.compose.material.SnackbarHostState r10 = (androidx.compose.material.SnackbarHostState) r10
            kotlin.C4885d0.n(r12)     // Catch: java.lang.Throwable -> L44
            goto Lb4
        L44:
            r11 = move-exception
            goto Lbf
        L47:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L4f:
            java.lang.Object r9 = r0.f97491e
            kotlinx.coroutines.sync.a r9 = (kotlinx.coroutines.sync.a) r9
            java.lang.Object r10 = r0.f97490d
            r11 = r10
            androidx.compose.material.SnackbarDuration r11 = (androidx.compose.material.SnackbarDuration) r11
            java.lang.Object r10 = r0.f97489c
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r2 = r0.f97488b
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r6 = r0.f97487a
            androidx.compose.material.SnackbarHostState r6 = (androidx.compose.material.SnackbarHostState) r6
            kotlin.C4885d0.n(r12)
            r12 = r9
            r9 = r2
            r2 = r11
            r11 = r10
            r10 = r6
            goto L88
        L6d:
            kotlin.C4885d0.n(r12)
            kotlinx.coroutines.sync.a r12 = r8.f97481a
            r0.f97487a = r8
            r0.f97488b = r9
            r0.f97489c = r10
            r0.f97490d = r11
            r0.f97491e = r12
            r0.f97495i = r4
            java.lang.Object r2 = r12.h(r5, r0)
            if (r2 != r1) goto L85
            goto Lb0
        L85:
            r2 = r11
            r11 = r10
            r10 = r8
        L88:
            r0.f97487a = r10     // Catch: java.lang.Throwable -> Lbd
            r0.f97488b = r9     // Catch: java.lang.Throwable -> Lbd
            r0.f97489c = r11     // Catch: java.lang.Throwable -> Lbd
            r0.f97490d = r2     // Catch: java.lang.Throwable -> Lbd
            r0.f97491e = r12     // Catch: java.lang.Throwable -> Lbd
            r0.f97492f = r0     // Catch: java.lang.Throwable -> Lbd
            r0.f97495i = r3     // Catch: java.lang.Throwable -> Lbd
            kotlinx.coroutines.o r3 = new kotlinx.coroutines.o     // Catch: java.lang.Throwable -> Lbd
            kotlin.coroutines.e r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.e(r0)     // Catch: java.lang.Throwable -> Lbd
            r3.<init>(r0, r4)     // Catch: java.lang.Throwable -> Lbd
            r3.n0()     // Catch: java.lang.Throwable -> Lbd
            androidx.compose.material.SnackbarHostState$a r0 = new androidx.compose.material.SnackbarHostState$a     // Catch: java.lang.Throwable -> Lbd
            r0.<init>(r9, r11, r2, r3)     // Catch: java.lang.Throwable -> Lbd
            r10.c(r0)     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object r9 = r3.z()     // Catch: java.lang.Throwable -> Lbd
            if (r9 != r1) goto Lb1
        Lb0:
            return r1
        Lb1:
            r7 = r12
            r12 = r9
            r9 = r7
        Lb4:
            r10.c(r5)     // Catch: java.lang.Throwable -> Lbb
            r9.i(r5)
            return r12
        Lbb:
            r10 = move-exception
            goto Lc3
        Lbd:
            r11 = move-exception
            r9 = r12
        Lbf:
            r10.c(r5)     // Catch: java.lang.Throwable -> Lbb
            throw r11     // Catch: java.lang.Throwable -> Lbb
        Lc3:
            r9.i(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostState.d(java.lang.String, java.lang.String, androidx.compose.material.SnackbarDuration, kotlin.coroutines.e):java.lang.Object");
    }
}

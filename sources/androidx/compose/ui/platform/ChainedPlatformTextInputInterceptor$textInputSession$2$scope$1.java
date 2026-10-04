package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.SessionMutex;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 implements H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H0 f103455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H0 f103456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicReference<SessionMutex.a<Object>> f103457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ChainedPlatformTextInputInterceptor f103458d;

    public ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1(H0 h02, AtomicReference<SessionMutex.a<Object>> atomicReference, ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor) {
        this.f103456b = h02;
        this.f103457c = atomicReference;
        this.f103458d = chainedPlatformTextInputInterceptor;
        this.f103455a = h02;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.platform.G0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull androidx.compose.ui.platform.E0 r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 r0 = (androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1) r0
            int r1 = r0.f103461c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f103461c = r1
            goto L18
        L13:
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 r0 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f103459a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f103461c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2b:
            kotlin.C4885d0.n(r10)
            goto L49
        L2f:
            kotlin.C4885d0.n(r10)
            java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex$a<java.lang.Object>> r10 = r8.f103457c
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2 r2 = new ed.l<kotlinx.coroutines.L, kotlin.L0>() { // from class: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2
                static {
                    /*
                        androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2 r0 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2) androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2.d androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2.<init>():void");
                }

                public final void e(@org.jetbrains.annotations.NotNull kotlinx.coroutines.L r1) {
                    /*
                        r0 = this;
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2.e(kotlinx.coroutines.L):void");
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ kotlin.L0 invoke(kotlinx.coroutines.L r1) {
                    /*
                        r0 = this;
                        kotlinx.coroutines.L r1 = (kotlinx.coroutines.L) r1
                        kotlin.L0 r1 = kotlin.L0.f217464a
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2.invoke(java.lang.Object):java.lang.Object");
                }
            }
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3 r4 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor r5 = r8.f103458d
            androidx.compose.ui.platform.H0 r6 = r8.f103456b
            r7 = 0
            r4.<init>(r5, r9, r6, r7)
            r0.f103461c = r3
            java.lang.Object r9 = androidx.compose.ui.SessionMutex.j(r10, r2, r4, r0)
            if (r9 != r1) goto L49
            return r1
        L49:
            kotlin.KotlinNothingValueException r9 = new kotlin.KotlinNothingValueException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1.a(androidx.compose.ui.platform.E0, kotlin.coroutines.e):java.lang.Object");
    }

    @Override // androidx.compose.ui.platform.G0
    @NotNull
    public View getView() {
        return this.f103455a.getView();
    }

    @Override // kotlinx.coroutines.L
    @NotNull
    public kotlin.coroutines.i m() {
        return this.f103455a.m();
    }
}

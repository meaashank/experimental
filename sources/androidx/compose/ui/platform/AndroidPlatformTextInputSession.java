package androidx.compose.ui.platform;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.SessionMutex;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class AndroidPlatformTextInputSession implements H0, kotlinx.coroutines.L {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f103374e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final View f103375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final androidx.compose.ui.text.input.Y f103376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final kotlinx.coroutines.L f103377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final AtomicReference<SessionMutex.a<Object>> f103378d = SessionMutex.b();

    public AndroidPlatformTextInputSession(@NotNull View view, @NotNull androidx.compose.ui.text.input.Y y10, @NotNull kotlinx.coroutines.L l10) {
        this.f103375a = view;
        this.f103376b = y10;
        this.f103377c = l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.platform.G0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull final androidx.compose.ui.platform.E0 r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 r0 = (androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1) r0
            int r1 = r0.f103381c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f103381c = r1
            goto L18
        L13:
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 r0 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f103379a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f103381c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            kotlin.C4885d0.n(r7)
            goto L48
        L2f:
            kotlin.C4885d0.n(r7)
            java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex$a<java.lang.Object>> r7 = r5.f103378d
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2 r2 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2
            r2.<init>()
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3 r6 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3
            r4 = 0
            r6.<init>(r5, r4)
            r0.f103381c = r3
            java.lang.Object r6 = androidx.compose.ui.SessionMutex.j(r7, r2, r6, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidPlatformTextInputSession.a(androidx.compose.ui.platform.E0, kotlin.coroutines.e):java.lang.Object");
    }

    @Nullable
    public final InputConnection e(@NotNull EditorInfo editorInfo) {
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.f(this.f103378d);
        if (inputMethodSession != null) {
            return inputMethodSession.c(editorInfo);
        }
        return null;
    }

    public final boolean f() {
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.f(this.f103378d);
        return inputMethodSession != null && (inputMethodSession.f103593e ^ true);
    }

    @Override // androidx.compose.ui.platform.G0
    @NotNull
    public View getView() {
        return this.f103375a;
    }

    @Override // kotlinx.coroutines.L
    @NotNull
    public kotlin.coroutines.i m() {
        return this.f103377c.m();
    }
}

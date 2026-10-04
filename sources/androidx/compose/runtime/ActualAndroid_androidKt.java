package androidx.compose.runtime;

import android.os.Looper;
import android.util.Log;
import ed.InterfaceC4376a;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class ActualAndroid_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f98976a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final kotlin.G f98977b = kotlin.I.a(new InterfaceC4376a<InterfaceC1981y0>() { // from class: androidx.compose.runtime.ActualAndroid_androidKt$DefaultMonotonicFrameClock$2
        @Override // ed.InterfaceC4376a
        @NotNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1981y0 invoke() {
            return Looper.getMainLooper() != null ? DefaultChoreographerFrameClock.f99091a : SdkStubsFallbackFrameClock.f99338a;
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f98978c = "ComposeInternal";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f98979d;

    static {
        long id2;
        try {
            id2 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id2 = -1;
        }
        f98979d = id2;
    }

    @NotNull
    public static final D0 a(double d10) {
        return new ParcelableSnapshotMutableDoubleState(d10);
    }

    @NotNull
    public static final F0 b(float f10) {
        return new ParcelableSnapshotMutableFloatState(f10);
    }

    @NotNull
    public static final H0 c(int i10) {
        return new ParcelableSnapshotMutableIntState(i10);
    }

    @NotNull
    public static final J0 d(long j10) {
        return new ParcelableSnapshotMutableLongState(j10);
    }

    @NotNull
    public static final <T> androidx.compose.runtime.snapshots.v<T> e(T t10, @NotNull H1<T> h12) {
        return new ParcelableSnapshotMutableState(t10, h12);
    }

    @NotNull
    public static final InterfaceC1981y0 f() {
        return (InterfaceC1981y0) f98977b.getValue();
    }

    @InterfaceC4982o(message = "MonotonicFrameClocks are not globally applicable across platforms. Use an appropriate local clock.")
    public static /* synthetic */ void g() {
    }

    public static final long h() {
        return f98979d;
    }

    public static final void i(@NotNull String str, @NotNull Throwable th) {
        Log.e(f98978c, str, th);
    }
}

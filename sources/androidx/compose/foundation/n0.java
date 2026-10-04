package androidx.compose.foundation;

import android.os.Build;
import android.view.View;
import androidx.compose.runtime.T1;
import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@T1
public interface n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f92211a = a.f92212a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f92212a = new a();

        @T1
        @NotNull
        public final n0 a() {
            if (c0.d(0, 1, null)) {
                return Build.VERSION.SDK_INT == 28 ? o0.f92213b : p0.f92218b;
            }
            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }

    @NotNull
    m0 a(@NotNull View view, boolean z10, long j10, float f10, float f11, boolean z11, @NotNull InterfaceC4814e interfaceC4814e, float f12);

    boolean b();
}

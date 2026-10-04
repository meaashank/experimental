package androidx.compose.foundation;

import androidx.compose.runtime.T1;
import jd.C4806d;
import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@T1
public interface g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f89118a = a.f89119a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f89119a = new a();

        public static final int c(float f10, InterfaceC4814e interfaceC4814e, int i10, int i11) {
            return C4806d.L0(f10 * i11);
        }

        @NotNull
        public final g0 b(float f10) {
            return new f0(f10);
        }
    }

    int a(@NotNull InterfaceC4814e interfaceC4814e, int i10, int i11);
}

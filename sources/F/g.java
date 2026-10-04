package F;

import androidx.compose.runtime.T1;
import androidx.compose.ui.platform.InterfaceC2275r0;
import e.D;
import k0.InterfaceC4814e;
import kotlin.sequences.C4994g;
import kotlin.sequences.InterfaceC5000m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f33912a = new a();

    public static final class a implements f, InterfaceC2275r0 {
        @Override // androidx.compose.ui.platform.InterfaceC2275r0
        public /* bridge */ /* synthetic */ Object a() {
            return "ZeroCornerSize";
        }

        @Override // androidx.compose.ui.platform.InterfaceC2275r0
        public InterfaceC5000m b() {
            return C4994g.f218169a;
        }

        @Override // F.f
        public float c(long j10, @NotNull InterfaceC4814e interfaceC4814e) {
            return 0.0f;
        }

        @Override // androidx.compose.ui.platform.InterfaceC2275r0
        public /* synthetic */ String d() {
            return null;
        }

        @NotNull
        public String e() {
            return "ZeroCornerSize";
        }

        @NotNull
        public String toString() {
            return "ZeroCornerSize";
        }
    }

    @T1
    @NotNull
    public static final f a(float f10) {
        return new m(f10);
    }

    @T1
    @NotNull
    public static final f b(@D(from = 0, to = 100) int i10) {
        return new l(i10);
    }

    @T1
    @NotNull
    public static final f c(float f10) {
        return new j(f10);
    }

    @NotNull
    public static final f d() {
        return f33912a;
    }

    @T1
    public static /* synthetic */ void e() {
    }
}

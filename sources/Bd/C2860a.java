package bd;

import Q0.g;
import Xc.f;
import com.mbridge.msdk.MBridgeConstans;
import dd.j;
import ed.InterfaceC4376a;
import ed.l;
import kotlin.C;
import kotlin.C4987s;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4887e0;
import kotlin.L0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: bd.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@j(name = "AutoCloseableKt")
public final class C2860a {

    /* JADX INFO: renamed from: bd.a$a, reason: collision with other inner class name */
    @V({"SMAP\nAutoCloseableJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoCloseableJVM.kt\nkotlin/jdk7/AutoCloseableKt$AutoCloseable$1\n*L\n1#1,51:1\n*E\n"})
    public static final class C0350a implements AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4376a<L0> f126022a;

        public C0350a(InterfaceC4376a<L0> interfaceC4376a) {
            this.f126022a = interfaceC4376a;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            this.f126022a.invoke();
        }
    }

    @InterfaceC4887e0(version = MBridgeConstans.NATIVE_VIDEO_VERSION)
    @f
    public static final AutoCloseable a(InterfaceC4376a<L0> closeAction) {
        G.p(closeAction, "closeAction");
        return new C0350a(closeAction);
    }

    @InterfaceC4887e0(version = "1.2")
    @InterfaceC4850b0
    public static final void c(@Nullable AutoCloseable autoCloseable, @Nullable Throwable th) throws Exception {
        if (autoCloseable != null) {
            if (th == null) {
                g.a(autoCloseable);
                return;
            }
            try {
                g.a(autoCloseable);
            } catch (Throwable th2) {
                C4987s.a(th, th2);
            }
        }
    }

    @InterfaceC4887e0(version = "1.2")
    @C
    @f
    public static final <T extends AutoCloseable, R> R d(T t10, l<? super T, ? extends R> block) throws Exception {
        G.p(block, "block");
        try {
            R rInvoke = block.invoke(t10);
            c(t10, null);
            return rInvoke;
        } finally {
        }
    }

    @InterfaceC4887e0(version = MBridgeConstans.NATIVE_VIDEO_VERSION)
    public static /* synthetic */ void b() {
    }
}

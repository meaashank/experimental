package vd;

import android.annotation.SuppressLint;
import dd.o;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import kotlin.C4885d0;
import kotlin.Result;
import kotlin.jvm.internal.G;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sun.misc.Signal;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"all"})
@IgnoreJRERequirement
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f239956a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f239957b;

    public static final class a implements ClassFileTransformer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f239958a = new a();

        @Nullable
        public byte[] a(@Nullable ClassLoader classLoader, @NotNull String str, @Nullable Class<?> cls, @NotNull ProtectionDomain protectionDomain, @Nullable byte[] bArr) {
            if (classLoader == null || !G.g(str, "kotlin/coroutines/jvm/internal/DebugProbesKt")) {
                return null;
            }
            kotlinx.coroutines.debug.internal.a.f219270a.getClass();
            kotlinx.coroutines.debug.internal.a.f219271b = true;
            return kotlin.io.a.p(classLoader.getResourceAsStream("DebugProbesKt.bin"));
        }
    }

    static {
        Object objA;
        boolean zBooleanValue;
        try {
            String property = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            objA = property != null ? Boolean.valueOf(Boolean.parseBoolean(property)) : null;
        } catch (Throwable th) {
            objA = C4885d0.a(th);
        }
        Boolean bool = (Boolean) (objA instanceof Result.Failure ? null : objA);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            DebugProbesImpl.f219244a.getClass();
            zBooleanValue = DebugProbesImpl.f219250g;
        }
        f239957b = zBooleanValue;
    }

    public static final void c(Signal signal) {
        DebugProbesImpl debugProbesImpl = DebugProbesImpl.f219244a;
        if (debugProbesImpl.B()) {
            debugProbesImpl.f(System.out);
        } else {
            System.out.println((Object) "Cannot perform coroutines dump, debug probes are disabled");
        }
    }

    @o
    public static final void d(@Nullable String str, @NotNull Instrumentation instrumentation) {
        kotlinx.coroutines.debug.internal.a.f219270a.getClass();
        kotlinx.coroutines.debug.internal.a.f219271b = true;
        instrumentation.addTransformer(a.f239958a);
        DebugProbesImpl debugProbesImpl = DebugProbesImpl.f219244a;
        boolean z10 = f239957b;
        debugProbesImpl.getClass();
        DebugProbesImpl.f219250g = z10;
        debugProbesImpl.z();
        f239956a.b();
    }

    public final void b() {
        try {
            Signal.handle(new Signal("TRAP"), new vd.a());
        } catch (Throwable unused) {
        }
    }
}

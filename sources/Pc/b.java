package Pc;

import Xc.f;
import dd.j;
import ed.InterfaceC4376a;
import kotlin.L0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nThread.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Thread.kt\nkotlin/concurrent/ThreadsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
@j(name = "ThreadsKt")
public final class b {

    public static final class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4376a<L0> f65707a;

        public a(InterfaceC4376a<L0> interfaceC4376a) {
            this.f65707a = interfaceC4376a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f65707a.invoke();
        }
    }

    @f
    public static final <T> T a(ThreadLocal<T> threadLocal, InterfaceC4376a<? extends T> interfaceC4376a) {
        G.p(threadLocal, "<this>");
        G.p(interfaceC4376a, "default");
        T t10 = threadLocal.get();
        if (t10 != null) {
            return t10;
        }
        T tInvoke = interfaceC4376a.invoke();
        threadLocal.set(tInvoke);
        return tInvoke;
    }

    @NotNull
    public static final Thread b(boolean z10, boolean z11, @Nullable ClassLoader classLoader, @Nullable String str, int i10, @NotNull InterfaceC4376a<L0> block) {
        G.p(block, "block");
        a aVar = new a(block);
        if (z11) {
            aVar.setDaemon(true);
        }
        if (i10 > 0) {
            aVar.setPriority(i10);
        }
        if (str != null) {
            aVar.setName(str);
        }
        if (classLoader != null) {
            aVar.setContextClassLoader(classLoader);
        }
        if (z10) {
            aVar.start();
        }
        return aVar;
    }

    public static /* synthetic */ Thread c(boolean z10, boolean z11, ClassLoader classLoader, String str, int i10, InterfaceC4376a interfaceC4376a, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            classLoader = null;
        }
        if ((i11 & 8) != 0) {
            str = null;
        }
        if ((i11 & 16) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        String str2 = str;
        return b(z10, z11, classLoader, str2, i12, interfaceC4376a);
    }
}

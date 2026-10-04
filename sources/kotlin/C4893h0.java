package kotlin;

import ed.InterfaceC4376a;

/* JADX INFO: renamed from: kotlin.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C4893h0 extends C4891g0 {
    @C
    @Xc.f
    public static final <R> R l(Object lock, InterfaceC4376a<? extends R> block) {
        R rInvoke;
        kotlin.jvm.internal.G.p(lock, "lock");
        kotlin.jvm.internal.G.p(block, "block");
        synchronized (lock) {
            rInvoke = block.invoke();
        }
        return rInvoke;
    }
}

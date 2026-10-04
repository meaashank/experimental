package kotlinx.coroutines;

import kotlinx.coroutines.internal.C5088w;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/NodeList\n+ 2 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n*L\n1#1,1461:1\n336#2,6:1462\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/NodeList\n*L\n1371#1:1462,6\n*E\n"})
public final class K0 extends C5088w implements InterfaceC5114u0 {
    @NotNull
    public final String J(@NotNull String str) {
        StringBuilder sbA = androidx.activity.result.i.a("List{", str, "}[");
        Object objL = l();
        kotlin.jvm.internal.G.n(objL, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        boolean z10 = true;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeM = (LockFreeLinkedListNode) objL; !lockFreeLinkedListNodeM.equals(this); lockFreeLinkedListNodeM = lockFreeLinkedListNodeM.m()) {
            if (lockFreeLinkedListNodeM instanceof F0) {
                F0 f02 = (F0) lockFreeLinkedListNodeM;
                if (z10) {
                    z10 = false;
                } else {
                    sbA.append(U6.j.f68738d);
                }
                sbA.append(f02);
            }
        }
        sbA.append("]");
        String string = sbA.toString();
        kotlin.jvm.internal.G.o(string, "toString(...)");
        return string;
    }

    @Override // kotlinx.coroutines.InterfaceC5114u0
    @NotNull
    public K0 getList() {
        return this;
    }

    @Override // kotlinx.coroutines.InterfaceC5114u0
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    @NotNull
    public String toString() {
        return super.toString();
    }
}

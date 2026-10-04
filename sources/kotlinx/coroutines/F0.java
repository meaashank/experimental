package kotlinx.coroutines;

import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class F0 extends LockFreeLinkedListNode implements InterfaceC5118w0, InterfaceC5058e0, InterfaceC5114u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JobSupport f218717d;

    @NotNull
    public final JobSupport G() {
        JobSupport jobSupport = this.f218717d;
        if (jobSupport != null) {
            return jobSupport;
        }
        kotlin.jvm.internal.G.S("job");
        throw null;
    }

    public final void H(@NotNull JobSupport jobSupport) {
        this.f218717d = jobSupport;
    }

    @Override // kotlinx.coroutines.InterfaceC5058e0
    public void dispose() {
        G().u1(this);
    }

    @Override // kotlinx.coroutines.InterfaceC5114u0
    @Nullable
    public K0 getList() {
        return null;
    }

    @Override // kotlinx.coroutines.InterfaceC5114u0
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '@' + O.b(this) + "[job@" + O.b(G()) + ']';
    }
}

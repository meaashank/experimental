package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.InterfaceC5120x0;
import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC5120x0
public interface i<T> extends kotlinx.coroutines.flow.e<T> {

    public static final class a {
        public static /* synthetic */ kotlinx.coroutines.flow.e a(i iVar, kotlin.coroutines.i iVar2, int i10, BufferOverflow bufferOverflow, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i11 & 1) != 0) {
                iVar2 = EmptyCoroutineContext.f217673a;
            }
            if ((i11 & 2) != 0) {
                i10 = -3;
            }
            if ((i11 & 4) != 0) {
                bufferOverflow = BufferOverflow.SUSPEND;
            }
            return iVar.b(iVar2, i10, bufferOverflow);
        }
    }

    @NotNull
    kotlinx.coroutines.flow.e<T> b(@NotNull kotlin.coroutines.i iVar, int i10, @NotNull BufferOverflow bufferOverflow);
}

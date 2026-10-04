package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlinx.coroutines.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC5118w0 {

    /* JADX INFO: renamed from: kotlinx.coroutines.w0$a */
    public static final class a implements InterfaceC5118w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ed.l<Throwable, kotlin.L0> f220807a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull ed.l<? super Throwable, kotlin.L0> lVar) {
            this.f220807a = lVar;
        }

        @Override // kotlinx.coroutines.InterfaceC5118w0
        public void a(@Nullable Throwable th) {
            this.f220807a.invoke(th);
        }

        @NotNull
        public String toString() {
            return "InternalCompletionHandler.UserSupplied[" + O.a(this.f220807a) + '@' + O.b(this) + ']';
        }
    }

    void a(@Nullable Throwable th);
}

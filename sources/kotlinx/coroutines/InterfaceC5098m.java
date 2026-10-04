package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlinx.coroutines.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC5098m extends N0 {

    /* JADX INFO: renamed from: kotlinx.coroutines.m$a */
    public static final class a implements InterfaceC5098m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ed.l<Throwable, kotlin.L0> f220408a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull ed.l<? super Throwable, kotlin.L0> lVar) {
            this.f220408a = lVar;
        }

        @Override // kotlinx.coroutines.InterfaceC5098m
        public void a(@Nullable Throwable th) {
            this.f220408a.invoke(th);
        }

        @NotNull
        public String toString() {
            return "CancelHandler.UserSupplied[" + O.a(this.f220408a) + '@' + O.b(this) + ']';
        }
    }

    void a(@Nullable Throwable th);
}

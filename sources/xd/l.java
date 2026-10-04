package xd;

import kotlinx.coroutines.O;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dd.g
    @NotNull
    public final Runnable f240627c;

    public l(@NotNull Runnable runnable, long j10, @NotNull j jVar) {
        super(j10, jVar);
        this.f240627c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f240627c.run();
        } finally {
            this.f240625b.d();
        }
    }

    @NotNull
    public String toString() {
        return "Task[" + O.a(this.f240627c) + '@' + O.b(this.f240627c) + U6.j.f68738d + this.f240624a + U6.j.f68738d + this.f240625b + ']';
    }
}

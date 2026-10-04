package wb;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c extends C5773b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AtomicLong f240227k;

    public c(int i10, int i11, int i12) {
        super(i10, i11, i12);
        this.f240227k = new AtomicLong(0L);
    }

    @Override // wb.C5773b
    public long a(int i10) {
        return this.f240227k.get();
    }

    @Override // wb.C5773b
    public void c(boolean z10, Exception exc) {
        if (z10) {
            this.f240227k.set(0L);
        } else if (f(exc)) {
            AtomicLong atomicLong = this.f240227k;
            atomicLong.set(Math.max(Math.min(this.f240219b, atomicLong.get() * 2), this.f240218a));
        }
    }

    public abstract boolean f(Exception exc);
}

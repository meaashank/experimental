package z3;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: z3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5855c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f241217a = false;

    /* JADX INFO: renamed from: z3.c$b */
    public static class b extends AbstractC5855c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile RuntimeException f241218b;

        @Override // z3.AbstractC5855c
        public void b(boolean z10) {
            if (z10) {
                this.f241218b = new RuntimeException("Released");
            } else {
                this.f241218b = null;
            }
        }

        @Override // z3.AbstractC5855c
        public void c() {
            if (this.f241218b != null) {
                throw new IllegalStateException("Already released", this.f241218b);
            }
        }
    }

    /* JADX INFO: renamed from: z3.c$c, reason: collision with other inner class name */
    public static class C0914c extends AbstractC5855c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile boolean f241219b;

        @Override // z3.AbstractC5855c
        public void b(boolean z10) {
            this.f241219b = z10;
        }

        @Override // z3.AbstractC5855c
        public void c() {
            if (this.f241219b) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public AbstractC5855c() {
    }

    @NonNull
    public static AbstractC5855c a() {
        return new C0914c();
    }

    public abstract void b(boolean z10);

    public abstract void c();

    public AbstractC5855c(a aVar) {
    }
}

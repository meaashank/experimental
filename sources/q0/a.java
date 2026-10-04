package Q0;

import Q0.k;
import Q0.l;
import Q0.m;
import android.graphics.Typeface;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final l.d f65709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Executor f65710b;

    /* JADX INFO: renamed from: Q0.a$a, reason: collision with other inner class name */
    public class RunnableC0096a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l.d f65711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Typeface f65712b;

        public RunnableC0096a(l.d dVar, Typeface typeface) {
            this.f65711a = dVar;
            this.f65712b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f65711a.b(this.f65712b);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l.d f65714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f65715b;

        public b(l.d dVar, int i10) {
            this.f65714a = dVar;
            this.f65715b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f65714a.a(this.f65715b);
        }
    }

    public a(@NonNull l.d dVar, @NonNull Executor executor) {
        this.f65709a = dVar;
        this.f65710b = executor;
    }

    public final void a(int i10) {
        this.f65710b.execute(new b(this.f65709a, i10));
    }

    public void b(@NonNull k.e eVar) {
        if (eVar.a()) {
            c(eVar.f65746a);
        } else {
            a(eVar.f65747b);
        }
    }

    public final void c(@NonNull Typeface typeface) {
        this.f65710b.execute(new RunnableC0096a(this.f65709a, typeface));
    }

    public a(@NonNull l.d dVar) {
        this(dVar, new m.b(Q0.b.a()));
    }
}

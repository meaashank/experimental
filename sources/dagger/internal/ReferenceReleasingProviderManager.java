package dagger.internal;

import dc.InterfaceC4322c;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes7.dex */
@f
public final class ReferenceReleasingProviderManager implements InterfaceC4322c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<? extends Annotation> f194916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Queue<WeakReference<l<?>>> f194917b = new ConcurrentLinkedQueue();

    public enum Operation {
        RELEASE { // from class: dagger.internal.ReferenceReleasingProviderManager.Operation.1
            @Override // dagger.internal.ReferenceReleasingProviderManager.Operation
            public void execute(l<?> provider) {
                provider.c();
            }
        },
        RESTORE { // from class: dagger.internal.ReferenceReleasingProviderManager.Operation.2
            @Override // dagger.internal.ReferenceReleasingProviderManager.Operation
            public void execute(l<?> provider) {
                provider.d();
            }
        };

        public abstract void execute(l<?> provider);
    }

    public ReferenceReleasingProviderManager(Class<? extends Annotation> scope) {
        scope.getClass();
        this.f194916a = scope;
    }

    @Override // dc.InterfaceC4322c
    public void a() {
        f(Operation.RESTORE);
    }

    @Override // dc.InterfaceC4322c
    public Class<? extends Annotation> c() {
        return this.f194916a;
    }

    @Override // dc.InterfaceC4322c
    public void d() {
        f(Operation.RELEASE);
    }

    public void e(l<?> provider) {
        this.f194917b.add(new WeakReference<>(provider));
    }

    public final void f(Operation operation) {
        Iterator<WeakReference<l<?>>> it = this.f194917b.iterator();
        while (it.hasNext()) {
            l<?> lVar = it.next().get();
            if (lVar == null) {
                it.remove();
            } else {
                operation.execute(lVar);
            }
        }
    }
}

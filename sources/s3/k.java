package s3;

import androidx.annotation.NonNull;
import androidx.lifecycle.A;
import androidx.lifecycle.B;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.S;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements j, A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Set<l> f238494a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Lifecycle f238495b;

    public k(Lifecycle lifecycle) {
        this.f238495b = lifecycle;
        lifecycle.c(this);
    }

    @Override // s3.j
    public void a(@NonNull l lVar) {
        this.f238494a.add(lVar);
        if (this.f238495b.d() == Lifecycle.State.DESTROYED) {
            lVar.onDestroy();
        } else if (this.f238495b.d().isAtLeast(Lifecycle.State.STARTED)) {
            lVar.onStart();
        } else {
            lVar.onStop();
        }
    }

    @Override // s3.j
    public void b(@NonNull l lVar) {
        this.f238494a.remove(lVar);
    }

    @S(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(@NonNull B b10) {
        ArrayList arrayList = (ArrayList) y3.o.l(this.f238494a);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((l) obj).onDestroy();
        }
        b10.getLifecycle().g(this);
    }

    @S(Lifecycle.Event.ON_START)
    public void onStart(@NonNull B b10) {
        ArrayList arrayList = (ArrayList) y3.o.l(this.f238494a);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((l) obj).onStart();
        }
    }

    @S(Lifecycle.Event.ON_STOP)
    public void onStop(@NonNull B b10) {
        ArrayList arrayList = (ArrayList) y3.o.l(this.f238494a);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((l) obj).onStop();
        }
    }
}

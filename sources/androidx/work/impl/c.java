package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.K;
import androidx.lifecycle.P;
import androidx.work.j;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class c implements androidx.work.j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final P<j.b> f120378c = new P<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.work.impl.utils.futures.a<j.b.c> f120379d = androidx.work.impl.utils.futures.a.u();

    public c() {
        a(androidx.work.j.f120555b);
    }

    public void a(@NonNull j.b state) {
        this.f120378c.o(state);
        if (state instanceof j.b.c) {
            this.f120379d.p((j.b.c) state);
        } else if (state instanceof j.b.a) {
            this.f120379d.q(((j.b.a) state).f120556a);
        }
    }

    @Override // androidx.work.j
    @NonNull
    public ListenableFuture<j.b.c> getResult() {
        return this.f120379d;
    }

    @Override // androidx.work.j
    @NonNull
    public K<j.b> getState() {
        return this.f120378c;
    }
}

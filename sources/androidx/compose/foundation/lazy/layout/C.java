package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.HandleAndRequestImpl;
import androidx.compose.runtime.T1;
import java.util.ArrayList;
import java.util.List;
import kotlin.L0;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.L
@T1
public final class C {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f91536e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final O f91537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final ed.l<J, L0> f91538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final L f91539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public PrefetchHandleProvider f91540d;

    public final class a implements J {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<M> f91541a = new ArrayList();

        public a() {
        }

        @Override // androidx.compose.foundation.lazy.layout.J
        public void a(int i10) {
            b(i10, D.f91544b);
        }

        @Override // androidx.compose.foundation.lazy.layout.J
        public void b(int i10, long j10) {
            C c10 = C.this;
            PrefetchHandleProvider prefetchHandleProvider = c10.f91540d;
            if (prefetchHandleProvider == null) {
                return;
            }
            this.f91541a.add(prefetchHandleProvider.new HandleAndRequestImpl(i10, j10, c10.f91539c));
        }

        @NotNull
        public final List<M> c() {
            return this.f91541a;
        }
    }

    public interface b {
        void a();

        void cancel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @NotNull
    public final List<M> b() {
        ed.l<J, L0> lVar = this.f91538b;
        if (lVar == null) {
            return EmptyList.f217510a;
        }
        a aVar = new a();
        lVar.invoke(aVar);
        return aVar.f91541a;
    }

    @Nullable
    public final PrefetchHandleProvider c() {
        return this.f91540d;
    }

    @Nullable
    public final O d() {
        return this.f91537a;
    }

    @NotNull
    public final b e(int i10) {
        return f(i10, D.f91544b);
    }

    @NotNull
    public final b f(int i10, long j10) {
        PrefetchHandleProvider prefetchHandleProvider = this.f91540d;
        return prefetchHandleProvider != null ? prefetchHandleProvider.d(i10, j10, this.f91539c) : C1728b.f91813a;
    }

    public final void g(@Nullable PrefetchHandleProvider prefetchHandleProvider) {
        this.f91540d = prefetchHandleProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C(@Nullable O o10, @Nullable ed.l<? super J, L0> lVar) {
        this.f91537a = o10;
        this.f91538b = lVar;
        this.f91539c = new L();
    }

    public /* synthetic */ C(O o10, ed.l lVar, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? null : o10, (i10 & 2) != 0 ? null : lVar);
    }
}

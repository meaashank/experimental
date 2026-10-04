package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.collection.C1531f0;

/* JADX INFO: loaded from: classes2.dex */
public interface G {

    public static class a implements G {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f116298a = 0;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.G$a$a, reason: collision with other inner class name */
        public class C0319a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C1531f0<Long> f116299a = new C1531f0<>();

            public C0319a() {
            }

            @Override // androidx.recyclerview.widget.G.d
            public long a(long j10) {
                Long lG = this.f116299a.g(j10);
                if (lG == null) {
                    lG = Long.valueOf(a.this.b());
                    this.f116299a.m(j10, lG);
                }
                return lG.longValue();
            }
        }

        @Override // androidx.recyclerview.widget.G
        @NonNull
        public d a() {
            return new C0319a();
        }

        public long b() {
            long j10 = this.f116298a;
            this.f116298a = 1 + j10;
            return j10;
        }
    }

    public static class b implements G {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f116301a = new a();

        public class a implements d {
            public a() {
            }

            @Override // androidx.recyclerview.widget.G.d
            public long a(long j10) {
                return -1L;
            }
        }

        @Override // androidx.recyclerview.widget.G
        @NonNull
        public d a() {
            return this.f116301a;
        }
    }

    public static class c implements G {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f116303a = new a();

        public class a implements d {
            public a() {
            }

            @Override // androidx.recyclerview.widget.G.d
            public long a(long j10) {
                return j10;
            }
        }

        @Override // androidx.recyclerview.widget.G
        @NonNull
        public d a() {
            return this.f116303a;
        }
    }

    public interface d {
        long a(long j10);
    }

    @NonNull
    d a();
}

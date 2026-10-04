package l3;

import androidx.annotation.NonNull;
import g3.C4447e;
import java.io.InputStream;
import java.net.URL;
import k3.m;
import k3.n;
import k3.q;

/* JADX INFO: loaded from: classes2.dex */
public class i implements m<URL, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m<k3.h, InputStream> f220943a;

    public i(m<k3.h, InputStream> mVar) {
        this.f220943a = mVar;
    }

    @Override // k3.m
    public /* bridge */ /* synthetic */ boolean b(@NonNull URL url) {
        return true;
    }

    @Override // k3.m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a<InputStream> a(@NonNull URL url, int i10, int i11, @NonNull C4447e c4447e) {
        return this.f220943a.a(new k3.h(url), i10, i11, c4447e);
    }

    public boolean d(@NonNull URL url) {
        return true;
    }

    public static class a implements n<URL, InputStream> {
        @Override // k3.n
        @NonNull
        public m<URL, InputStream> e(q qVar) {
            return new i(qVar.d(k3.h.class, InputStream.class));
        }

        @Override // k3.n
        public void d() {
        }
    }
}

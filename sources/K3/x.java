package k3;

import android.net.Uri;
import androidx.annotation.NonNull;
import g3.C4447e;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import k3.m;

/* JADX INFO: loaded from: classes2.dex */
public class x<Data> implements m<Uri, Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<String> f214454b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m<h, Data> f214455a;

    public x(m<h, Data> mVar) {
        this.f214455a = mVar;
    }

    @Override // k3.m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a<Data> a(@NonNull Uri uri, int i10, int i11, @NonNull C4447e c4447e) {
        return this.f214455a.a(new h(uri.toString()), i10, i11, c4447e);
    }

    @Override // k3.m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Uri uri) {
        return f214454b.contains(uri.getScheme());
    }

    public static class a implements n<Uri, InputStream> {
        @Override // k3.n
        @NonNull
        public m<Uri, InputStream> e(q qVar) {
            return new x(qVar.d(h.class, InputStream.class));
        }

        @Override // k3.n
        public void d() {
        }
    }
}

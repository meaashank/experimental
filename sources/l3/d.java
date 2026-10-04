package l3;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import g3.C4447e;
import h3.C4488b;
import java.io.InputStream;
import k3.m;
import k3.n;
import k3.q;
import x3.C5785e;

/* JADX INFO: loaded from: classes2.dex */
public class d implements m<Uri, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f220922a;

    public d(Context context) {
        this.f220922a = context.getApplicationContext();
    }

    @Override // k3.m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a<InputStream> a(@NonNull Uri uri, int i10, int i11, @NonNull C4447e c4447e) {
        if (C4488b.e(i10, i11)) {
            return new m.a<>(new C5785e(uri), h3.c.f(this.f220922a, uri));
        }
        return null;
    }

    @Override // k3.m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Uri uri) {
        return C4488b.b(uri);
    }

    public static class a implements n<Uri, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f220923a;

        public a(Context context) {
            this.f220923a = context;
        }

        @Override // k3.n
        @NonNull
        public m<Uri, InputStream> e(q qVar) {
            return new d(this.f220923a);
        }

        @Override // k3.n
        public void d() {
        }
    }
}

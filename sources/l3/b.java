package l3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.data.j;
import g3.C4446d;
import g3.C4447e;
import java.io.InputStream;
import k3.l;
import k3.m;
import k3.n;
import k3.q;

/* JADX INFO: loaded from: classes2.dex */
public class b implements m<k3.h, InputStream> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C4446d<Integer> f220919b = C4446d.g("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final l<k3.h, k3.h> f220920a;

    public b() {
        this(null);
    }

    @Override // k3.m
    public /* bridge */ /* synthetic */ boolean b(@NonNull k3.h hVar) {
        return true;
    }

    @Override // k3.m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a<InputStream> a(@NonNull k3.h hVar, int i10, int i11, @NonNull C4447e c4447e) {
        l<k3.h, k3.h> lVar = this.f220920a;
        if (lVar != null) {
            k3.h hVarB = lVar.b(hVar, 0, 0);
            if (hVarB == null) {
                this.f220920a.c(hVar, 0, 0, hVar);
            } else {
                hVar = hVarB;
            }
        }
        return new m.a<>(hVar, new j(hVar, ((Integer) c4447e.c(f220919b)).intValue()));
    }

    public boolean d(@NonNull k3.h hVar) {
        return true;
    }

    public b(@Nullable l<k3.h, k3.h> lVar) {
        this.f220920a = lVar;
    }

    public static class a implements n<k3.h, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l<k3.h, k3.h> f220921a = new l<>(500);

        @Override // k3.n
        @NonNull
        public m<k3.h, InputStream> e(q qVar) {
            return new b(this.f220921a);
        }

        @Override // k3.n
        public void d() {
        }
    }
}

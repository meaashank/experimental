package Ua;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.lib.pfs.file.image.PrivateImage;
import g3.C4447e;
import java.io.InputStream;
import k3.m;
import k3.n;
import k3.q;
import x3.C5785e;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class b implements m<PrivateImage, InputStream> {
    @Override // k3.m
    public /* bridge */ /* synthetic */ boolean b(@NonNull PrivateImage privateImage) {
        return true;
    }

    @Override // k3.m
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a<InputStream> a(@NonNull PrivateImage privateImage, int i10, int i11, @NonNull C4447e c4447e) {
        return new m.a<>(new C5785e(privateImage.getRealPath()), new Ua.a(privateImage));
    }

    public boolean d(@NonNull PrivateImage privateImage) {
        return true;
    }

    public static class a implements n<PrivateImage, InputStream> {
        @Override // k3.n
        @NonNull
        public m<PrivateImage, InputStream> e(@NonNull q qVar) {
            return new b();
        }

        @Override // k3.n
        public void d() {
        }
    }
}

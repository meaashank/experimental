package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import androidx.media.k;
import e.T;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@T(28)
public class s extends l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediaSessionManager f114657h;

    public s(Context context) {
        super(context);
        this.f114657h = (MediaSessionManager) context.getSystemService(Q7.b.f67650e);
    }

    @Override // androidx.media.l, androidx.media.t, androidx.media.k.a
    public boolean a(k.c cVar) {
        if (cVar instanceof a) {
            return this.f114657h.isTrustedForMediaControl(((a) cVar).f114658a);
        }
        return false;
    }

    public static final class a implements k.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaSessionManager.RemoteUserInfo f114658a;

        public a(String str, int i10, int i11) {
            this.f114658a = r.a(str, i10, i11);
        }

        @Override // androidx.media.k.c
        public int c() {
            return this.f114658a.getPid();
        }

        @Override // androidx.media.k.c
        public int d() {
            return this.f114658a.getUid();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.f114658a.equals(((a) obj).f114658a);
            }
            return false;
        }

        @Override // androidx.media.k.c
        public String getPackageName() {
            return this.f114658a.getPackageName();
        }

        public int hashCode() {
            return Objects.hash(this.f114658a);
        }

        public a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.f114658a = remoteUserInfo;
        }
    }
}

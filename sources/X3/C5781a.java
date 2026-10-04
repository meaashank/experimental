package x3;

import android.content.Context;
import androidx.annotation.NonNull;
import g3.InterfaceC4444b;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import y3.o;

/* JADX INFO: renamed from: x3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5781a implements InterfaceC4444b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f240481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC4444b f240482d;

    public C5781a(int i10, InterfaceC4444b interfaceC4444b) {
        this.f240481c = i10;
        this.f240482d = interfaceC4444b;
    }

    @NonNull
    public static InterfaceC4444b c(@NonNull Context context) {
        return new C5781a(context.getResources().getConfiguration().uiMode & 48, C5782b.c(context));
    }

    @Override // g3.InterfaceC4444b
    public void b(@NonNull MessageDigest messageDigest) {
        this.f240482d.b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f240481c).array());
    }

    @Override // g3.InterfaceC4444b
    public boolean equals(Object obj) {
        if (obj instanceof C5781a) {
            C5781a c5781a = (C5781a) obj;
            if (this.f240481c == c5781a.f240481c && this.f240482d.equals(c5781a.f240482d)) {
                return true;
            }
        }
        return false;
    }

    @Override // g3.InterfaceC4444b
    public int hashCode() {
        return o.r(this.f240482d, this.f240481c);
    }
}

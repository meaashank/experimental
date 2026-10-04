package x3;

import androidx.annotation.NonNull;
import g3.InterfaceC4444b;
import java.security.MessageDigest;
import y3.m;

/* JADX INFO: renamed from: x3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5785e implements InterfaceC4444b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f240489c;

    public C5785e(@NonNull Object obj) {
        m.f(obj, "Argument must not be null");
        this.f240489c = obj;
    }

    @Override // g3.InterfaceC4444b
    public void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.f240489c.toString().getBytes(InterfaceC4444b.f202232b));
    }

    @Override // g3.InterfaceC4444b
    public boolean equals(Object obj) {
        if (obj instanceof C5785e) {
            return this.f240489c.equals(((C5785e) obj).f240489c);
        }
        return false;
    }

    @Override // g3.InterfaceC4444b
    public int hashCode() {
        return this.f240489c.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f240489c + '}';
    }
}

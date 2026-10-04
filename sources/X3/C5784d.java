package x3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import g3.InterfaceC4444b;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: renamed from: x3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5784d implements InterfaceC4444b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final String f240486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f240487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f240488e;

    public C5784d(@Nullable String str, long j10, int i10) {
        this.f240486c = str == null ? "" : str;
        this.f240487d = j10;
        this.f240488e = i10;
    }

    @Override // g3.InterfaceC4444b
    public void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.f240487d).putInt(this.f240488e).array());
        messageDigest.update(this.f240486c.getBytes(InterfaceC4444b.f202232b));
    }

    @Override // g3.InterfaceC4444b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5784d c5784d = (C5784d) obj;
        return this.f240487d == c5784d.f240487d && this.f240488e == c5784d.f240488e && this.f240486c.equals(c5784d.f240486c);
    }

    @Override // g3.InterfaceC4444b
    public int hashCode() {
        int iHashCode = this.f240486c.hashCode() * 31;
        long j10 = this.f240487d;
        return ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f240488e;
    }
}

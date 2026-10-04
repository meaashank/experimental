package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import g3.C4447e;
import g3.InterfaceC4444b;
import g3.InterfaceC4450h;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements InterfaceC4444b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final y3.j<Class<?>, byte[]> f139781k = new y3.j<>(50);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.b f139782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC4444b f139783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC4444b f139784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f139785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f139786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Class<?> f139787h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C4447e f139788i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC4450h<?> f139789j;

    public u(com.bumptech.glide.load.engine.bitmap_recycle.b bVar, InterfaceC4444b interfaceC4444b, InterfaceC4444b interfaceC4444b2, int i10, int i11, InterfaceC4450h<?> interfaceC4450h, Class<?> cls, C4447e c4447e) {
        this.f139782c = bVar;
        this.f139783d = interfaceC4444b;
        this.f139784e = interfaceC4444b2;
        this.f139785f = i10;
        this.f139786g = i11;
        this.f139789j = interfaceC4450h;
        this.f139787h = cls;
        this.f139788i = c4447e;
    }

    @Override // g3.InterfaceC4444b
    public void b(@NonNull MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f139782c.d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f139785f).putInt(this.f139786g).array();
        this.f139784e.b(messageDigest);
        this.f139783d.b(messageDigest);
        messageDigest.update(bArr);
        InterfaceC4450h<?> interfaceC4450h = this.f139789j;
        if (interfaceC4450h != null) {
            interfaceC4450h.b(messageDigest);
        }
        this.f139788i.b(messageDigest);
        messageDigest.update(c());
        this.f139782c.put(bArr);
    }

    public final byte[] c() {
        y3.j<Class<?>, byte[]> jVar = f139781k;
        byte[] bArrK = jVar.k(this.f139787h);
        if (bArrK != null) {
            return bArrK;
        }
        byte[] bytes = this.f139787h.getName().getBytes(InterfaceC4444b.f202232b);
        jVar.o(this.f139787h, bytes);
        return bytes;
    }

    @Override // g3.InterfaceC4444b
    public boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f139786g == uVar.f139786g && this.f139785f == uVar.f139785f && y3.o.e(this.f139789j, uVar.f139789j) && this.f139787h.equals(uVar.f139787h) && this.f139783d.equals(uVar.f139783d) && this.f139784e.equals(uVar.f139784e) && this.f139788i.equals(uVar.f139788i)) {
                return true;
            }
        }
        return false;
    }

    @Override // g3.InterfaceC4444b
    public int hashCode() {
        int iHashCode = ((((this.f139784e.hashCode() + (this.f139783d.hashCode() * 31)) * 31) + this.f139785f) * 31) + this.f139786g;
        InterfaceC4450h<?> interfaceC4450h = this.f139789j;
        if (interfaceC4450h != null) {
            iHashCode = (iHashCode * 31) + interfaceC4450h.hashCode();
        }
        return this.f139788i.f202239c.hashCode() + ((this.f139787h.hashCode() + (iHashCode * 31)) * 31);
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f139783d + ", signature=" + this.f139784e + ", width=" + this.f139785f + ", height=" + this.f139786g + ", decodedResourceClass=" + this.f139787h + ", transformation='" + this.f139789j + "', options=" + this.f139788i + '}';
    }
}

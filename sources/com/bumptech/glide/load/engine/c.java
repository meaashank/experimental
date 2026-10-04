package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import g3.InterfaceC4444b;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements InterfaceC4444b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4444b f139574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC4444b f139575d;

    public c(InterfaceC4444b interfaceC4444b, InterfaceC4444b interfaceC4444b2) {
        this.f139574c = interfaceC4444b;
        this.f139575d = interfaceC4444b2;
    }

    @Override // g3.InterfaceC4444b
    public void b(@NonNull MessageDigest messageDigest) {
        this.f139574c.b(messageDigest);
        this.f139575d.b(messageDigest);
    }

    public InterfaceC4444b c() {
        return this.f139574c;
    }

    @Override // g3.InterfaceC4444b
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f139574c.equals(cVar.f139574c) && this.f139575d.equals(cVar.f139575d)) {
                return true;
            }
        }
        return false;
    }

    @Override // g3.InterfaceC4444b
    public int hashCode() {
        return this.f139575d.hashCode() + (this.f139574c.hashCode() * 31);
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f139574c + ", signature=" + this.f139575d + '}';
    }
}

package com.bumptech.glide;

import androidx.annotation.NonNull;
import com.bumptech.glide.l;
import w3.C5743d;
import w3.C5746g;
import w3.C5747h;
import w3.C5748i;
import w3.InterfaceC5745f;
import y3.m;
import y3.o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l<CHILD extends l<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC5745f<? super TranscodeType> f139377a = (InterfaceC5745f<? super TranscodeType>) C5743d.f240083b;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public final CHILD b() {
        g(C5743d.f240083b);
        return this;
    }

    public final InterfaceC5745f<? super TranscodeType> c() {
        return this.f139377a;
    }

    public final CHILD e() {
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            return o.e(this.f139377a, ((l) obj).f139377a);
        }
        return false;
    }

    @NonNull
    public final CHILD f(int i10) {
        this.f139377a = new C5746g(i10);
        return this;
    }

    @NonNull
    public final CHILD g(@NonNull InterfaceC5745f<? super TranscodeType> interfaceC5745f) {
        m.f(interfaceC5745f, "Argument must not be null");
        this.f139377a = interfaceC5745f;
        return this;
    }

    @NonNull
    public final CHILD h(@NonNull C5748i.a aVar) {
        this.f139377a = new C5747h(aVar);
        return this;
    }

    public int hashCode() {
        InterfaceC5745f<? super TranscodeType> interfaceC5745f = this.f139377a;
        if (interfaceC5745f != null) {
            return interfaceC5745f.hashCode();
        }
        return 0;
    }
}

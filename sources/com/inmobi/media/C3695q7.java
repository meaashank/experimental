package com.inmobi.media;

import fd.InterfaceC4421d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.inmobi.media.q7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3695q7 implements Iterator, InterfaceC4421d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f153296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3708r7 f153297b;

    public C3695q7(C3708r7 c3708r7) {
        this.f153297b = c3708r7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f153296a < this.f153297b.f153311B;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            ArrayList arrayList = this.f153297b.f153310A;
            int i10 = this.f153296a;
            this.f153296a = i10 + 1;
            C3639m7 c3639m7 = (C3639m7) arrayList.get(i10);
            kotlin.jvm.internal.G.m(c3639m7);
            return c3639m7;
        } catch (IndexOutOfBoundsException e10) {
            this.f153296a--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

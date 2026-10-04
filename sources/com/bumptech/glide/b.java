package com.bumptech.glide;

import androidx.annotation.NonNull;
import w3.C5743d;
import w3.C5748i;
import w3.InterfaceC5745f;

/* JADX INFO: loaded from: classes2.dex */
public final class b<TranscodeType> extends l<b<TranscodeType>, TranscodeType> {
    @NonNull
    public static <TranscodeType> b<TranscodeType> i(int i10) {
        b<TranscodeType> bVar = new b<>();
        bVar.f(i10);
        return bVar;
    }

    @NonNull
    public static <TranscodeType> b<TranscodeType> j(@NonNull InterfaceC5745f<? super TranscodeType> interfaceC5745f) {
        b<TranscodeType> bVar = new b<>();
        bVar.g(interfaceC5745f);
        return bVar;
    }

    @NonNull
    public static <TranscodeType> b<TranscodeType> k(@NonNull C5748i.a aVar) {
        b<TranscodeType> bVar = new b<>();
        bVar.h(aVar);
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static <TranscodeType> b<TranscodeType> l() {
        b<TranscodeType> bVar = (b<TranscodeType>) new b();
        bVar.g(C5743d.f240083b);
        return bVar;
    }

    @Override // com.bumptech.glide.l
    public boolean equals(Object obj) {
        return (obj instanceof b) && super.equals(obj);
    }

    @Override // com.bumptech.glide.l
    public int hashCode() {
        return super.hashCode();
    }
}

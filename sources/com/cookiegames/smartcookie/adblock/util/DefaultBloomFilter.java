package com.cookiegames.smartcookie.adblock.util;

import J3.a;
import K3.b;
import androidx.compose.runtime.internal.r;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import jd.C4806d;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nDefaultBloomFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultBloomFilter.kt\ncom/cookiegames/smartcookie/adblock/util/DefaultBloomFilter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n1855#2,2:89\n*S KotlinDebug\n*F\n+ 1 DefaultBloomFilter.kt\ncom/cookiegames/smartcookie/adblock/util/DefaultBloomFilter\n*L\n66#1:89,2\n*E\n"})
@r(parameters = 0)
public final class DefaultBloomFilter<T> implements a<T>, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f140712e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final b<T> f140713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f140714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f140715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final BitSet f140716d;

    public DefaultBloomFilter(int i10, double d10, @NotNull b<T> hashingAlgorithm) {
        G.p(hashingAlgorithm, "hashingAlgorithm");
        this.f140713a = hashingAlgorithm;
        int iK0 = C4806d.K0((Math.log(d10) * ((double) (-i10))) / (Math.log(2.0d) * Math.log(2.0d)));
        iK0 = iK0 < 1 ? 1 : iK0;
        this.f140714b = iK0;
        int iK02 = C4806d.K0((Math.log(2.0d) * ((double) iK0)) / ((double) i10));
        this.f140715c = iK02 >= 1 ? iK02 : 1;
        this.f140716d = new BitSet(iK0);
    }

    @Override // J3.a
    public boolean a(T t10) {
        int iA = this.f140713a.a(t10);
        int iA2 = L3.a.a(iA);
        int iB = L3.a.b(iA);
        int size = this.f140716d.size();
        int i10 = this.f140715c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (!this.f140716d.get((Integer.MAX_VALUE & iA2) % size)) {
                return false;
            }
            iA2 += iB;
        }
        return true;
    }

    @Override // J3.a
    public void b(@NotNull Collection<? extends T> collection) {
        G.p(collection, "collection");
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            put(it.next());
        }
    }

    @Override // J3.a
    public void put(T t10) {
        int iA = this.f140713a.a(t10);
        int iA2 = L3.a.a(iA);
        int iB = L3.a.b(iA);
        int size = this.f140716d.size();
        int i10 = this.f140715c;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f140716d.set((Integer.MAX_VALUE & iA2) % size);
            iA2 += iB;
        }
    }
}

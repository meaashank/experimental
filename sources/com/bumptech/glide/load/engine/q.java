package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.core.util.s;
import com.bumptech.glide.load.engine.g;
import g3.C4447e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class q<Data, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<Data> f139762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s.a<List<Throwable>> f139763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<? extends g<Data, ResourceType, Transcode>> f139764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f139765d;

    public q(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<g<Data, ResourceType, Transcode>> list, s.a<List<Throwable>> aVar) {
        this.f139762a = cls;
        this.f139763b = aVar;
        y3.m.d(list);
        this.f139764c = list;
        this.f139765d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public Class<Data> a() {
        return this.f139762a;
    }

    public s<Transcode> b(com.bumptech.glide.load.data.e<Data> eVar, @NonNull C4447e c4447e, int i10, int i11, g.a<ResourceType> aVar) throws GlideException {
        List<Throwable> listA = this.f139763b.a();
        y3.m.f(listA, "Argument must not be null");
        List<Throwable> list = listA;
        try {
            return c(eVar, c4447e, i10, i11, aVar, list);
        } finally {
            this.f139763b.b(list);
        }
    }

    public final s<Transcode> c(com.bumptech.glide.load.data.e<Data> eVar, @NonNull C4447e c4447e, int i10, int i11, g.a<ResourceType> aVar, List<Throwable> list) throws GlideException {
        int size = this.f139764c.size();
        s<Transcode> sVarA = null;
        for (int i12 = 0; i12 < size; i12++) {
            try {
                sVarA = this.f139764c.get(i12).a(eVar, i10, i11, c4447e, aVar);
            } catch (GlideException e10) {
                list.add(e10);
            }
            if (sVarA != null) {
                break;
            }
        }
        if (sVarA != null) {
            return sVarA;
        }
        throw new GlideException(this.f139765d, new ArrayList(list));
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f139764c.toArray()) + '}';
    }
}

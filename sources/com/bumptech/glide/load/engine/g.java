package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.s;
import g3.C4447e;
import g3.InterfaceC4448f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class g<DataType, ResourceType, Transcode> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f139663f = "DecodePath";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<DataType> f139664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<? extends InterfaceC4448f<DataType, ResourceType>> f139665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r3.e<ResourceType, Transcode> f139666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s.a<List<Throwable>> f139667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f139668e;

    public interface a<ResourceType> {
        @NonNull
        s<ResourceType> a(@NonNull s<ResourceType> sVar);
    }

    public g(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends InterfaceC4448f<DataType, ResourceType>> list, r3.e<ResourceType, Transcode> eVar, s.a<List<Throwable>> aVar) {
        this.f139664a = cls;
        this.f139665b = list;
        this.f139666c = eVar;
        this.f139667d = aVar;
        this.f139668e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public s<Transcode> a(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, @NonNull C4447e c4447e, a<ResourceType> aVar) throws GlideException {
        return this.f139666c.a(aVar.a(b(eVar, i10, i11, c4447e)), c4447e);
    }

    @NonNull
    public final s<ResourceType> b(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, @NonNull C4447e c4447e) throws GlideException {
        List<Throwable> listA = this.f139667d.a();
        y3.m.f(listA, "Argument must not be null");
        List<Throwable> list = listA;
        try {
            return c(eVar, i10, i11, c4447e, list);
        } finally {
            this.f139667d.b(list);
        }
    }

    @NonNull
    public final s<ResourceType> c(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, @NonNull C4447e c4447e, List<Throwable> list) throws GlideException {
        int size = this.f139665b.size();
        s<ResourceType> sVarA = null;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC4448f<DataType, ResourceType> interfaceC4448f = this.f139665b.get(i12);
            try {
                if (interfaceC4448f.b(eVar.a(), c4447e)) {
                    sVarA = interfaceC4448f.a(eVar.a(), i10, i11, c4447e);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable(f139663f, 2)) {
                    Log.v(f139663f, "Failed to decode data for " + interfaceC4448f, e10);
                }
                list.add(e10);
            }
            if (sVarA != null) {
                break;
            }
        }
        if (sVarA != null) {
            return sVarA;
        }
        throw new GlideException(this.f139668e, new ArrayList(list));
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f139664a + ", decoders=" + this.f139665b + ", transcoder=" + this.f139666c + '}';
    }
}

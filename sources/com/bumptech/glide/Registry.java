package com.bumptech.glide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.s;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.engine.q;
import g3.InterfaceC4443a;
import g3.InterfaceC4448f;
import g3.InterfaceC4449g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k3.m;
import k3.n;
import k3.o;
import u3.C5639a;
import u3.C5640b;
import u3.C5641c;
import u3.C5642d;
import u3.C5643e;
import u3.C5644f;
import z3.C5853a;

/* JADX INFO: loaded from: classes2.dex */
public class Registry {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f137561k = "Animation";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final String f137562l = "Animation";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f137563m = "Bitmap";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f137564n = "BitmapDrawable";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f137565o = "legacy_prepend_all";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f137566p = "legacy_append";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f137567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5639a f137568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5643e f137569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5644f f137570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.data.f f137571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r3.f f137572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C5640b f137573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C5642d f137574h = new C5642d();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C5641c f137575i = new C5641c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s.a<List<Throwable>> f137576j;

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(@NonNull String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(@NonNull Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(@NonNull Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        s.a<List<Throwable>> aVarH = C5853a.h(20);
        this.f137576j = aVarH;
        this.f137567a = new o(aVarH);
        this.f137568b = new C5639a();
        this.f137569c = new C5643e();
        this.f137570d = new C5644f();
        this.f137571e = new com.bumptech.glide.load.data.f();
        this.f137572f = new r3.f();
        this.f137573g = new C5640b();
        z(Arrays.asList("Animation", f137563m, f137564n));
    }

    @NonNull
    public <Data> Registry a(@NonNull Class<Data> cls, @NonNull InterfaceC4443a<Data> interfaceC4443a) {
        this.f137568b.a(cls, interfaceC4443a);
        return this;
    }

    @NonNull
    public <TResource> Registry b(@NonNull Class<TResource> cls, @NonNull InterfaceC4449g<TResource> interfaceC4449g) {
        this.f137570d.a(cls, interfaceC4449g);
        return this;
    }

    @NonNull
    public <Data, TResource> Registry c(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull InterfaceC4448f<Data, TResource> interfaceC4448f) {
        e(f137566p, cls, cls2, interfaceC4448f);
        return this;
    }

    @NonNull
    public <Model, Data> Registry d(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull n<Model, Data> nVar) {
        this.f137567a.a(cls, cls2, nVar);
        return this;
    }

    @NonNull
    public <Data, TResource> Registry e(@NonNull String str, @NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull InterfaceC4448f<Data, TResource> interfaceC4448f) {
        this.f137569c.a(str, interfaceC4448f, cls, cls2);
        return this;
    }

    @NonNull
    public final <Data, TResource, Transcode> List<com.bumptech.glide.load.engine.g<Data, TResource, Transcode>> f(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        Class<Data> cls4 = cls;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) this.f137569c.d(cls4, cls2);
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            Class cls5 = (Class) arrayList2.get(i10);
            ArrayList arrayList3 = (ArrayList) this.f137572f.b(cls5, cls3);
            int size2 = arrayList3.size();
            for (int i12 = 0; i12 < size2; i12++) {
                Class cls6 = (Class) arrayList3.get(i12);
                arrayList.add(new com.bumptech.glide.load.engine.g(cls4, cls5, cls6, this.f137569c.b(cls4, cls5), this.f137572f.a(cls5, cls6), this.f137576j));
                cls4 = cls;
            }
            cls4 = cls;
            i10 = i11;
        }
        return arrayList;
    }

    @NonNull
    public List<ImageHeaderParser> g() {
        List<ImageHeaderParser> listB = this.f137573g.b();
        if (listB.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return listB;
    }

    @Nullable
    public <Data, TResource, Transcode> q<Data, TResource, Transcode> h(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        Class<Data> cls4;
        Class<TResource> cls5;
        Class<Transcode> cls6;
        q<Data, TResource, Transcode> qVarA = this.f137575i.a(cls, cls2, cls3);
        q<Data, TResource, Transcode> qVar = null;
        if (this.f137575i.c(qVarA)) {
            return null;
        }
        if (qVarA != null) {
            return qVarA;
        }
        List<com.bumptech.glide.load.engine.g<Data, TResource, Transcode>> listF = f(cls, cls2, cls3);
        if (((ArrayList) listF).isEmpty()) {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
        } else {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
            qVar = new q<>(cls4, cls5, cls6, listF, this.f137576j);
        }
        this.f137575i.d(cls4, cls5, cls6, qVar);
        return qVar;
    }

    @NonNull
    public <Model> List<m<Model, ?>> i(@NonNull Model model) {
        return this.f137567a.e(model);
    }

    @NonNull
    public <Model, TResource, Transcode> List<Class<?>> j(@NonNull Class<Model> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        List<Class<?>> listB = this.f137574h.b(cls, cls2, cls3);
        List<Class<?>> list = listB;
        if (listB == null) {
            ArrayList arrayList = new ArrayList();
            Iterator<Class<?>> it = this.f137567a.d(cls).iterator();
            while (it.hasNext()) {
                ArrayList arrayList2 = (ArrayList) this.f137569c.d(it.next(), cls2);
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    Class cls4 = (Class) obj;
                    if (!((ArrayList) this.f137572f.b(cls4, cls3)).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            this.f137574h.c(cls, cls2, cls3, Collections.unmodifiableList(arrayList));
            list = arrayList;
        }
        return list;
    }

    @NonNull
    public <X> InterfaceC4449g<X> k(@NonNull com.bumptech.glide.load.engine.s<X> sVar) throws NoResultEncoderAvailableException {
        InterfaceC4449g<X> interfaceC4449gB = this.f137570d.b(sVar.b());
        if (interfaceC4449gB != null) {
            return interfaceC4449gB;
        }
        throw new NoResultEncoderAvailableException(sVar.b());
    }

    @NonNull
    public <X> com.bumptech.glide.load.data.e<X> l(@NonNull X x10) {
        return this.f137571e.a(x10);
    }

    @NonNull
    public <X> InterfaceC4443a<X> m(@NonNull X x10) throws NoSourceEncoderAvailableException {
        InterfaceC4443a<X> interfaceC4443aB = this.f137568b.b(x10.getClass());
        if (interfaceC4443aB != null) {
            return interfaceC4443aB;
        }
        throw new NoSourceEncoderAvailableException(x10.getClass());
    }

    public boolean n(@NonNull com.bumptech.glide.load.engine.s<?> sVar) {
        return this.f137570d.b(sVar.b()) != null;
    }

    @NonNull
    public <Data> Registry o(@NonNull Class<Data> cls, @NonNull InterfaceC4443a<Data> interfaceC4443a) {
        this.f137568b.c(cls, interfaceC4443a);
        return this;
    }

    @NonNull
    public <TResource> Registry p(@NonNull Class<TResource> cls, @NonNull InterfaceC4449g<TResource> interfaceC4449g) {
        this.f137570d.c(cls, interfaceC4449g);
        return this;
    }

    @NonNull
    public <Data, TResource> Registry q(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull InterfaceC4448f<Data, TResource> interfaceC4448f) {
        s(f137565o, cls, cls2, interfaceC4448f);
        return this;
    }

    @NonNull
    public <Model, Data> Registry r(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull n<Model, Data> nVar) {
        this.f137567a.g(cls, cls2, nVar);
        return this;
    }

    @NonNull
    public <Data, TResource> Registry s(@NonNull String str, @NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull InterfaceC4448f<Data, TResource> interfaceC4448f) {
        this.f137569c.e(str, interfaceC4448f, cls, cls2);
        return this;
    }

    @NonNull
    public Registry t(@NonNull ImageHeaderParser imageHeaderParser) {
        this.f137573g.a(imageHeaderParser);
        return this;
    }

    @NonNull
    public Registry u(@NonNull e.a<?> aVar) {
        this.f137571e.b(aVar);
        return this;
    }

    @NonNull
    @Deprecated
    public <Data> Registry v(@NonNull Class<Data> cls, @NonNull InterfaceC4443a<Data> interfaceC4443a) {
        return a(cls, interfaceC4443a);
    }

    @NonNull
    @Deprecated
    public <TResource> Registry w(@NonNull Class<TResource> cls, @NonNull InterfaceC4449g<TResource> interfaceC4449g) {
        return b(cls, interfaceC4449g);
    }

    @NonNull
    public <TResource, Transcode> Registry x(@NonNull Class<TResource> cls, @NonNull Class<Transcode> cls2, @NonNull r3.e<TResource, Transcode> eVar) {
        this.f137572f.c(cls, cls2, eVar);
        return this;
    }

    @NonNull
    public <Model, Data> Registry y(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull n<? extends Model, ? extends Data> nVar) {
        this.f137567a.i(cls, cls2, nVar);
        return this;
    }

    @NonNull
    public final Registry z(@NonNull List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add(f137565o);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add(f137566p);
        this.f137569c.f(arrayList);
        return this;
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(@NonNull Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> NoModelLoaderAvailableException(@NonNull M m10, @NonNull List<m<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m10);
        }

        public NoModelLoaderAvailableException(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }
}

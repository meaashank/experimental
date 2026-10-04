package com.bykv.vk.openvk.preload.a;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.bykv.vk.openvk.preload.a.c.a<?> f140312a = com.bykv.vk.openvk.preload.a.c.a.a(Object.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadLocal<Map<com.bykv.vk.openvk.preload.a.c.a<?>, a<?>>> f140313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<com.bykv.vk.openvk.preload.a.c.a<?>, q<?>> f140314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.b f140315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.a.d f140316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<r> f140317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.a.b.c f140318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f140319h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<Type, com.bykv.vk.openvk.preload.geckox.a.a.c<?>> f140320i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f140321j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f140322k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f140323l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f140324m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f140325n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f140326o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f140327p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f140328q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f140329r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f140330s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private p f140331t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private List<r> f140332u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List<r> f140333v;

    /* JADX WARN: Illegal instructions before constructor call */
    public d() {
        com.bykv.vk.openvk.preload.a.b.c cVar = com.bykv.vk.openvk.preload.a.b.c.f140264a;
        b bVar = b.f140097a;
        Map map = Collections.EMPTY_MAP;
        p pVar = p.f140394a;
        List list = Collections.EMPTY_LIST;
        this(cVar, bVar, map, true, pVar, 2, 2, list, list, list);
    }

    public static void a(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f140317f + ",instanceCreators:" + this.f140315d + "}";
    }

    public static class a<T> extends q<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private q<T> f140338a;

        public final void a(q<T> qVar) {
            if (this.f140338a != null) {
                throw new AssertionError();
            }
            this.f140338a = qVar;
        }

        @Override // com.bykv.vk.openvk.preload.a.q
        public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
            q<T> qVar = this.f140338a;
            if (qVar != null) {
                return qVar.a(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // com.bykv.vk.openvk.preload.a.q
        public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t10) throws IOException {
            q<T> qVar = this.f140338a;
            if (qVar != null) {
                qVar.a(cVar, t10);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final <T> q<T> a(com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        boolean z10;
        q<T> qVar = (q) this.f140314c.get(aVar == null ? f140312a : aVar);
        if (qVar != null) {
            return qVar;
        }
        Map<com.bykv.vk.openvk.preload.a.c.a<?>, a<?>> map = this.f140313b.get();
        if (map == null) {
            map = new HashMap<>();
            this.f140313b.set(map);
            z10 = true;
        } else {
            z10 = false;
        }
        a<?> aVar2 = map.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        try {
            a<?> aVar3 = new a<>();
            map.put(aVar, aVar3);
            Iterator<r> it = this.f140317f.iterator();
            while (it.hasNext()) {
                q<T> qVarA = it.next().a(this, aVar);
                if (qVarA != null) {
                    aVar3.a((q<?>) qVarA);
                    this.f140314c.put(aVar, qVarA);
                    return qVarA;
                }
            }
            throw new IllegalArgumentException("GSON (pangle-v3200) cannot handle ".concat(String.valueOf(aVar)));
        } finally {
            map.remove(aVar);
            if (z10) {
                this.f140313b.remove();
            }
        }
    }

    public d(com.bykv.vk.openvk.preload.a.b.c cVar, c cVar2, Map<Type, com.bykv.vk.openvk.preload.geckox.a.a.c<?>> map, boolean z10, p pVar, int i10, int i11, List<r> list, List<r> list2, List<r> list3) {
        final q<Number> qVar;
        this.f140313b = new ThreadLocal<>();
        this.f140314c = new ConcurrentHashMap();
        this.f140318g = cVar;
        this.f140319h = cVar2;
        this.f140320i = map;
        com.bykv.vk.openvk.preload.a.b.b bVar = new com.bykv.vk.openvk.preload.a.b.b(map);
        this.f140315d = bVar;
        this.f140321j = false;
        this.f140322k = false;
        this.f140323l = false;
        this.f140324m = z10;
        this.f140325n = false;
        this.f140326o = false;
        this.f140327p = false;
        this.f140331t = pVar;
        this.f140328q = null;
        this.f140329r = i10;
        this.f140330s = i11;
        this.f140332u = list;
        this.f140333v = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f140167B);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.g.f140131a);
        arrayList.add(cVar);
        arrayList.addAll(list3);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f140205p);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f140196g);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f140193d);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f140194e);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f140195f);
        if (pVar == p.f140394a) {
            qVar = com.bykv.vk.openvk.preload.a.b.a.m.f140200k;
        } else {
            qVar = new q<Number>() { // from class: com.bykv.vk.openvk.preload.a.d.3
                @Override // com.bykv.vk.openvk.preload.a.q
                public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar3, Number number) throws IOException {
                    Number number2 = number;
                    if (number2 == null) {
                        cVar3.h();
                    } else {
                        cVar3.b(number2.toString());
                    }
                }

                @Override // com.bykv.vk.openvk.preload.a.q
                public final /* synthetic */ Number a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                    if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                        aVar.j();
                        return null;
                    }
                    return Long.valueOf(aVar.l());
                }
            };
        }
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.a(Long.TYPE, Long.class, qVar));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.a(Double.TYPE, Double.class, new q<Number>() { // from class: com.bykv.vk.openvk.preload.a.d.1
            @Override // com.bykv.vk.openvk.preload.a.q
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar3, Number number) throws IOException {
                Number number2 = number;
                if (number2 == null) {
                    cVar3.h();
                } else {
                    d.a(number2.doubleValue());
                    cVar3.a(number2);
                }
            }

            @Override // com.bykv.vk.openvk.preload.a.q
            public final /* synthetic */ Number a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.j();
                    return null;
                }
                return Double.valueOf(aVar.k());
            }
        }));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.a(Float.TYPE, Float.class, new q<Number>() { // from class: com.bykv.vk.openvk.preload.a.d.2
            @Override // com.bykv.vk.openvk.preload.a.q
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar3, Number number) throws IOException {
                Number number2 = number;
                if (number2 == null) {
                    cVar3.h();
                } else {
                    d.a(number2.floatValue());
                    cVar3.a(number2);
                }
            }

            @Override // com.bykv.vk.openvk.preload.a.q
            public final /* synthetic */ Number a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.j();
                    return null;
                }
                return Float.valueOf((float) aVar.k());
            }
        }));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f140201l);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f140197h);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f140198i);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.a(AtomicLong.class, new q<AtomicLong>() { // from class: com.bykv.vk.openvk.preload.a.d.4
            @Override // com.bykv.vk.openvk.preload.a.q
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar3, AtomicLong atomicLong) throws IOException {
                qVar.a(cVar3, Long.valueOf(atomicLong.get()));
            }

            @Override // com.bykv.vk.openvk.preload.a.q
            public final /* synthetic */ AtomicLong a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                return new AtomicLong(((Number) qVar.a(aVar)).longValue());
            }
        }.a()));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.a(AtomicLongArray.class, new q<AtomicLongArray>() { // from class: com.bykv.vk.openvk.preload.a.d.5
            @Override // com.bykv.vk.openvk.preload.a.q
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar3, AtomicLongArray atomicLongArray) throws IOException {
                AtomicLongArray atomicLongArray2 = atomicLongArray;
                cVar3.d();
                int length = atomicLongArray2.length();
                for (int i12 = 0; i12 < length; i12++) {
                    qVar.a(cVar3, Long.valueOf(atomicLongArray2.get(i12)));
                }
                cVar3.e();
            }

            @Override // com.bykv.vk.openvk.preload.a.q
            public final /* synthetic */ AtomicLongArray a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                ArrayList arrayList2 = new ArrayList();
                aVar.a();
                while (aVar.e()) {
                    arrayList2.add(Long.valueOf(((Number) qVar.a(aVar)).longValue()));
                }
                aVar.b();
                int size = arrayList2.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i12 = 0; i12 < size; i12++) {
                    atomicLongArray.set(i12, ((Long) arrayList2.get(i12)).longValue());
                }
                return atomicLongArray;
            }
        }.a()));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f140199j);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f140202m);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f140206q);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f140207r);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.a(BigDecimal.class, com.bykv.vk.openvk.preload.a.b.a.m.f140203n));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.a(BigInteger.class, com.bykv.vk.openvk.preload.a.b.a.m.f140204o));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f140208s);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f140209t);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f140211v);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f140212w);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f140215z);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f140210u);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f140191b);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.c.f140117a);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f140214y);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.j.f140153a);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.i.f140151a);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f140213x);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.a.f140110a);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f140190a);
        arrayList.add(new com.bykv.vk.openvk.preload.a.b.a.b(bVar));
        arrayList.add(new com.bykv.vk.openvk.preload.a.b.a.f(bVar));
        com.bykv.vk.openvk.preload.a.b.a.d dVar = new com.bykv.vk.openvk.preload.a.b.a.d(bVar);
        this.f140316e = dVar;
        arrayList.add(dVar);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f140168C);
        arrayList.add(new com.bykv.vk.openvk.preload.a.b.a.h(bVar, cVar2, cVar, dVar));
        this.f140317f = Collections.unmodifiableList(arrayList);
    }

    public final <T> q<T> a(r rVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        if (!this.f140317f.contains(rVar)) {
            rVar = this.f140316e;
        }
        boolean z10 = false;
        for (r rVar2 : this.f140317f) {
            if (z10) {
                q<T> qVarA = rVar2.a(this, aVar);
                if (qVarA != null) {
                    return qVarA;
                }
            } else if (rVar2 == rVar) {
                z10 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize ".concat(String.valueOf(aVar)));
    }

    public final <T> q<T> a(Class<T> cls) {
        return a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a((Class) cls));
    }

    public final String a(Object obj) {
        com.bykv.vk.openvk.preload.a.d.c cVarA;
        boolean zA;
        boolean zB;
        boolean zC;
        if (obj == null) {
            j jVar = j.f140391a;
            StringWriter stringWriter = new StringWriter();
            try {
                cVarA = a((Writer) stringWriter);
                zA = cVarA.a();
                cVarA.a(true);
                zB = cVarA.b();
                cVarA.b(this.f140324m);
                zC = cVarA.c();
                cVarA.c(false);
                try {
                    try {
                        com.bykv.vk.openvk.preload.falconx.a.a.a(jVar, cVarA);
                        return stringWriter.toString();
                    } finally {
                    }
                } catch (IOException e10) {
                    throw new i(e10);
                } catch (AssertionError e11) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON pangle-v3200): " + e11.getMessage());
                    assertionError.initCause(e11);
                    throw assertionError;
                }
            } catch (IOException e12) {
                throw new i(e12);
            }
        }
        Class<?> cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            cVarA = a((Writer) stringWriter2);
            q qVarA = a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a((Type) cls));
            zA = cVarA.a();
            cVarA.a(true);
            zB = cVarA.b();
            cVarA.b(this.f140324m);
            zC = cVarA.c();
            cVarA.c(false);
            try {
                try {
                    qVarA.a(cVarA, obj);
                    return stringWriter2.toString();
                } catch (IOException e13) {
                    throw new i(e13);
                } catch (AssertionError e14) {
                    AssertionError assertionError2 = new AssertionError("AssertionError (GSON pangle-v3200): " + e14.getMessage());
                    assertionError2.initCause(e14);
                    throw assertionError2;
                }
            } finally {
            }
        } catch (IOException e15) {
            throw new i(e15);
        }
    }

    private static com.bykv.vk.openvk.preload.a.d.c a(Writer writer) throws IOException {
        com.bykv.vk.openvk.preload.a.d.c cVar = new com.bykv.vk.openvk.preload.a.d.c(writer);
        cVar.c(false);
        return cVar;
    }

    private <T> T a(com.bykv.vk.openvk.preload.a.d.a aVar, Type type) throws i, o {
        boolean zQ = aVar.q();
        boolean z10 = true;
        aVar.a(true);
        try {
            try {
                try {
                    aVar.f();
                    z10 = false;
                    return a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(type)).a(aVar);
                } catch (EOFException e10) {
                    if (z10) {
                        aVar.a(zQ);
                        return null;
                    }
                    throw new o(e10);
                } catch (IllegalStateException e11) {
                    throw new o(e11);
                }
            } catch (IOException e12) {
                throw new o(e12);
            } catch (AssertionError e13) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON pangle-v3200): " + e13.getMessage());
                assertionError.initCause(e13);
                throw assertionError;
            }
        } finally {
            aVar.a(zQ);
        }
    }

    public final <T> T a(Reader reader, Type type) throws i, o {
        com.bykv.vk.openvk.preload.a.d.a aVar = new com.bykv.vk.openvk.preload.a.d.a(reader);
        aVar.a(false);
        T t10 = (T) a(aVar, type);
        if (t10 != null) {
            try {
                if (aVar.f() != com.bykv.vk.openvk.preload.a.d.b.END_DOCUMENT) {
                    throw new i("JSON document was not fully consumed.");
                }
            } catch (com.bykv.vk.openvk.preload.a.d.d e10) {
                throw new o(e10);
            } catch (IOException e11) {
                throw new i(e11);
            }
        }
        return t10;
    }
}

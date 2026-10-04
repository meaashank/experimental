package o;

import U6.j;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class C5287b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c<K, V> f223000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c<K, V> f223001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakHashMap<f<K, V>, Boolean> f223002c = new WeakHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f223003d = 0;

    /* JADX INFO: renamed from: o.b$a */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // o.C5287b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f223007d;
        }

        @Override // o.C5287b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f223006c;
        }
    }

    /* JADX INFO: renamed from: o.b$b, reason: collision with other inner class name */
    public static class C0846b<K, V> extends e<K, V> {
        public C0846b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // o.C5287b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f223006c;
        }

        @Override // o.C5287b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f223007d;
        }
    }

    /* JADX INFO: renamed from: o.b$c */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final K f223004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final V f223005b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c<K, V> f223006c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c<K, V> f223007d;

        public c(@NonNull K k10, @NonNull V v10) {
            this.f223004a = k10;
            this.f223005b = v10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f223004a.equals(cVar.f223004a) && this.f223005b.equals(cVar.f223005b);
        }

        @Override // java.util.Map.Entry
        @NonNull
        public K getKey() {
            return this.f223004a;
        }

        @Override // java.util.Map.Entry
        @NonNull
        public V getValue() {
            return this.f223005b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f223004a.hashCode() ^ this.f223005b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f223004a + "=" + this.f223005b;
        }
    }

    /* JADX INFO: renamed from: o.b$d */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c<K, V> f223008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f223009b = true;

        public d() {
        }

        @Override // o.C5287b.f
        public void a(@NonNull c<K, V> cVar) {
            c<K, V> cVar2 = this.f223008a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f223007d;
                this.f223008a = cVar3;
                this.f223009b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.f223009b) {
                this.f223009b = false;
                this.f223008a = C5287b.this.f223000a;
            } else {
                c<K, V> cVar = this.f223008a;
                this.f223008a = cVar != null ? cVar.f223006c : null;
            }
            return this.f223008a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f223009b) {
                return C5287b.this.f223000a != null;
            }
            c<K, V> cVar = this.f223008a;
            return (cVar == null || cVar.f223006c == null) ? false : true;
        }
    }

    /* JADX INFO: renamed from: o.b$e */
    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c<K, V> f223011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c<K, V> f223012b;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f223011a = cVar2;
            this.f223012b = cVar;
        }

        @Override // o.C5287b.f
        public void a(@NonNull c<K, V> cVar) {
            if (this.f223011a == cVar && cVar == this.f223012b) {
                this.f223012b = null;
                this.f223011a = null;
            }
            c<K, V> cVar2 = this.f223011a;
            if (cVar2 == cVar) {
                this.f223011a = b(cVar2);
            }
            if (this.f223012b == cVar) {
                this.f223012b = e();
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f223012b;
            this.f223012b = e();
            return cVar;
        }

        public final c<K, V> e() {
            c<K, V> cVar = this.f223012b;
            c<K, V> cVar2 = this.f223011a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f223012b != null;
        }
    }

    /* JADX INFO: renamed from: o.b$f */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static abstract class f<K, V> {
        public abstract void a(@NonNull c<K, V> cVar);
    }

    @Nullable
    public Map.Entry<K, V> b() {
        return this.f223000a;
    }

    @Nullable
    public c<K, V> c(K k10) {
        c<K, V> cVar = this.f223000a;
        while (cVar != null && !cVar.f223004a.equals(k10)) {
            cVar = cVar.f223006c;
        }
        return cVar;
    }

    @NonNull
    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0846b c0846b = new C0846b(this.f223001b, this.f223000a);
        this.f223002c.put(c0846b, Boolean.FALSE);
        return c0846b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        if (((o.C5287b.e) r5).hasNext() != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            if (r5 != r4) goto L3
            goto L52
        L3:
            boolean r0 = r5 instanceof o.C5287b
            if (r0 != 0) goto L8
            goto L54
        L8:
            o.b r5 = (o.C5287b) r5
            int r0 = r4.size()
            int r1 = r5.size()
            if (r0 == r1) goto L15
            goto L54
        L15:
            java.util.Iterator r0 = r4.iterator()
            java.util.Iterator r5 = r5.iterator()
        L1d:
            r1 = r0
            o.b$e r1 = (o.C5287b.e) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L44
            r2 = r5
            o.b$e r2 = (o.C5287b.e) r2
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L44
            java.util.Map$Entry r1 = r1.next()
            java.util.Map$Entry r2 = r2.next()
            if (r1 != 0) goto L3b
            if (r2 != 0) goto L54
        L3b:
            if (r1 == 0) goto L1d
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L1d
            goto L54
        L44:
            boolean r0 = r1.hasNext()
            if (r0 != 0) goto L54
            o.b$e r5 = (o.C5287b.e) r5
            boolean r5 = r5.hasNext()
            if (r5 != 0) goto L54
        L52:
            r5 = 1
            return r5
        L54:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5287b.equals(java.lang.Object):boolean");
    }

    @NonNull
    public C5287b<K, V>.d g() {
        C5287b<K, V>.d dVar = new d();
        this.f223002c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    @Nullable
    public Map.Entry<K, V> h() {
        return this.f223001b;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += eVar.next().hashCode();
        }
    }

    public c<K, V> i(@NonNull K k10, @NonNull V v10) {
        c<K, V> cVar = new c<>(k10, v10);
        this.f223003d++;
        c<K, V> cVar2 = this.f223001b;
        if (cVar2 == null) {
            this.f223000a = cVar;
            this.f223001b = cVar;
            return cVar;
        }
        cVar2.f223006c = cVar;
        cVar.f223007d = cVar2;
        this.f223001b = cVar;
        return cVar;
    }

    @Override // java.lang.Iterable
    @NonNull
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f223000a, this.f223001b);
        this.f223002c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public V j(@NonNull K k10, @NonNull V v10) {
        c<K, V> cVarC = c(k10);
        if (cVarC != null) {
            return cVarC.f223005b;
        }
        i(k10, v10);
        return null;
    }

    public V k(@NonNull K k10) {
        c<K, V> cVarC = c(k10);
        if (cVarC == null) {
            return null;
        }
        this.f223003d--;
        if (!this.f223002c.isEmpty()) {
            Iterator<f<K, V>> it = this.f223002c.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(cVarC);
            }
        }
        c<K, V> cVar = cVarC.f223007d;
        if (cVar != null) {
            cVar.f223006c = cVarC.f223006c;
        } else {
            this.f223000a = cVarC.f223006c;
        }
        c<K, V> cVar2 = cVarC.f223006c;
        if (cVar2 != null) {
            cVar2.f223007d = cVar;
        } else {
            this.f223001b = cVar;
        }
        cVarC.f223006c = null;
        cVarC.f223007d = null;
        return cVarC.f223005b;
    }

    public int size() {
        return this.f223003d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(eVar.next().toString());
            if (eVar.hasNext()) {
                sb2.append(j.f68738d);
            }
        }
    }
}

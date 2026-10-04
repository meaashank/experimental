package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class X extends Y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MessageLite f112768f;

    public static class b<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map.Entry<K, X> f112769a;

        public X a() {
            return this.f112769a.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f112769a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            X value = this.f112769a.getValue();
            if (value == null) {
                return null;
            }
            return value.p();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof MessageLite) {
                return this.f112769a.getValue().m((MessageLite) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        public b(Map.Entry<K, X> entry) {
            this.f112769a = entry;
        }
    }

    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterator<Map.Entry<K, Object>> f112770a;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f112770a = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f112770a.next();
            return next.getValue() instanceof X ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f112770a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f112770a.remove();
        }
    }

    public X(MessageLite messageLite, H h10, ByteString byteString) {
        super(h10, byteString);
        this.f112768f = messageLite;
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public boolean c() {
        return super.c() || this.f112781c == this.f112768f;
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public boolean equals(Object obj) {
        return p().equals(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public int hashCode() {
        return p().hashCode();
    }

    public MessageLite p() {
        return g(this.f112768f);
    }

    public String toString() {
        return p().toString();
    }
}

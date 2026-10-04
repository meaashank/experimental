package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class Y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final H f112778e = H.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ByteString f112779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public H f112780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile MessageLite f112781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile ByteString f112782d;

    public Y(H h10, ByteString byteString) {
        a(h10, byteString);
        this.f112780b = h10;
        this.f112779a = byteString;
    }

    public static void a(H h10, ByteString byteString) {
        if (h10 == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if (byteString == null) {
            throw new NullPointerException("found null ByteString");
        }
    }

    public static Y e(MessageLite messageLite) {
        Y y10 = new Y();
        y10.m(messageLite);
        return y10;
    }

    public static MessageLite j(MessageLite messageLite, ByteString byteString, H h10) {
        try {
            return messageLite.e().mergeFrom(byteString, h10).build();
        } catch (InvalidProtocolBufferException unused) {
            return messageLite;
        }
    }

    public void b() {
        this.f112779a = null;
        this.f112781c = null;
        this.f112782d = null;
    }

    public boolean c() {
        ByteString byteString = this.f112782d;
        ByteString byteString2 = ByteString.f112510e;
        if (byteString == byteString2) {
            return true;
        }
        if (this.f112781c != null) {
            return false;
        }
        ByteString byteString3 = this.f112779a;
        return byteString3 == null || byteString3 == byteString2;
    }

    public void d(MessageLite messageLite) {
        if (this.f112781c != null) {
            return;
        }
        synchronized (this) {
            if (this.f112781c != null) {
                return;
            }
            try {
                if (this.f112779a != null) {
                    this.f112781c = messageLite.k().s(this.f112779a, this.f112780b);
                    this.f112782d = this.f112779a;
                } else {
                    this.f112781c = messageLite;
                    this.f112782d = ByteString.f112510e;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.f112781c = messageLite;
                this.f112782d = ByteString.f112510e;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y10 = (Y) obj;
        MessageLite messageLite = this.f112781c;
        MessageLite messageLite2 = y10.f112781c;
        return (messageLite == null && messageLite2 == null) ? n().equals(y10.n()) : (messageLite == null || messageLite2 == null) ? messageLite != null ? messageLite.equals(y10.g(messageLite.getDefaultInstanceForType())) : g(messageLite2.getDefaultInstanceForType()).equals(messageLite2) : messageLite.equals(messageLite2);
    }

    public int f() {
        if (this.f112782d != null) {
            return this.f112782d.size();
        }
        ByteString byteString = this.f112779a;
        if (byteString != null) {
            return byteString.size();
        }
        if (this.f112781c != null) {
            return this.f112781c.g();
        }
        return 0;
    }

    public MessageLite g(MessageLite messageLite) {
        d(messageLite);
        return this.f112781c;
    }

    public void h(Y y10) {
        ByteString byteString;
        if (y10.c()) {
            return;
        }
        if (c()) {
            k(y10);
            return;
        }
        if (this.f112780b == null) {
            this.f112780b = y10.f112780b;
        }
        ByteString byteString2 = this.f112779a;
        if (byteString2 != null && (byteString = y10.f112779a) != null) {
            this.f112779a = byteString2.o(byteString);
            return;
        }
        if (this.f112781c == null && y10.f112781c != null) {
            m(j(y10.f112781c, this.f112779a, this.f112780b));
        } else if (this.f112781c == null || y10.f112781c != null) {
            m(this.f112781c.e().mergeFrom(y10.f112781c).build());
        } else {
            m(j(this.f112781c, y10.f112779a, y10.f112780b));
        }
    }

    public int hashCode() {
        return 1;
    }

    public void i(AbstractC2549t abstractC2549t, H h10) throws IOException {
        if (c()) {
            l(abstractC2549t.x(), h10);
            return;
        }
        if (this.f112780b == null) {
            this.f112780b = h10;
        }
        ByteString byteString = this.f112779a;
        if (byteString != null) {
            l(byteString.o(abstractC2549t.x()), this.f112780b);
        } else {
            try {
                m(this.f112781c.e().mergeFrom(abstractC2549t, h10).build());
            } catch (InvalidProtocolBufferException unused) {
            }
        }
    }

    public void k(Y y10) {
        this.f112779a = y10.f112779a;
        this.f112781c = y10.f112781c;
        this.f112782d = y10.f112782d;
        H h10 = y10.f112780b;
        if (h10 != null) {
            this.f112780b = h10;
        }
    }

    public void l(ByteString byteString, H h10) {
        a(h10, byteString);
        this.f112779a = byteString;
        this.f112780b = h10;
        this.f112781c = null;
        this.f112782d = null;
    }

    public MessageLite m(MessageLite messageLite) {
        MessageLite messageLite2 = this.f112781c;
        this.f112779a = null;
        this.f112782d = null;
        this.f112781c = messageLite;
        return messageLite2;
    }

    public ByteString n() {
        if (this.f112782d != null) {
            return this.f112782d;
        }
        ByteString byteString = this.f112779a;
        if (byteString != null) {
            return byteString;
        }
        synchronized (this) {
            try {
                if (this.f112782d != null) {
                    return this.f112782d;
                }
                if (this.f112781c == null) {
                    this.f112782d = ByteString.f112510e;
                } else {
                    this.f112782d = this.f112781c.f();
                }
                return this.f112782d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o(Writer writer, int i10) throws IOException {
        if (this.f112782d != null) {
            writer.i(i10, this.f112782d);
            return;
        }
        ByteString byteString = this.f112779a;
        if (byteString != null) {
            writer.i(i10, byteString);
        } else if (this.f112781c != null) {
            writer.K(i10, this.f112781c);
        } else {
            writer.i(i10, ByteString.f112510e);
        }
    }

    public Y() {
    }
}

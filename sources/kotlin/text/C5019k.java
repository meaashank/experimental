package kotlin.text;

import fd.InterfaceC4418a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.text.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C5019k implements Iterator<String>, InterfaceC4418a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f218351f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final int f218352g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final int f218353h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final int f218354i = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CharSequence f218355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f218356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f218357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f218358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f218359e;

    /* JADX INFO: renamed from: kotlin.text.k$a */
    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public C5019k(@NotNull CharSequence string) {
        kotlin.jvm.internal.G.p(string, "string");
        this.f218355a = string;
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f218356b = 0;
        int i10 = this.f218358d;
        int i11 = this.f218357c;
        this.f218357c = this.f218359e + i10;
        return this.f218355a.subSequence(i11, i10).toString();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10;
        int i11;
        int i12 = this.f218356b;
        if (i12 != 0) {
            return i12 == 1;
        }
        if (this.f218359e < 0) {
            this.f218356b = 2;
            return false;
        }
        int length = this.f218355a.length();
        int length2 = this.f218355a.length();
        for (int i13 = this.f218357c; i13 < length2; i13++) {
            char cCharAt = this.f218355a.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i10 = (cCharAt == '\r' && (i11 = i13 + 1) < this.f218355a.length() && this.f218355a.charAt(i11) == '\n') ? 2 : 1;
                length = i13;
                this.f218356b = 1;
                this.f218359e = i10;
                this.f218358d = length;
                return true;
            }
        }
        i10 = -1;
        this.f218356b = 1;
        this.f218359e = i10;
        this.f218358d = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

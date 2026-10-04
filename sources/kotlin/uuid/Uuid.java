package kotlin.uuid;

import Oc.g;
import androidx.collection.C1550p;
import com.google.common.base.Ascii;
import com.mbridge.msdk.MBridgeConstans;
import ed.p;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Comparator;
import kotlin.B0;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC4982o;
import kotlin.InterfaceC4984p;
import kotlin.InterfaceC5045x;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.text.F;
import kotlin.time.Instant;
import kotlin.time.InterfaceC5038e;
import kotlin.time.n;
import okio.h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = MBridgeConstans.NATIVE_VIDEO_VERSION)
@kotlin.uuid.a
public final class Uuid implements Comparable<Uuid>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f218475c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Uuid f218476d = new Uuid(0, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f218477e = 16;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f218478f = 128;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f218479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f218480b;

    public static final class a {
        public a() {
        }

        @InterfaceC4982o(message = "Use naturalOrder<Uuid>() instead", replaceWith = @InterfaceC4852c0(expression = "naturalOrder<Uuid>()", imports = {"kotlin.comparisons.naturalOrder"}))
        @InterfaceC4984p(warningSince = "2.1")
        public static /* synthetic */ void j() {
        }

        @NotNull
        public final Uuid a(@NotNull byte[] byteArray) {
            G.p(byteArray, "byteArray");
            if (byteArray.length == 16) {
                return b(e.t(byteArray, 0), e.t(byteArray, 8));
            }
            throw new IllegalArgumentException(("Expected exactly 16 bytes, but was " + e.x(byteArray, 32) + " of size " + byteArray.length).toString());
        }

        @NotNull
        public final Uuid b(long j10, long j11) {
            return (j10 == 0 && j11 == 0) ? Uuid.f218476d : new Uuid(j10, j11);
        }

        @InterfaceC4887e0(version = "2.1")
        @InterfaceC5045x
        @NotNull
        public final Uuid c(@NotNull byte[] bArr) {
            G.p(bArr, "$v$c$kotlin-UByteArray$-ubyteArray$0");
            return a(bArr);
        }

        @NotNull
        public final Uuid d(long j10, long j11) {
            return b(j10, j11);
        }

        @InterfaceC4887e0(version = "2.3")
        @NotNull
        public final Uuid e() {
            return e.u();
        }

        @InterfaceC4887e0(version = "2.3")
        @NotNull
        public final Uuid f() {
            return g(InterfaceC5038e.b.f218415b);
        }

        @NotNull
        public final Uuid g(@NotNull InterfaceC5038e clock) {
            G.p(clock, "clock");
            return f.f218488a.a(clock);
        }

        @InterfaceC4887e0(version = "2.3")
        @n
        @NotNull
        public final Uuid h(@NotNull Instant timestamp) {
            G.p(timestamp, "timestamp");
            byte[] bArr = new byte[10];
            d.h(bArr);
            long jN = (timestamp.n() << 16) | ((long) ((((bArr[8] & Ascii.SI) | 112) << 8) | (bArr[9] & 255)));
            bArr[0] = (byte) (((byte) (bArr[0] & h0.f225962a)) | (-128));
            return b(jN, e.t(bArr, 0));
        }

        @NotNull
        public final Comparator<Uuid> i() {
            return g.q();
        }

        @NotNull
        public final Uuid k() {
            return Uuid.f218476d;
        }

        @NotNull
        public final Uuid l(@NotNull String uuidString) {
            G.p(uuidString, "uuidString");
            int length = uuidString.length();
            if (length == 32) {
                return e.A(uuidString);
            }
            if (length == 36) {
                return e.C(uuidString);
            }
            throw new IllegalArgumentException("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"" + e.w(uuidString, 64) + "\" of length " + uuidString.length());
        }

        @NotNull
        public final Uuid m(@NotNull String hexString) {
            G.p(hexString, "hexString");
            if (hexString.length() == 32) {
                return e.A(hexString);
            }
            throw new IllegalArgumentException(("Expected a 32-char hexadecimal string, but was \"" + e.w(hexString, 64) + "\" of length " + hexString.length()).toString());
        }

        @InterfaceC4887e0(version = "2.1")
        @NotNull
        public final Uuid n(@NotNull String hexDashString) {
            G.p(hexDashString, "hexDashString");
            if (hexDashString.length() == 36) {
                return e.C(hexDashString);
            }
            throw new IllegalArgumentException(("Expected a 36-char string in the standard hex-and-dash UUID format, but was \"" + e.w(hexDashString, 64) + "\" of length " + hexDashString.length()).toString());
        }

        @InterfaceC4887e0(version = "2.3")
        @Nullable
        public final Uuid o(@NotNull String hexDashString) {
            G.p(hexDashString, "hexDashString");
            if (hexDashString.length() != 36) {
                return null;
            }
            return e.E(hexDashString);
        }

        @InterfaceC4887e0(version = "2.3")
        @Nullable
        public final Uuid p(@NotNull String hexString) {
            G.p(hexString, "hexString");
            if (hexString.length() != 32) {
                return null;
            }
            return e.F(hexString);
        }

        @InterfaceC4887e0(version = "2.3")
        @Nullable
        public final Uuid q(@NotNull String uuidString) {
            G.p(uuidString, "uuidString");
            int length = uuidString.length();
            if (length == 32) {
                return p(uuidString);
            }
            if (length != 36) {
                return null;
            }
            return o(uuidString);
        }

        @NotNull
        public final Uuid r() {
            return e.u();
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ Uuid(long j10, long j11, C4969v c4969v) {
        this(j10, j11);
    }

    @InterfaceC4850b0
    public static /* synthetic */ void h() {
    }

    @InterfaceC4850b0
    public static /* synthetic */ void j() {
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return d.i(this);
    }

    @Override // java.lang.Comparable
    @InterfaceC4887e0(version = "2.1")
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull Uuid other) {
        G.p(other, "other");
        long j10 = this.f218479a;
        long j11 = other.f218479a;
        return j10 != j11 ? Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) : Long.compare(this.f218480b ^ Long.MIN_VALUE, other.f218480b ^ Long.MIN_VALUE);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Uuid)) {
            return false;
        }
        Uuid uuid = (Uuid) obj;
        return this.f218479a == uuid.f218479a && this.f218480b == uuid.f218480b;
    }

    public final long g() {
        return this.f218480b;
    }

    public int hashCode() {
        return C1550p.a(this.f218479a ^ this.f218480b);
    }

    public final long i() {
        return this.f218479a;
    }

    @NotNull
    public final byte[] k() {
        byte[] bArr = new byte[16];
        e.v(bArr, 0, this.f218479a);
        e.v(bArr, 8, this.f218480b);
        return bArr;
    }

    @InterfaceC4887e0(version = "2.1")
    @NotNull
    public final String l() {
        byte[] bArr = new byte[36];
        e.s(this.f218479a, bArr, 0, 0, 4);
        bArr[8] = 45;
        e.s(this.f218479a, bArr, 9, 4, 6);
        bArr[13] = 45;
        e.s(this.f218479a, bArr, 14, 6, 8);
        bArr[18] = 45;
        e.s(this.f218480b, bArr, 19, 0, 2);
        bArr[23] = 45;
        e.s(this.f218480b, bArr, 24, 2, 8);
        return F.W1(bArr);
    }

    @NotNull
    public final String m() {
        byte[] bArr = new byte[32];
        e.s(this.f218479a, bArr, 0, 0, 8);
        e.s(this.f218480b, bArr, 16, 0, 8);
        return F.W1(bArr);
    }

    @Xc.f
    public final <T> T n(p<? super Long, ? super Long, ? extends T> action) {
        G.p(action, "action");
        return action.invoke(Long.valueOf(this.f218479a), Long.valueOf(this.f218480b));
    }

    @InterfaceC4887e0(version = "2.1")
    @InterfaceC5045x
    @NotNull
    public final byte[] p() {
        return k();
    }

    @Xc.f
    public final <T> T r(p<? super B0, ? super B0, ? extends T> action) {
        G.p(action, "action");
        return action.invoke(new B0(this.f218479a), new B0(this.f218480b));
    }

    @NotNull
    public String toString() {
        return l();
    }

    public Uuid(long j10, long j11) {
        this.f218479a = j10;
        this.f218480b = j11;
    }
}

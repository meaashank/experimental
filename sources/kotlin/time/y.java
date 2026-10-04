package kotlin.time;

import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/LongParser\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,1613:1\n1656#2,3:1614\n1656#2,3:1617\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/LongParser\n*L\n1295#1:1614,3\n1302#1:1617,3\n*E\n"})
public final class y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f218465e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final y f218466f = new y(4611686018427387903L, true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final y f218467g = new y(Long.MAX_VALUE, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f218468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f218469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f218470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f218471d;

    public static final class a {
        public a() {
        }

        @NotNull
        public final y a() {
            return y.f218467g;
        }

        @NotNull
        public final y b() {
            return y.f218466f;
        }

        public a(C4969v c4969v) {
        }
    }

    public y(long j10, boolean z10) {
        this.f218468a = j10;
        this.f218469b = z10;
        long j11 = 10;
        this.f218470c = j10 / j11;
        this.f218471d = j10 % j11;
    }

    public final long g(@NotNull String value, int i10, @NotNull ed.q<? super Integer, ? super Integer, ? super Boolean, L0> callback) {
        int i11;
        char cCharAt;
        char cCharAt2;
        kotlin.jvm.internal.G.p(value, "value");
        kotlin.jvm.internal.G.p(callback, "callback");
        if (this.f218469b) {
            char cCharAt3 = value.charAt(i10);
            if (cCharAt3 == '+') {
                i10++;
            } else if (cCharAt3 == '-') {
                i10++;
                i11 = -1;
            }
            i11 = 1;
        } else {
            i11 = 1;
        }
        while (i10 < value.length() && value.charAt(i10) == '0') {
            i10++;
        }
        long j10 = 0;
        while (i10 < value.length() && '0' <= (cCharAt = value.charAt(i10)) && cCharAt < ':') {
            int i12 = cCharAt - '0';
            long j11 = this.f218470c;
            if (j10 > j11 || (j10 == j11 && i12 > this.f218471d)) {
                while (i10 < value.length() && '0' <= (cCharAt2 = value.charAt(i10)) && cCharAt2 < ':') {
                    i10++;
                }
                callback.invoke(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.TRUE);
                return this.f218468a;
            }
            j10 = ((long) i12) + (j10 << 3) + (j10 << 1);
            i10++;
        }
        callback.invoke(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.FALSE);
        return j10;
    }
}

package kotlin.time;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.InterfaceC4887e0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class m extends l {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f218441a;

        static {
            int[] iArr = new int[DurationUnit.values().length];
            try {
                iArr[DurationUnit.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DurationUnit.HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DurationUnit.MINUTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DurationUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DurationUnit.MILLISECONDS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DurationUnit.NANOSECONDS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DurationUnit.MICROSECONDS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f218441a = iArr;
        }
    }

    public static final long f(long j10, @NotNull DurationUnit unit) {
        kotlin.jvm.internal.G.p(unit, "unit");
        return h(j10, g(unit));
    }

    public static final long g(DurationUnit durationUnit) {
        int i10 = a.f218441a[durationUnit.ordinal()];
        if (i10 == 1) {
            return 86400000L;
        }
        if (i10 == 2) {
            return 3600000L;
        }
        if (i10 == 3) {
            return 60000L;
        }
        if (i10 == 4) {
            return 1000L;
        }
        if (i10 == 5) {
            return 1L;
        }
        throw new IllegalStateException(("Wrong unit for millisMultiplier: " + durationUnit).toString());
    }

    public static final long h(long j10, long j11) {
        if (j10 == 0) {
            return 0L;
        }
        if (j10 == 1) {
            if (j11 > 4611686018427387903L) {
                return 4611686018427387903L;
            }
            return j11;
        }
        if (j11 == 1) {
            if (j10 > 4611686018427387903L) {
                return 4611686018427387903L;
            }
            return j10;
        }
        int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j10)) - Long.numberOfLeadingZeros(j11);
        if (iNumberOfLeadingZeros < 63) {
            return j10 * j11;
        }
        if (iNumberOfLeadingZeros > 63) {
            return 4611686018427387903L;
        }
        long j12 = j10 * j11;
        if (j12 > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j12;
    }

    @InterfaceC4887e0(version = "1.3")
    @NotNull
    public static final String i(@NotNull DurationUnit durationUnit) {
        kotlin.jvm.internal.G.p(durationUnit, "<this>");
        switch (a.f218441a[durationUnit.ordinal()]) {
            case 1:
                return DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D;
            case 2:
                return K9.h.f58477a;
            case 3:
                return G0.F.f40036b;
            case 4:
                return "s";
            case 5:
                return "ms";
            case 6:
                return "ns";
            case 7:
                return "us";
            default:
                throw new IllegalStateException(("Unknown unit: " + durationUnit).toString());
        }
    }
}

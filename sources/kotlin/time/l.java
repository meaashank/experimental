package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.InterfaceC4887e0;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class l {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f218440a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f218440a = iArr;
        }
    }

    @InterfaceC4887e0(version = "1.3")
    public static final double a(double d10, @NotNull DurationUnit sourceUnit, @NotNull DurationUnit targetUnit) {
        kotlin.jvm.internal.G.p(sourceUnit, "sourceUnit");
        kotlin.jvm.internal.G.p(targetUnit, "targetUnit");
        long jConvert = targetUnit.getTimeUnit$kotlin_stdlib().convert(1L, sourceUnit.getTimeUnit$kotlin_stdlib());
        return jConvert > 0 ? d10 * jConvert : d10 / sourceUnit.getTimeUnit$kotlin_stdlib().convert(1L, targetUnit.getTimeUnit$kotlin_stdlib());
    }

    @InterfaceC4887e0(version = "1.5")
    public static final long b(long j10, @NotNull DurationUnit sourceUnit, @NotNull DurationUnit targetUnit) {
        kotlin.jvm.internal.G.p(sourceUnit, "sourceUnit");
        kotlin.jvm.internal.G.p(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit$kotlin_stdlib().convert(j10, sourceUnit.getTimeUnit$kotlin_stdlib());
    }

    @InterfaceC4887e0(version = "1.5")
    public static final long c(long j10, @NotNull DurationUnit sourceUnit, @NotNull DurationUnit targetUnit) {
        kotlin.jvm.internal.G.p(sourceUnit, "sourceUnit");
        kotlin.jvm.internal.G.p(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit$kotlin_stdlib().convert(j10, sourceUnit.getTimeUnit$kotlin_stdlib());
    }

    @InterfaceC4887e0(version = "1.8")
    @NotNull
    public static final DurationUnit d(@NotNull TimeUnit timeUnit) {
        kotlin.jvm.internal.G.p(timeUnit, "<this>");
        switch (a.f218440a[timeUnit.ordinal()]) {
            case 1:
                return DurationUnit.NANOSECONDS;
            case 2:
                return DurationUnit.MICROSECONDS;
            case 3:
                return DurationUnit.MILLISECONDS;
            case 4:
                return DurationUnit.SECONDS;
            case 5:
                return DurationUnit.MINUTES;
            case 6:
                return DurationUnit.HOURS;
            case 7:
                return DurationUnit.DAYS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @InterfaceC4887e0(version = "1.8")
    @NotNull
    public static final TimeUnit e(@NotNull DurationUnit durationUnit) {
        kotlin.jvm.internal.G.p(durationUnit, "<this>");
        return durationUnit.getTimeUnit$kotlin_stdlib();
    }
}

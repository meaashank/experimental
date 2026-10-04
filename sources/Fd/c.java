package Fd;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.G;
import org.apache.http.protocol.HttpDateGenerator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f39976a = 253402300799999L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f39977b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String[] f39978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final DateFormat[] f39979d;

    public static final class a extends ThreadLocal<DateFormat> {
        @Override // java.lang.ThreadLocal
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(Bd.f.f17496f);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {HttpDateGenerator.PATTERN_RFC1123, "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f39978c = strArr;
        f39979d = new DateFormat[strArr.length];
    }

    @Nullable
    public static final Date a(@NotNull String str) {
        G.p(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = f39977b.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = f39978c;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                int i10 = 0;
                while (i10 < length) {
                    int i11 = i10 + 1;
                    DateFormat[] dateFormatArr = f39979d;
                    DateFormat simpleDateFormat = dateFormatArr[i10];
                    if (simpleDateFormat == null) {
                        simpleDateFormat = new SimpleDateFormat(f39978c[i10], Locale.US);
                        simpleDateFormat.setTimeZone(Bd.f.f17496f);
                        dateFormatArr[i10] = simpleDateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date date2 = simpleDateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return date2;
                    }
                    i10 = i11;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NotNull
    public static final String b(@NotNull Date date) {
        G.p(date, "<this>");
        String str = f39977b.get().format(date);
        G.o(str, "STANDARD_DATE_FORMAT.get().format(this)");
        return str;
    }
}

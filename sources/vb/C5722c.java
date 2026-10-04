package vb;

import android.util.Log;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.prism.lib_google_billing.q;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* JADX INFO: renamed from: vb.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C5722c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f239941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f239942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Throwable f239943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f239944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f239945e = System.currentTimeMillis();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f239946f = Thread.currentThread().getId();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f239947g;

    public C5722c(String str, int i10, String str2, Throwable th) {
        this.f239947g = null;
        this.f239944d = i10;
        this.f239941a = str;
        this.f239942b = str2;
        this.f239943c = th;
        this.f239947g = Thread.currentThread().getName();
    }

    public static String b(int i10) {
        return i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 != 6 ? q.f194113a : "ERROR" : "WARN" : "INFO" : "DEBUG" : "VERBOSE";
    }

    public static String c(long j10, String str) {
        Date date = new Date(j10);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        return new SimpleDateFormat(str, Locale.CHINA).format(gregorianCalendar.getTime());
    }

    public long a() {
        return (this.f239942b != null ? r0.length() : 0) + 40;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b(this.f239944d));
        sb2.append(RemoteSettings.FORWARD_SLASH_STRING);
        sb2.append(c(this.f239945e, "yyyy-MM-dd HH:mm:ss"));
        sb2.append("[");
        sb2.append(this.f239947g);
        sb2.append(C4.q.f17581a);
        sb2.append(this.f239946f);
        sb2.append("][");
        sb2.append(this.f239941a);
        sb2.append("][");
        sb2.append(this.f239942b);
        sb2.append("]");
        if (this.f239943c != null) {
            sb2.append(" * Exception :\n");
            sb2.append(Log.getStackTraceString(this.f239943c));
        }
        sb2.append("\n");
        return sb2.toString();
    }
}

package com.tencent.qcloud.core.http;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicLong;
import vb.C5724e;

/* JADX INFO: loaded from: classes7.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f194252b = "EEE, dd MMM yyyy HH:mm:ss z";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicLong f194251a = new AtomicLong(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TimeZone f194253c = TimeZone.getTimeZone("GMT");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ThreadLocal<SimpleDateFormat> f194254d = new ThreadLocal<>();

    public static long a(String str, Date date) {
        AtomicLong atomicLong = f194251a;
        long j10 = atomicLong.get();
        b(str, date, 0);
        return Math.abs(j10 - atomicLong.get());
    }

    public static void b(String str, Date date, int i10) {
        try {
            long time = (d().parse(str).getTime() - date.getTime()) / 1000;
            if (Math.abs(time) >= i10) {
                f194251a.set(time);
                C5724e.g(QCloudHttpClient.f194181k, "NEW TIME OFFSET is " + time + "s", new Object[0]);
            }
        } catch (ParseException unused) {
        }
    }

    public static long c() {
        return f194251a.get() + (System.currentTimeMillis() / 1000);
    }

    public static SimpleDateFormat d() {
        SimpleDateFormat simpleDateFormat = f194254d.get();
        if (simpleDateFormat != null) {
            return simpleDateFormat;
        }
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(f194252b, Locale.US);
        simpleDateFormat2.setTimeZone(f194253c);
        simpleDateFormat2.setLenient(false);
        f194254d.set(simpleDateFormat2);
        return simpleDateFormat2;
    }

    public static String e(Date date) {
        return d().format(date);
    }

    public static Date f(String str) {
        try {
            return d().parse(str);
        } catch (ParseException unused) {
            return null;
        }
    }
}

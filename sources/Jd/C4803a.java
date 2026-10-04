package jd;

import dd.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jd.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4803a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C4803a f214256a = new C4803a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @g
    public static final double f214257b = Math.log(2.0d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @g
    public static final double f214258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @g
    public static final double f214259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @g
    public static final double f214260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @g
    public static final double f214261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @g
    public static final double f214262g;

    static {
        double dUlp = Math.ulp(1.0d);
        f214258c = dUlp;
        double dSqrt = Math.sqrt(dUlp);
        f214259d = dSqrt;
        double dSqrt2 = Math.sqrt(dSqrt);
        f214260e = dSqrt2;
        double d10 = 1;
        f214261f = d10 / dSqrt;
        f214262g = d10 / dSqrt2;
    }
}

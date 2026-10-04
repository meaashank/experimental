package com.prism.hider.vault.calculator;

import com.android.launcher3.IconCache;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: renamed from: com.prism.hider.vault.calculator.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C4261m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f168559e = "Error";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f168560a = MBridgeConstans.ENDCARD_URL_TYPE_PL;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Double f168561b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f168562c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f168563d = true;

    public void a() {
        this.f168560a = MBridgeConstans.ENDCARD_URL_TYPE_PL;
        this.f168561b = null;
        this.f168562c = null;
        this.f168563d = true;
    }

    public final void b() {
        Double d10;
        double dDoubleValue;
        double dI;
        if (this.f168562c == null || (d10 = this.f168561b) == null) {
            return;
        }
        dDoubleValue = d10.doubleValue();
        dI = i(this.f168560a);
        String str = this.f168562c;
        str.getClass();
        switch (str) {
            case "*":
                dI *= dDoubleValue;
                break;
            case "+":
                dI += dDoubleValue;
                break;
            case "-":
                dI = dDoubleValue - dI;
                break;
            case "/":
                dI = dI == 0.0d ? Double.NaN : dDoubleValue / dI;
                break;
        }
        this.f168560a = (Double.isNaN(dI) || Double.isInfinite(dI)) ? f168559e : l(dI);
        this.f168561b = null;
    }

    public void c() {
        if (h()) {
            return;
        }
        b();
        this.f168562c = null;
        this.f168563d = true;
    }

    public String d() {
        return this.f168560a;
    }

    public void e() {
        if (h()) {
            this.f168560a = MBridgeConstans.ENDCARD_URL_TYPE_PL;
            this.f168563d = false;
        }
        if (this.f168563d) {
            this.f168560a = "0.";
            this.f168563d = false;
        } else {
            if (this.f168560a.contains(IconCache.EMPTY_CLASS_NAME)) {
                return;
            }
            this.f168560a = android.support.v4.media.e.a(new StringBuilder(), this.f168560a, IconCache.EMPTY_CLASS_NAME);
        }
    }

    public void f(int i10) {
        if (h()) {
            this.f168560a = MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        if (!this.f168563d) {
            this.f168560a = androidx.multidex.d.a(new StringBuilder(), this.f168560a, i10);
        } else {
            this.f168560a = String.valueOf(i10);
            this.f168563d = false;
        }
    }

    public void g(String str) {
        if (h()) {
            return;
        }
        if (this.f168562c != null && !this.f168563d) {
            b();
        }
        this.f168561b = Double.valueOf(i(this.f168560a));
        this.f168562c = str;
        this.f168563d = true;
    }

    public boolean h() {
        return f168559e.equals(this.f168560a);
    }

    public final double i(String str) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return 0.0d;
        }
    }

    public void j() {
        if (h()) {
            return;
        }
        this.f168560a = l(i(this.f168560a) / 100.0d);
    }

    public void k() {
        if (h() || MBridgeConstans.ENDCARD_URL_TYPE_PL.equals(this.f168560a)) {
            return;
        }
        this.f168560a = l(-i(this.f168560a));
    }

    public final String l(double d10) {
        return (d10 != Math.floor(d10) || Double.isInfinite(d10) || Math.abs(d10) >= 1.0E15d) ? String.valueOf(Math.round(d10 * 1.0E10d) / 1.0E10d) : String.valueOf((long) d10);
    }
}

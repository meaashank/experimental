package com.prism.gaia.helper.utils;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* JADX INFO: loaded from: classes6.dex */
public class t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f165214e = "ro.build.version.emui";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f165215f = "ro.miui.ui.version.code";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f165216g = "ro.miui.ui.version.name";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f165217h = "ro.miui.internal.storage";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t f165218i = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f165219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f165220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f165221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f165222d;

    public t() {
        Properties properties;
        try {
            properties = new Properties();
            properties.load(new FileInputStream(new File(Environment.getRootDirectory(), "build.prop")));
        } catch (IOException unused) {
            properties = null;
        }
        if (properties != null) {
            boolean z10 = true;
            this.f165219a = !TextUtils.isEmpty(properties.getProperty(f165214e));
            String property = properties.getProperty(f165215f);
            this.f165222d = property;
            if (TextUtils.isEmpty(property) && TextUtils.isEmpty(properties.getProperty(f165216g)) && TextUtils.isEmpty(properties.getProperty(f165217h))) {
                z10 = false;
            }
            this.f165220b = z10;
        }
        this.f165221c = c();
    }

    public static t a() {
        return f165218i;
    }

    public String b() {
        return this.f165222d;
    }

    public final boolean c() {
        try {
            return Build.class.getMethod("hasSmartBar", null) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean d() {
        return this.f165219a;
    }

    public boolean e() {
        return this.f165221c;
    }

    public boolean f() {
        return this.f165220b;
    }
}

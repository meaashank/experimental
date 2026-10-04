package com.prism.remoteconfig;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Map;
import pb.InterfaceC5401a;
import pb.InterfaceC5402b;

/* JADX INFO: loaded from: classes7.dex */
public class RepositoryWrapper implements InterfaceC5402b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f194115c = "RepositoryWrapper";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f194116d = "ad_cache";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f194117e = 7200;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferences f194118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC5402b f194119b;

    public class a implements InterfaceC5401a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5401a f194120a;

        public a(InterfaceC5401a interfaceC5401a) {
            this.f194120a = interfaceC5401a;
        }

        @Override // pb.InterfaceC5401a
        public void a() {
            InterfaceC5401a interfaceC5401a = this.f194120a;
            if (interfaceC5401a != null) {
                interfaceC5401a.a();
            }
        }

        @Override // pb.InterfaceC5401a
        public void onFailed(String str) {
            RepositoryWrapper.this.f194119b = null;
            InterfaceC5401a interfaceC5401a = this.f194120a;
            if (interfaceC5401a != null) {
                interfaceC5401a.onFailed(str);
            }
        }
    }

    public class b implements InterfaceC5401a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5401a f194122a;

        public b(InterfaceC5401a interfaceC5401a) {
            this.f194122a = interfaceC5401a;
        }

        @Override // pb.InterfaceC5401a
        public void a() {
            InterfaceC5401a interfaceC5401a = this.f194122a;
            if (interfaceC5401a != null) {
                interfaceC5401a.a();
            }
        }

        @Override // pb.InterfaceC5401a
        public void onFailed(String str) {
            InterfaceC5401a interfaceC5401a = this.f194122a;
            if (interfaceC5401a != null) {
                interfaceC5401a.onFailed(str);
            }
        }
    }

    public RepositoryWrapper(InterfaceC5402b interfaceC5402b) {
        this.f194119b = interfaceC5402b;
    }

    @Override // pb.InterfaceC5402b
    public void a(String str, Object obj) {
        InterfaceC5402b interfaceC5402b = this.f194119b;
        if (interfaceC5402b != null) {
            interfaceC5402b.a(str, obj);
        }
        l(str, obj);
    }

    @Override // pb.InterfaceC5402b
    public boolean b(String str) {
        InterfaceC5402b interfaceC5402b = this.f194119b;
        if (interfaceC5402b != null) {
            boolean zB = interfaceC5402b.b(str);
            l(str, Boolean.valueOf(zB));
            return zB;
        }
        if (this.f194118a.contains(str)) {
            return this.f194118a.getBoolean(str, false);
        }
        return false;
    }

    @Override // pb.InterfaceC5402b
    public long c(String str) {
        InterfaceC5402b interfaceC5402b = this.f194119b;
        if (interfaceC5402b != null) {
            long jC = interfaceC5402b.c(str);
            l(str, Long.valueOf(jC));
            return jC;
        }
        if (this.f194118a.contains(str)) {
            return this.f194118a.getLong(str, 0L);
        }
        return 0L;
    }

    @Override // pb.InterfaceC5402b
    public double d(String str, double d10) {
        InterfaceC5402b interfaceC5402b = this.f194119b;
        if (interfaceC5402b != null) {
            double dF = interfaceC5402b.f(str);
            l(str, Double.valueOf(dF));
            return dF;
        }
        if (this.f194118a.contains(str)) {
            return this.f194118a.getFloat(str, (float) d10);
        }
        return 0.0d;
    }

    @Override // pb.InterfaceC5402b
    public String e(String str) {
        InterfaceC5402b interfaceC5402b = this.f194119b;
        if (interfaceC5402b == null) {
            return this.f194118a.contains(str) ? this.f194118a.getString(str, "") : "";
        }
        String strE = interfaceC5402b.e(str);
        l(str, strE);
        return strE;
    }

    @Override // pb.InterfaceC5402b
    public double f(String str) {
        InterfaceC5402b interfaceC5402b = this.f194119b;
        if (interfaceC5402b != null) {
            double dF = interfaceC5402b.f(str);
            l(str, Double.valueOf(dF));
            return dF;
        }
        if (this.f194118a.contains(str)) {
            return this.f194118a.getFloat(str, 0.0f);
        }
        return 0.0d;
    }

    @Override // pb.InterfaceC5402b
    public void g(Context context, InterfaceC5401a interfaceC5401a) {
        h(context, interfaceC5401a, f194117e);
    }

    @Override // pb.InterfaceC5402b
    public boolean getBoolean(String str, boolean z10) {
        InterfaceC5402b interfaceC5402b = this.f194119b;
        if (interfaceC5402b == null) {
            return this.f194118a.contains(str) ? this.f194118a.getBoolean(str, z10) : z10;
        }
        boolean z11 = interfaceC5402b.getBoolean(str, z10);
        l(str, Boolean.valueOf(z11));
        return z11;
    }

    @Override // pb.InterfaceC5402b
    public long getLong(String str, long j10) {
        InterfaceC5402b interfaceC5402b = this.f194119b;
        if (interfaceC5402b == null) {
            return this.f194118a.contains(str) ? this.f194118a.getLong(str, j10) : j10;
        }
        long j11 = interfaceC5402b.getLong(str, j10);
        l(str, Long.valueOf(j11));
        Log.d("OssRemoteConfig", "key:" + str + "remote:" + j11);
        return j11;
    }

    @Override // pb.InterfaceC5402b
    public String getString(String str, String str2) {
        InterfaceC5402b interfaceC5402b = this.f194119b;
        if (interfaceC5402b == null) {
            return this.f194118a.contains(str) ? this.f194118a.getString(str, str2) : str2;
        }
        String string = interfaceC5402b.getString(str, str2);
        l(str, string);
        return string;
    }

    @Override // pb.InterfaceC5402b
    public void h(Context context, InterfaceC5401a interfaceC5401a, long j10) {
        this.f194118a = context.getSharedPreferences(f194116d, 0);
        InterfaceC5402b interfaceC5402b = this.f194119b;
        if (interfaceC5402b != null) {
            interfaceC5402b.h(context, new a(interfaceC5401a), j10);
            return;
        }
        this.f194119b = null;
        if (interfaceC5401a != null) {
            interfaceC5401a.onFailed("repository is null");
        }
    }

    @Override // pb.InterfaceC5402b
    public void i(Map<String, Object> map) {
        InterfaceC5402b interfaceC5402b = this.f194119b;
        if (interfaceC5402b != null) {
            interfaceC5402b.i(map);
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            l(entry.getKey(), entry.getValue());
        }
    }

    public void k(Context context, InterfaceC5401a interfaceC5401a, long j10) {
        this.f194118a = context.getSharedPreferences(f194116d, 0);
        InterfaceC5402b interfaceC5402b = this.f194119b;
        if (interfaceC5402b != null) {
            interfaceC5402b.h(context, new b(interfaceC5401a), j10);
        } else if (interfaceC5401a != null) {
            interfaceC5401a.onFailed("repository is null");
        }
    }

    public final void l(String str, Object obj) {
        SharedPreferences.Editor editorEdit = this.f194118a.edit();
        if (obj instanceof String) {
            editorEdit.putString(str, (String) obj);
        } else if (obj instanceof Long) {
            editorEdit.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Double) {
            editorEdit.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Boolean) {
            editorEdit.putBoolean(str, ((Boolean) obj).booleanValue());
        }
        editorEdit.apply();
        editorEdit.commit();
        Log.d(f194115c, "save cahce: key=" + str + "; val:" + obj);
    }
}

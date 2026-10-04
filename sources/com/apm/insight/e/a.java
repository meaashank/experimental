package com.apm.insight.e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.e;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f137167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.apm.insight.e.a.b f137168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SQLiteDatabase f137169c;

    private a() {
    }

    public static a a() {
        if (f137167a == null) {
            synchronized (a.class) {
                try {
                    if (f137167a == null) {
                        f137167a = new a();
                    }
                } finally {
                }
            }
        }
        return f137167a;
    }

    private void b() {
        if (this.f137168b == null) {
            a(e.g());
        }
    }

    public final synchronized void a(Context context) {
        try {
            this.f137169c = new b(context).getWritableDatabase();
        } finally {
        }
        this.f137168b = new com.apm.insight.e.a.b();
    }

    public final synchronized void a(com.apm.insight.d.a aVar) {
        b();
        com.apm.insight.e.a.b bVar = this.f137168b;
        if (bVar != null) {
            bVar.a(this.f137169c, aVar);
        }
    }

    public final synchronized boolean a(String str) {
        b();
        com.apm.insight.e.a.b bVar = this.f137168b;
        if (bVar == null) {
            return false;
        }
        return bVar.a(this.f137169c, str);
    }
}

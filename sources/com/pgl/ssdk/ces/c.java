package com.pgl.ssdk.ces;

import android.content.Context;
import android.text.TextUtils;
import com.pgl.ssdk.k0;
import com.pgl.ssdk.l0;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f161836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f161837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f161838c;

    public c(Context context, String str, Map<String, Object> map) {
        this.f161836a = context;
        this.f161837b = str;
        this.f161838c = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            byte[] bArr = (byte[]) a.meta(222, this.f161836a, new Object[]{this.f161837b, this.f161838c});
            if (bArr != null && bArr.length > 0 && !TextUtils.isEmpty(l0.a())) {
                new k0(this.f161836a, null).a(1, 2, bArr);
            }
        } catch (Throwable unused) {
        }
    }
}

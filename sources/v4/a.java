package V4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.prism.commons.utils.C3840d;
import q4.c;
import t7.C5617a;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f74615b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f74616c = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f74617a = -1;

    /* JADX INFO: renamed from: V4.a$a, reason: collision with other inner class name */
    public class C0124a extends BroadcastReceiver {
        public C0124a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            a.this.f(context);
        }
    }

    public static a d() {
        return f74615b;
    }

    public int b() {
        return this.f74617a;
    }

    public void c(Context context) {
        IntentFilter intentFilter = new IntentFilter(c.f226807e);
        f(context);
        C3840d.a(context, new C0124a(), intentFilter);
    }

    public boolean e() {
        return this.f74617a == 1;
    }

    public final void f(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(C5617a.f239212e)).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            this.f74617a = -1;
        } else {
            this.f74617a = activeNetworkInfo.getType();
        }
    }
}

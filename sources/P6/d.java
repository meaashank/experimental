package p6;

import android.os.IBinder;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public class d implements InterfaceC5394a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f226351e = "d";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f226352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f226353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f226354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f226355d;

    public interface a {
        void a() throws Throwable;
    }

    public d(@NonNull String str, @NonNull IBinder iBinder, @Nullable a aVar) {
        this.f226355d = false;
        this.f226352a = str;
        this.f226353b = iBinder;
        this.f226354c = aVar;
        if (aVar == null) {
            this.f226355d = true;
        }
    }

    @Override // p6.InterfaceC5394a
    public boolean a() {
        return this.f226355d;
    }

    @Override // p6.InterfaceC5394a
    @NonNull
    public String b() {
        return this.f226352a;
    }

    @Override // p6.InterfaceC5394a
    @NonNull
    public IBinder c() {
        return this.f226353b;
    }

    @Override // p6.InterfaceC5394a
    public void d() {
        if (this.f226355d) {
            return;
        }
        synchronized (this) {
            if (this.f226355d) {
                return;
            }
            try {
                this.f226354c.a();
            } catch (Throwable th) {
                Log.e(f226351e, "service(" + this.f226352a + ") toGetReady failed: " + th.getMessage(), th);
            }
            this.f226355d = true;
        }
    }
}

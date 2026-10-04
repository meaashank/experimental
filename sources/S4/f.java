package s4;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.compose.runtime.internal.r;
import com.cookiegames.smartcookie.permissions.Permissions;
import e.InterfaceC4335i;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 0)
public abstract class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f238556c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f238557d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f238558e = "f";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Set<String> f238559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public Looper f238560b;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public f() {
        this.f238559a = new HashSet(1);
        Looper mainLooper = Looper.getMainLooper();
        G.o(mainLooper, "getMainLooper(...)");
        this.f238560b = mainLooper;
    }

    public static void a(f fVar) {
        fVar.f();
    }

    public static void b(f fVar, String str) {
        fVar.e(str);
    }

    public static void c(f fVar, String str) {
        fVar.e(str);
    }

    public static void d(f fVar) {
        fVar.f();
    }

    public static final void i(f fVar) {
        fVar.f();
    }

    public static final void j(f fVar, String str) {
        fVar.e(str);
    }

    public static final void k(f fVar) {
        fVar.f();
    }

    public static final void l(f fVar, String str) {
        fVar.e(str);
    }

    public abstract void e(@NotNull String str);

    public abstract void f();

    @InterfaceC4335i
    public final synchronized boolean g(@NotNull String permission, int i10) {
        try {
            G.p(permission, "permission");
        } catch (Throwable th) {
            throw th;
        }
        return i10 == 0 ? h(permission, Permissions.GRANTED) : h(permission, Permissions.DENIED);
    }

    @InterfaceC4335i
    public final synchronized boolean h(@NotNull final String permission, @NotNull Permissions result) {
        G.p(permission, "permission");
        G.p(result, "result");
        this.f238559a.remove(permission);
        if (result == Permissions.GRANTED) {
            if (this.f238559a.isEmpty()) {
                new Handler(this.f238560b).post(new Runnable() { // from class: s4.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.d(this.f238550a);
                    }
                });
                return true;
            }
        } else {
            if (result == Permissions.DENIED) {
                new Handler(this.f238560b).post(new Runnable() { // from class: s4.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.b(this.f238551a, permission);
                    }
                });
                return true;
            }
            if (result == Permissions.NOT_FOUND) {
                n(permission);
                if (this.f238559a.isEmpty()) {
                    new Handler(this.f238560b).post(new Runnable() { // from class: s4.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            f.a(this.f238553a);
                        }
                    });
                    return true;
                }
            }
        }
        return false;
    }

    @InterfaceC4335i
    public final synchronized void m(@NotNull String[] perms) {
        G.p(perms, "perms");
        Collections.addAll(this.f238559a, Arrays.copyOf(perms, perms.length));
    }

    public final synchronized boolean n(@NotNull String permission) {
        G.p(permission, "permission");
        Log.d(f238558e, "Permission not found: ".concat(permission));
        return true;
    }

    public f(@NotNull Looper looper) {
        G.p(looper, "looper");
        this.f238559a = new HashSet(1);
        G.o(Looper.getMainLooper(), "getMainLooper(...)");
        this.f238560b = looper;
    }
}

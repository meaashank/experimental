package na;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.util.Log;
import android.widget.Toast;
import androidx.annotation.NonNull;
import com.prism.commons.utils.l0;
import com.prism.hider.vault.commons.C4269e;
import com.prism.hider.vault.commons.C4276l;
import e.T;
import javax.crypto.Cipher;
import s6.C5577b;
import s6.j;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f221257e = l0.b(c.class.getSimpleName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f221258f = "DEFAULT_KEY_";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f221259g = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f221260a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CancellationSignal f221261b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f221262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC0844c f221263d;

    public class a implements j.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f221264a;

        public a(Activity activity) {
            this.f221264a = activity;
        }

        @Override // s6.j.e
        public void a(int i10, j jVar) {
            Toast.makeText(this.f221264a, C4276l.m.f171963m2, 1);
        }

        @Override // s6.j.e
        @T(api = 23)
        public void b(int i10, j jVar) {
            c.this.i(this.f221264a);
        }

        @Override // s6.j.e
        public void c(int i10, j jVar, @NonNull String[] strArr, @NonNull int[] iArr) {
            Toast.makeText(this.f221264a, C4276l.m.f171963m2, 1);
        }
    }

    public class b extends FingerprintManager.AuthenticationCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f221266a;

        public b(Context context) {
            this.f221266a = context;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i10, CharSequence charSequence) {
            Log.d(c.f221257e, "startListeningFingerprintUnlock onAuthenticationError code:" + i10 + " msg:" + ((Object) charSequence));
            c cVar = c.this;
            if (!cVar.f221260a || 5 == i10) {
                return;
            }
            cVar.f(this.f221266a);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            Log.d(c.f221257e, "startListeningFingerprintUnlock onAuthenticationFailed");
            c.this.f(this.f221266a);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i10, CharSequence charSequence) {
            Log.d(c.f221257e, "startListeningFingerprintUnlock onAuthenticationHelp code:" + i10 + " str:" + ((Object) charSequence));
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            Log.d(c.f221257e, "startListeningFingerprintUnlock onAuthenticationSucceeded");
            if (c.this.f221260a) {
                Toast.makeText(this.f221266a, C4276l.m.f171868L2, 1).show();
                InterfaceC0844c interfaceC0844c = c.this.f221263d;
                if (interfaceC0844c != null) {
                    interfaceC0844c.a();
                }
            }
        }
    }

    /* JADX INFO: renamed from: na.c$c, reason: collision with other inner class name */
    public interface InterfaceC0844c {
        void a();
    }

    public c(InterfaceC0844c interfaceC0844c) {
        this.f221263d = interfaceC0844c;
    }

    public final void f(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public void g(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        Log.d(f221257e, "onRequestPermissionsResult " + this.f221262c);
        j jVar = this.f221262c;
        if (jVar != null) {
            jVar.e(i10, strArr, iArr);
        }
    }

    public void h() {
        CancellationSignal cancellationSignal = this.f221261b;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
            this.f221261b = null;
            this.f221260a = false;
        }
    }

    public final void i(Context context) {
        if (C4269e.c(context)) {
            k(context);
        }
    }

    public void j(Activity activity, int i10) {
        this.f221262c = new j(new C5577b[]{new C5577b("android.permission.USE_FINGERPRINT", C4276l.m.f171959l2, true)});
        Log.d(f221257e, "start permsRequester");
        this.f221262c.f(activity, i10, new a(activity));
    }

    @T(api = 23)
    public final void k(Context context) {
        Log.d(f221257e, "startListeningFingerprintUnlock");
        this.f221260a = true;
        this.f221261b = new CancellationSignal();
        FingerprintManager fingerprintManager = (FingerprintManager) context.getSystemService(FingerprintManager.class);
        Cipher cipherA = C4269e.a(context, f221258f + Math.random());
        if (cipherA == null) {
            return;
        }
        fingerprintManager.authenticate(new FingerprintManager.CryptoObject(cipherA), this.f221261b, 0, new b(context), null);
    }
}

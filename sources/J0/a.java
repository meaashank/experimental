package J0;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.os.C2407f;
import e.T;
import e.W;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@Deprecated
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f53116a;

    /* JADX INFO: renamed from: J0.a$a, reason: collision with other inner class name */
    public class C0059a extends FingerprintManager.AuthenticationCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f53117a;

        public C0059a(c cVar) {
            this.f53117a = cVar;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i10, CharSequence charSequence) {
            this.f53117a.getClass();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.f53117a.getClass();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i10, CharSequence charSequence) {
            this.f53117a.getClass();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            c cVar = this.f53117a;
            b.f(authenticationResult.getCryptoObject());
            cVar.getClass();
        }
    }

    @T(23)
    public static class b {
        @W("android.permission.USE_FINGERPRINT")
        public static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i10, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i10, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        public static FingerprintManager.CryptoObject b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        public static FingerprintManager c(Context context) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 == 23) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            if (i10 <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return null;
            }
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }

        @W("android.permission.USE_FINGERPRINT")
        public static boolean d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        @W("android.permission.USE_FINGERPRINT")
        public static boolean e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        public static e f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new e(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new e(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new e(cryptoObject.getMac());
            }
            return null;
        }

        public static FingerprintManager.CryptoObject g(e eVar) {
            if (eVar == null) {
                return null;
            }
            if (eVar.a() != null) {
                return new FingerprintManager.CryptoObject(eVar.a());
            }
            if (eVar.c() != null) {
                return new FingerprintManager.CryptoObject(eVar.c());
            }
            if (eVar.b() != null) {
                return new FingerprintManager.CryptoObject(eVar.b());
            }
            return null;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f53118a;

        public d(@NonNull e eVar) {
            this.f53118a = eVar;
        }

        @NonNull
        public e a() {
            return this.f53118a;
        }
    }

    public a(Context context) {
        this.f53116a = context;
    }

    @NonNull
    public static a c(@NonNull Context context) {
        return new a(context);
    }

    @Nullable
    @T(23)
    public static FingerprintManager d(@NonNull Context context) {
        return b.c(context);
    }

    @T(23)
    public static e g(FingerprintManager.CryptoObject cryptoObject) {
        return b.f(cryptoObject);
    }

    @T(23)
    public static FingerprintManager.AuthenticationCallback h(c cVar) {
        return new C0059a(cVar);
    }

    @T(23)
    public static FingerprintManager.CryptoObject i(e eVar) {
        return b.g(eVar);
    }

    @W("android.permission.USE_FINGERPRINT")
    public void a(@Nullable e eVar, int i10, @Nullable CancellationSignal cancellationSignal, @NonNull c cVar, @Nullable Handler handler) {
        FingerprintManager fingerprintManagerC = b.c(this.f53116a);
        if (fingerprintManagerC != null) {
            fingerprintManagerC.authenticate(b.g(eVar), cancellationSignal, i10, new C0059a(cVar), handler);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @W("android.permission.USE_FINGERPRINT")
    @Deprecated
    public void b(@Nullable e eVar, int i10, @Nullable C2407f c2407f, @NonNull c cVar, @Nullable Handler handler) {
        a(eVar, i10, c2407f != null ? (CancellationSignal) c2407f.b() : null, cVar, handler);
    }

    @W("android.permission.USE_FINGERPRINT")
    public boolean e() {
        FingerprintManager fingerprintManagerC = b.c(this.f53116a);
        return fingerprintManagerC != null && fingerprintManagerC.hasEnrolledFingerprints();
    }

    @W("android.permission.USE_FINGERPRINT")
    public boolean f() {
        FingerprintManager fingerprintManagerC = b.c(this.f53116a);
        return fingerprintManagerC != null && fingerprintManagerC.isHardwareDetected();
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Signature f53119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Cipher f53120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Mac f53121c;

        public e(@NonNull Signature signature) {
            this.f53119a = signature;
            this.f53120b = null;
            this.f53121c = null;
        }

        @Nullable
        public Cipher a() {
            return this.f53120b;
        }

        @Nullable
        public Mac b() {
            return this.f53121c;
        }

        @Nullable
        public Signature c() {
            return this.f53119a;
        }

        public e(@NonNull Cipher cipher) {
            this.f53120b = cipher;
            this.f53119a = null;
            this.f53121c = null;
        }

        public e(@NonNull Mac mac) {
            this.f53121c = mac;
            this.f53120b = null;
            this.f53119a = null;
        }
    }

    public static abstract class c {
        public void b() {
        }

        public void d(@NonNull d dVar) {
        }

        public void a(int i10, @NonNull CharSequence charSequence) {
        }

        public void c(int i10, @NonNull CharSequence charSequence) {
        }
    }
}

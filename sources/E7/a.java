package E7;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import c7.C2953e;
import c7.E;
import c7.InterfaceC2957i;
import c7.x;

/* JADX INFO: loaded from: classes6.dex */
public class a extends E {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f33321h = "asdf-".concat(a.class.getSimpleName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f33322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f33323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC2957i[] f33324g;

    public a(String str, String str2, InterfaceC2957i... interfaceC2957iArr) {
        this.f33322e = str;
        this.f33323f = str2;
        this.f33324g = interfaceC2957iArr;
    }

    @Override // c7.E, u8.b
    public Object c() {
        return "identity-service:" + this.f33322e;
    }

    @Override // c7.E
    public void d(@NonNull C2953e<IInterface> c2953e) {
        c2953e.g(new x());
        for (InterfaceC2957i interfaceC2957i : this.f33324g) {
            c2953e.g(interfaceC2957i);
        }
    }

    @Override // c7.E
    @Nullable
    public IInterface i(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        try {
            return (IInterface) Class.forName(this.f33323f + "$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // c7.E
    public String l() {
        return this.f33322e;
    }
}

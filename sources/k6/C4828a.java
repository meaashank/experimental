package k6;

import android.os.Bundle;
import com.prism.commons.utils.I;
import com.prism.commons.utils.l0;

/* JADX INFO: renamed from: k6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C4828a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f217331b = l0.b(C4828a.class.getSimpleName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C4828a f217332c = new C4828a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC4829b f217333a = null;

    public static C4828a a() {
        return f217332c;
    }

    public void b(Throwable th, String str, Bundle bundle) {
        InterfaceC4829b interfaceC4829b = this.f217333a;
        if (interfaceC4829b == null) {
            I.b(f217331b, "bugReporter is not set yet!", new Object[0]);
        } else {
            interfaceC4829b.a(th, str, bundle);
        }
    }

    public void c(InterfaceC4829b interfaceC4829b) {
        this.f217333a = interfaceC4829b;
    }
}

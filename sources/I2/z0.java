package I2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes2.dex */
public class z0 implements WebMessageBoundaryInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f51054b = {"WEB_MESSAGE_ARRAY_BUFFER"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H2.o f51055a;

    public z0(@NonNull H2.o oVar) {
        this.f51055a = oVar;
    }

    public static boolean a(int i10) {
        return i10 == 0 || (i10 == 1 && H0.f50925C.d());
    }

    @NonNull
    public static H2.p[] b(InvocationHandler[] invocationHandlerArr) {
        H2.p[] pVarArr = new H2.p[invocationHandlerArr.length];
        for (int i10 = 0; i10 < invocationHandlerArr.length; i10++) {
            pVarArr[i10] = new D0(invocationHandlerArr[i10]);
        }
        return pVarArr;
    }

    @Nullable
    public static H2.o c(@NonNull WebMessageBoundaryInterface webMessageBoundaryInterface) {
        H2.p[] pVarArrB = b(webMessageBoundaryInterface.getPorts());
        if (!H0.f50925C.d()) {
            return new H2.o(webMessageBoundaryInterface.getData(), pVarArrB);
        }
        WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        int type = webMessagePayloadBoundaryInterface.getType();
        if (type == 0) {
            return new H2.o(webMessagePayloadBoundaryInterface.getAsString(), pVarArrB);
        }
        if (type != 1) {
            return null;
        }
        return new H2.o(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), pVarArrB);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    @Nullable
    @Deprecated
    public String getData() {
        return this.f51055a.c();
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    @Nullable
    public InvocationHandler getMessagePayload() {
        C0 c02;
        int iE = this.f51055a.e();
        if (iE == 0) {
            c02 = new C0(this.f51055a.c());
        } else {
            if (iE != 1) {
                throw new IllegalStateException("Unknown web message payload type: " + this.f51055a.e());
            }
            byte[] bArrB = this.f51055a.b();
            Objects.requireNonNull(bArrB);
            c02 = new C0(bArrB);
        }
        return BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(c02);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    @Nullable
    public InvocationHandler[] getPorts() {
        H2.p[] pVarArrD = this.f51055a.d();
        if (pVarArrD == null) {
            return null;
        }
        InvocationHandler[] invocationHandlerArr = new InvocationHandler[pVarArrD.length];
        for (int i10 = 0; i10 < pVarArrD.length; i10++) {
            invocationHandlerArr[i10] = pVarArrD[i10].c();
        }
        return invocationHandlerArr;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @NonNull
    public String[] getSupportedFeatures() {
        return f51054b;
    }
}

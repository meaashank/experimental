package r8;

import android.os.IInterface;
import c7.AbstractC2950b;
import com.prism.commons.utils.l0;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: r8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5541b extends AbstractC2950b<IInterface> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f227263i = l0.b(C5541b.class.getSimpleName());

    /* JADX INFO: renamed from: r8.b$a */
    public static class a extends C5540a {
        @Override // r8.C5540a, c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return super.c(obj, method, objArr);
        }

        public a() {
            super("relayout");
        }
    }

    public C5541b(IInterface iInterface) {
        super(iInterface);
    }

    @Override // c7.AbstractC2950b
    public void r() {
        f(new C5540a("add"));
        f(new C5540a("addToDisplay"));
        f(new C5540a("addToDisplayAsUser"));
        f(new C5540a("addToDisplayWithoutInputChannel"));
        f(new C5540a("addWithoutInputChannel"));
        f(new a());
        f(new C5540a("relayoutAsync"));
    }
}

package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.LruCacheKt;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.platform.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C2233d implements InterfaceC2230c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f103807b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f103808c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f103809d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f103810e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f103811f = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AccessibilityManager f103812a;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.d$a */
    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public C2233d(@NotNull Context context) {
        Object systemService = context.getSystemService("accessibility");
        kotlin.jvm.internal.G.n(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f103812a = (AccessibilityManager) systemService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.compose.ui.platform.InterfaceC2230c
    public long a(long j10, boolean z10, boolean z11, boolean z12) {
        int i10 = z10;
        if (j10 < LruCacheKt.f86729a) {
            if (z11) {
                i10 = (z10 ? 1 : 0) | 2;
            }
            if (z12) {
                i10 = (i10 == true ? 1 : 0) | 4;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                int iA = U.f103654a.a(this.f103812a, (int) j10, i10);
                if (iA == Integer.MAX_VALUE) {
                    return Long.MAX_VALUE;
                }
                return iA;
            }
            if (z12 && this.f103812a.isTouchExplorationEnabled()) {
                return Long.MAX_VALUE;
            }
        }
        return j10;
    }
}

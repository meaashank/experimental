package androidx.window.layout;

import android.app.Activity;
import android.os.Build;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import dd.C4325b;
import e.T;
import ed.InterfaceC4376a;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.I;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class SafeWindowLayoutComponentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final SafeWindowLayoutComponentProvider f120090a = new SafeWindowLayoutComponentProvider();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final kotlin.G f120091b = I.a(new InterfaceC4376a<WindowLayoutComponent>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$windowLayoutComponent$2
        @Override // ed.InterfaceC4376a
        @Nullable
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final WindowLayoutComponent invoke() {
            ClassLoader classLoader = SafeWindowLayoutComponentProvider.class.getClassLoader();
            if (classLoader == null || !SafeWindowLayoutComponentProvider.f120090a.i(classLoader)) {
                return null;
            }
            try {
                return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
            } catch (UnsupportedOperationException unused) {
                return null;
            }
        }
    });

    public static final Class d(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider, ClassLoader classLoader) {
        safeWindowLayoutComponentProvider.getClass();
        return classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
    }

    public static final Class f(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider, ClassLoader classLoader) {
        safeWindowLayoutComponentProvider.getClass();
        return classLoader.loadClass("androidx.window.extensions.WindowExtensions");
    }

    public static final Class g(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider, ClassLoader classLoader) {
        safeWindowLayoutComponentProvider.getClass();
        return classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    }

    public static final Class h(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider, ClassLoader classLoader) {
        safeWindowLayoutComponentProvider.getClass();
        return classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    }

    public final boolean i(ClassLoader classLoader) {
        return Build.VERSION.SDK_INT >= 24 && r(classLoader) && p(classLoader) && q(classLoader) && n(classLoader);
    }

    public final boolean j(Method method, Class<?> cls) {
        return method.getReturnType().equals(cls);
    }

    public final boolean k(Method method, kotlin.reflect.d<?> dVar) {
        return j(method, C4325b.e(dVar));
    }

    public final Class<?> l(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
    }

    @Nullable
    public final WindowLayoutComponent m() {
        return (WindowLayoutComponent) f120091b.getValue();
    }

    public final boolean n(final ClassLoader classLoader) {
        return s(new InterfaceC4376a<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
            @Override // ed.InterfaceC4376a
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Boolean invoke() throws java.lang.NoSuchMethodException {
                /*
                    r6 = this;
                    androidx.window.layout.SafeWindowLayoutComponentProvider r0 = androidx.window.layout.SafeWindowLayoutComponentProvider.f120090a
                    java.lang.ClassLoader r1 = r1
                    java.lang.Class r1 = androidx.window.layout.SafeWindowLayoutComponentProvider.d(r0, r1)
                    java.lang.String r2 = "getBounds"
                    r3 = 0
                    java.lang.reflect.Method r2 = r1.getMethod(r2, r3)
                    java.lang.String r4 = "getType"
                    java.lang.reflect.Method r4 = r1.getMethod(r4, r3)
                    java.lang.String r5 = "getState"
                    java.lang.reflect.Method r1 = r1.getMethod(r5, r3)
                    java.lang.String r3 = "getBoundsMethod"
                    kotlin.jvm.internal.G.o(r2, r3)
                    java.lang.Class<android.graphics.Rect> r3 = android.graphics.Rect.class
                    kotlin.reflect.d r3 = kotlin.jvm.internal.O.d(r3)
                    java.lang.Class r3 = dd.C4325b.e(r3)
                    boolean r3 = r0.j(r2, r3)
                    if (r3 == 0) goto L7a
                    int r2 = r2.getModifiers()
                    boolean r2 = java.lang.reflect.Modifier.isPublic(r2)
                    if (r2 == 0) goto L7a
                    java.lang.String r2 = "getTypeMethod"
                    kotlin.jvm.internal.G.o(r4, r2)
                    kotlin.jvm.internal.P r2 = kotlin.jvm.internal.O.f217893a
                    java.lang.Class r3 = java.lang.Integer.TYPE
                    kotlin.reflect.d r5 = r2.d(r3)
                    java.lang.Class r5 = dd.C4325b.e(r5)
                    boolean r5 = r0.j(r4, r5)
                    if (r5 == 0) goto L7a
                    int r4 = r4.getModifiers()
                    boolean r4 = java.lang.reflect.Modifier.isPublic(r4)
                    if (r4 == 0) goto L7a
                    java.lang.String r4 = "getStateMethod"
                    kotlin.jvm.internal.G.o(r1, r4)
                    kotlin.reflect.d r2 = r2.d(r3)
                    java.lang.Class r2 = dd.C4325b.e(r2)
                    boolean r0 = r0.j(r1, r2)
                    if (r0 == 0) goto L7a
                    int r0 = r1.getModifiers()
                    boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
                    if (r0 == 0) goto L7a
                    r0 = 1
                    goto L7b
                L7a:
                    r0 = 0
                L7b:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1.invoke():java.lang.Boolean");
            }
        });
    }

    public final boolean o(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    public final boolean p(final ClassLoader classLoader) {
        return s(new InterfaceC4376a<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$isWindowExtensionsValid$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
            @Override // ed.InterfaceC4376a
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Boolean invoke() throws java.lang.NoSuchMethodException {
                /*
                    r4 = this;
                    androidx.window.layout.SafeWindowLayoutComponentProvider r0 = androidx.window.layout.SafeWindowLayoutComponentProvider.f120090a
                    java.lang.ClassLoader r1 = r1
                    java.lang.Class r1 = androidx.window.layout.SafeWindowLayoutComponentProvider.f(r0, r1)
                    java.lang.String r2 = "getWindowLayoutComponent"
                    r3 = 0
                    java.lang.reflect.Method r1 = r1.getMethod(r2, r3)
                    java.lang.ClassLoader r2 = r1
                    java.lang.Class r2 = androidx.window.layout.SafeWindowLayoutComponentProvider.h(r0, r2)
                    java.lang.String r3 = "getWindowLayoutComponentMethod"
                    kotlin.jvm.internal.G.o(r1, r3)
                    boolean r3 = r0.o(r1)
                    if (r3 == 0) goto L2d
                    java.lang.String r3 = "windowLayoutComponentClass"
                    kotlin.jvm.internal.G.o(r2, r3)
                    boolean r0 = r0.j(r1, r2)
                    if (r0 == 0) goto L2d
                    r0 = 1
                    goto L2e
                L2d:
                    r0 = 0
                L2e:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SafeWindowLayoutComponentProvider$isWindowExtensionsValid$1.invoke():java.lang.Boolean");
            }
        });
    }

    @T(24)
    public final boolean q(final ClassLoader classLoader) {
        return s(new InterfaceC4376a<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$isWindowLayoutComponentValid$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            @NotNull
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() throws NoSuchMethodException {
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.f120090a;
                Class clsH = SafeWindowLayoutComponentProvider.h(safeWindowLayoutComponentProvider, classLoader);
                boolean z10 = false;
                Method addListenerMethod = clsH.getMethod("addWindowLayoutInfoListener", Activity.class, t.a());
                Method removeListenerMethod = clsH.getMethod("removeWindowLayoutInfoListener", t.a());
                kotlin.jvm.internal.G.o(addListenerMethod, "addListenerMethod");
                if (safeWindowLayoutComponentProvider.o(addListenerMethod)) {
                    kotlin.jvm.internal.G.o(removeListenerMethod, "removeListenerMethod");
                    if (safeWindowLayoutComponentProvider.o(removeListenerMethod)) {
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
            }
        });
    }

    public final boolean r(final ClassLoader classLoader) {
        return s(new InterfaceC4376a<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$isWindowLayoutProviderValid$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            @NotNull
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() throws NoSuchMethodException {
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.f120090a;
                Method getWindowExtensionsMethod = SafeWindowLayoutComponentProvider.g(safeWindowLayoutComponentProvider, classLoader).getDeclaredMethod("getWindowExtensions", null);
                Class<?> windowExtensionsClass = SafeWindowLayoutComponentProvider.f(safeWindowLayoutComponentProvider, classLoader);
                kotlin.jvm.internal.G.o(getWindowExtensionsMethod, "getWindowExtensionsMethod");
                kotlin.jvm.internal.G.o(windowExtensionsClass, "windowExtensionsClass");
                return Boolean.valueOf(safeWindowLayoutComponentProvider.j(getWindowExtensionsMethod, windowExtensionsClass) && safeWindowLayoutComponentProvider.o(getWindowExtensionsMethod));
            }
        });
    }

    public final boolean s(InterfaceC4376a<Boolean> interfaceC4376a) {
        try {
            return interfaceC4376a.invoke().booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    public final Class<?> t(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensions");
    }

    public final Class<?> u(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    }

    public final Class<?> v(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    }
}

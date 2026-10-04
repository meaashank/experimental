package K2;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import kotlin.jvm.internal.G;
import kotlin.text.F;
import kotlin.text.M;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.window.core.d
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final p f58368a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f58369b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f58370c = "SplitRuleResolution";

    public final boolean a(@NotNull Activity activity, @NotNull ComponentName ruleComponent) {
        ComponentName component;
        G.p(activity, "activity");
        G.p(ruleComponent, "ruleComponent");
        if (b(activity.getComponentName(), ruleComponent)) {
            return true;
        }
        Intent intent = activity.getIntent();
        if (intent == null || (component = intent.getComponent()) == null) {
            return false;
        }
        return f58368a.b(component, ruleComponent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(@org.jetbrains.annotations.Nullable android.content.ComponentName r7, @org.jetbrains.annotations.NotNull android.content.ComponentName r8) {
        /*
            r6 = this;
            java.lang.String r0 = "ruleComponent"
            kotlin.jvm.internal.G.p(r8, r0)
            java.lang.String r0 = "*"
            r1 = 1
            r2 = 0
            if (r7 != 0) goto L21
            java.lang.String r7 = r8.getPackageName()
            boolean r7 = kotlin.jvm.internal.G.g(r7, r0)
            if (r7 == 0) goto L20
            java.lang.String r7 = r8.getClassName()
            boolean r7 = kotlin.jvm.internal.G.g(r7, r0)
            if (r7 == 0) goto L20
            return r1
        L20:
            return r2
        L21:
            java.lang.String r3 = r7.toString()
            java.lang.String r4 = "activityComponent.toString()"
            kotlin.jvm.internal.G.o(r3, r4)
            r4 = 2
            r5 = 0
            boolean r0 = kotlin.text.M.p3(r3, r0, r2, r4, r5)
            if (r0 != 0) goto L8c
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r3 = r8.getPackageName()
            boolean r0 = kotlin.jvm.internal.G.g(r0, r3)
            if (r0 != 0) goto L5b
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r3 = "activityComponent.packageName"
            kotlin.jvm.internal.G.o(r0, r3)
            java.lang.String r3 = r8.getPackageName()
            java.lang.String r4 = "ruleComponent.packageName"
            kotlin.jvm.internal.G.o(r3, r4)
            boolean r0 = r6.c(r0, r3)
            if (r0 == 0) goto L59
            goto L5b
        L59:
            r0 = r2
            goto L5c
        L5b:
            r0 = r1
        L5c:
            java.lang.String r3 = r7.getClassName()
            java.lang.String r4 = r8.getClassName()
            boolean r3 = kotlin.jvm.internal.G.g(r3, r4)
            if (r3 != 0) goto L85
            java.lang.String r7 = r7.getClassName()
            java.lang.String r3 = "activityComponent.className"
            kotlin.jvm.internal.G.o(r7, r3)
            java.lang.String r8 = r8.getClassName()
            java.lang.String r3 = "ruleComponent.className"
            kotlin.jvm.internal.G.o(r8, r3)
            boolean r7 = r6.c(r7, r8)
            if (r7 == 0) goto L83
            goto L85
        L83:
            r7 = r2
            goto L86
        L85:
            r7 = r1
        L86:
            if (r0 == 0) goto L8b
            if (r7 == 0) goto L8b
            return r1
        L8b:
            return r2
        L8c:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Wildcard can only be part of the rule."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.p.b(android.content.ComponentName, android.content.ComponentName):boolean");
    }

    public final boolean c(String str, String str2) {
        if (!M.p3(str2, "*", false, 2, null)) {
            return false;
        }
        if (G.g(str2, "*")) {
            return true;
        }
        if (M.L3(str2, "*", 0, false, 6, null) != M.a4(str2, "*", 0, false, 6, null) || !F.d2(str2, "*", false, 2, null)) {
            throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end");
        }
        String strSubstring = str2.substring(0, str2.length() - 1);
        G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return F.L2(str, strSubstring, false, 2, null);
    }
}
